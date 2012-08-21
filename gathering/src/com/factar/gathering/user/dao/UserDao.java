package com.factar.gathering.user.dao;

import java.util.List;

import com.factar.gathering.user.model.User;

/**
 *  用户dao接口
 * @author towery
 *
 */
public interface UserDao {

		// 根据id 获取用户
		public  User getUser(Integer id);
		
		//
		public User getUser(String userName,String userPassword);
		
		//获取所有用户
		public List<User> getUserList();
		
		
	
	
}
