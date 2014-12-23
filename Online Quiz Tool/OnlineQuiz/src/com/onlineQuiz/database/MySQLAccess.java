package com.onlineQuiz.database;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection.*;

public class MySQLAccess {
  
	private Connection connection=null;
  private PreparedStatement ps=null;
  private java.sql.Statement st=null;
  private ResultSet rs=null;
  
  public Connection getConnection() throws Exception
  {
	  
	  try
	  {
		  Class.forName("com.mysql.jdbc.Driver");
		  //set up the connection with DB
		  System.out.println("connecting to database");
		  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1","root","root");
		  System.out.println("connection established!!");
		 
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  return connection;
	
  }
  
	
}
