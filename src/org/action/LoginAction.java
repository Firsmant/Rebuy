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
		if(l!=null){//��¼�ɹ�
			System.out.println("��¼�ɹ�");
			Map session=ActionContext.getContext().getSession();
			session.put("login",1);//�ѻ�ȡ���󱣴���Session��
			return SUCCESS; //���ص���ʼҳ�� index��jsp,����ʱSession���Ѿ������û�����
		}else{
			System.out.println("��¼ʧ��");
			this.setMessage("�û������������");//���û�е�¼�ɹ�
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
