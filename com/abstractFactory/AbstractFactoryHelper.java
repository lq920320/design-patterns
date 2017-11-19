package com.abstractFactory;

public class AbstractFactoryHelper {

	public static Factory getFactory(Goods goods) {
		// TODO Auto-generated method stub
		Factory factory = null;
		if(goods.getGoodsType() == GoodsType.normalTemperature) {
			factory = new NormalFactory();
		}
		if(goods.getGoodsType() == GoodsType.coldTemperature) {
			factory = new ColdFactory();
		}
		
		return factory;
	}
}
