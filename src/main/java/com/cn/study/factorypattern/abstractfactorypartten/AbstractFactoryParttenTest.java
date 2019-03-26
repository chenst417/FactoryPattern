package com.cn.study.factorypattern.abstractfactorypartten;

public class AbstractFactoryParttenTest {

	public static void main(String[] args) {
		IPinPaiFactory factory = new HaierPinPaiFactoryImpl();
		
		factory.getIBingXiangProduct().get();
	}
	
}
