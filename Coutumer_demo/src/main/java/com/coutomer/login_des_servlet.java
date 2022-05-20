package com.coutomer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login_des_servlet
 */
@WebServlet("/login_des_servlet")
public class login_des_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String division=request.getParameter("division");
		String password =request.getParameter("password");
		try {
		List<Customer> cus=des_staff_butil.validate(division, password);
		
		if(cus.get(0).getAccess()) {
		request.setAttribute("cus",cus);
		RequestDispatcher dis =request.getRequestDispatcher("des_user.jsp");
		dis.forward(request, response);}
		
		else {
			RequestDispatcher dis =request.getRequestDispatcher("des_user_logerror.jsp");
			dis.forward(request, response);
		}
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
