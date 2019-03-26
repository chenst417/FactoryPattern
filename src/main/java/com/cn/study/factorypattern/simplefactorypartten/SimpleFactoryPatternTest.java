package com.cn.study.factorypattern.simplefactorypartten;

import com.cn.study.factorypattern.ICar;

/**
 * 简单工厂模式测试
 */
public class SimpleFactoryPatternTest {

	public static void main(String[] args) {
		ICar car = SimpleFactoryPattern.getCar("BenChiCar");
		car.getCar();
	}

}
