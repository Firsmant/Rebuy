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
			System.out.println("ע��ʧ��");
			this.setMessage("���û����Ѵ��ڣ�");
			return SUCCESS;
		}
		if(registerDao.addLogin(login.getUsername(),login.getPassword())){
		System.out.println("ע��ɹ�");
		this.setMessage("ע��ɹ���");
		return SUCCESS;
		}
		System.out.println("ע��ʧ��");
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

