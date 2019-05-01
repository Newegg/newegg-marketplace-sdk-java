package com.newegg.marketplace.sdk.item.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.item.Variables;
import com.newegg.marketplace.sdk.item.model.InventoryQueryCriteria;
import com.newegg.marketplace.sdk.item.model.InventoryResult;
import com.newegg.marketplace.sdk.item.model.ItemInventoryInfo;
import com.newegg.marketplace.sdk.item.model.ItemPriceInfo;
import com.newegg.marketplace.sdk.item.model.PriceQueryCriteria;
import com.newegg.marketplace.sdk.item.model.PriceResult;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryResult;
import com.newegg.marketplace.sdk.item.model.UpdatePriceResult;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
/**
Copyright (c) 2000-present, Newegg Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

/**
 * For openfeign used
 * @author QB
 *
 */
public interface ItemUSACaller {

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /contentmgmt/item/international/inventory?sellerid={sellerid}")
	InventoryResult getItemInventoryJSON(@Param("sellerid") String sellerID,InventoryQueryCriteria body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /contentmgmt/item/international/inventory?sellerid={sellerid}")
	InventoryResult getItemInventoryXML(@Param("sellerid") String sellerID,InventoryQueryCriteria body);
	
	default InventoryResult getItemInventory(InventoryQueryCriteria body) {
		switch(Variables.MediaType){
		case JSON:			
			return getItemInventoryJSON(Content.SellerID,body);
		case XML:			
			return getItemInventoryXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /contentmgmt/item/international/price?sellerid={sellerid}")
	PriceResult getItemPriceJSON(@Param("sellerid") String sellerID,PriceQueryCriteria body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /contentmgmt/item/international/price?sellerid={sellerid}")
	PriceResult getItemPriceXML(@Param("sellerid") String sellerID,PriceQueryCriteria body);
	
	default PriceResult getItemPrice(PriceQueryCriteria body) {
		switch(Variables.MediaType){
		case JSON:			
			return getItemPriceJSON(Content.SellerID,body);
		case XML:			
			return getItemPriceXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/international/inventory?sellerid={sellerid}")
	UpdateInventoryResult updateItemInventoryJSON(@Param("sellerid") String sellerID,ItemInventoryInfo body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/international/inventory?sellerid={sellerid}")
	UpdateInventoryResult updateItemInventoryXML(@Param("sellerid") String sellerID,ItemInventoryInfo body);
	
	default UpdateInventoryResult updateItemInventory(ItemInventoryInfo body) {
		switch(Variables.MediaType){
		case JSON:			
			return updateItemInventoryJSON(Content.SellerID,body);
		case XML:			
			return updateItemInventoryXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/international/price?sellerid={sellerid}")
	UpdatePriceResult updateItemPriceJSON(@Param("sellerid") String sellerID,ItemPriceInfo body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/international/price?sellerid={sellerid}")
	UpdatePriceResult updateItemPriceXML(@Param("sellerid") String sellerID,ItemPriceInfo body);

	default UpdatePriceResult updateItemPrice(ItemPriceInfo body) {
		switch(Variables.MediaType){
		case JSON:			
			return updateItemPriceJSON(Content.SellerID,body);
		case XML:			
			return updateItemPriceXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static ItemUSACaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<ItemUSACaller>()
		.jsonBuild(ItemUSACaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
	
	static ItemUSACaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<ItemUSACaller>()
		.xmlBuild(ItemUSACaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
}
