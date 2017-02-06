package com.feiyu.abstract_factory_pattern.version_1;

import com.feiyu.abstract_factory_pattern.interfaces.IUser;

/**
 * 提供AccessUser的工厂类
 * @author jfy
 *
 */
public class AccessFactory implements IFactory {

	@Override
	public IUser CreateUser() {
		
		return new AccessUser();
	}

}
