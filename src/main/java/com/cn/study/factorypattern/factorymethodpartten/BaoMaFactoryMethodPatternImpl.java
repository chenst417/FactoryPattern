package com.cn.study.factorypattern.factorymethodpartten;

import com.cn.study.factorypattern.BaoMaCar;
import com.cn.study.factorypattern.ICar;

public class BaoMaFactoryMethodPatternImpl implements FactoryMethodPattern {

	public ICar getCar() {
		return new BaoMaCar();
	}

}
