package com.feiyu.builder_pattern;
/**
 * 指挥者--用来根据用户的需求来建造不同的对象
 * 你提供我要求的零件，然后我给你组装起来。
 * @author feiyu
 *
 */
public class PersonDirector {
	private PersonBuilder pb;
	public PersonDirector(PersonBuilder pb){
		this.pb = pb;
	}
	
	public void CreatePerson(){
		pb.BuildHead();//先画头
		pb.BuildBody();//再画身体
		pb.BuildArmLeft();//再画左手
		pb.BuildArmRight();//再画右手
		pb.BuildLegLeft();//再画左腿
		pb.BuildLegRight();//再画右腿
	}
}
