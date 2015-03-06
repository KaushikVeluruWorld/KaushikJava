package com.onlineQuiz.database;

import java.sql.Connection;
import java.sql.*;

import com.mysql.jdbc.Statement;

public class loginCheck extends MySQLAccess{

	
	public boolean login(String username,String password)
	{
		try
		{
			Connection conn=getConnection();
			java.sql.Statement statement=conn.createStatement();
			String sql="Select username, password from login";
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next())
			{
				System.out.println("username= "+rs.getString(1)+" password="+rs.getString(2));
			}
			
			statement.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
	//test
	public static void main(String args[])
	{
		loginCheck check=new loginCheck();
		check.login("kaushik", "veluru");
		
	}
	
}
