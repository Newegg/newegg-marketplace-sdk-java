package com.newegg.marketplace.sdk.datafeed.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.AddingCAProp65;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusRequest;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemChinaTaxSetting;
import com.newegg.marketplace.sdk.datafeed.model.ItemSubscription;
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
public interface SubmitOtherCaller {

	
	/*
		Item Warranty Feed
	 */
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_CHINATAXSETTING_DATA")
	SubmitFeedResponse itemChinaTaxSettingFeedJSON(@Param("sellerid") String sellerID,ItemChinaTaxSetting body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_CHINATAXSETTING_DATA")
	SubmitFeedResponse itemChinaTaxSettingFeedXML(@Param("sellerid") String sellerID,ItemChinaTaxSetting body);
	
	default SubmitFeedResponse itemChinaTaxSettingFeed(ItemChinaTaxSetting body) {
		switch(Variables.MediaType){
		case JSON:			
			return itemChinaTaxSettingFeedJSON(Content.SellerID,body);
		case XML:			
			return itemChinaTaxSettingFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_CAPROP65_DATA")
	SubmitFeedResponse itemCAProp65FeedJSON(@Param("sellerid") String sellerID,AddingCAProp65 body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_CAPROP65_DATA")
	SubmitFeedResponse itemCAProp65FeedXML(@Param("sellerid") String sellerID,AddingCAProp65 body);
	
	default SubmitFeedResponse itemCAProp65Feed(AddingCAProp65 body) {
		switch(Variables.MediaType){
		case JSON:			
			return itemCAProp65FeedJSON(Content.SellerID,body);
		case XML:			
			return itemCAProp65FeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_SUBSCRIPTION")
	SubmitFeedResponse itemSubscriptionFeedJSON(@Param("sellerid") String sellerID,ItemSubscription body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_SUBSCRIPTION")
	SubmitFeedResponse itemSubscriptionFeedXML(@Param("sellerid") String sellerID,ItemSubscription body);
	
	default SubmitFeedResponse itemSubscriptionFeed(ItemSubscription body) {
		switch(Variables.MediaType){
		case JSON:			
			return itemSubscriptionFeedJSON(Content.SellerID,body);
		case XML:			
			return itemSubscriptionFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	static SubmitOtherCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<SubmitOtherCaller>()
		.jsonBuild(SubmitOtherCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
	
	static SubmitOtherCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<SubmitOtherCaller>()
		.xmlBuild(SubmitOtherCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
}
