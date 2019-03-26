package com.cn.study.factorypattern.factorymethodpartten;

import com.cn.study.factorypattern.AoDiCar;
import com.cn.study.factorypattern.ICar;

public class AoDiFactoryMethodPatternImpl implements FactoryMethodPattern {

	public ICar getCar() {
		return new AoDiCar();
	}

}
