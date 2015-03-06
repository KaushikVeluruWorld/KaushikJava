


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection.*;
import java.util.Scanner;

public class MovieDatabase {
  
	static Connection connection=null;
  static PreparedStatement ps=null;
  static java.sql.Statement statement=null;
  static ResultSet rs=null;
  
  public Connection getConnection() throws Exception
  {
	  
	  try
	  {
		  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		  //set up the connection with DB
		  System.out.println("connecting to database");
		  connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=movies;username=kaushikveluru;password=12345");
		  System.out.println("connection established!!");
		 
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
		  return null;
	  }
	  
	  return connection;
	
  }
  public void addMovie()
  {
	  
  }
  public void searchMovie() throws SQLException
  {
	  rs=statement.executeQuery("select * from moviesDB where title=?");
	  
	  while(rs.next())
	  {
		  System.out.println(rs.getString("title")+"\t"+rs.getString("actor")+"\t"+rs.getString("actress")+"\t"+rs.getString("genre")+"\t"+rs.getString("year"));	  
	  }

  }
  public void getMovies() throws SQLException
  {
	  rs=statement.executeQuery("select * from moviesDB");
	  if(rs!=null)
	  {
		  System.out.println("number of movies");
		  while(rs.next())
		  {
			  System.out.println("printing moives");
			  //System.out.print(rs.getString(1)+"\t"+rs.getString("actor")+"\t"+rs.getString("actress")+"\t"+rs.getString("genre")+"\t"+rs.getString("year"));
			  System.out.print(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
		  }

	  }
	  
	  else
		  System.out.println("No results found");
	  
  }
  
  public static void main(String[] args)
  {
	 MovieDatabase mdb=new MovieDatabase();
	  try {
		 connection=mdb.getConnection();
		 statement=connection.createStatement();
		 
		 Scanner sc=new Scanner(System.in);
		 while(true)
		 {
			 System.out.println("Enter your choice: 1. Browse Movies \n 2. Add Movies \n "
			 		+ "3. Search Movies by Movie Name \n 4. Quit");
			 int option=sc.nextInt();
			 
			 switch(option)
			 {
			 case 1:
				 mdb.getMovies();
				 break;
			 case 2: 
				 mdb.addMovie();
				 break;
			 case 3: 
				 mdb.searchMovie();
				 break;
			 case 4: 
				 System.exit(0);
				 break;
			 default:
				 System.out.println("invalid option");
				 break;
			 }
		 }
		 
		 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	 
		 
	 }
	  
	  
	  
  
	
}
