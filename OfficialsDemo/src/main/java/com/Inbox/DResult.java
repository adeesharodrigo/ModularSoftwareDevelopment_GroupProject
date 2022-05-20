package com.Inbox;

public class DResult {
	
	private String district;
	private String division;
	private int party1;
	private int party2;
	private int party3;
	private final String method;
	
	
	
	public DResult(String district, String division, int party1, int party2, int party3, String method) {
		this.method = method;
		this.district = district;
		this.division = division;
		this.party1 = party1;
		this.party2 = party2;
		this.party3 = party3;
	}


	public String getDistrict() {
		return district;
	}


	public String getDivision() {
		return division;
	}


	public int getParty1() {
		return party1;
	}


	public int getParty2() {
		return party2;
	}


	public int getParty3() {
		return party3;
	}


	public String getMethod() {
		return method;
	}

}
