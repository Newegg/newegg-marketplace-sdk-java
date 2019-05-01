package com.newegg.marketplace.sdk.datafeed.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.ItemPromotion;
import com.newegg.marketplace.sdk.datafeed.model.PremierItemMark;
import com.newegg.marketplace.sdk.datafeed.model.SubmitFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.VolumeDiscount;

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
public interface SubmitActivityCaller {
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=VOLUME_DISCOUNT_DATA")
	SubmitFeedResponse volumeDiscountFeedJSON(@Param("sellerid") String sellerID,VolumeDiscount body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=VOLUME_DISCOUNT_DATA")
	SubmitFeedResponse volumeDiscountFeedXML(@Param("sellerid") String sellerID,VolumeDiscount body);
	
	default SubmitFeedResponse volumeDiscountFeed(VolumeDiscount body) {
		switch(Variables.MediaType){
		case JSON:			
			return volumeDiscountFeedJSON(Content.SellerID,body);
		case XML:			
			return volumeDiscountFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_PROMOTION_DATA")
	SubmitFeedResponse itemPromotionFeedJSON(@Param("sellerid") String sellerID,ItemPromotion body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_PROMOTION_DATA")
	SubmitFeedResponse itemPromotionFeedXML(@Param("sellerid") String sellerID,ItemPromotion body);
	
	default SubmitFeedResponse itemPromotionFeed(ItemPromotion body) {
		switch(Variables.MediaType){
		case JSON:			
			return itemPromotionFeedJSON(Content.SellerID,body);
		case XML:			
			return itemPromotionFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_PREMIER_MARK_DATA")
	SubmitFeedResponse itemPremierMarkFeedJSON(@Param("sellerid") String sellerID,PremierItemMark body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_PREMIER_MARK_DATA")
	SubmitFeedResponse itemPremierMarkFeedXML(@Param("sellerid") String sellerID,PremierItemMark body);
	
	default SubmitFeedResponse itemPremierMarkFeed(PremierItemMark body) {
		switch(Variables.MediaType){
		case JSON:			
			return itemPremierMarkFeedJSON(Content.SellerID,body);
		case XML:			
			return itemPremierMarkFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	
	static SubmitActivityCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<SubmitActivityCaller>()
		.jsonBuild(SubmitActivityCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
	
	static SubmitActivityCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<SubmitActivityCaller>()
		.xmlBuild(SubmitActivityCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
}
