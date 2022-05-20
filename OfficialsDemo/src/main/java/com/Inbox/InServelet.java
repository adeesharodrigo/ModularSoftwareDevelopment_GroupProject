package com.Inbox;

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
 * Servlet implementation class InServelet
 */
@WebServlet("/InServelet")
public class InServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public InServelet() {
    	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Pass District
		String district=request.getParameter("district");
		
		ArrayList <String> cus = new ArrayList();
		cus.add(district);
		//------------------------------
		try {
			List<DResult> prl = DBConnector.pendingResults(district);
			request.setAttribute("PResults", prl);
			request.setAttribute("cus", cus);
			
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("Inbox.jsp");
			dis.forward(request, response);
	
	}

}
