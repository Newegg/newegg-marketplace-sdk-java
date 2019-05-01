package com.newegg.marketplace.sdk.datafeed.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusRequest;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusResponse;
import com.newegg.marketplace.sdk.datafeed.model.ProcessingReportResponse;

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
public interface DataFeedCaller {

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /datafeedmgmt/feeds/status?sellerid={sellerid}")
	GetFeedStatusResponse getFeedStatusJSON(@Param("sellerid") String sellerID,GetFeedStatusRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /datafeedmgmt/feeds/status?sellerid={sellerid}")
	GetFeedStatusResponse getFeedStatusXML(@Param("sellerid") String sellerID,GetFeedStatusRequest body);
	
	default GetFeedStatusResponse getFeedStatus(GetFeedStatusRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getFeedStatusJSON(Content.SellerID,body);
		case XML:			
			return getFeedStatusXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("GET /datafeedmgmt/feeds/result/{Requestid}?sellerid={sellerid}")
	ProcessingReportResponse getFeedResultJSON(@Param("sellerid") String sellerID,@Param("Requestid")String Requestid);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("GET /datafeedmgmt/feeds/result/{Requestid}?sellerid={sellerid}")
	ProcessingReportResponse getFeedResultXML(@Param("sellerid") String sellerID,@Param("Requestid")String Requestid);
	
	default ProcessingReportResponse getFeedResult(String Requestid) {
		switch(Variables.MediaType){
		case JSON:	
			if(Variables.SimulationEnabled)
				return getFeedResultJSON(Content.SellerID,"test");
			else
				return getFeedResultJSON(Content.SellerID,Requestid);
		case XML:	
			if(Variables.SimulationEnabled)
				return getFeedResultXML(Content.SellerID,"test");
			else
				return getFeedResultXML(Content.SellerID,Requestid);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	
	static DataFeedCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<DataFeedCaller>()
		.jsonBuild(DataFeedCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
	
	static DataFeedCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<DataFeedCaller>()
		.xmlBuild(DataFeedCaller.class, Variables.LogLevel, Variables.Retryer,DataFeedClient.genClient());		
	}
}
