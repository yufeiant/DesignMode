package com.feiyu.adapter_pattern;
/**
 * 适配器-翻译
 * @author jfy
 *
 */
public class Translator extends Player{
	private ForeignCenter wjzf = new ForeignCenter();
	
	public Translator(String name) {
		super(name);
		wjzf.setName(name);
	}
	
	
	@Override
	public void Attack() {
		wjzf.进攻();
		
	}
	@Override
	public void Defense() {
		wjzf.防守();
		
	}
	
	
}
