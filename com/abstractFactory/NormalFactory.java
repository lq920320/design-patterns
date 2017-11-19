package com.abstractFactory;

/**
 * ³£ÎÂ¹¤³§
 * @author liuiqian
 *
 */
public class NormalFactory extends Factory {

	@Override
	public Shelf createShelf() {
		// TODO Auto-generated method stub
		return new NormalShelf();
	}

	@Override
	public AirConditioner createAirConditioner() {
		// TODO Auto-generated method stub
		return new NormalAirConditioner();
	}

}
