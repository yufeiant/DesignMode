package com.feiyu.abstract_factory_pattern.version_4;

import com.feiyu.abstract_factory_pattern.interfaces.IDepartment;
import com.feiyu.abstract_factory_pattern.interfaces.IUser;
import com.feiyu.abstract_factory_pattern.javabean.Department;
import com.feiyu.abstract_factory_pattern.javabean.User;

/**
 * 简单工厂改进抽象工厂
 * 
 * 改进后的被简单工厂改进后的抽象工厂模式虽然解决了添加一个project，需要增加很多类和修改很多类的问题，但是如果我想增加一个数据库访问，Orcale的话，就需要
 * 改动很多了case了。
 * 
 * 在version_4 的版本中，我用反射替代了条件判断语句。现在db语句是写在了代码中，我们可以让其读取配置文件。实现可以动态的操作更换数据库。
 * @author jfy
 *
 */
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		User user = new User();
		Department department = new Department();
		DataAccess data_util = new DataAccess();
		IUser iu =  data_util.CreateUser();
		iu.Insert(user);
		iu.GetUser(1);
		
		IDepartment idep =  data_util.CreateDepartment();
		idep.Insert(department);
		idep.GetDepartment(1);

	}

}
