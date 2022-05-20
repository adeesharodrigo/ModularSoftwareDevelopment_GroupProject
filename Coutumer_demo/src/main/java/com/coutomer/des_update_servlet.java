package com.coutomer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class des_update_servlet
 */
@WebServlet("/des_update_servlet")
public class des_update_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			    String party1=request.getParameter("party1");
			    String party2 =request.getParameter("party2");
			    String party3=request.getParameter("party3");
				String division=request.getParameter("division");
				String distric =request.getParameter("distric");
				String id=request.getParameter("id");
				
				ArrayList<Integer> status;
				
				status = des_staff_butil.update(id, division, distric, party1, party2, party3);
				
				if(status.get(0) ==1) {
					
					
					RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
					dis.forward(request, response);
				}
				else {
					if (status.get(1)==0) {
					List<Customer> cus =des_staff_butil.getDetails(id);
					request.setAttribute("cus", cus);
					
					RequestDispatcher dis = request.getRequestDispatcher("fail.jsp");
					dis.forward(request, response);}
					else {
						RequestDispatcher dis = request.getRequestDispatcher("submitted.jsp");
						dis.forward(request, response);
						
					}
				}
	}
}
