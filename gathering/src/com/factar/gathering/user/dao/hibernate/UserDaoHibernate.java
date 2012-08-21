package com.factar.gathering.user.dao.hibernate;

import java.util.List;

import org.hibernate.Query;

import com.factar.gathering.common.hibernate.BaseDaoSupport;
import com.factar.gathering.user.dao.UserDao;
import com.factar.gathering.user.model.User;

public class UserDaoHibernate extends BaseDaoSupport implements UserDao {

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return  (User) getHibernateTemplate().get(User.class, id);

	}

	@Override
	public List<User> getUserList() {
		String sql  = "from user";
		
		Query query = this.getSession().createSQLQuery(sql);
		List<User> users = (List<User>) query.list();
		return users;
	}

	@Override
	public User getUser(String userName, String userPassword) {
		// TODO Auto-generated method stub
		
		//tring 
		return null;
	}

}
