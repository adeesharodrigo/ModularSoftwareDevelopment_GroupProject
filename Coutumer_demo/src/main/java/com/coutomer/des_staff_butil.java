package com.coutomer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class des_staff_butil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static ResultSet rs_ = null;
	private static ResultSet stmt_ = null;
	
	public static List<Customer> validate(String division,String password){
		
		ArrayList<Customer> customer = new ArrayList<>();
		try {
			con = DBConnect.getConnection();
			Statement stat=con.createStatement();
			String sql="select * from designated where name='"+division+"'and password='"+password+"'";
			ResultSet rs=stat.executeQuery(sql);
			
			if(rs.next()) {
				
				int id =rs.getInt(1);
				String name=rs.getString(2);
				String distric =rs.getString(3);
				String status=rs.getString(8);
				
				Customer c=new Customer(id,name,distric,status,true);
				customer.add(c);
				
			}
			else {
				int id =0;
				String name="";
				String distric ="";
				String status="";
				
				Customer c=new Customer(id,name,distric,status,false);
				customer.add(c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return customer;
				
	}
public static ArrayList<Integer> update(String id, String division, String distric, String party1, String party2, String party3) {
	
	int convertedID = Integer.parseInt(id);
	 ArrayList<Integer> status = new ArrayList<Integer>();
	 status.add(0);
	 status.add(0);
	 int submit = 0;
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql_ = "select * from designated where id='"+convertedID+"'";
    		rs_ = stmt.executeQuery(sql_);
    		
			while(rs_.next()) {
    			submit =rs_.getInt(9);
  
    		}
			System.out.println(submit); 
    		if(submit==0) {
    		String sql = "update designated set name='"+division+"',distric='"+distric+"',submit='"+1+"',party1='"+party1+"',party2='"+party2+"',party3='"+party3+"'"
    				+ "where id='"+id+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		
    		
    		if(rs > 0) {
    			 status.set(0,1);
    		}
    		else {
    			status.set(0, 0);
    		}}
    		else {status.set(1, 1);}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	System.out.println(status);   
    	return status;
    }
public static List<Customer> getDetails(String Id) {
	
	int convertedID = Integer.parseInt(Id);
	
	ArrayList<Customer> customer = new ArrayList<>();
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from designated where id='"+convertedID+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id =rs.getInt(1);
			String name=rs.getString(2);
			String distric =rs.getString(3);
			String status=rs.getString(8);
			
			Customer c=new Customer(id,name,distric,status,true);
			customer.add(c);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
	return customer;	
}
}
