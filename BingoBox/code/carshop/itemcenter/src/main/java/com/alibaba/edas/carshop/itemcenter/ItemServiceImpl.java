package com.alibaba.edas.carshop.itemcenter;


/**
 * Alibaba Group EDAS. http://www.aliyun.com/product/edas
 */
public class ItemServiceImpl implements ItemService {

	@Override
	public Item getItemById( long id ) {
		Item car = new Item();
		car.setItemId( 111l );
		car.setItemName( "Mercedes Benz1111" );
		return car;
	}
	@Override
	public Item getItemByName( String name ) {
		Item car = new Item();
		car.setItemId( 222l );
		car.setItemName( "Mercedes Benz2222" );
		return car;
	}

	@Override
	public String getNide(String str) {
		return str+" hahahahahahha";
	}
}
