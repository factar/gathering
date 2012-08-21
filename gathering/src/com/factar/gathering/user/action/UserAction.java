package com.factar.gathering.user.action;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.factar.gathering.common.action.BaseAction;
import com.factar.gathering.user.model.User;
import com.factar.gathering.user.service.UserManager;

public class UserAction extends BaseAction {
	
	@Autowired
	private UserManager userManager;
	@Autowired
	private User user;
	
	private static final Logger log = LogManager.getLogger(UserAction.class);
	public String Login(){
		System.out.println("bb");
		//String userName = "admin";
		//String password = "admin";
		int userid = 1;
		
		user = userManager.getUser(userid);
		if( user!=null)
		{
			log.info("user's name is " + user.getUserName());
			return "success";
		}
		else return "failed";
	}
	
	public String Add(){
		
		return  "success";
	}
	
}
