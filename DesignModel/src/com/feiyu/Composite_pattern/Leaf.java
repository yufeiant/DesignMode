package com.feiyu.Composite_pattern;


public class Leaf extends Component {

	public Leaf(String name) {
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
