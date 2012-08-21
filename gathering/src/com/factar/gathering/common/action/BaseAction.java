package com.factar.gathering.common.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class BaseAction extends ActionSupport implements ServletContextAware,
		ServletRequestAware, ServletResponseAware, Preparable {
	
	private static final long serialVersionUID = 1L;

	

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}



	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		
	}

}
