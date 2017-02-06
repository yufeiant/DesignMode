package com.feiyu.abstract_factory_pattern.version_1;

import com.feiyu.abstract_factory_pattern.interfaces.IUser;
import com.feiyu.abstract_factory_pattern.javabean.User;

/**
 * 现在我们要更换数据库，只需要把new SqlServerFactory()改成new AccessFactory(),此时由于多态的关系，使得申明IUser接口的
 * 对象iu 事先根本不知道是在访问哪个数据库，却可以运行时很好的完成工作，这就是所谓的业务逻辑和数据访问罗的解耦。
 * 如果我们这个时候添加一个新的表部门表Department表，应该怎么做呢？
 * @author jfy
 *
 */
public class Main {

	public static void main(String[] args) {
		User user = new User("帅帅",24);
		IFactory factory = new SqlServerFactory();
		IUser iu = factory.CreateUser();
		iu.Insert(user);
		iu.GetUser(24);
	}

}