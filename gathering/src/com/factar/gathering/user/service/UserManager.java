package com.factar.gathering.user.service;

import java.util.List;

import com.factar.gathering.user.model.User;

/**
 * �û�����ӿ�
 * @author towery
 *
 */

public interface UserManager {

	// ����id ��ȡ�û�
	public  User getUser(Integer id);
	
	//
	public User getUser(String userName,String passWord);
	
	//��ȡ�����û�
	public List<User> getUserList();
	
	public Boolean addUser(String userName,String passWord);
	
	
}
