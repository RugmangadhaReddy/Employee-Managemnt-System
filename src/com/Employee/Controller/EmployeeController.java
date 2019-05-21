package com.Employee.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Employee.Bean.Login;
import com.Employee.Service.EmployeeService;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		EmployeeService employeeService = new EmployeeService();
		System.out.println(action);
		if(action==null)
		{
			response.sendRedirect(request.getContextPath()+"/JSP/index.jsp");
		}
		else if(action.equals("ShowRegisterPage"))
		{
			response.sendRedirect(request.getContextPath()+"/JSP/register.jsp");
		}
		else if(action.equals("ShowRegisterPage"))
		{
			response.sendRedirect(request.getContextPath()+"/JSP/Login.jsp");
		}
		else if(action.equals("Login"))
		{
			System.out.println("Login Controllwer Start");
			String uname = request.getParameter("userName");
			String pwd = request.getParameter("password");
			Login login = new Login(uname,pwd);
			boolean loginSuccess = employeeService.loginEmployee(login);
			if(loginSuccess)
			{
				System.out.println("Login Controller Success");
				response.sendRedirect(request.getContextPath()+"/JSP/LoginSuccess.jsp");
			}
			else
			{
				RequestDispatcher rd  = request.getRequestDispatcher("/JSP/Home.jsp");
				request.setAttribute("Message", "Login Failed");
				rd.forward(request, response);
			}
			
			
			
		}
		else if(action.equals("Cancel"))
		{
			response.sendRedirect(request.getContextPath()+"/JSP/Home.jsp");
		}
		
	}

}
