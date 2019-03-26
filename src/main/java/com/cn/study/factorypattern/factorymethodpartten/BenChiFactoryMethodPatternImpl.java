package com.cn.study.factorypattern.factorymethodpartten;

import com.cn.study.factorypattern.BenChiCar;
import com.cn.study.factorypattern.ICar;

public class BenChiFactoryMethodPatternImpl implements FactoryMethodPattern{

	public ICar getCar() {
		return new BenChiCar();
	}

}
