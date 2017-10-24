/*
 * Copyright (C) 2016 Yong Zhu.
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

import java.lang.reflect.Method;

import com.github.drinkjava2.jdialects.model.TableModel;

/**
 * Entity class extended from ActiveRecord will get CRUD methods, see below
 * difference in jSqlBox to save ActiveRecord entity and normal entity into
 * database:
 * 
 * <pre>
 * ActiveRecord style only works when a global defaultContext be set or set the
 * SqlBoxContext binded with entity, for example:   
 * 
 *    SqlBoxContext.setDefaultContext(new SqlBoxContext(dataSource));           
 *    entity.insert(); 
 * 
 *    or 
 *    
 *    entity.box().setContext(new SqlBoxContext(dataSource))
 *    entity.insert();
 *    
 * Non-ActiveRecord entity style (also called Data Mapper style):
 *    SqlBoxContext ctx=new SqlBoxContext(dataSource);
 *    ctx.insert(entity);
 * </pre>
 * 
 * 
 * 
 * @author Yong Zhu
 * @since 1.0.0
 */
public class ActiveRecord implements ActiveRecordSupport {
	private static ThreadLocal<String[]> lastTimePutFieldsCache = new ThreadLocal<String[]>();

	SqlBox box;

	@Override
	public SqlBox bindedBox() {
		return box;
	}

	@Override
	public void unbindBox() {
		if (box != null) {
			box.setEntityBean(null);
			box = null;
		}
	}

	@Override
	public void bindBox(SqlBox box) {
		if (box == null)
			throw new SqlBoxException("Can not bind null SqlBox to entity");
		box.setEntityBean(this);
		this.box = box;
	}

	@Override
	public SqlBox box() {
		if (box == null)
			this.bindBox(SqlBoxUtils.createSqlBox(SqlBoxContext.defaultContext, this.getClass()));
		return box;
	}

	@Override
	public TableModel tableModel() {
		return box().getTableModel();
	}

	@Override
	public String table() {
		return box().getTableModel().getTableName();
	}

	@Override
	public SqlBoxContext context() {
		return box().getContext();
	}

	@Override
	public void insert() {
		context().insert(this);
	}

	@Override
	public int update() {
		return context().update(this);
	}

	@Override
	public void delete() {
		context().delete(this);
	}

	@Override
	public <T> T load(Object pkey) {
		return context().load(this.getClass(), pkey);
	}

	@Override
	public ActiveRecordSupport put(Object... fieldAndValues) {
		for (int i = 0; i < fieldAndValues.length / 2; i++) {
			String field = (String) fieldAndValues[i * 2];
			Object value = fieldAndValues[i * 2 + 1];
			Method writeMethod = ClassCacheUtils.getClassFieldWriteMethod(this.getClass(), field);
			try {
				writeMethod.invoke(this, value);
			} catch (Exception e) {
				throw new SqlBoxException(e);
			}
		}
		return this;
	}

	@Override
	public ActiveRecordSupport putFields(String... fieldNames) {
		lastTimePutFieldsCache.set(fieldNames);
		return this;
	}

	@Override
	public ActiveRecordSupport putValues(Object... values) {
		String[] fields = lastTimePutFieldsCache.get();
		if (values.length == 0 || fields == null || fields.length == 0)
			throw new SqlBoxException("putValues fields or values can not be empty");
		if (values.length != fields.length)
			throw new SqlBoxException("putValues fields and values number not match");
		for (int i = 0; i < fields.length; i++) {
			Method writeMethod = ClassCacheUtils.getClassFieldWriteMethod(this.getClass(), fields[i]);
			try {
				writeMethod.invoke(this, values[i]);
			} catch (Exception e) {
				throw new SqlBoxException(e);
			}
		}
		return this;
	}

}