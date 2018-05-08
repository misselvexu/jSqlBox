/**
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.drinkjava2.jsqlbox.sharding;

import com.github.drinkjava2.jdbpro.SqlItem;
import com.github.drinkjava2.jsqlbox.SqlBoxContext;

/**
 * This interface defines some Sharding methods
 * 
 * @author Yong Zhu
 * @since 1.7.0.3
 */

public interface ShardingTool {// NOSONAR
	/**
	 * Dealing a sharding method
	 * 
	 * @param ctx
	 *            Current SqlBoxContext instance
	 * @param sb
	 *            StringBuilder instance used to append real sharding table name
	 * @param item
	 *            The SqlItem which stored sharding query parameters
	 * @return A String[] or null if the sharding strategy is not fit for current
	 *         implementation
	 */
	public String[] doSharding(SqlBoxContext ctx, StringBuilder sb, SqlItem item);

}
