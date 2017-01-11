package com.feiyu.factory_method_pattern;

import com.feiyu.factory_pattern.Operation;
import com.feiyu.factory_pattern.OperationAdd;
/**
 * 构建加法工厂
 * @author jfy
 *
 */
public class AddFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		
		return new OperationAdd();
	}

}
