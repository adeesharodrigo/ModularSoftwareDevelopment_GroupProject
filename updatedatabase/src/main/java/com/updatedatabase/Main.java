package com.updatedatabase;

import java.util.Date; 

public class Main {
	 public static void main(String[] args) {
		 	int current_msg=0;
		 	while(true) {
		 		try {
					Thread.sleep(2000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}   
		 	
	    
	        Textreader a=new Textreader("inbox.SML");
	        try {
	    
	        if (current_msg<a.getNumber()) {
	        	String detail=a.getMsg().get(current_msg).split("sent")[0];
	        	String division = detail.split(",")[0].split("-")[1];
	        	String distric = detail.split(",")[1].split("-")[1];
	        	String party1 = detail.split(",")[2].split("-")[1];
	        	String party2 = detail.split(",")[3].split("-")[1];
	        	String party3 = detail.split(",")[4].split("-")[1];
	        	
	        	boolean s=Databaseup.insertcustomer(division, distric, party1, party2, party3);
	        	
	        	System.out.println("writing");
	        	current_msg=current_msg+1;
	        	
	       }}
	        catch(Exception e){System.out.println("update not success!");}
	        }}
	    }

