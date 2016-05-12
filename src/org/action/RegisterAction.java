package org.action;

import org.dao.LoginDao;
import org.dao.RegisterDao;
import org.model.Login;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	private String message;
	private Login login;
	RegisterDao registerDao=new RegisterDao();	
	public String execute() throws Exception{
		LoginDao loginDao=new LoginDao();
		Login l=loginDao.selectLogin(login.getUsername());
		if(l!=null){
			System.out.println("注册失败");
			this.setMessage("该用户名已存在！");
			return SUCCESS;
		}
		if(registerDao.addLogin(login.getUsername(),login.getPassword())){
		System.out.println("注册成功");
		this.setMessage("注册成功！");
		return SUCCESS;
		}
		System.out.println("注册失败");
		return SUCCESS;
	}
	
	
	public Login getLogin(){
		return login;
	}
	public void setLogin(Login login){
		this.login=login;
	}
	public String setMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}
}

