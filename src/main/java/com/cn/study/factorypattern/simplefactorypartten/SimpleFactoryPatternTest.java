package com.cn.study.factorypattern.simplefactorypartten;

import com.cn.study.factorypattern.ICar;

public class SimpleFactoryPatternTest {

	public static void main(String[] args) {
		ICar car = SimpleFactoryPattern.getCar("BenChiCar");
		car.getCar();
	}

}
