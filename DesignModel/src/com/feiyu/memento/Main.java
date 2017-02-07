package com.feiyu.memento;
/**
 * 备忘录模式(Memento)：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外
 * 保存这个状态，这样以后就可将该对象恢复到原先保存的状态。
 * 
 * Memento模式比较适用于功能比较复杂的，但需要维护或记录属性历史的类，或者需要保存的属性
 * 只是众多属性中的一小部分，Originator可以根据保存的Memento信息还原到前一状态。
 * 
 * 
 * @author feiyu
 */
public class Main {

	public static void main(String[] args) {
		Originator o = new Originator();
		o.setAge(10);
		o.setName("shuaishuai");
		o.setState("false");
		o.show();
		Caretaker c = new  Caretaker();
		//备份
		c.setMemento(o.CreateMemento());
		//设置别的参数
		o.setAge(12);
		o.setName("xixi");
		o.setState("true");
		o.show();
		
		o.setMemento(c.getMemento());
		o.show();
		
		
	}

}
