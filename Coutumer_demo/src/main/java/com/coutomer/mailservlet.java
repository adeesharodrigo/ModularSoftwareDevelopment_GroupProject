package com.coutomer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mailservlet
 */
@WebServlet("/mailservlet")
public class mailservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SendMail mail =new SendMail("surenbandara7@gmail.com","asfsegs","vadvsd");
		mail.send_now();
	}

}
