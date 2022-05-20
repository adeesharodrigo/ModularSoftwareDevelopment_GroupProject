package com.officials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OfficialsDBUtil {
	
	public static List<DResults> publishedResults (){
		
		ArrayList<DResults> dis = new ArrayList<>();
		
		//DataBase Connection
		String url = "jdbc:mysql://localhost:3306/erms";
		String user = "root";
		String password = "Alsoftdata@98";
		
		//Assign Data
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "Select * from fresult";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
			do {
				
			String disc = rs.getString(1);
			int pr1 = rs.getInt(2);
			int pr2 = rs.getInt(3);
			int pr3 = rs.getInt(4);
			
			System.out.println(disc);
			System.out.println(pr1);
			System.out.println(pr2);
			System.out.println(pr3);
			
			
			if (!(disc.equals("Island"))) {
			DResults drslt = new DResults(disc, pr1, pr2, pr3);
			dis.add(drslt);
			}
			
			}
			while (rs.next());
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(dis);
		return dis;
		
	}

}
