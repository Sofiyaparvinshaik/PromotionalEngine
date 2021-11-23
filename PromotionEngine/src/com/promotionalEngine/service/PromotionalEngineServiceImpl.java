package com.promotionalEngine.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.promotionalEngine.PromotionalEngine;
import com.promotionalEngine.Entities.Items;
import com.promotionalEngine.Entities.PromotionVocher;
import com.promotionalEngine.Entities.PromotionalDetails;
import com.promotionalEngine.Entities.ResultEntity;
import com.promotionalEngine.Entities.SKU;
import com.promotionalEngine.PromotionalEngineException.PromotionalEngineException;
import com.promotionalEngine.helper.PromotionalEngineHelper;

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
	
	public List<SKU> getSKUUnitForPromotionalDetails(PromotionalDetails promo)
	{
	 
	    List<SKU> listOfSKU=new ArrayList<SKU>();	
		for(Entry<String,Integer> promovocher: promo.getPromtionVocher().entrySet())
		{
	     listOfSKU.add(getRepository().get(promovocher.getKey()));               		
		}
		
		return listOfSKU;
		
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
		
		
		List<SKU> skulist=getSKUUnitForPromotionalDetails(activePromotions);
		for(SKU sku:skulist)
		{
		sku.setPromotionalDetails(activePromotions);
		}
		
		if(skulist.size()==0)
		{
	    throw new PromotionalEngineException("Unable to udpate the PromotionalDetails for respective SKU please contact administrator to add SKU Unit");
		}
		
		return true;	
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
		
		HashMap<String,SKU> repo=getRepository();
		Integer Total=0;
		List<ResultEntity> results=new ArrayList<ResultEntity>();
		for(Items item:cart)
		{  
		results.add(PromotionalEngineHelper.getPriceForItem(item,repo.get(item.getSKUID())));	
		}
		
		for(ResultEntity re:results)
		{
			Total=Total+Math.min(re.getActualPrice(),re.getPromotionPrice());	
		}
		
		return Total;
	}
	
	@Override
	public boolean clearCart(List<Items> cart) {
		// TODO Auto-generated method stub
		
		 cart.clear();
		 return true;
	}

	@Override
	public List<Items> getCart() {
		// TODO Auto-generated method stub
		return new ArrayList<Items>();
	}
	

}
