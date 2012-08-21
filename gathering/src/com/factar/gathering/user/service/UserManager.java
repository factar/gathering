package com.factar.gathering.user.service;

import java.util.List;

import com.factar.gathering.user.model.User;

/**
 * 用户管理接口
 * @author towery
 *
 */

public interface UserManager {

	// 根据id 获取用户
	public  User getUser(Integer id);
	
	//
	public User getUser(String userName,String passWord);
	
	//获取所有用户
	public List<User> getUserList();
	
	public Boolean addUser(String userName,String passWord);
	
	
}
