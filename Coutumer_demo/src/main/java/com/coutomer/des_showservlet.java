package com.coutomer;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class des_showservlet
 */
@WebServlet("/des_showservlet")
public class des_showservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String party1=request.getParameter("party1");
	    String party2 =request.getParameter("party2");
	    String party3=request.getParameter("party3");
		String division=request.getParameter("division");
		String distric =request.getParameter("distric");
		String id=request.getParameter("id");

			    ArrayList<String> cus = new ArrayList<String>();
			    
			    cus.add(party1);
			    cus.add(party2);
			    cus.add(party3);
			    cus.add(division);
			    cus.add(distric);
			    cus.add(id);
			    
				request.setAttribute("cus", cus);
					RequestDispatcher dis = request.getRequestDispatcher("des_submitform.jsp");
					dis.forward(request, response);
				
		
	}

}
