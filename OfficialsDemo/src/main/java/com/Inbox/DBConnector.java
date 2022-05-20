package com.Inbox;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.officials.DResults;



public class DBConnector {
	
private static String pmsg = "no";

	
	public static List<DResult> pendingResults(String district){
		
		
		
		ArrayList<DResult> dis = new ArrayList<>();
		ArrayList<String> divs = new ArrayList<>();
		
		////DataBase Connection
		String url = "jdbc:mysql://localhost:3306/erms";
		String user = "root";
		String password = "Alsoftdata@98";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(pmsg);
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			
			String sql1 = "Select * from dresults where status='"+pmsg+"' and district='"+district+"'";
			ResultSet rs1 = stmt.executeQuery(sql1);
			
			if(rs1.next()) {
				System.out.println("done");
			do {
			String disc = rs1.getString(3);
			String div = rs1.getString(2);
			int pr1 = rs1.getInt(5);
			int pr2 = rs1.getInt(6);
			int pr3 = rs1.getInt(7);
			
			System.out.println(disc);
			System.out.println(pr1);
			System.out.println(pr2);
			System.out.println(pr3);
			
			
			divs.add(div);
			DResult drslt = new DResult(disc, div, pr1, pr2, pr3, "x");
			dis.add(drslt);
			
			}
			while(rs1.next());
			}
			
			System.out.println(rs1);
			String sql2 = "Select * from dresults where status = '"+pmsg+"' and district='"+district+"'";
			ResultSet rs2 = stmt.executeQuery(sql2);
			
			String sql3 = "Select * from dresults where status = '"+pmsg+"' and district='"+district+"'";
			ResultSet rs3 = stmt.executeQuery(sql3);
			System.out.println(rs2);
			
	
			if (rs2.next()) {
				do {
					String disc = rs1.getString(3);
					String div = rs1.getString(2);
					int pr1 = rs1.getInt(5);
					int pr2 = rs1.getInt(6);
					int pr3 = rs1.getInt(7);
					
					System.out.println(disc);
					System.out.println(pr1);
					System.out.println(pr2);
					System.out.println(pr3);
					
					if (!(divs.contains(div))) {
					divs.add(div);
					DResult drslt = new DResult(disc, div, pr1, pr2, pr3, "x");
					dis.add(drslt);
					}
					}
				while(rs1.next());
				
			}
			
			
	}
	catch (Exception e){
			e.printStackTrace();
	}
	
	System.out.println(dis);
	System.out.println(divs);
	return dis;
	
	
}

// ------------------------------------------------------------------------------------------------------------------------------
// Inbox | view database controller ---------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------


public static List<DResult> viewDivision (String district, String division){
	
	ArrayList<DResult> dis = new ArrayList<>();
	
	//DataBase Connection
	String url = "jdbc:mysql://localhost:3306/erms";
	String user = "root";
	String password = "Alsoftdata@98";
	
	//Assign Data
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("done");
		
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		String sql1 = "Select * from dresults where district='"+district+"' and name = '"+division+"'";  // Main database Table
		ResultSet rs1 = stmt.executeQuery(sql1);
		
		if (rs1.next()) {
			String disc = rs1.getString(3);
			String div = rs1.getString(2);
			int pr1 = rs1.getInt(5);
			int pr2 = rs1.getInt(6);
			int pr3 = rs1.getInt(7);
			
			System.out.println(disc);
			System.out.println(pr1);
			System.out.println(pr2);
			System.out.println(pr3);
			
			
			
			DResult drslt = new DResult(disc, div, pr1, pr2, pr3, "Direct From poling Station");
			dis.add(drslt);
			}
		
		String sql2 = "Select * from oresults where district='"+district+"' and name = '"+division+"'"; // Additional Database
		ResultSet rs2 = stmt.executeQuery(sql2);
		
		if (rs2.next()) {
			String disc = rs2.getString(3);
			String div = rs2.getString(2);
			int pr1 = rs2.getInt(5);
			int pr2 = rs2.getInt(6);
			int pr3 = rs2.getInt(7);
			
			System.out.println(disc);
			System.out.println(pr1);
			System.out.println(pr2);
			System.out.println(pr3);
			
			
			
			DResult drslt = new DResult(disc, div, pr1, pr2, pr3, "From the Divisional Office");
			dis.add(drslt);
			}
		
		String sql3 = "Select * from mresults where district='"+district+"' and name = '"+division+"'"; // Additional Database
		ResultSet rs3 = stmt.executeQuery(sql3);

		if (rs3.next()) {
			String disc = rs3.getString(3);
			String div = rs3.getString(2);
			int pr1 = rs3.getInt(5);
			int pr2 = rs3.getInt(6);
			int pr3 = rs3.getInt(7);
			
			System.out.println(disc);
			System.out.println(pr1);
			System.out.println(pr2);
			System.out.println(pr3);
			
			
			
			DResult drslt = new DResult(disc, div, pr1, pr2, pr3, "From Massage");
			dis.add(drslt);
			}


	}
	catch (Exception e){
		e.printStackTrace();
	}
	System.out.println(dis);
	return dis;
	
}


}