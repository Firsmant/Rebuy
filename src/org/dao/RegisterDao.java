package org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.db.DBConn;


public class RegisterDao {
	Connection conn;
	public boolean addLogin(String username,String password){
		try{
			conn=DBConn.getConn();
			PreparedStatement pstmt=conn.prepareStatement("insert into [login] values(?,?)");
			pstmt.setString(1,username);
			pstmt.setString(2,password);
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
