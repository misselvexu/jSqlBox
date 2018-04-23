package com.github.drinkjava2.test;

import java.lang.reflect.Method;

import com.github.drinkjava2.cglib3_2_0.proxy.Enhancer;
import com.github.drinkjava2.cglib3_2_0.proxy.MethodInterceptor;
import com.github.drinkjava2.cglib3_2_0.proxy.MethodProxy;
import com.github.drinkjava2.jdbpro.SqlItem;
import com.github.drinkjava2.jdialects.StrUtils;
import com.github.drinkjava2.jdialects.TableModelUtils;
import com.github.drinkjava2.jdialects.model.ColumnModel;
import com.github.drinkjava2.jdialects.model.TableModel;
import com.github.drinkjava2.jsqlbox.SqlBoxException;

public class AliasProxyUtils {
	public static ThreadLocal<AliasItemInfo> thdMethodName = new ThreadLocal<AliasItemInfo>();

	static class AliasItemInfo {
		public String tableName;
		public String alias;
		public String colName;

		public AliasItemInfo(String tableName, String alias, String colName) {
			this.tableName = tableName;
			this.alias = alias;
			this.colName = colName;
		}
		 
	}

	public static class ProxyBean implements MethodInterceptor {
		private TableModel tableModel;

		public ProxyBean(TableModel tableModel) {
			this.tableModel = tableModel;
		}

		public Object intercept(Object obj, Method method, Object[] args, MethodProxy cgLibMethodProxy)
				throws Throwable {
			thdMethodName.remove();
			if (method != null && tableModel != null) {
				String fieldName = method.getName().substring(3);
				String columnName = null;
				for (ColumnModel col : tableModel.getColumns())
					if (col.getEntityField().equalsIgnoreCase(fieldName))
						columnName = col.getColumnName();
				thdMethodName.set(new AliasItemInfo(tableModel.getTableName(), tableModel.getAlias(), columnName));
			}
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T createAliasProxy(Class<T> c, String alias) {
		TableModel t = TableModelUtils.entity2Model(c);
		t.setAlias(alias);
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(c);
		enhancer.setCallback(new ProxyBean(t));
		return (T) enhancer.create();
	}
 

	public static SqlItem clean() {
		thdMethodName.remove();
		return new SqlItem("");
	}

	public static SqlItem alias(Object o) {
		try {
			AliasItemInfo a = thdMethodName.get(); 
			if (StrUtils.isEmpty(a.colName))
				throw new SqlBoxException("Column name not found.");
			String sqlPiece = new StringBuilder(a.alias).append(".").append(a.colName).append(" as ").append(a.alias).append("_")
					.append(a.colName).toString();
			return new SqlItem(sqlPiece);
		} finally {
			thdMethodName.remove();
		}
	}

	public static SqlItem col(Object o) {
		try {
			AliasItemInfo a = thdMethodName.get(); 
			if (StrUtils.isEmpty(a.colName))
				throw new SqlBoxException("Column name not found.");
			String sqlPiece = new StringBuilder(a.alias).append(".").append(a.colName).toString();
			return new SqlItem(sqlPiece);
		} finally {
			thdMethodName.remove();
		}
	}

	public static SqlItem table(Object o) {
		try {
			o.toString();
			AliasItemInfo a = thdMethodName.get(); 
			String sqlPiece = new StringBuilder(a.tableName).append(" ").append(a.alias).toString();
			return new SqlItem(sqlPiece);
		} finally {
			thdMethodName.remove();
		}
	}

	public static SqlItem TABLE(Object o) {
		return table(o);
	}

}