package com.promotionalEngine.Entities;

public class SKU {
	
	String SKUID;
	Integer unitPrice;
	PromotionalDetails promotionalDetails=null;
	
	
	public SKU(String sKUID, Integer unitPrice) {
		super();
		SKUID = sKUID;
		this.unitPrice = unitPrice;
	}


	public PromotionalDetails getPromotionalDetails() {
		return promotionalDetails;
	}


	public void setPromotionalDetails(PromotionalDetails promotionalDetails) {
		this.promotionalDetails = promotionalDetails;
	}


	public String getSKUID() {
		return SKUID;
	}


	public Integer getUnitPrice() {
		return unitPrice;
	}
	
	
	
	
	
	

}
