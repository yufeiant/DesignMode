package com.feiyu.abstract_factory_pattern.interfaces;

import com.feiyu.abstract_factory_pattern.javabean.User;

/**
 * 定义了User表的操作
 * @author jfy
 *
 */
public interface IUser {
	void Insert(User user);
	User GetUser(int id);
}
