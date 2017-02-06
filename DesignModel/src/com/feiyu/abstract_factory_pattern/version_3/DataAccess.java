package com.feiyu.abstract_factory_pattern.version_3;

import com.feiyu.abstract_factory_pattern.interfaces.IDepartment;
import com.feiyu.abstract_factory_pattern.interfaces.IUser;
import com.feiyu.abstract_factory_pattern.version_1.AccessUser;
import com.feiyu.abstract_factory_pattern.version_1.SqlServerUser;
import com.feiyu.abstract_factory_pattern.version_2.AccessDepartment;
import com.feiyu.abstract_factory_pattern.version_2.SqlServerDepartment;

public class DataAccess {
	private static final String db = "SqlServer";
//	private static final String  db = "Access";
	
	public static IUser CreateUser(){
		IUser result = null;
		switch (db) {
		case "SqlServer":
			result = new SqlServerUser();
			break;
		case "Access":
			result = new AccessUser();
			break;
		default:
			break;
		}
		return result;
	}
	
	public static IDepartment CreateDepartment(){
		IDepartment result = null;
		switch (db) {
		case "SqlServer":
			result = new SqlServerDepartment();
			break;
		case "Access":
			result = new AccessDepartment();
			break;
		default:
			break;
		}
		return result;
	}
}
