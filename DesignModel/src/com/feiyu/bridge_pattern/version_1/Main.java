package com.feiyu.bridge_pattern.version_1;
/**
 * 在书中，手机软件和手机品牌都是变化点，我们应该怎么确定他们的关系呢，就是使用合成聚合原则。
 * 
 * @author jfy
 *
 */
public class Main {

	public static void main(String[] args) {
		 HandsetBrand phone ;
		 phone  = new HandsetBrandN();
		 
		 phone.SetHandsetSoft(new HandsetGame());
		 phone.Run();
		 
		 phone.SetHandsetSoft(new HandsetAddressList());
		 phone.Run();
		 
		 phone  = new HandsetBrandM();
		 
		 phone.SetHandsetSoft(new HandsetGame());
		 phone.Run();
		 
		 phone.SetHandsetSoft(new HandsetAddressList());
		 phone.Run();
	}

}
