package com.feiyu.abstract_factory_pattern;

import com.feiyu.abstract_factory_pattern.interfaces.IDepartment;
import com.feiyu.abstract_factory_pattern.interfaces.IUser;
import com.feiyu.abstract_factory_pattern.javabean.Department;
import com.feiyu.abstract_factory_pattern.javabean.User;
import com.feiyu.abstract_factory_pattern.version_4.DataAccess;

/**
 * 抽象工厂模式的推导
 * 
 * 抽象工厂模式(Abstract Factory):提供一个创建一系列相关或相互依赖对象的接口，而无需制定他们具体的类。
 * 
 * 
 * 抽象工厂的优点和缺点：
 * 第一个好处：最大的好处就是易于交换产品系列，由于具体工厂类，例如IFactory operFactory = new AddFactory();在一个应用中只需要在初始化的
 * 时候出现一次，这句使得改变一个应用的具体工厂变得非常容易，它只需要改变具体工厂即可使用不同的产品配置。我们的设计不能防止需求的更改
 * ，那么我们的理想便是让改动变的最小，现在如果你要更改数据库的访问，我们只需要更改具体工厂就可以了。
 * 第二个好处：它让具体的创建实例过程与客户端分离，客户端是通过它们的抽象接口操作实例，产品的具体类名也被具体工厂的实现分离了，
 * 不会出现在客户代码中。
 * 缺点：
 * 当我们需要增加一个项目表Project的时候，我们需要增加很多类，比如IProject,SqlServerProject,AccessProject,还需要改动IFactory,SqlServerFactory,
 * AccessFactory才可以实现。
 * 
 * 改进后的被简单工厂改进后的抽象工厂模式虽然解决了添加一个project，需要增加很多类和修改很多类的问题，但是如果我想增加一个数据库访问，Orcale的话，就需要
 * 改动很多了case了。
 * 
 * 下面就该反射出场了：
 * 用反射取代DataAccess中的switch条件判断，当我们想要添加一个新的数据库替换时，不在需要修改DataAccess中的代码了，只需要修改一下配置文件。
 * @author jfy
 *
 */
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//version_4 版本中的代码
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
