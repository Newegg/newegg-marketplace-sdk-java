package com.newegg.marketplace.sdk.item.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.item.Variables;
import com.newegg.marketplace.sdk.item.model.GetItemInventoryRequest;
import com.newegg.marketplace.sdk.item.model.GetItemInventoryResponse;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryandPriceRequest;
import com.newegg.marketplace.sdk.item.model.GetItemPriceRequest;
import com.newegg.marketplace.sdk.item.model.GetItemPriceResponse;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryandPriceResponse;

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
	GetItemInventoryResponse getItemInventoryJSON(@Param("sellerid") String sellerID,GetItemInventoryRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/inventory?sellerid={sellerid}&version=304")
	GetItemInventoryResponse getItemInventoryXML(@Param("sellerid") String sellerID,GetItemInventoryRequest body);
	
	default GetItemInventoryResponse getItemInventory(GetItemInventoryRequest body) {
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
	GetItemPriceResponse getPriceJSON(@Param("sellerid") String sellerID,GetItemPriceRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/price?sellerid={sellerid}")
	GetItemPriceResponse getPriceXML(@Param("sellerid") String sellerID,GetItemPriceRequest body);

	default GetItemPriceResponse getPrice(GetItemPriceRequest body) {
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
	UpdateInventoryandPriceResponse updateInventoryAndPriceJSON(@Param("sellerid") String sellerID,UpdateInventoryandPriceRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /contentmgmt/item/inventoryandprice?sellerid={sellerid}")
	UpdateInventoryandPriceResponse updateInventoryAndPriceXML(@Param("sellerid") String sellerID,UpdateInventoryandPriceRequest body);
	
	default UpdateInventoryandPriceResponse updateInventoryAndPrice(UpdateInventoryandPriceRequest body) {
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
