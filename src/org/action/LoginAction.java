package org.action;

import java.util.Map;

import org.dao.LoginDao;
import org.model.Login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String message;
	private Login login;
	public String execute() throws Exception{
		LoginDao loginDao=new LoginDao();
		Login l=loginDao.checkLogin(login.getUsername(),login.getPassword());
		if(l!=null){//登录成功
			System.out.println("登录成功");
			Map session=ActionContext.getContext().getSession();
			session.put("login",1);//把获取对象保存在Session中
			return SUCCESS; //返回到初始页面 index。jsp,但此时Session中已经有了用户对象
		}else{
			System.out.println("登录失败");
			this.setMessage("用户名或密码错误！");//如果没有登录成功
			return SUCCESS;
		}
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
