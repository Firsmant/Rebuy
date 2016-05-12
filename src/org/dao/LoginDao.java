package org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.db.DBConn;
import org.model.Login;

public class LoginDao {
	Connection conn;
	public Login checkLogin(String username,String password){
		try{
			conn=DBConn.getConn();
			PreparedStatement pstmt=conn.prepareStatement("select * from [login] where username=?"+" and password=?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				Login login=new Login();
				login.setId(rs.getInt(1));
				login.setUsername(rs.getString(2));
				login.setPassword(rs.getString(3));
				return login;
			}
			return null;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			DBConn.CloseConn();
		}
	}
	public Login selectLogin(String username){
		try{
			conn=DBConn.getConn();
			PreparedStatement pstmt=conn.prepareStatement("select * from [login] where username=?");
			pstmt.setString(1, username);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				Login login=new Login();
				login.setId(rs.getInt(1));
				login.setUsername(rs.getString(2));
				login.setPassword(rs.getString(3));
				return login;
			}
			return null;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			DBConn.CloseConn();
		}
	}

}
