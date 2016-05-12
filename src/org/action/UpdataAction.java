package org.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.dao.UpdataDao;
import org.model.Updata;
import org.tool.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UpdataAction extends ActionSupport{
	private int pageNow=1;
	private int pageSize=4;
	private Updata updata;
	private String message;
	UpdataDao updataDao=new UpdataDao();
	
	//ͼƬ�й�
	private final static String file = "files";  //�ϴ���Tomcat�� �����µ�files
	private File myFile;  /*��ʱ�ļ��ϴ�����λ��   D:\Tomcat 7.0\work\
	                      * Catalina localhost Rebuy upload__36143375_1547fb92038__8000_00000014.tmp*/
	private String myFileFileName; //��������ϴ�ͼƬ��ȫ�����磺�⽭��.jpg �ϴ��Ժ��Ĭ����������ط�
	
	//�ϴ�ͼƬ
	public String selectAllUpdata() throws Exception{
		//����UpdataDao�Ĳ�ѯ �ϴ����ݵķ���
		List list=updataDao.selectUpdata(this.getPageNow(),this.getPageSize());
		//���ݵ�ǰҳ��һ����������¼������ҳ����Pager����
		Pager page=new Pager(pageNow,updataDao.selectUpdataSize());
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	public String addallUpdata() throws Exception{
		Updata u=new Updata();
		u.setUsername(updata.getUsername());
		u.setTitle(updata.getTitle());
		u.setPrice(updata.getPrice());
		u.setDescribe(updata.getDescribe());
		u.setType(updata.getType());
		
		//System.out.println("�ϴ����ļ���Ϊ��"+myFileFileName);
		String realPath =  ServletActionContext.getServletContext().getRealPath(file + "/");   
		//���ϴ���ͼƬ���Ʊ��浽���ݿ��У���������ȫ��ͳһ�Ե�ǰϵͳʱ������   
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");   
		String end =  myFileFileName.substring(myFileFileName.indexOf("."));   
		String newPhothPath = "/files/"+sdf.format(new Date())+end;//�õ�ͼƬ��������    
		u.setUpphoto(newPhothPath);
		
		u.setPhone(updata.getPhone());
		u.setQqnum(updata.getQqnum());
		u.setUpname(updata.getUpname());
		updataDao.addUpdata(u);
		this.setMessage("��ӳɹ�");
		//��ͼƬ�����Ʊ��浽���ݿ�    c
		copyFiles(realPath);// realPath:  D:\Tomcat 7.0\webapps\Rebuy\filesҪ�ϴ�������
		return SUCCESS;
		
	}
	
	/**    * ��Ŀ���ļ��������������µ�ָ��Ŀ¼��   * @param realPath   */
	private void copyFiles(String realPath) {   
		try {    
			InputStream is = new FileInputStream(myFile); 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");     
			String end =  myFileFileName.substring(myFileFileName.indexOf("."));    
			OutputStream os = new FileOutputStream(realPath + "/"+ sdf.format(new Date())+end);    
			int len = 0;     byte[] b = new byte[is.available()];   
			while((len = is.read(b)) != -1){     
				os.write(b, 0, len);     
				os.flush();    
				}     
			is.close();    
			os.close(); 
		}catch (FileNotFoundException e) {   
			e.printStackTrace();   
		} catch (IOException e) {    
			e.printStackTrace();    
		}    
	}
	
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public Updata getUpdata() {
		return updata;
	}
	public void setUpdata(Updata updata) {
		this.updata = updata;
	}
	

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMyFileFileName() {
		return myFileFileName;
	}
	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
	public File getMyFile() {
		return myFile;
	}
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}
}
