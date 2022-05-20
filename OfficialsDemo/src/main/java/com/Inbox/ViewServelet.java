package com.Inbox;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.officials.DResults;
import com.officials.OfficialsDBUtil;


@WebServlet("/ViewServelet")
public class ViewServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public String sb;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			this.sb = request.getParameter("view");
			System.out.println(sb);
			
			// pass district
			String district=request.getParameter("district");
			
			ArrayList <String> cus = new ArrayList();
			cus.add(district);
			//------------------------------------------------------
			
			try {
				System.out.println(sb);
				List<DResult> drl = DBConnector.viewDivision("Kegalle", sb);
				request.setAttribute("Results", drl);
				request.setAttribute("cus", cus);
				
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
				RequestDispatcher dis = request.getRequestDispatcher("View.jsp");
				dis.forward(request, response);
		}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		this.sb = request.getParameter("view");
//		System.out.println(sb);
		
		
		
		
	}

}
