package cn.tedu.sp01.service;

import java.util.List;

import cn.tedu.sp01.pojo.Item;

public interface ItemService {
	//������Ʒ���,��ѯ�����е���Ʒ�б�
	List<Item> getItems(String orderId);
	//������Ʒ���,���涩��ʱ,���������еĿ��Ҫ����
	void decreaseNumbers(List<Item> list);
}
