package com.updatedatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




import java.sql.DriverManager;


public class Databaseup {
	private static Connection con = null;
	private static Statement stmt = null;


	
    public static boolean insertcustomer(String division, String distric, String party1, String party2, String party3) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnet.getConnection();
    		stmt = con.createStatement();
    		String no="no";
    	    String sql = "insert into smsresult values (0,'"+division+"','"+distric+"','"+party1+"','"+party2+"','"+party3+"','"+no+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
    
 

}
