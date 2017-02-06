package com.feiyu.abstract_factory_pattern.version_2;

import com.feiyu.abstract_factory_pattern.interfaces.IDepartment;
import com.feiyu.abstract_factory_pattern.interfaces.IUser;
import com.feiyu.abstract_factory_pattern.javabean.Department;
import com.feiyu.abstract_factory_pattern.javabean.User;

/**
 * 增加了一个Department表
 * 
 * 如果想要切换数据库，只需要IFactory factory = new SqlServerFactory();就可以了，而下面的数据调用并不会产生影响。
 * 现在的实现就已经抽象工厂模式了！
 * 
 * 
 * @author jfy
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("帅帅",24);
		Department department = new Department();
//		IFactory factory = new SqlServerFactory();
		IFactory factory = new AccessFactory();
		IUser iu = factory.CreateUser();
		iu.Insert(user);
		iu.GetUser(1);
		IDepartment idepartment = factory.CreateDepartment();
		
	}
}
