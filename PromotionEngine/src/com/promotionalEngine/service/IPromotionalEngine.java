package com.promotionalEngine.service;

import com.promotionalEngine.PromotionalEngine;
import com.promotionalEngine.Entities.Items;
import com.promotionalEngine.Entities.SKU;

public interface IPromotionalEngine {
	
	public boolean addNewSKUIDsRepository(SKU skuEntity)throws Exception;
	
	public boolean addPromotionalDetailsRepository(PromotionalEngine activePromotions)throws Exception;
	
	public boolean updatePrmotionalDetailsRepository(PromotionalEngine activePromotions)throws Exception;
	
	public boolean removeSKUIDs(String SKUID)throws Exception;
	
	public Integer getCartTotal();
	
	public void addItemToCart(Items Item);

}
