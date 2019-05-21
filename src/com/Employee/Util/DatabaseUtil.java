package com.Employee.Util;
import java.sql.*;
public class DatabaseUtil {
	
	public static final String DATABASE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String USER_NAME = "Rugma";
	public static final String PASSWORD = "1234";
	public static final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
	
	public static Connection getConnection()
	{
		Connection con = null;
		
		try
		{
			Class.forName(DATABASE_DRIVER);
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return con;
	}
	
	public static void closeConnection(Connection con)
	{
		
		if(con != null)
		{
				try
				{
					con.close();
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
		}
	}
	public static void closeStatement(PreparedStatement ps)
	{
		if(ps != null)
		{
		
			try
			{
				ps.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
