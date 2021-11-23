package com.promotionalEngine.helper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import com.promotionalEngine.Entities.Items;
import com.promotionalEngine.Entities.ResultEntity;
import com.promotionalEngine.Entities.SKU;

public class PromotionalEngineHelper {
	
	
	
	public static ResultEntity getPriceForItem(Items itm,SKU skuunit)
	{
	
		ResultEntity result=new ResultEntity();
	    if(skuunit.getPromotionalDetails().getPromtionVocher().size()>1)
	    {
	    	result.setVocher(VocherEnum.GROUPVOCHER);
	    	result.setActualPrice(skuunit.getUnitPrice()*itm.getNoOfSKUID());
	    	result.setPromotionPrice(0);
	    	return result;
	    }
		Integer offerSKUs=skuunit.getPromotionalDetails().getPromtionVocher().get(itm.getSKUID());
	    if(itm.getNoOfSKUID()>=offerSKUs)	
	    {
	        result.setVocher(VocherEnum.APPLICABLE);
	        result.setActualPrice(skuunit.getUnitPrice()*itm.getNoOfSKUID());
	        result.setPromotionPrice(getDiscountFinalPrice(itm.getNoOfSKUID(),skuunit.getUnitPrice(),skuunit.getPromotionalDetails().getPrice(),offerSKUs));
	        return result;
	    	
	    }
	    
	    result.setVocher(VocherEnum.NOT_APPLICABLE);
	    result.setActualPrice(skuunit.getUnitPrice()*itm.getNoOfSKUID());
	    result.setPromotionPrice(0);
   				
		return result;
		
	}
	
	
	public static Integer getDiscountFinalPrice(Integer noOfItem,Integer skuUnitprice,Integer promotionalPrice,Integer promotionOfferSkusNum)
	{
		
	         Integer DiscountedItem=noOfItem/promotionOfferSkusNum;
	         Integer nonDiscountedItem=noOfItem%promotionOfferSkusNum;
	         Integer total=(DiscountedItem*promotionalPrice)+(nonDiscountedItem*skuUnitprice);
	         
	         return total;         
		
	}
	
	public static Integer getGroupDiscountFinalPrice()
	{
		
		return null;
	}
	
	
	

}
