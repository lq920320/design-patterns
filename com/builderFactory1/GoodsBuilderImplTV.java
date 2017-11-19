package com.builderFactory1;

/**
 * 电视机创建者
 * @author liuiqian
 *
 */
public class GoodsBuilderImplTV extends GoodsBuilder {

	@Override
	public void createMainProduct() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("TV", 2999.99f));
	}

	@Override
	public void createAdd1Product() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("演示DVD", 5.99f));
	}

	@Override
	public void createAdd2Product() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("蓝牙耳机", 199.05f));
	}
	
	
}
