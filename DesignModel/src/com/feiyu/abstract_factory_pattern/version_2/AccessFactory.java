package com.feiyu.abstract_factory_pattern.version_2;

import com.feiyu.abstract_factory_pattern.interfaces.IDepartment;
import com.feiyu.abstract_factory_pattern.interfaces.IUser;
import com.feiyu.abstract_factory_pattern.version_1.AccessUser;
/**
 * 提供访问Access数据库的工厂类
 * @author jfy
 *
 */
public class AccessFactory implements IFactory {

	@Override
	public IUser CreateUser() {
		return new AccessUser();
	}
	//增加了AccessDepartment工厂
	@Override
	public IDepartment CreateDepartment() {
		return new AccessDepartment();
	}

}
