package test.transaction;

import static com.github.drinkjava2.jsqlbox.SqlHelper.empty;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.drinkjava2.jsqlbox.SqlBoxContext;
import com.github.drinkjava2.jsqlbox.SqlHelper;

import test.config.TestPrepare;
import test.config.SpringConfig;
import test.config.po.User;

/**
 * This is to test use Spring's Declarative Transaction
 *
 * @author Yong Zhu
 *
 * @version 1.0.0
 * @since 1.0.0
 */
@Transactional(propagation = Propagation.REQUIRED)
public class SpringTransactionTest {
	private static SqlBoxContext defaultSqlBoxContext = null;

	public static SqlBoxContext getDefaultCTX() {
		return defaultSqlBoxContext;
	}

	@Before
	public void setup() {
		TestPrepare.dropAndRecreateTables();
	}

	@After
	public void cleanUp() {
		TestPrepare.closeBeanBoxContext();
	}

	public void tx_InsertUser1() {
		User u = new User();
		u.dao().execute("insert into ", u.table(), //
				" (", u.userName(), empty("user1"), //
				", ", u.address(), empty("address1"), //
				", ", u.age(), ")", empty("10"), //
				SqlHelper.questionMarks());
	}

	public void tx_InsertUser2() {
		User u = new User();
		u.dao().execute("insert into ", u.table(), //
				" (", u.userName(), empty("user2"), //
				", ", u.address(), empty("address2"), //
				", ", u.age(), ")", empty("20"), //
				SqlHelper.questionMarks());
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void tx_doInsert() {
		User u = new User();
		tx_InsertUser1();
		int i = u.dao().queryForInteger("select count(*) from ", u.table());
		Assert.assertEquals(1, i);
		System.out.println(i / 0);// throw a runtime exception
		tx_InsertUser2();
	}

	@Test
	public void doTest() {
		AnnotationConfigApplicationContext springCTX = new AnnotationConfigApplicationContext(SpringConfig.class);
		SqlBoxContext sc = springCTX.getBean("sqlBoxCtxBean", SqlBoxContext.class);
		defaultSqlBoxContext = sc;
		SqlBoxContext.configDefaultContext(SpringTransactionTest.class.getName(), "getDefaultCTX");
		SpringTransactionTest tester = springCTX.getBean(SpringTransactionTest.class);
		boolean foundException = false;
		try {
			tester.tx_doInsert();
		} catch (Exception e) {
			foundException = true;
			User u = new User();
			int i = u.dao().queryForInteger("select count(*) from ", u.table());
			Assert.assertEquals(0, i);
		}
		Assert.assertEquals(foundException, true);
		springCTX.close();
	}

}