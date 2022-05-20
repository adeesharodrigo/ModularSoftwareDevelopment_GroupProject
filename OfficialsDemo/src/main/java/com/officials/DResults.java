package com.officials;

public class DResults {
	
	private String district;
	private int party1;
	private int party2;
	private int party3;
	
	public DResults(String district, int party1, int party2, int party3) {
		this.district = district;
		this.party1 = party1;
		this.party2 = party2;
		this.party3 = party3;
	}

	public String getDistrict() {
		return district;
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
}
