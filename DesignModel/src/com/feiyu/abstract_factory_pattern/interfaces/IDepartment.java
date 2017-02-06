package com.feiyu.abstract_factory_pattern.interfaces;

import com.feiyu.abstract_factory_pattern.javabean.Department;

public interface IDepartment {
	void Insert(Department department);
	Department GetDepartment(int id);
}
