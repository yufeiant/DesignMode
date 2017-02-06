package com.feiyu.abstract_factory_pattern.version_3;

import com.feiyu.abstract_factory_pattern.interfaces.IDepartment;
import com.feiyu.abstract_factory_pattern.interfaces.IUser;
import com.feiyu.abstract_factory_pattern.javabean.Department;
import com.feiyu.abstract_factory_pattern.javabean.User;

/**
 * 简单工厂改进抽象工厂
 * 
 * 改进后的被简单工厂改进后的抽象工厂模式虽然解决了添加一个project，需要增加很多类和修改很多类的问题，但是如果我想增加一个数据库访问，Orcale的话，就需要
 * 改动很多了case了。
 * @author jfy
 *
 */
public class Main {

	public static void main(String[] args) {
		User user = new User("",21);
		Department department = new Department();
		IUser iu = DataAccess.CreateUser();
		iu.Insert(user);
		iu.GetUser(1);
		
		IDepartment idep = DataAccess.CreateDepartment();
		idep.Insert(department);
		idep.GetDepartment(1);

	}

}
