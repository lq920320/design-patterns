package com.prototype1;

public class Client {

	public static void main(String[] args) {
		//生成总店
		Shop shop = new Shop();
		shop.setName("DPC连锁总店");
		shop.getGoodLists().add(new Goods("鱼子酱", 299.99));
		shop.getGoodLists().add(new Goods("葡萄酒", 500.5));
		shop.getGoodLists().add(new Goods("挂面", 5.9));
		
		ShopManager.addShop(shop);
		
		//显示所有店铺信息
		ShopManager.showAllShop();
		
		//复制店铺
		Shop myShop = (Shop) ShopManager.findShop("DPC连锁总店").clone();
		myShop.init("DPC连锁分店1");
		myShop.getGoodLists().add(new Goods("二锅头", 4.9));
		ShopManager.addShop(myShop);
		
		Shop myShop2 = (Shop) ShopManager.findShop("DPC连锁分店1").clone();
		myShop2.init("DPC连锁分店2");
		myShop2.getGoodLists().clear();
		myShop2.getGoodLists().add(new Goods("龙虾", 900.67));
		ShopManager.addShop(myShop2);
		
		ShopManager.showAllShop();
		
		
	}

}
