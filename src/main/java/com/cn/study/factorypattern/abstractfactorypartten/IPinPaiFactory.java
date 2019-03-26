package com.cn.study.factorypattern.abstractfactorypartten;
/**
 * 
 */
/**
 * @author User
 *
 */
public interface IPinPaiFactory {
	
	IXiYiJiProduct getIXiYiJiProduct();
	
	ITvProduct getITvProduct();
	
	IBingXiangProduct getIBingXiangProduct();
}