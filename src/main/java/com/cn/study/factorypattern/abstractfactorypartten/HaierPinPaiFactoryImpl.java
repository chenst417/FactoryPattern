package com.cn.study.factorypattern.abstractfactorypartten;

public class HaierPinPaiFactoryImpl implements IPinPaiFactory {

	public IXiYiJiProduct getIXiYiJiProduct() {
		return new HaierXiYiJiImpl();
	}

	public ITvProduct getITvProduct() {
		return new HaierTvProductImpl();
	}

	public IBingXiangProduct getIBingXiangProduct() {
		
		return new HaierBingXiangProductImpl();
	}

}
