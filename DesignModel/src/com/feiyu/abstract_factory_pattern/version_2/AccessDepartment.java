package com.feiyu.abstract_factory_pattern.version_2;

import com.feiyu.abstract_factory_pattern.interfaces.IDepartment;
import com.feiyu.abstract_factory_pattern.javabean.Department;

public class AccessDepartment implements IDepartment {

	@Override
	public void Insert(Department department) {
		System.out.println("在 Access Server 中给Department 表增加一条记录");
	}

	@Override
	public Department GetDepartment(int id) {
		System.out.println("在 Access Server 中得到Department 表中的一条记录");

		return null;
	}
}
