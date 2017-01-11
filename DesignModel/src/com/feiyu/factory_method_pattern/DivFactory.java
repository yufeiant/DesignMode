package com.feiyu.factory_method_pattern;

import com.feiyu.factory_pattern.Operation;
import com.feiyu.factory_pattern.OperationDiv;
/**
 * 除法工厂构建类
 * @author jfy
 *
 */
public class DivFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new OperationDiv();
	}

}
