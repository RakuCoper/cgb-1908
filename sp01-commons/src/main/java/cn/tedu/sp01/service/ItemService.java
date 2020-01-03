package cn.tedu.sp01.service;

import java.util.List;

import cn.tedu.sp01.pojo.Item;

public interface ItemService {
	//根据商品编号,查询订单中的商品列表
	List<Item> getItems(String orderId);
	//减少商品库存,保存订单时,订单中所有的库存要减少
	void decreaseNumbers(List<Item> list);
}
