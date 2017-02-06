package com.feiyu.abstract_factory_pattern.version_2;

import com.feiyu.abstract_factory_pattern.interfaces.IDepartment;
import com.feiyu.abstract_factory_pattern.interfaces.IUser;

public interface IFactory {
	IUser CreateUser();
	IDepartment CreateDepartment(); //增加的方法
}
