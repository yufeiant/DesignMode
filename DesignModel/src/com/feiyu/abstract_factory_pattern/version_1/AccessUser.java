package com.feiyu.abstract_factory_pattern.version_1;

import com.feiyu.abstract_factory_pattern.interfaces.IUser;
import com.feiyu.abstract_factory_pattern.javabean.User;

/**
 * 通过Access操作User数据
 * @author jfy
 *
 */
public class AccessUser implements IUser {

	@Override
	public void Insert(User user) {
		System.out.println("在 Access Server 中给User 表插入一条记录");

	}

	@Override
	public User GetUser(int id) {
		System.out.println("在 Access Server 中根据ID得到User表一条记录");
		return null;
	}

}
