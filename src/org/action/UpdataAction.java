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
	
	//图片有关
	private final static String file = "files";  //上传到Tomcat的 工程下的files
	private File myFile;  /*临时文件上传到的位置   D:\Tomcat 7.0\work\
	                      * Catalina localhost Rebuy upload__36143375_1547fb92038__8000_00000014.tmp*/
	private String myFileFileName; //保存的是上传图片的全名，如：吴江波.jpg 上传以后就默认来了这个地方
	
	//上传图片
	public String selectAllUpdata() throws Exception{
		//调用UpdataDao的查询 上传内容的方法
		List list=updataDao.selectUpdata(this.getPageNow(),this.getPageSize());
		//根据当前页及一共多少条记录创建分页的类Pager对象
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
		
		//System.out.println("上传的文件名为："+myFileFileName);
		String realPath =  ServletActionContext.getServletContext().getRealPath(file + "/");   
		//将上传的图片名称保存到数据库中，但是名字全部统一以当前系统时间命名   
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");   
		String end =  myFileFileName.substring(myFileFileName.indexOf("."));   
		String newPhothPath = "/files/"+sdf.format(new Date())+end;//得到图片的新名称    
		u.setUpphoto(newPhothPath);
		
		u.setPhone(updata.getPhone());
		u.setQqnum(updata.getQqnum());
		u.setUpname(updata.getUpname());
		updataDao.addUpdata(u);
		this.setMessage("添加成功");
		//将图片的名称保存到数据库    c
		copyFiles(realPath);// realPath:  D:\Tomcat 7.0\webapps\Rebuy\files要上传到这里
		return SUCCESS;
		
	}
	
	/**    * 把目标文件拷贝到服务器下的指定目录中   * @param realPath   */
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
