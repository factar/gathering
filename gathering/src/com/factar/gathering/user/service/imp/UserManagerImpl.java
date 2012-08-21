package com.factar.gathering.user.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.factar.gathering.user.dao.UserDao;
import com.factar.gathering.user.model.User;
import com.factar.gathering.user.service.UserManager;

@Component
public class UserManagerImpl implements UserManager {
	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		User user  = userDao.getUser(id);
		return user;
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addUser(String userName, String passWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String userName, String passWord) {
		// TODO Auto-generated method stub
		
//		User user  = userDao.get
		return null;
	}
	
}
