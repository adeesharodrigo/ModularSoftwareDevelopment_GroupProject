package com.officials;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OfficialsServelet")
public class PublishServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Pass District
		String district=request.getParameter("district");
				
		ArrayList <String> cus = new ArrayList();
		cus.add(district);
		//------------------------------
		
		
		try {
		List<DResults> drl = OfficialsDBUtil.publishedResults();
		request.setAttribute("DResults", drl);
		request.setAttribute("cus", cus);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("Publish.jsp");
		dis.forward(request, response);
		
		
		
		
	}

}
