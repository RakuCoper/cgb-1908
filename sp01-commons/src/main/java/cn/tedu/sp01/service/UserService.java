package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

public interface UserService {
	//根据用户id,获取用户信息
	User getUser(Integer id);
	//增加积分
	void addScore(Integer id,Integer score);
}
