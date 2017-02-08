package com.feiyu.Iterator_pattern;

/**
 * Iterator迭代器抽象类
 * @author feiyu
 *
 */
public abstract class Iterator {
	public abstract Object First();
	public abstract Object Next();
	public abstract boolean isDone();
	public abstract Object CurrentItem();
}
