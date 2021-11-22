package com.promotionalEngine.Entities;

public class PromotionalDetails {
	
	String SKUID;
	Integer NoofSkus;
	Integer price;
	
	public PromotionalDetails(String sKUID, Integer noofSkus, Integer price) {
		super();
		SKUID = sKUID;
		NoofSkus = noofSkus;
		this.price = price;
	}

	public String getSKUID() {
		return SKUID;
	}

	public Integer getNoofSkus() {
		return NoofSkus;
	}

	public Integer getPrice() {
		return price;
	}
	
	
	
    

}
