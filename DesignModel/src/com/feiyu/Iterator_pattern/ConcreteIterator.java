package com.feiyu.Iterator_pattern;
/**
 * ConcreteIterator 具体的迭代器类，继承于Iterator
 * @author feiyu
 * 
 */
public class ConcreteIterator extends Iterator {
	
	private ConcreteAggregate aggregate ;
	private int current = 0;
	
	public ConcreteIterator (ConcreteAggregate aggregate){
		this.aggregate = aggregate;
	}
	
	@Override
	public Object First() {
		
		return aggregate.getItem(0);
	}

	@Override
	public Object Next() {
		Object ret = null;
		current++;
		if(current<aggregate.getCount()){
			ret = aggregate.getItem(current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current>=aggregate.getCount() ? true : false;
	}

	@Override
	public Object CurrentItem() {
		return 	aggregate.getItem(current);
	}

}
