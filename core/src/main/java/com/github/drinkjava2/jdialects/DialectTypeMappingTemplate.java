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
package com.github.drinkjava2.jdialects;

import java.util.HashMap;
import java.util.Map;

/**
 * Initialize type mapping, this file is generated by source code generator by
 * extracting from Hibernate5.2.9
 * 
 * @author Yong Zhu
 * @since 1.0.1
 */
@SuppressWarnings("all")
public class DialectTypeMappingTemplate {

	private static void copyTo(Map lastMap, Dialect d) {
		Map<Type, String> target = d.typeMappings;
		target.clear();
		target.putAll(lastMap);
	}

	protected static void initTypeMappings() {
		Map<Type, String> mp = new HashMap<Type, String>();
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.BINARY, "blob");
		mp.put(Type.BIT, "boolean");
		mp.put(Type.BLOB, "blob");
		mp.put(Type.BOOLEAN, "boolean");
		mp.put(Type.CHAR, "char");
		mp.put(Type.CLOB, "clob");
		mp.put(Type.DATE, "date");
		mp.put(Type.DECIMAL, "decimal");
		mp.put(Type.DOUBLE, "double precision");
		mp.put(Type.FLOAT, "float($p)");
		mp.put(Type.INTEGER, "integer");
		mp.put(Type.JAVA_OBJECT, "N/A");
		mp.put(Type.LONGNVARCHAR, "nvarchar($l)");
		mp.put(Type.LONGVARBINARY, "blob");
		mp.put(Type.LONGVARCHAR, "longvarchar");
		mp.put(Type.NCHAR, "nchar($l)");
		mp.put(Type.NCLOB, "nclob");
		mp.put(Type.NUMERIC, "numeric($p,$s)");
		mp.put(Type.NVARCHAR, "nvarchar($l)");
		mp.put(Type.OTHER, "N/A");
		mp.put(Type.REAL, "real");
		mp.put(Type.SMALLINT, "smallint");
		mp.put(Type.TIME, "time");
		mp.put(Type.TIMESTAMP, "datetime");
		mp.put(Type.TINYINT, "tinyint");
		mp.put(Type.VARBINARY, "blob");
		mp.put(Type.VARCHAR, "varchar($l)");
		copyTo(mp, Dialect.SQLiteDialect);
		mp.put(Type.BIGINT, "integer");
		mp.put(Type.BINARY, "binary<255|N/A");
		mp.put(Type.BLOB, "ole");
		mp.put(Type.CHAR, "varchar($l)");
		mp.put(Type.CLOB, "longvarchar");
		mp.put(Type.DECIMAL, "N/A");
		mp.put(Type.DOUBLE, "double");
		mp.put(Type.FLOAT, "float");
		mp.put(Type.JAVA_OBJECT, "java_object");
		mp.put(Type.LONGVARBINARY, "longvarbinary");
		mp.put(Type.OTHER, "currency");
		mp.put(Type.TIME, "timestamp");
		mp.put(Type.TIMESTAMP, "timestamp");
		mp.put(Type.VARBINARY, "varbinary<255|bit varying($l)");
		copyTo(mp, Dialect.AccessDialect);
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.BINARY, "binary");
		mp.put(Type.BLOB, "blob");
		mp.put(Type.CLOB, "clob");
		mp.put(Type.JAVA_OBJECT, "longvarchar");
		mp.put(Type.OTHER, "N/A");
		mp.put(Type.SMALLINT, "numeric(5,0)");
		mp.put(Type.TIME, "time");
		mp.put(Type.TINYINT, "numeric(3,0)");
		mp.put(Type.VARBINARY, "varbinary");
		copyTo(mp, Dialect.ExcelDialect);
		mp.put(Type.DECIMAL, "decimal($p,$s)");
		mp.put(Type.JAVA_OBJECT, "java_object");
		copyTo(mp, Dialect.TextDialect);
		mp.put(Type.BIGINT, "integer");
		mp.put(Type.DECIMAL, "N/A");
		mp.put(Type.OTHER, "ole");
		mp.put(Type.SMALLINT, "smallint");
		mp.put(Type.TINYINT, "tinyint");
		copyTo(mp, Dialect.ParadoxDialect);
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.DECIMAL, "decimal($p,$s)");
		mp.put(Type.OTHER, "N/A");
		copyTo(mp, Dialect.CobolDialect);
		mp.put(Type.DECIMAL, "N/A");
		mp.put(Type.JAVA_OBJECT, "longvarchar");
		mp.put(Type.SMALLINT, "numeric(5,0)");
		mp.put(Type.TINYINT, "numeric(3,0)");
		copyTo(mp, Dialect.XMLDialect);
		mp.put(Type.BIGINT, "integer");
		mp.put(Type.BINARY, "binary<255|N/A");
		mp.put(Type.JAVA_OBJECT, "java_object");
		mp.put(Type.OTHER, "blob");
		mp.put(Type.SMALLINT, "smallint");
		mp.put(Type.TINYINT, "tinyint");
		mp.put(Type.VARBINARY, "varbinary<255|bit varying($l)");
		copyTo(mp, Dialect.DbfDialect);
		mp.put(Type.BIGINT, "BigInt");
		mp.put(Type.BINARY, "varbinary($1)");
		mp.put(Type.BIT, "bit");
		mp.put(Type.BLOB, "longvarbinary");
		mp.put(Type.CHAR, "char(1)");
		mp.put(Type.CLOB, "longvarchar");
		mp.put(Type.DECIMAL, "decimal");
		mp.put(Type.JAVA_OBJECT, "N/A");
		mp.put(Type.OTHER, "N/A");
		mp.put(Type.VARBINARY, "longvarbinary");
		copyTo(mp, Dialect.Cache71Dialect);
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.BINARY, "N/A");
		mp.put(Type.BIT, "bit(8)");
		mp.put(Type.BLOB, "bit varying(65535)");
		mp.put(Type.BOOLEAN, "bit(8)");
		mp.put(Type.CLOB, "string");
		mp.put(Type.INTEGER, "int");
		mp.put(Type.LONGVARBINARY, "bit varying($l)");
		mp.put(Type.LONGVARCHAR, "varchar($l)");
		mp.put(Type.REAL, "double");
		mp.put(Type.SMALLINT, "short");
		mp.put(Type.TINYINT, "short");
		mp.put(Type.VARBINARY, "bit varying($l)<2000|bit varying($l)");
		mp.put(Type.VARCHAR, "varchar($l)<255|varchar($l)<2000|string");
		copyTo(mp, Dialect.CUBRIDDialect);
		mp.put(Type.BIGINT, "number(19,0)");
		mp.put(Type.BIT, "number(1,0)");
		mp.put(Type.BLOB, "blob");
		mp.put(Type.BOOLEAN, "boolean");
		mp.put(Type.CHAR, "char(1 char)");
		mp.put(Type.CLOB, "clob");
		mp.put(Type.DECIMAL, "number($p,$s)");
		mp.put(Type.DOUBLE, "double precision");
		mp.put(Type.INTEGER, "number(10,0)");
		mp.put(Type.NUMERIC, "number($p,$s)");
		mp.put(Type.REAL, "real");
		mp.put(Type.SMALLINT, "number(5,0)");
		mp.put(Type.TIME, "date");
		mp.put(Type.TINYINT, "number(3,0)");
		mp.put(Type.VARBINARY, "raw($l)<2000|long raw");
		mp.put(Type.VARCHAR, "varchar2($l char)<4000|long");
		copyTo(mp, Dialect.DataDirectOracle9Dialect);
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.BINARY, "char($l) for bit data<254|varchar($l) for bit data");
		mp.put(Type.BIT, "smallint");
		mp.put(Type.BLOB, "blob($l)");
		mp.put(Type.BOOLEAN, "smallint");
		mp.put(Type.CHAR, "char(1)");
		mp.put(Type.CLOB, "clob($l)");
		mp.put(Type.DECIMAL, "decimal($p,$s)");
		mp.put(Type.DOUBLE, "double");
		mp.put(Type.INTEGER, "integer");
		mp.put(Type.LONGVARBINARY, "long varchar for bit data");
		mp.put(Type.LONGVARCHAR, "long varchar");
		mp.put(Type.NUMERIC, "decimal($p,$s)");
		mp.put(Type.SMALLINT, "smallint");
		mp.put(Type.TIME, "time");
		mp.put(Type.TINYINT, "smallint");
		mp.put(Type.VARBINARY, "varchar($l) for bit data");
		mp.put(Type.VARCHAR, "varchar($l)");
		copyTo(mp, Dialect.DB2Dialect);
		copyTo(mp, Dialect.DB2390Dialect);
		copyTo(mp, Dialect.DB2390V8Dialect);
		copyTo(mp, Dialect.DB2400Dialect);
		copyTo(mp, Dialect.DB297Dialect);
		mp.put(Type.BLOB, "blob");
		copyTo(mp, Dialect.DerbyDialect);
		copyTo(mp, Dialect.DerbyTenFiveDialect);
		mp.put(Type.BOOLEAN, "boolean");
		copyTo(mp, Dialect.DerbyTenSevenDialect);
		mp.put(Type.BOOLEAN, "smallint");
		copyTo(mp, Dialect.DerbyTenSixDialect);
		mp.put(Type.BIGINT, "numeric(18,0)");
		mp.put(Type.BINARY, "N/A");
		mp.put(Type.CLOB, "blob sub_type 1");
		mp.put(Type.DECIMAL, "N/A");
		mp.put(Type.DOUBLE, "double precision");
		mp.put(Type.LONGVARBINARY, "bit varying($l)");
		mp.put(Type.LONGVARCHAR, "varchar($l)");
		mp.put(Type.NUMERIC, "numeric($p,$s)");
		mp.put(Type.VARBINARY, "blob");
		copyTo(mp, Dialect.FirebirdDialect);
		mp.put(Type.BIGINT, "longint");
		mp.put(Type.BIT, "bit");
		mp.put(Type.BOOLEAN, "boolean");
		mp.put(Type.CLOB, "clob");
		mp.put(Type.TINYINT, "tinyint");
		mp.put(Type.VARBINARY, "bit varying($l)");
		copyTo(mp, Dialect.FrontBaseDialect);
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.BINARY, "binary");
		mp.put(Type.BIT, "boolean");
		mp.put(Type.CHAR, "char($l)");
		mp.put(Type.DECIMAL, "decimal($p,$s)");
		mp.put(Type.DOUBLE, "double");
		mp.put(Type.LONGVARBINARY, "longvarbinary");
		mp.put(Type.LONGVARCHAR, "varchar(2147483647)");
		mp.put(Type.NUMERIC, "decimal($p,$s)");
		mp.put(Type.VARBINARY, "binary($l)");
		copyTo(mp, Dialect.H2Dialect);
		mp.put(Type.BINARY, "varbinary($l)<5000|blob");
		mp.put(Type.BIT, "smallint");
		mp.put(Type.CHAR, "varchar(1)");
		mp.put(Type.DECIMAL, "decimal($p, $s)");
		mp.put(Type.FLOAT, "float($p)");
		mp.put(Type.LONGNVARCHAR, "nvarchar($l)<5000|nclob");
		mp.put(Type.LONGVARBINARY, "varbinary($l)<5000|blob");
		mp.put(Type.LONGVARCHAR, "varchar($l)<5000|clob");
		mp.put(Type.NCHAR, "nvarchar(1)");
		mp.put(Type.NUMERIC, "decimal($p, $s)");
		mp.put(Type.NVARCHAR, "nvarchar($l)<5000|nclob");
		mp.put(Type.TINYINT, "smallint");
		mp.put(Type.VARBINARY, "varbinary($l)<5000|blob");
		mp.put(Type.VARCHAR, "varchar($l)<5000|clob");
		copyTo(mp, Dialect.HANAColumnStoreDialect);
		copyTo(mp, Dialect.HANARowStoreDialect);
		mp.put(Type.BINARY, "binary($l)");
		mp.put(Type.BIT, "bit");
		mp.put(Type.BLOB, "longvarbinary");
		mp.put(Type.CHAR, "char($l)");
		mp.put(Type.CLOB, "longvarchar");
		mp.put(Type.DECIMAL, "decimal($p,$s)");
		mp.put(Type.FLOAT, "float");
		mp.put(Type.LONGNVARCHAR, "nvarchar($l)");
		mp.put(Type.LONGVARBINARY, "longvarbinary");
		mp.put(Type.LONGVARCHAR, "longvarchar");
		mp.put(Type.NCHAR, "nchar($l)");
		mp.put(Type.NCLOB, "clob");
		mp.put(Type.NUMERIC, "numeric");
		mp.put(Type.NVARCHAR, "nvarchar($l)");
		mp.put(Type.TINYINT, "tinyint");
		mp.put(Type.VARBINARY, "varbinary($l)");
		mp.put(Type.VARCHAR, "varchar($l)");
		copyTo(mp, Dialect.HSQLDialect);
		mp.put(Type.BIGINT, "int8");
		mp.put(Type.BINARY, "byte");
		mp.put(Type.BIT, "smallint");
		mp.put(Type.BLOB, "blob");
		mp.put(Type.CLOB, "clob");
		mp.put(Type.DECIMAL, "decimal");
		mp.put(Type.DOUBLE, "float");
		mp.put(Type.FLOAT, "smallfloat");
		mp.put(Type.LONGVARBINARY, "blob");
		mp.put(Type.LONGVARCHAR, "clob");
		mp.put(Type.NCLOB, "nclob");
		mp.put(Type.NUMERIC, "decimal");
		mp.put(Type.REAL, "smallfloat");
		mp.put(Type.TIME, "datetime hour to second");
		mp.put(Type.TIMESTAMP, "datetime year to fraction(5)");
		mp.put(Type.TINYINT, "smallint");
		mp.put(Type.VARBINARY, "byte");
		mp.put(Type.VARCHAR, "varchar($l)<255|lvarchar($l)<32739|varchar($l)");
		copyTo(mp, Dialect.InformixDialect);
		copyTo(mp, Dialect.Informix10Dialect);
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.BINARY, "byte($l)<32000|long byte");
		mp.put(Type.BIT, "tinyint");
		mp.put(Type.CHAR, "char($l)<32000|char($l)");
		mp.put(Type.DECIMAL, "decimal($p, $s)");
		mp.put(Type.FLOAT, "float");
		mp.put(Type.LONGVARBINARY, "long byte");
		mp.put(Type.LONGVARCHAR, "long varchar");
		mp.put(Type.NUMERIC, "decimal($p, $s)");
		mp.put(Type.REAL, "real");
		mp.put(Type.TIME, "time with time zone");
		mp.put(Type.TIMESTAMP, "timestamp with time zone");
		mp.put(Type.TINYINT, "tinyint");
		mp.put(Type.VARBINARY, "varbyte($l)<32000|long byte");
		mp.put(Type.VARCHAR, "varchar($l)<32000|long varchar");
		copyTo(mp, Dialect.IngresDialect);
		mp.put(Type.BIT, "boolean");
		mp.put(Type.DATE, "ansidate");
		mp.put(Type.TIMESTAMP, "timestamp(9) with time zone");
		copyTo(mp, Dialect.Ingres10Dialect);
		mp.put(Type.BIT, "tinyint");
		copyTo(mp, Dialect.Ingres9Dialect);
		mp.put(Type.BIGINT, "numeric(18,0)");
		mp.put(Type.BINARY, "N/A");
		mp.put(Type.BIT, "smallint");
		mp.put(Type.BOOLEAN, "smallint");
		mp.put(Type.CHAR, "char(1)");
		mp.put(Type.CLOB, "blob sub_type 1");
		mp.put(Type.DATE, "date");
		mp.put(Type.DECIMAL, "N/A");
		mp.put(Type.DOUBLE, "double precision");
		mp.put(Type.LONGVARBINARY, "bit varying($l)");
		mp.put(Type.LONGVARCHAR, "varchar($l)");
		mp.put(Type.NUMERIC, "numeric($p,$s)");
		mp.put(Type.TIME, "time");
		mp.put(Type.TIMESTAMP, "timestamp");
		mp.put(Type.TINYINT, "smallint");
		mp.put(Type.VARBINARY, "blob");
		mp.put(Type.VARCHAR, "varchar($l)");
		copyTo(mp, Dialect.InterbaseDialect);
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.BIT, "tinyint");
		mp.put(Type.BLOB, "varbinary");
		mp.put(Type.BOOLEAN, "boolean");
		mp.put(Type.CLOB, "varchar");
		mp.put(Type.DOUBLE, "double");
		mp.put(Type.NUMERIC, "numeric($p, $s)");
		mp.put(Type.TINYINT, "tinyint");
		mp.put(Type.VARBINARY, "varbinary($l)");
		copyTo(mp, Dialect.JDataStoreDialect);
		mp.put(Type.BINARY, "binary($l)");
		mp.put(Type.BIT, "bit");
		mp.put(Type.BLOB, "longblob");
		mp.put(Type.BOOLEAN, "bit");
		mp.put(Type.CLOB, "longtext");
		mp.put(Type.DOUBLE, "double precision");
		mp.put(Type.LONGVARBINARY, "mediumblob<16777215|longblob");
		mp.put(Type.LONGVARCHAR, "longtext");
		mp.put(Type.NCLOB, "longtext");
		mp.put(Type.NUMERIC, "decimal($p,$s)");
		mp.put(Type.TIMESTAMP, "datetime");
		mp.put(Type.VARBINARY, "tinyblob<255|blob<65535|mediumblob<16777215|longblob");
		mp.put(Type.VARCHAR, "varchar($l)<65535|longtext");
		copyTo(mp, Dialect.MariaDBDialect);
		mp.put(Type.TIMESTAMP, "datetime(6)");
		copyTo(mp, Dialect.MariaDB53Dialect);
		mp.put(Type.JAVA_OBJECT, "json");
		copyTo(mp, Dialect.MariaDB102Dialect);
		copyTo(mp, Dialect.MariaDB103Dialect);
		mp.put(Type.JAVA_OBJECT, "N/A");
		copyTo(mp, Dialect.MariaDB10Dialect);
		mp.put(Type.BINARY, "N/A");
		mp.put(Type.BLOB, "blob");
		mp.put(Type.BOOLEAN, "boolean");
		mp.put(Type.CLOB, "clob");
		mp.put(Type.DOUBLE, "double");
		mp.put(Type.LONGVARBINARY, "bit varying($l)");
		mp.put(Type.LONGVARCHAR, "varchar($l)");
		mp.put(Type.NCLOB, "nclob");
		mp.put(Type.NUMERIC, "numeric");
		mp.put(Type.TIMESTAMP, "timestamp");
		mp.put(Type.VARBINARY, "varbinary");
		mp.put(Type.VARCHAR, "varchar($l)");
		copyTo(mp, Dialect.MckoiDialect);
		mp.put(Type.BIGINT, "BIGINT");
		mp.put(Type.BINARY, "BINARY<2000|BLOB($1)");
		mp.put(Type.BIT, "ODBC.BIT");
		mp.put(Type.BLOB, "BLOB($l)");
		mp.put(Type.CHAR, "NCHAR(1)");
		mp.put(Type.CLOB, "NCLOB($l)");
		mp.put(Type.DATE, "DATE");
		mp.put(Type.DOUBLE, "DOUBLE PRECISION");
		mp.put(Type.FLOAT, "FLOAT");
		mp.put(Type.INTEGER, "INTEGER");
		mp.put(Type.LONGVARBINARY, "BLOB($1)");
		mp.put(Type.LONGVARCHAR, "CLOB($1)");
		mp.put(Type.NUMERIC, "NUMERIC(19, $l)");
		mp.put(Type.SMALLINT, "SMALLINT");
		mp.put(Type.TIME, "TIME");
		mp.put(Type.TIMESTAMP, "TIMESTAMP");
		mp.put(Type.TINYINT, "ODBC.TINYINT");
		mp.put(Type.VARBINARY, "BINARY VARYING($l)<2000|BLOB($1)");
		mp.put(Type.VARCHAR, "NATIONAL CHARACTER VARYING($l)<2000|NCLOB($l)");
		copyTo(mp, Dialect.MimerSQLDialect);
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.BINARY, "binary($l)");
		mp.put(Type.BIT, "bit");
		mp.put(Type.BLOB, "longblob");
		mp.put(Type.BOOLEAN, "bit");
		mp.put(Type.CHAR, "char(1)");
		mp.put(Type.CLOB, "longtext");
		mp.put(Type.DATE, "date");
		mp.put(Type.DOUBLE, "double precision");
		mp.put(Type.FLOAT, "float");
		mp.put(Type.INTEGER, "integer");
		mp.put(Type.LONGVARBINARY, "mediumblob<16777215|longblob");
		mp.put(Type.LONGVARCHAR, "longtext");
		mp.put(Type.NCLOB, "longtext");
		mp.put(Type.NUMERIC, "decimal($p,$s)");
		mp.put(Type.SMALLINT, "smallint");
		mp.put(Type.TIME, "time");
		mp.put(Type.TIMESTAMP, "datetime");
		mp.put(Type.TINYINT, "tinyint");
		mp.put(Type.VARBINARY, "tinyblob<255|blob<65535|mediumblob<16777215|longblob");
		mp.put(Type.VARCHAR, "varchar($l)<255|longtext");
		copyTo(mp, Dialect.MySQLDialect);
		mp.put(Type.VARCHAR, "varchar($l)<65535|longtext");
		copyTo(mp, Dialect.MySQL5Dialect);
		copyTo(mp, Dialect.MySQL55Dialect);
		mp.put(Type.JAVA_OBJECT, "json");
		mp.put(Type.TIMESTAMP, "datetime(6)");
		copyTo(mp, Dialect.MySQL57Dialect);
		copyTo(mp, Dialect.MySQL57InnoDBDialect);
		mp.put(Type.JAVA_OBJECT, "N/A");
		mp.put(Type.TIMESTAMP, "datetime");
		copyTo(mp, Dialect.MySQL5InnoDBDialect);
		mp.put(Type.VARCHAR, "varchar($l)<255|longtext");
		copyTo(mp, Dialect.MySQLInnoDBDialect);
		copyTo(mp, Dialect.MySQLMyISAMDialect);
		mp.put(Type.JAVA_OBJECT, "json");
		mp.put(Type.TIMESTAMP, "datetime(6)");
		mp.put(Type.VARCHAR, "varchar($l)<65535|longtext");
		copyTo(mp, Dialect.MySQL8Dialect);
		mp.put(Type.BIGINT, "number(19,0)");
		mp.put(Type.BINARY, "N/A");
		mp.put(Type.BIT, "number(1,0)");
		mp.put(Type.BLOB, "blob");
		mp.put(Type.BOOLEAN, "boolean");
		mp.put(Type.CLOB, "clob");
		mp.put(Type.DECIMAL, "number($p,$s)");
		mp.put(Type.INTEGER, "number(10,0)");
		mp.put(Type.JAVA_OBJECT, "N/A");
		mp.put(Type.LONGVARBINARY, "bit varying($l)");
		mp.put(Type.LONGVARCHAR, "varchar($l)");
		mp.put(Type.NCLOB, "nclob");
		mp.put(Type.NUMERIC, "number($p,$s)");
		mp.put(Type.SMALLINT, "number(5,0)");
		mp.put(Type.TIME, "date");
		mp.put(Type.TIMESTAMP, "date");
		mp.put(Type.TINYINT, "number(3,0)");
		mp.put(Type.VARBINARY, "raw($l)<2000|long raw");
		mp.put(Type.VARCHAR, "varchar2($l)<4000|long");
		copyTo(mp, Dialect.OracleDialect);
		mp.put(Type.BINARY, "raw($l)<2000|long raw");
		mp.put(Type.BOOLEAN, "number(1,0)");
		mp.put(Type.CHAR, "char(1 char)");
		mp.put(Type.LONGNVARCHAR, "nvarchar2($l)");
		mp.put(Type.LONGVARBINARY, "long raw");
		mp.put(Type.LONGVARCHAR, "long");
		mp.put(Type.NVARCHAR, "nvarchar2($l)");
		mp.put(Type.TIMESTAMP, "timestamp");
		mp.put(Type.VARCHAR, "varchar2($l char)<4000|long");
		copyTo(mp, Dialect.Oracle10gDialect);
		copyTo(mp, Dialect.Oracle12cDialect);
		mp.put(Type.CHAR, "char(1)");
		mp.put(Type.LONGNVARCHAR, "nvarchar($l)");
		mp.put(Type.NVARCHAR, "nvarchar($l)");
		mp.put(Type.TIMESTAMP, "date");
		mp.put(Type.VARCHAR, "varchar2($l)<4000|long");
		copyTo(mp, Dialect.Oracle8iDialect);
		mp.put(Type.BINARY, "N/A");
		mp.put(Type.BOOLEAN, "boolean");
		mp.put(Type.CHAR, "char(1 char)");
		mp.put(Type.LONGVARBINARY, "bit varying($l)");
		mp.put(Type.LONGVARCHAR, "varchar($l)");
		mp.put(Type.TIMESTAMP, "timestamp");
		mp.put(Type.VARCHAR, "varchar2($l char)<4000|long");
		copyTo(mp, Dialect.Oracle9Dialect);
		mp.put(Type.BINARY, "raw($l)<2000|long raw");
		mp.put(Type.BOOLEAN, "number(1,0)");
		mp.put(Type.LONGNVARCHAR, "nvarchar2($l)");
		mp.put(Type.LONGVARBINARY, "long raw");
		mp.put(Type.LONGVARCHAR, "long");
		mp.put(Type.NVARCHAR, "nvarchar2($l)");
		copyTo(mp, Dialect.Oracle9iDialect);
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.BINARY, "N/A");
		mp.put(Type.BIT, "smallint");
		mp.put(Type.BOOLEAN, "boolean");
		mp.put(Type.CHAR, "char(1)");
		mp.put(Type.DECIMAL, "N/A");
		mp.put(Type.INTEGER, "integer");
		mp.put(Type.LONGNVARCHAR, "nvarchar($l)");
		mp.put(Type.LONGVARBINARY, "bit varying($l)");
		mp.put(Type.LONGVARCHAR, "varchar($l)");
		mp.put(Type.NUMERIC, "numeric($p,$s)");
		mp.put(Type.NVARCHAR, "nvarchar($l)");
		mp.put(Type.SMALLINT, "smallint");
		mp.put(Type.TIME, "time");
		mp.put(Type.TINYINT, "smallint");
		mp.put(Type.VARBINARY, "blob($l)");
		mp.put(Type.VARCHAR, "varchar($l)");
		copyTo(mp, Dialect.PointbaseDialect);
		mp.put(Type.BIGINT, "int8");
		mp.put(Type.BINARY, "bytea");
		mp.put(Type.BIT, "bool");
		mp.put(Type.BLOB, "oid");
		mp.put(Type.CLOB, "text");
		mp.put(Type.DOUBLE, "float8");
		mp.put(Type.FLOAT, "float4");
		mp.put(Type.INTEGER, "int4");
		mp.put(Type.LONGVARBINARY, "bytea");
		mp.put(Type.LONGVARCHAR, "text");
		mp.put(Type.NUMERIC, "numeric($p, $s)");
		mp.put(Type.OTHER, "uuid");
		mp.put(Type.SMALLINT, "int2");
		mp.put(Type.TINYINT, "int2");
		mp.put(Type.VARBINARY, "bytea");
		copyTo(mp, Dialect.PostgresPlusDialect);
		copyTo(mp, Dialect.PostgreSQLDialect);
		copyTo(mp, Dialect.PostgreSQL81Dialect);
		copyTo(mp, Dialect.PostgreSQL82Dialect);
		copyTo(mp, Dialect.PostgreSQL9Dialect);
		copyTo(mp, Dialect.PostgreSQL91Dialect);
		mp.put(Type.JAVA_OBJECT, "json");
		copyTo(mp, Dialect.PostgreSQL92Dialect);
		copyTo(mp, Dialect.PostgreSQL93Dialect);
		copyTo(mp, Dialect.PostgreSQL94Dialect);
		copyTo(mp, Dialect.PostgreSQL95Dialect);
		mp.put(Type.BIGINT, "numeric");
		mp.put(Type.BINARY, "N/A");
		mp.put(Type.BIT, "bit");
		mp.put(Type.BLOB, "blob");
		mp.put(Type.CHAR, "character(1)");
		mp.put(Type.CLOB, "clob");
		mp.put(Type.DOUBLE, "double precision");
		mp.put(Type.FLOAT, "real");
		mp.put(Type.INTEGER, "integer");
		mp.put(Type.JAVA_OBJECT, "N/A");
		mp.put(Type.LONGVARBINARY, "bit varying($l)");
		mp.put(Type.LONGVARCHAR, "varchar($l)");
		mp.put(Type.NUMERIC, "numeric($p,$s)");
		mp.put(Type.OTHER, "N/A");
		mp.put(Type.SMALLINT, "smallint");
		mp.put(Type.TINYINT, "tinyint");
		mp.put(Type.VARBINARY, "varbinary($l)");
		copyTo(mp, Dialect.ProgressDialect);
		mp.put(Type.BIGINT, "NUMERIC(21,0)");
		mp.put(Type.BIT, "SMALLINT");
		mp.put(Type.BLOB, "BLOB($l)");
		mp.put(Type.CHAR, "CHARACTER(1)");
		mp.put(Type.DATE, "DATE");
		mp.put(Type.DECIMAL, "NUMERIC(21,$l)");
		mp.put(Type.DOUBLE, "DOUBLE PRECISION");
		mp.put(Type.FLOAT, "FLOAT");
		mp.put(Type.INTEGER, "INTEGER");
		mp.put(Type.NUMERIC, "NUMERIC(21,$l)");
		mp.put(Type.REAL, "REAL");
		mp.put(Type.SMALLINT, "SMALLINT");
		mp.put(Type.TIME, "TIME");
		mp.put(Type.TIMESTAMP, "TIMESTAMP");
		mp.put(Type.TINYINT, "SMALLINT");
		mp.put(Type.VARBINARY, "bit varying($l)");
		mp.put(Type.VARCHAR, "CHARACTER($l)");
		copyTo(mp, Dialect.RDMSOS2200Dialect);
		mp.put(Type.BIGINT, "fixed(19,0)");
		mp.put(Type.BIT, "boolean");
		mp.put(Type.BLOB, "long byte");
		mp.put(Type.CHAR, "char(1)");
		mp.put(Type.CLOB, "long varchar");
		mp.put(Type.DATE, "date");
		mp.put(Type.DECIMAL, "N/A");
		mp.put(Type.DOUBLE, "double precision");
		mp.put(Type.FLOAT, "float");
		mp.put(Type.INTEGER, "int");
		mp.put(Type.NUMERIC, "fixed($p,$s)");
		mp.put(Type.REAL, "real");
		mp.put(Type.SMALLINT, "smallint");
		mp.put(Type.TIME, "time");
		mp.put(Type.TIMESTAMP, "timestamp");
		mp.put(Type.TINYINT, "fixed(3,0)");
		mp.put(Type.VARBINARY, "long byte");
		mp.put(Type.VARCHAR, "varchar($l)");
		copyTo(mp, Dialect.SAPDBDialect);
		mp.put(Type.BIGINT, "numeric(19,0)");
		mp.put(Type.BINARY, "binary($l)");
		mp.put(Type.BIT, "tinyint");
		mp.put(Type.BLOB, "image");
		mp.put(Type.BOOLEAN, "bit");
		mp.put(Type.CLOB, "text");
		mp.put(Type.DATE, "datetime");
		mp.put(Type.LONGVARBINARY, "image");
		mp.put(Type.LONGVARCHAR, "text");
		mp.put(Type.NUMERIC, "numeric($p,$s)");
		mp.put(Type.TIME, "datetime");
		mp.put(Type.TIMESTAMP, "datetime");
		mp.put(Type.TINYINT, "smallint");
		mp.put(Type.VARBINARY, "varbinary($l)<8000|image");
		copyTo(mp, Dialect.SQLServerDialect);
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.BIT, "bit");
		mp.put(Type.BLOB, "varbinary(MAX)");
		mp.put(Type.CLOB, "varchar(MAX)");
		mp.put(Type.LONGVARBINARY, "varbinary(MAX)");
		mp.put(Type.LONGVARCHAR, "varchar(MAX)");
		mp.put(Type.NCLOB, "nvarchar(MAX)");
		mp.put(Type.VARBINARY, "varbinary($l)<8000|varbinary(MAX)");
		mp.put(Type.VARCHAR, "varchar($l)<8000|varchar(MAX)");
		copyTo(mp, Dialect.SQLServer2005Dialect);
		mp.put(Type.DATE, "date");
		mp.put(Type.NVARCHAR, "nvarchar($l)<4000|nvarchar(MAX)");
		mp.put(Type.TIME, "time");
		mp.put(Type.TIMESTAMP, "datetime2");
		copyTo(mp, Dialect.SQLServer2008Dialect);
		copyTo(mp, Dialect.SQLServer2012Dialect);
		mp.put(Type.BIGINT, "numeric(19,0)");
		mp.put(Type.BIT, "tinyint");
		mp.put(Type.BLOB, "image");
		mp.put(Type.BOOLEAN, "boolean");
		mp.put(Type.CLOB, "text");
		mp.put(Type.DATE, "datetime");
		mp.put(Type.LONGVARBINARY, "bit varying($l)");
		mp.put(Type.LONGVARCHAR, "varchar($l)");
		mp.put(Type.NCLOB, "nclob");
		mp.put(Type.NVARCHAR, "nvarchar($l)");
		mp.put(Type.TIME, "datetime");
		mp.put(Type.TIMESTAMP, "datetime");
		mp.put(Type.VARBINARY, "varbinary($l)");
		mp.put(Type.VARCHAR, "varchar($l)");
		copyTo(mp, Dialect.SybaseDialect);
		copyTo(mp, Dialect.Sybase11Dialect);
		copyTo(mp, Dialect.SybaseAnywhereDialect);
		mp.put(Type.BIGINT, "bigint");
		mp.put(Type.BOOLEAN, "tinyint");
		mp.put(Type.DATE, "date");
		mp.put(Type.DECIMAL, "numeric($p,$s)");
		mp.put(Type.LONGVARBINARY, "image");
		mp.put(Type.LONGVARCHAR, "text");
		mp.put(Type.TIME, "time");
		copyTo(mp, Dialect.SybaseASE15Dialect);
		copyTo(mp, Dialect.SybaseASE157Dialect);
		mp.put(Type.BIGINT, "NUMERIC(18,0)");
		mp.put(Type.BINARY, "BYTEINT");
		mp.put(Type.BIT, "BYTEINT");
		mp.put(Type.BLOB, "BLOB");
		mp.put(Type.BOOLEAN, "BYTEINT");
		mp.put(Type.CHAR, "CHAR(1)");
		mp.put(Type.CLOB, "CLOB");
		mp.put(Type.DATE, "DATE");
		mp.put(Type.DECIMAL, "DECIMAL");
		mp.put(Type.DOUBLE, "DOUBLE PRECISION");
		mp.put(Type.FLOAT, "FLOAT");
		mp.put(Type.INTEGER, "INTEGER");
		mp.put(Type.LONGVARBINARY, "bit varying($l)");
		mp.put(Type.LONGVARCHAR, "LONG VARCHAR");
		mp.put(Type.NUMERIC, "NUMERIC($p,$s)");
		mp.put(Type.SMALLINT, "SMALLINT");
		mp.put(Type.TIME, "TIME");
		mp.put(Type.TIMESTAMP, "TIMESTAMP");
		mp.put(Type.TINYINT, "BYTEINT");
		mp.put(Type.VARBINARY, "VARBYTE($l)");
		mp.put(Type.VARCHAR, "VARCHAR($l)");
		copyTo(mp, Dialect.TeradataDialect);
		mp.put(Type.BIGINT, "BIGINT");
		mp.put(Type.BINARY, "VARBYTE(100)");
		mp.put(Type.LONGVARBINARY, "VARBYTE(32000)");
		mp.put(Type.LONGVARCHAR, "VARCHAR(32000)");
		copyTo(mp, Dialect.Teradata14Dialect);
		mp.put(Type.BINARY, "N/A");
		mp.put(Type.BIT, "TINYINT");
		mp.put(Type.BLOB, "VARBINARY(4000000)");
		mp.put(Type.BOOLEAN, "boolean");
		mp.put(Type.CLOB, "VARCHAR(4000000)");
		mp.put(Type.DECIMAL, "N/A");
		mp.put(Type.DOUBLE, "DOUBLE");
		mp.put(Type.LONGVARBINARY, "bit varying($l)");
		mp.put(Type.LONGVARCHAR, "varchar($l)");
		mp.put(Type.NUMERIC, "DECIMAL($p, $s)");
		mp.put(Type.TINYINT, "TINYINT");
		mp.put(Type.VARBINARY, "VARBINARY($l)");
		copyTo(mp, Dialect.TimesTenDialect);
	}

}
