package com.newegg.marketplace.sdk.datafeed.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.MultiChannelOrderRequest;
import com.newegg.marketplace.sdk.datafeed.model.ShipNoticeRequest;
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
public interface SubmitOrderCaller {

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ORDER_SHIP_NOTICE_DATA")
	SubmitFeedResponse orderShipNoticeFeedJSON(@Param("sellerid") String sellerID,ShipNoticeRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ORDER_SHIP_NOTICE_DATA")
	SubmitFeedResponse orderShipNoticeFeedXML(@Param("sellerid") String sellerID,ShipNoticeRequest body);
	
	default SubmitFeedResponse orderShipNoticeFeed(ShipNoticeRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return orderShipNoticeFeedJSON(Content.SellerID,body);
		case XML:			
			return orderShipNoticeFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=MULTICHANNEL_ORDER_DATA")
	SubmitFeedResponse multiChannelOrderFeedJSON(@Param("sellerid") String sellerID,MultiChannelOrderRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=MULTICHANNEL_ORDER_DATA")
	SubmitFeedResponse multiChannelOrderFeedXML(@Param("sellerid") String sellerID,MultiChannelOrderRequest body);
	
	default SubmitFeedResponse multiChannelOrderFeed(MultiChannelOrderRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return multiChannelOrderFeedJSON(Content.SellerID,body);
		case XML:			
			return multiChannelOrderFeedXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	static SubmitOrderCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<SubmitOrderCaller>()
		.jsonBuild(SubmitOrderCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
	
	static SubmitOrderCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<SubmitOrderCaller>()
		.xmlBuild(SubmitOrderCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
}
