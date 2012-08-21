package com.factar.gathering.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

/**
 * 
 * @author towery
 * Time : 2012/07/11 22:41
 */
@Component
@Entity
@Table(name = "user")
public class User {
	private Integer userId; // 用户id
	private String loginName;//登录名
	private String userName; //姓名
	private String passWord; //密码
	private String zbx;//用户所在的x坐标
	private String zby; //用户所在的y坐标
	private Integer groupId;//用户所在的组的id
	
	@Id
	@Column(name = "userid")
	@GenericGenerator(name = "userid", strategy = "increment")
	@GeneratedValue(generator = "userid")
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Column(name = "loginname")
	public String getLoginName(){
		return loginName;
	}
	public void setLoginName(String loginName){
		this.loginName = loginName;
	}
	@Column(name = "USERNAME")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name = "PASSWORD")
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Column(name = "zbx")
	public String getZbx() {
		return zbx;
	}
	public void setZbx(String zbx) {
		this.zbx = zbx;
	}
	@Column(name = "zby")
	public String getZby() {
		return zby;
	}
	public void setZby(String zby) {
		this.zby = zby;
	}
	@Column(name = "groupid")
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	
	
}
