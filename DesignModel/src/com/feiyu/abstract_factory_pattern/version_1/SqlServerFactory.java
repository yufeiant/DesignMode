package com.feiyu.abstract_factory_pattern.version_1;

import com.feiyu.abstract_factory_pattern.interfaces.IUser;

/**
 * 提供SqlServerUser的factory工厂类
 * @author jfy
 *
 */
public class SqlServerFactory implements IFactory {

	@Override
	public IUser CreateUser() {
		
		return new SqlServerUser();
	}

}
