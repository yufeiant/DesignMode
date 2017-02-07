package com.feiyu.Composite_pattern.version_1;

import com.feiyu.Composite_pattern.Component;

public class CopyOfLeaf extends Component {

	public CopyOfLeaf(String name) {
		super(name);
	}
	@Override
	public void Add(Component c) {
	}
	@Override
	public void Remove(Component c) {
	}

	@Override
	public void Display(int depth) {
		System.out.println(depth+"-"+name);

	}

}
