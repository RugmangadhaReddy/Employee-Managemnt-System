package com.Employee.Service;

import com.Employee.Bean.Login;
import com.Employee.Dao.EmployeeDao;


public class EmployeeService implements EmployeeServiceInterface{

	EmployeeDao employeeDao = new EmployeeDao();
	@Override
	public boolean loginEmployee(Login login) {
		// TODO Auto-generated method stub
		boolean loginSuccess = false;
		loginSuccess = employeeDao.loginEmployeeDao(login);
		
		return loginSuccess;
	}

}
