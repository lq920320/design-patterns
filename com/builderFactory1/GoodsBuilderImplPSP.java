package com.builderFactory1;

/**
 * PSP创建者
 * @author liuiqian
 *
 */
public class GoodsBuilderImplPSP extends GoodsBuilder {

	@Override
	public void createMainProduct() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("PSP", 1499.99f));
	}

	@Override
	public void createAdd1Product() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("贴膜", 1.00f));
		getProductList().add(new Product("充电器", 99f));
	}

	@Override
	public void createAdd2Product() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("耳机", 30.99f));
		getProductList().add(new Product("硅胶套", 1499.99f));
	}

	
}
