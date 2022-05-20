package com.coutomer;



public class Customer {
	private boolean access;
    private int id;
    private String name;
    private String distric;
    private String status;

    
    public Customer(int id, String name, String distric, String status ,boolean access
    		) {
    this.access= access;
	this.id = id;
	this.name = name;
	this.distric = distric;
	this.status = status;

    }
    
    public boolean getAccess() {
        return access;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistric() {
        return distric;
    }

    public String getStatus() {
        return status;
    }

 
}



