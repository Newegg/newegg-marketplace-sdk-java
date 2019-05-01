package com.newegg.marketplace.sdk.datafeed.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.InventoryAndPrice;
import com.newegg.marketplace.sdk.datafeed.model.InventoryUpdate;
import com.newegg.marketplace.sdk.datafeed.model.PriceUpdate;
import com.newegg.marketplace.sdk.datafeed.model.SubmitFeedResponse;

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
 * <pre>
 * IAP (Inventory And Price)
 * For openfeign used
 * </pre>
 * @author QB
 *
 */
public interface SubmitIAPCaller {
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=INVENTORY_AND_PRICE_DATA")
	SubmitFeedResponse inventoryAndPriceFeedJSON(@Param("sellerid") String sellerID,InventoryAndPrice body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=INVENTORY_AND_PRICE_DATA")
	SubmitFeedResponse inventoryAndPriceFeedXML(@Param("sellerid") String sellerID,InventoryAndPrice body);
	
	default SubmitFeedResponse inventoryAndPriceFeed(InventoryAndPrice body) {
		switch(Variables.MediaType){
		case JSON:			
			return inventoryAndPriceFeedJSON(Content.SellerID,body);
		case XML:			
			return inventoryAndPriceFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=PRICE_DATA")
	SubmitFeedResponse priceUpdateFeedJSON(@Param("sellerid") String sellerID,PriceUpdate body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=PRICE_DATA")
	SubmitFeedResponse priceUpdateFeedXML(@Param("sellerid") String sellerID,PriceUpdate body);
	
	default SubmitFeedResponse priceUpdateFeed(PriceUpdate body) {
		switch(Variables.MediaType){
		case JSON:			
			return priceUpdateFeedJSON(Content.SellerID,body);
		case XML:			
			return priceUpdateFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=INVENTORY_DATA")
	SubmitFeedResponse inventoryUpdateFeedJSON(@Param("sellerid") String sellerID,InventoryUpdate body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=INVENTORY_DATA")
	SubmitFeedResponse inventoryUpdateFeedXML(@Param("sellerid") String sellerID,InventoryUpdate body);
	
	default SubmitFeedResponse inventoryUpdateFeed(InventoryUpdate body) {
		switch(Variables.MediaType){
		case JSON:			
			return inventoryUpdateFeedJSON(Content.SellerID,body);
		case XML:			
			return inventoryUpdateFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	
	static SubmitIAPCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<SubmitIAPCaller>()
		.jsonBuild(SubmitIAPCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
	
	static SubmitIAPCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<SubmitIAPCaller>()
		.xmlBuild(SubmitIAPCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
}
