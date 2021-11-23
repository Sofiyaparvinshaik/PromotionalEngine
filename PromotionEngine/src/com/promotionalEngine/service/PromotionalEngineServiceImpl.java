package com.promotionalEngine.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.promotionalEngine.PromotionalEngine;
import com.promotionalEngine.Entities.Items;
import com.promotionalEngine.Entities.PromotionalDetails;
import com.promotionalEngine.Entities.SKU;
import com.promotionalEngine.PromotionalEngineException.PromotionalEngineException;

public class PromotionalEngineServiceImpl implements IPromotionalEngine{
	
	
	private static HashMap<String,SKU> skuRepository=null;
	
	
	
	public HashMap<String,SKU> getRepository()
	{
		if(skuRepository==null)
		{
			return new HashMap<String,SKU>();
		}
		return skuRepository;
	}
	
	public boolean updateRepository(SKU skuUnit)
	{
		skuRepository.put(skuUnit.getSKUID(), skuUnit);
		return true;
	}
	
	public SKU getSKUUnitForPromotionalDetails(PromotionalDetails promo)
	{
	 
		return getRepository().get(promo.getSKUID());
		
	}

	@Override
	public boolean addNewSKUIDsRepository(SKU skuEntity) throws PromotionalEngineException {
		
		if(getRepository().get(skuEntity.getSKUID())==null)
		{
			updateRepository(skuEntity);
			return true;
		}
		throw new PromotionalEngineException("SKUID is already Present please update or remove");
		
		
	}

	@Override
	public boolean addorupdatePromotionalDetailsRepository(PromotionalDetails activePromotions) throws PromotionalEngineException {
		
		
		SKU sku=getSKUUnitForPromotionalDetails(activePromotions);
		if(sku!=null)
		{
		sku.setPromotionalDetails(activePromotions);
		return true;
		}
	
	    throw new PromotionalEngineException("Unable to udpate the PromotionalDetails for respective SKU please contact administrator to add SKU Unit");
	
		
	}

	@Override
	public boolean removeSKUIDs(String SKUID) throws PromotionalEngineException {
		// TODO Auto-generated method stub
		
		if(getRepository().get(SKUID)!=null)
		{
			getRepository().remove(SKUID);
			return true;
		}
		throw new PromotionalEngineException("Not Found SKUID unable to delete the resource");
			
	}

	@Override
	public Integer getCartTotal(List<Items> cart) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean clearCart() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Items> getCart() {
		// TODO Auto-generated method stub
		return new ArrayList<Items>();
	}
	

}
