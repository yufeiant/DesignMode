package com.feiyu.decorative_pattern;

import com.feiyu.decorative_pattern.decorative.Component;
/**
 * 具体操作的对象
 * @author jfy
 *
 */
public class ConcreteComonent implements Component {
	
	@Override
	public void Operation() {
		System.out.println("具体操作的对象");
	}
}
