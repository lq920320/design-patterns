package com.builderFactory1;

import java.util.List;

public class GoodsDirectorImplCommon extends GoodsDirector {

	public GoodsDirectorImplCommon(GoodsBuilder goodsBuilder) {
		super(goodsBuilder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Product> construct() {
		// TODO Auto-generated method stub
		getGoodsBuilder().init();
		/**
		 * 创建过程
		 */
		getGoodsBuilder().createMainProduct();
		getGoodsBuilder().createAdd1Product();

		/**
		 * 得到产品
		 */
		return getGoodsBuilder().getProductList();
	}

}
