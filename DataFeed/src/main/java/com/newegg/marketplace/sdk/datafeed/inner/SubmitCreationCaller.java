package com.newegg.marketplace.sdk.datafeed.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.ExistingFeed;
import com.newegg.marketplace.sdk.datafeed.model.InventoryAndPrice;
import com.newegg.marketplace.sdk.datafeed.model.ItemUpdate;
import com.newegg.marketplace.sdk.datafeed.model.ItemfeedRequest;
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
 * For openfeign used
 * @author QB
 *
 */
public interface SubmitCreationCaller {

/*	Item Creation/Update Feed	
*/

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v3")
	SubmitFeedResponse itemBasicInformationFeedJSON(@Param("sellerid") String sellerID,ItemUpdate body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v3")
	SubmitFeedResponse itemBasicInformationFeedXML(@Param("sellerid") String sellerID,ItemUpdate body);
	
	default SubmitFeedResponse itemBasicInformationFeed(ItemUpdate body) {
		switch(Variables.MediaType){
		case JSON:			
			return itemBasicInformationFeedJSON(Content.SellerID,body);
		case XML:			
			return itemBasicInformationFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v2")
	SubmitFeedResponse existingItemCreationFeedJSON(@Param("sellerid") String sellerID,ExistingFeed body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v2")
	SubmitFeedResponse existingItemCreationFeedXML(@Param("sellerid") String sellerID,ExistingFeed body);
	
	default SubmitFeedResponse existingItemCreationFeed(ExistingFeed body) {
		switch(Variables.MediaType){
		case JSON:			
			return existingItemCreationFeedJSON(Content.SellerID,body);
		case XML:			
			return existingItemCreationFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}			
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v1")
	SubmitFeedResponse itemCreationFeedJSON(@Param("sellerid") String sellerID,ItemfeedRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v1")
	SubmitFeedResponse itemCreationFeedXML(@Param("sellerid") String sellerID,ItemfeedRequest body);
	
	default SubmitFeedResponse itemCreationFeed(ItemfeedRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return itemCreationFeedJSON(Content.SellerID,body);
		case XML:			
			return itemCreationFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}			
	}
	
	static SubmitCreationCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<SubmitCreationCaller>()
		.jsonBuild(SubmitCreationCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
	
	static SubmitCreationCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<SubmitCreationCaller>()
		.xmlBuild(SubmitCreationCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
}
