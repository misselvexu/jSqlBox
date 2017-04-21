package test.config.po;

import com.github.drinkjava2.jdialects.Dialect;
import com.github.drinkjava2.jsqlbox.Entity;

/**
 * Entity class is not a POJO, need extends from EntityBase or implements
 * EntityInterface interface<br/>
 * 
 * Default database table equal to entity name or add a "s" suffix , in this
 * example it will use "users" as table name
 * 
 * @author Yong Zhu
 *
 * @version 1.0.0
 * @since 1.0.0
 */

public class User implements Entity {
	private String id;
	private String userName;
	private String phoneNumber;
	private String address;
	private Integer age;
	private Boolean active;

	public String ddl() {
		Dialect d = this.box().getDialect();
		return "create table users " //
				+ "(id " + d.VARCHAR(32) //
				+ ", username " + d.VARCHAR(32) //
				+ ", Phone_Number " + d.VARCHAR(30) //
				+ ", Address  " + d.VARCHAR(32) //
				+ ", active " + d.BOOLEAN() //
				+ ", Age " + d.INTEGER() //
				+ ", constraint pkeycons1 primary key (id)" //
				+ ")" + d.ENGINE();
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	// Below methods are for JDBC & Query use, it's not compulsory but
	// recommended to have

	public String ID() {
		return box().getColumnName("id");
	}

	public String USERNAME() {
		return box().getColumnName("userName");
	}

	public String PHONENUMBER() {
		return box().getColumnName("phoneNumber");
	}

	public String ADDRESS() {
		return box().getColumnName("address");
	}

	public String AGE() {
		return box().getColumnName("age");
	}

	public String ACTIVE() {
		return box().getColumnName("active");
	}

}