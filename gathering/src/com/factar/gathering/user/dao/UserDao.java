package com.factar.gathering.user.dao;

import java.util.List;

import com.factar.gathering.user.model.User;

/**
 *  �û�dao�ӿ�
 * @author towery
 *
 */
public interface UserDao {

		// ����id ��ȡ�û�
		public  User getUser(Integer id);
		
		//
		public User getUser(String userName,String userPassword);
		
		//��ȡ�����û�
		public List<User> getUserList();
		
		
	
	
}
