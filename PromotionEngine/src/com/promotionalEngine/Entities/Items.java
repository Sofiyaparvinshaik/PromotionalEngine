package com.promotionalEngine.Entities;

public class Items {
	
	String SKUID;
	
	Integer NoOfSKUID;

	public Items(String sKUID, Integer noOfSKUID) {
		super();
		SKUID = sKUID;
		NoOfSKUID = noOfSKUID;
	}

	public String getSKUID() {
		return SKUID;
	}

	public Integer getNoOfSKUID() {
		return NoOfSKUID;
	}
	
	
}
