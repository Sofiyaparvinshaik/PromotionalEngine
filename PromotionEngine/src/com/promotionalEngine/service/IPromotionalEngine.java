package com.promotionalEngine.service;

import java.util.List;

import com.promotionalEngine.PromotionalEngine;
import com.promotionalEngine.Entities.Items;
import com.promotionalEngine.Entities.PromotionalDetails;
import com.promotionalEngine.Entities.SKU;
import com.promotionalEngine.PromotionalEngineException.PromotionalEngineException;

public interface IPromotionalEngine {
	
	public boolean addNewSKUIDsRepository(SKU skuEntity)throws PromotionalEngineException;
	
	public boolean addorupdatePromotionalDetailsRepository(PromotionalDetails activePromotions)throws PromotionalEngineException;
	
	
	
	public boolean removeSKUIDs(String SKUID)throws PromotionalEngineException;
	
	public Integer getCartTotal(List<Items> cart);
	
	//public void addItemToCart(Items Item);
	
	public List<Items> getCart();
	
	public boolean clearCart();

}
