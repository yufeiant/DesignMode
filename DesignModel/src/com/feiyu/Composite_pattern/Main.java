package com.feiyu.Composite_pattern;
/**
 * 组合模式--将对象组合成树形结构以表示'部分-整体'的层次结构，组合模式使得用户对单个对象和
 * 组合对象的使用具有一致性。
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) {
		Composite root  = new Composite("root");
		root.Add(new Leaf("A"));
		root.Add(new Leaf("B"));
		
		Composite comp  = new Composite("composite x");
		comp.Add(new Leaf("A"));
		comp.Add(new Leaf("B"));
		root.Add(comp);
		
		Composite comp1  = new Composite("composite xy");
		comp1.Add(new Leaf("A"));
		comp1.Add(new Leaf("B"));
		root.Add(comp1);
		
		root.Display(1);

	}

}
