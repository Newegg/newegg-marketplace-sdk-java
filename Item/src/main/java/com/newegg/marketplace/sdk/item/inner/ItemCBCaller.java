package com.newegg.marketplace.sdk.item.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.item.Variables;
import com.newegg.marketplace.sdk.item.model.InventoryQueryCriteriaV2;
import com.newegg.marketplace.sdk.item.model.InventoryResultV2;
import com.newegg.marketplace.sdk.item.model.ItemInventoryAndPriceInfo;
import com.newegg.marketplace.sdk.item.model.PriceQueryCriteriaV2;
import com.newegg.marketplace.sdk.item.model.PriceResultV2;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryAndPriceResult;

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
public interface ItemCBCaller {

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/inventory?sellerid={sellerid}&version=304")
	InventoryResultV2 getItemInventoryJSON(@Param("sellerid") String sellerID,InventoryQueryCriteriaV2 body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/inventory?sellerid={sellerid}&version=304")
	InventoryResultV2 getItemInventoryXML(@Param("sellerid") String sellerID,InventoryQueryCriteriaV2 body);
	
	default InventoryResultV2 getItemInventory(InventoryQueryCriteriaV2 body) {
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
	@RequestLine("POST /contentmgmt/item/price?sellerid={sellerid}")
	PriceResultV2 getPriceJSON(@Param("sellerid") String sellerID,PriceQueryCriteriaV2 body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/price?sellerid={sellerid}")
	PriceResultV2 getPriceXML(@Param("sellerid") String sellerID,PriceQueryCriteriaV2 body);

	default PriceResultV2 getPrice(PriceQueryCriteriaV2 body) {
		switch(Variables.MediaType){
		case JSON:			
			return getPriceJSON(Content.SellerID,body);
		case XML:			
			return getPriceXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /contentmgmt/item/inventoryandprice?sellerid={sellerid}")
	UpdateInventoryAndPriceResult updateInventoryAndPriceJSON(@Param("sellerid") String sellerID,ItemInventoryAndPriceInfo body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /contentmgmt/item/inventoryandprice?sellerid={sellerid}")
	UpdateInventoryAndPriceResult updateInventoryAndPriceXML(@Param("sellerid") String sellerID,ItemInventoryAndPriceInfo body);
	
	default UpdateInventoryAndPriceResult updateInventoryAndPrice(ItemInventoryAndPriceInfo body) {
		switch(Variables.MediaType){
		case JSON:			
			return updateInventoryAndPriceJSON(Content.SellerID,body);
		case XML:			
			return updateInventoryAndPriceXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
			
	}
	
	
	
	static ItemCBCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<ItemCBCaller>()
		.jsonBuild(ItemCBCaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
	
	static ItemCBCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<ItemCBCaller>()
		.xmlBuild(ItemCBCaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
}
