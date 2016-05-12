package org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.db.DBConn;
import org.model.Updata;

public class UpdataDao {
	Connection conn;
	//查询所有内容的方法
	public List selectUpdata(int pageNow,int pageSize){
		try{
			List list=new ArrayList();
			conn=DBConn.getConn();
			PreparedStatement pstmt=conn.prepareStatement("select top "+pageSize+" * from updata where upid not in (select top "+pageSize*(pageNow-1)+" upid from updata)");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				Updata updata=new Updata();
				updata.setUpid(rs.getInt(1));
				updata.setUsername(rs.getString(2));
				updata.setTitle(rs.getString(3));
				updata.setPrice(rs.getFloat(4));
				updata.setDescribe(rs.getString(5));
				updata.setType(rs.getInt(6));
				updata.setUpphoto(rs.getString(7));
				updata.setPhone(rs.getString(8));
				updata.setQqnum(rs.getString(9));
				updata.setUpname(rs.getString(10));
				list.add(updata);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			DBConn.CloseConn();
		}
	}
	//查询总记录条数的方法
	public int selectUpdataSize(){
		try{
			conn=DBConn.getConn();
			PreparedStatement pstmt=conn.prepareStatement("select count(*) from updata");
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				int pageCount=rs.getInt(1);
				return pageCount;
			}
			return 0;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			DBConn.CloseConn();
		}
		
	}
	public boolean addUpdata(Updata updata){
		try{
			conn=DBConn.getConn();
			PreparedStatement pstmt=conn.prepareStatement("insert into [updata] values(?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, updata.getUsername());
			pstmt.setString(2, updata.getTitle());
			pstmt.setFloat(3,updata.getPrice());
			pstmt.setString(4, updata.getDescribe());
			pstmt.setInt(5, updata.getType());
			pstmt.setString(6, updata.getUpphoto());
			pstmt.setString(7,updata.getPhone());
			pstmt.setString(8, updata.getQqnum());
			pstmt.setString(9, updata.getUpname());
			pstmt.execute();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			DBConn.CloseConn();
		}
	}
	
}
