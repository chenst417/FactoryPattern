package com.cn.study.factorypattern.simplefactorypartten;

import com.cn.study.factorypattern.AoDiCar;
import com.cn.study.factorypattern.BaoMaCar;
import com.cn.study.factorypattern.BenChiCar;
import com.cn.study.factorypattern.ICar;

/**
 *
 * @author User 简单工厂模式
 */
public class SimpleFactoryPattern {

	public static ICar getCar(String name) {
		if (name.equals("BaoMaCar")) {
			return new BaoMaCar();
		} else if (name.equals("BenChiCar")) {
			return new BenChiCar();
		} else if (name.equals("AoDiCar")) {
			return new AoDiCar();
		}
		return null;
	}

}
