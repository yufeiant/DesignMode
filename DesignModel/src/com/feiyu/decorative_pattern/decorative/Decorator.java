package com.feiyu.decorative_pattern.decorative;

public class Decorator implements Component {

	protected Component component;
	
	public void SetComponent(Component component){
		this.component = component;
	}
	@Override
	public void Operation() {
		if(component != null){
			component.Operation();
		}
	}

}
