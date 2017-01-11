package com.feiyu.factory_method_pattern;

import com.feiyu.factory_pattern.Operation;
import com.feiyu.factory_pattern.OperationMul;
/**
 * 乘法构建工厂
 * @author jfy
 *
 */
public class MulFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new OperationMul();
	}

}
