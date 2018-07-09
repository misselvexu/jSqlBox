/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package com.github.drinkjava2.jsqlbox;

import com.github.drinkjava2.jdbpro.PreparedSQL;
import com.github.drinkjava2.jdbpro.SqlItem;

/**
 * If a entity class implements ActiveRecordSupport interface, it will have CRUD
 * Method. This interface is designed for jSqlBox Java8 version because Java8
 * support default method interface is not useful for Java7 and below.
 * 
 * @author Yong Zhu
 * @since 1.0.0
 */
public interface ActiveRecordSupport {// NOSONAR

	static final ThreadLocal<String[]> lastTimePutFieldsCache = new ThreadLocal<String[]>();

	/** @return current SqlBoxContext instance */
	public SqlBoxContext ctx();

	/** Insert entity to database */
	public <T> T insert(Object... optionalSqlItems);

	/** Update entity in database */
	public <T> T update(Object... optionalSqlItems);

	/** Delete entity in database */
	public void delete(Object... optionalSqlItems);

	/**
	 * Load entity from database by primary key, shardTable and shardDatabase fields
	 * if have
	 */
	public <T> T load(Object... optionalSqlItems);

	/** Load entity by given id (P-Key) or id Map */
	public <T> T loadById(Object idOrIdMap, Object... optionalSqlItems);

	public int countAll(Object... optionalSqlItems);

	/**
	 * Link style set values for entity field, format like:
	 * user.put("id","id1").put("name","Sam").put("address","Beijing","phone","12345",
	 * "email","abc@123.com")
	 */
	public ActiveRecordSupport put(Object... fieldAndValues);

	/** Cache a field array in ThreadLocal for putValues method use */
	public ActiveRecordSupport putFields(String... fieldNames);

	/**
	 * Put values for entity fields, field names should be cached by call putFields
	 * method first
	 */
	public ActiveRecordSupport putValues(Object... values);

	/**
	 * In SqlMapper style, based on current method @Sql annotated String or Text(see
	 * user manual) in comments(need put Java file in resources folder, see user
	 * manual) and parameters, guess a best fit query/update/delete/execute method
	 * and run it
	 */
	public <T> T guess(Object... params);

	/**
	 * In SqlMapper style, return current method's SQL String based on current
	 * method @Sql annotated String or Text(see user manual) in comments(need put
	 * Java file in resources folder, see user manual)
	 */
	public String guessSQL();

	/** In SqlMapper style, return current method's prepared SQL */
	public PreparedSQL guessPreparedSQL(Object... params);

	/**
	 * For tXxxx style templateEngine use, return a SqlItemType.PUT type SqlItem
	 * instance,
	 * 
	 * Usage: put("key1",value1,"key2",value2...);
	 */
	public SqlItem bind(Object... parameters);

	/** Return current entity's shardTable according its sharding key values */
	public String shardTB(Object... optionItems);

	/** Return current entity's shardDatabase according its sharding key values */
	public SqlBoxContext shardDB(Object... optionItems);

}