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
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String division=request.getParameter("division");
		String password =request.getParameter("password");
		try {
		List<Customer> cus=coutomerdbutil.validate(division, password);
		
		if(cus.get(0).getAccess()) {
		request.setAttribute("cus",cus);
		RequestDispatcher dis =request.getRequestDispatcher("useraccount.jsp");
		dis.forward(request, response);}
		
		else {
			RequestDispatcher dis =request.getRequestDispatcher("loginerror.jsp");
			dis.forward(request, response);
		}
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
