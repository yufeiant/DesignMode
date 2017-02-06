package com.feiyu.abstract_factory_pattern.version_2;

import com.feiyu.abstract_factory_pattern.interfaces.IDepartment;
import com.feiyu.abstract_factory_pattern.interfaces.IUser;
import com.feiyu.abstract_factory_pattern.version_1.SqlServerUser;

public class SqlServerFactory implements IFactory {

	@Override
	public IUser CreateUser() {
		
		return new SqlServerUser();
	}

	//增加了SqlServerDepartment工厂
	@Override
	public IDepartment CreateDepartment() {
		
		return new SqlServerDepartment();
	}

}
