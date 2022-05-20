package com.updatedatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnet {
	


		
		private static String url = "jdbc:mysql://localhost:3306/erms";
		private static String userName = "root";
		private static String password = "19990721";
		private static Connection con;

		public static Connection getConnection() {
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection(url, userName, password);
				
			}
			catch (Exception e) {
				 e.printStackTrace();
				System.out.println("Database connection is not success!!!");
			}
			
			return con;
		}
	
}
