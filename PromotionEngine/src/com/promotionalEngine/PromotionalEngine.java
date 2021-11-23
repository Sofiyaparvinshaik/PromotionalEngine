package com.promotionalEngine;

import java.util.ArrayList;
import java.util.List;

import com.promotionalEngine.Entities.Items;
import com.promotionalEngine.Entities.PromotionVocher;
import com.promotionalEngine.Entities.PromotionalDetails;
import com.promotionalEngine.Entities.SKU;
import com.promotionalEngine.PromotionalEngineException.PromotionalEngineException;
import com.promotionalEngine.service.IPromotionalEngine;
import com.promotionalEngine.service.PromotionalEngineServiceImpl;

public class PromotionalEngine {
	
	
	IPromotionalEngine engine=new PromotionalEngineServiceImpl();	

	   
	
	public void addingToRepo() throws PromotionalEngineException 
	{
	
		System.out.println("Adding SKU ID to Repository");
		SKU skuA=new SKU("A",50);
		SKU skuB=new SKU("B",30);
		SKU skuC=new SKU("C",20);
		SKU skuD=new SKU("D",15);
		
		engine.addNewSKUIDsRepository(skuA);
		engine.addNewSKUIDsRepository(skuB);
		engine.addNewSKUIDsRepository(skuC);
		engine.addNewSKUIDsRepository(skuD);
		
		System.out.println("Update Active Promotional details");
		PromotionVocher VochA=new PromotionVocher("A", 1);
		PromotionVocher VochB=new PromotionVocher("B", 1);
		PromotionVocher VochC=new PromotionVocher("C", 1);
		PromotionVocher VochD=new PromotionVocher("D", 1);
		
	    List<PromotionVocher> lisA=new ArrayList<>();
	    lisA.add(VochA);
	    List<PromotionVocher> lisB=new ArrayList<>();
	    lisB.add(VochB);
	    List<PromotionVocher> lisC=new ArrayList<>();
	    lisC.add(VochC);
	    List<PromotionVocher> lisD=new ArrayList<>();
	    lisD.add(VochD);
		PromotionalDetails promA=new PromotionalDetails(lisA,130);
		PromotionalDetails promB=new PromotionalDetails(lisB,120);
		PromotionalDetails promC=new PromotionalDetails(lisC,30);
		PromotionalDetails promD=new PromotionalDetails(lisD,45);
		
		engine.addorupdatePromotionalDetailsRepository(promA);
		engine.addorupdatePromotionalDetailsRepository(promB);
		engine.addorupdatePromotionalDetailsRepository(promC);
		engine.addorupdatePromotionalDetailsRepository(promD);
	}
	
	
	public void addToCart()
	{
		Items it1=new Items("A", 4);
		Items it2=new Items("B", 4);
		Items it3=new Items("C", 2);
		Items it4=new Items("D",5);
		List<Items> itemList=new ArrayList<Items>();
		itemList.add(it1);
		itemList.add(it2);
		itemList.add(it3);
		itemList.add(it4);
			
			System.out.println("GrandTotal="+engine.getCartTotal(itemList));

	}		
		
		
				
	
	

}
