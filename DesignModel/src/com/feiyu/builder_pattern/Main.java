package com.feiyu.builder_pattern;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 * 建造者模式(Builder)--将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建
 * 不同的表示。
 * 也叫生成器模式。
 * 建造者模式可以可以将一个产品的内部表象与产品的生成过程分离开来，从而是使一个生产过程
 * 生成具有不同的内部表象的产品对象。
 * 如果我们使用了建造者模式，那么用户就只需指定需要建造的类型就可以得到它们，而具体建造过程
 * 和细节就不需要知道了。
 * 
 * 项目例子：一个需求是建造两个人，一个胖子，一个瘦子
 * @author feiyu
 *
 * 使用场景：主要用于创建一些复杂的对象，这些对象内部构建间的建造顺序是稳定的，但对对象内部
 * 的构建通常面临着复杂的变化，比如我们生产汽车，我们都需要四个车轮，地盘，车体，车门，发动机等
 * 但是具体是用哪些零件组装起来的汽车就大不相同了。
 */
public class Main {

	public static void main(String[] args) {
		PersonBuilder personBuilderA = new PersonFattyBuilder("画笔","画布");
		PersonDirector pdA = new PersonDirector(personBuilderA);
		pdA.CreatePerson();
		
		PersonBuilder personBuilderB = new PersonThinBuilder("画笔","画布");
		PersonDirector pdB = new PersonDirector(personBuilderB);
		pdB.CreatePerson();

	}

}
