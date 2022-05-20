package com.updatedatabase;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class Textreader {
	private int msg_num ;
	private ArrayList<String> msgs ;
	
	public Textreader(String file_path) {
		int num=0;
		ArrayList<String> msgs_= new ArrayList<String>();
	    try {
	      File myObj = new File(file_path);
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        
	        if(data.contains("Result")) {
	        	num=num+1;
	        	msgs_.add(myReader.nextLine());}
	     
	        
	      }
	      this.msg_num=num;
	      this.msgs=msgs_;
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	public int getNumber() {
		return this.msg_num;
	}
	public ArrayList<String>  getMsg() {
		return this.msgs;
	}
	
	}


