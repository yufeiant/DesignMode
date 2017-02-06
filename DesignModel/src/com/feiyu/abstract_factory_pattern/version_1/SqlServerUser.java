package com.feiyu.abstract_factory_pattern.version_1;

import com.feiyu.abstract_factory_pattern.interfaces.IUser;
import com.feiyu.abstract_factory_pattern.javabean.User;

/**
 * 通过SQL Server 来操作User表
 * @author jfy
 *
 */
public class SqlServerUser implements IUser {

	@Override
	public void Insert(User user) {
		System.out.println("在 SQL Server 中给User 表插入一条记录");
	}

	@Override
	public User GetUser(int id) {
		System.out.println("在 SQL Server 中根据ID得到User表一条记录");
		return null;
	}

}
