package com.onlineQuiz.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.onlineQuiz.database.MySQLAccess;

public class Login extends MySQLAccess {

	
	public boolean login(String username, String password) throws Exception 
	{
		Boolean reply=false;
		Connection connection=null;
		try
		{
			
			 connection=getConnection();
			 if(connection!=null)
			 {
				 System.out.println("befor error");
				 //create a statement
				  Statement st=connection.createStatement();
				  ResultSet rs=st.executeQuery("select * from onlinequiz.dbo.login");
				  System.out.println("after error");
				  while(rs.next())
				  {
					  System.out.println("username from database: "+rs.getString("username"));
					  System.out.println("username from password: "+rs.getString("password"));
						if(username.equals(rs.getString("username"))) 
						{
							if(password.equals(rs.getString("password")))
							{
								System.out.println("login succesfull");
								reply=true;;

							}
						}

				  }
				
				 connection.close();
			 }
			 else
				 return reply;

		}
		catch(Exception e)
		{
			e.printStackTrace();
			return reply;
		}
		return reply;
	}
	
	
}
