package com.promotionalEngine.Entities;

public class PromotionVocher {
	
	String SKUID;
	Integer NoofSku;
	public PromotionVocher(String sKUID, Integer noofSku) {
		super();
		SKUID = sKUID;
		NoofSku = noofSku;
	}
	public String getSKUID() {
		return SKUID;
	}
	public Integer getNoofSku() {
		return NoofSku;
	}
	

}
