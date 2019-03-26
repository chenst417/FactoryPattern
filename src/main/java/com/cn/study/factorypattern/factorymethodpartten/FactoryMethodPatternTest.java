package com.cn.study.factorypattern.factorymethodpartten;

import com.cn.study.factorypattern.ICar;

public class FactoryMethodPatternTest {
	
	public static void main(String[] args) {
		FactoryMethodPattern fmp = new AoDiFactoryMethodPatternImpl();
		ICar car = fmp.getCar();
		car.getCar();
	}
}

