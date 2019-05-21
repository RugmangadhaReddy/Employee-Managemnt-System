package com.Employee.Dao;

import com.Employee.Bean.Login;
import com.Employee.Util.DatabaseUtil;

import java.sql.*;

public class EmployeeDao implements EmployeeDaoInterface{

	@Override
	public boolean loginEmployeeDao(Login login) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		boolean loginSuccess = false;
		try
		{
			con = DatabaseUtil.getConnection();
			String sqlSelect = "Select * from Employee_Info where Email_Id = ?";
			ps = con.prepareStatement(sqlSelect);
			ps.setString(1, login.getUserName());
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				
				if(rs.getString("password").equals(login.getPassword()))
				{
					loginSuccess = true;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return loginSuccess;
	}

	
	

}
