package com.ValiedResults;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class VRDBConnecter {
		
	public static List<VRResults> valiedResults(String smsg, String discrit){
		
		
		ArrayList<VRResults> dis = new ArrayList<>();
		
		////DataBase Connection
		String url = "jdbc:mysql://localhost:3306/erms";
		String user = "root";
		String password = "Alsoftdata@98";
		
	try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(smsg);
			System.out.println(discrit);
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "Select * from dresults where status = '"+smsg+"' and district = '"+discrit+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
			do {
			String disc = rs.getString(2);
			int pr1 = rs.getInt(5);
			int pr2 = rs.getInt(6);
			int pr3 = rs.getInt(7);
			
			System.out.println(disc);
			System.out.println(pr1);
			System.out.println(pr2);
			System.out.println(pr3);
			
			
			
			VRResults vrrslt = new VRResults(disc, pr1, pr2, pr3);
			dis.add(vrrslt);
			}
			while(rs.next());
			}
	}
	catch (Exception e){
			e.printStackTrace();
	}
	
	System.out.println(dis);
	return dis;
	
	}
	
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Publishing Results	
	public static List<VRResults> pubResults(String discrit){
		
		
		ArrayList<VRResults> dis = new ArrayList<>();
		
		////DataBase Connection
		String url = "jdbc:mysql://localhost:3306/erms";
		String user = "root";
		String password = "Alsoftdata@98";
		
	try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(discrit);
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			
			String sql1 = "Select * from dresults where district = '"+discrit+"'";
			ResultSet rs1 = stmt.executeQuery(sql1);
			
			String sql2 = "Select * from fresult where name = '"+"Island"+"'";
			ResultSet rs2 = stmt.executeQuery(sql1);
			
			int tpr1=0;
			int tpr2=0;
			int tpr3=0;
			
			if(rs1.next()) {
			do {
			String disc = rs1.getString(2);
			int pr1 = rs1.getInt(5);
			int pr2 = rs1.getInt(6);
			int pr3 = rs1.getInt(7);
			
			tpr1 += pr1;
			tpr2 += pr2;
			tpr3 += pr3;
			
			System.out.println(disc);
			System.out.println(pr1);
			System.out.println(pr2);
			System.out.println(pr3);
			
			
			
			VRResults vrrslt = new VRResults(disc, pr1, pr2, pr3);
			dis.add(vrrslt);
			}
			while(rs1.next());
			}
			
			//Gives the total of the district trp1/ trp2/ trp3
			
			if (rs2.next()) {
				// Update Total Ammount
			}
	}
	catch (Exception e){
			e.printStackTrace();
	}
	
	System.out.println(dis);
	return dis;
	
	}
	
	
}
