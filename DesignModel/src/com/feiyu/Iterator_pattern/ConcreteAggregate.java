package com.feiyu.Iterator_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteAggregate 具体聚焦类 继承Aggregate
 * @author feiyu
 */
public class ConcreteAggregate extends Aggregate {
	
	private List<Object> items = new ArrayList();
	
	@Override
	public Iterator CreateIterator() {
		//又玩的这个把戏，把自己传进去，然后初始化出来
		return new ConcreteIterator(this);
	}
	//获取item的数量
	public int getCount(){
		return items.size();
	}
	//获取item
	public Object getItem(int index){
		return items.get(index);
	}
	//添加item
	public void setItem(Object item){
		items.add(item);
	}
}
