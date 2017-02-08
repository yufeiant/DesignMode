package com.feiyu.Iterator_pattern;
/**
 * 迭代器模式--提供一个方法顺序访问一个聚合对象中的各个元素，而又不暴露该对象的内部表示。
 * 
 * 这个模式的使用价值已经不如它的学习价值了，因为在java中的for each 就是它的实现。
 * 
 * 但是里面的代码实现还是很有意思的。
 * 
 * 当我们需要访问一个聚集对象，而且不管这些对象时什么都需要遍历的时候，我们就应该考虑使用
 * 迭代器模式了。
 * 为了遍历不同的聚集结构提供如开始，下一个，是否结束，当前哪一项等统一接口。
 * 
 * 当你需要对聚焦有多种方式遍历时，可以考虑用迭代器模式
 * 
 * 
 * @author feiyu
 */
public class Main {

	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		a.setItem("大鸟");
		a.setItem("小鸟");
		a.setItem("老鸟");
		a.setItem("中鸟");
		a.setItem("超大鸟");
		
		Iterator iterator = a.CreateIterator();
		
		while(!iterator.isDone()){
			System.out.println(iterator.CurrentItem());
			iterator.Next();
		}

	}

}
