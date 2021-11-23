package com.promotionalEngine.Entities;

import com.promotionalEngine.helper.VocherEnum;

public class ResultEntity {
	
	Integer actualPrice;
	Integer promotionPrice;
	VocherEnum vocher;
	
	public VocherEnum getVocher() {
		return vocher;
	}
	public void setVocher(VocherEnum vocher) {
		this.vocher = vocher;
	}
	public Integer getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(Integer actualPrice) {
		this.actualPrice = actualPrice;
	}
	public Integer getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(Integer promotionPrice) {
		this.promotionPrice = promotionPrice;
	}	
	
	
}
