package com.feiyu.factory_method_pattern;

import com.feiyu.factory_pattern.Operation;//使用的工厂模式中的Operation

/**
 * 工厂接口
 * @author jfy
 * 
 */
public interface IFactory {
	Operation CreateOperation();
}
