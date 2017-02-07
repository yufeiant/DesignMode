package com.feiyu.Composite_pattern;

import java.util.ArrayList;
import java.util.List;
/**
 * Composite 定义有枝节点行为，用来存储子节点，在Composite中实现关于Component的相关操作，
 * 
 * @author feiyu
 *
 */
public class Composite extends Component {
	//一个子对象集合，用来存储其下属的枝节点和叶节点
	private List<Component> children = new ArrayList<Component>();
	public Composite(String name) {
		super(name);
	}
	@Override
	public void Add(Component c) {
		children.add(c);
	}
	@Override
	public void Remove(Component c) {
		children.remove(c);
	}

	@Override
	public void Display(int depth) {
		//展示枝节点名称，并对下属便利
		System.out.println(name+"-"+depth);
		for (Component c : children) {
			c.Display(depth+2);
		}

	}

}
