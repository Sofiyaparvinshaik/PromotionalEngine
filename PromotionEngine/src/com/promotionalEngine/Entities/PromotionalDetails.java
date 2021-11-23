package com.promotionalEngine.Entities;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.promotionalEngine.Entities.*;

public class PromotionalDetails {
	
    Map<String,Integer> promotionVocher;
	Integer price;
	
	public PromotionalDetails(List<PromotionVocher> vochers, Integer price) {
		super();
		
		this.promotionVocher=vochers.stream().collect(Collectors.toMap(PromotionVocher::getSKUID,PromotionVocher::getNoofSku));
		this.price = price;
	}

	public Integer getPrice() {
		return price;
	}
	
	public Map<String,Integer> getPromtionVocher()
	{
		return promotionVocher;
	}
 

}
