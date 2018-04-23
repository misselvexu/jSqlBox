package com.github.drinkjava2.test;

import static com.github.drinkjava2.jdbpro.DbPro.param;
import static com.github.drinkjava2.test.AliasProxyUtils.alias;
import static com.github.drinkjava2.test.AliasProxyUtils.clean;
import static com.github.drinkjava2.test.AliasProxyUtils.col;
import static com.github.drinkjava2.test.AliasProxyUtils.createAliasProxy;
import static com.github.drinkjava2.test.AliasProxyUtils.table;

import java.util.List;

import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Assert;
import org.junit.Test;

import com.github.drinkjava2.jdbpro.handler.PrintSqlHandler;

/**
 * This is a demo shows how to write refactor-support SQL in Java6 and Java7.
 */
public class Java6Java7Test extends TestBase {

	@Test
	public void normalTest() {
		User u = createAliasProxy(User.class, "u");
		List<?> list = ctx.iQuery(new MapListHandler(), new PrintSqlHandler(), clean(), //
				"select u.*, ", alias(u.getAddress()), ", ", alias(u.getName())//
				, " from ", table(u), " where "//
				, col(u.getName()), ">=?", param("Foo90") //
				, " and ", col(u.getAge()), ">?", param(1) //
		);
		Assert.assertTrue(list.size() == 10);
	}
}