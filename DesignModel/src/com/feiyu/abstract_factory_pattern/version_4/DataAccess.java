package com.feiyu.abstract_factory_pattern.version_4;

import com.feiyu.abstract_factory_pattern.interfaces.IDepartment;
import com.feiyu.abstract_factory_pattern.interfaces.IUser;

/**
 * 用反射来代替判断语句
 * @author jfy
 *
 */
public class DataAccess {
	private  String db = "SqlServer";
//	private static final String  db = "Access";
	
	public  IUser CreateUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		if(db!=null && !db.equals("")){
			String class_name = "com.feiyu.abstract_factory_pattern.version_1."+db+"User";
			Class<IUser> user_class = (Class<IUser>) Class.forName(class_name);
			return user_class.newInstance();
		}
		return null;
	}
	
	public  IDepartment CreateDepartment() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		if(db!=null&&!db.equals("")){
			String class_name = "com.feiyu.abstract_factory_pattern.version_2."+db+"Department";
			Class<IDepartment> department_class = (Class<IDepartment>) Class.forName(class_name);
			return department_class.newInstance();
		}
		return null;
	}
}
