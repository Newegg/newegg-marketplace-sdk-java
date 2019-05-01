package com.newegg.marketplace.sdk.other.inner;


import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.other.Variables;
import com.newegg.marketplace.sdk.other.model.Domain;
import com.newegg.marketplace.sdk.other.model.GetServiceStatusResponse;

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
public interface OtherCaller {

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("GET /{domain}/servicestatus?sellerid={sellerid}")
	GetServiceStatusResponse verifyServiceStatusJSON(@Param("sellerid") String sellerID,@Param("domain") String domain);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("GET /{domain}/servicestatus?sellerid={sellerid}")
	GetServiceStatusResponse verifyServiceStatusXML(@Param("sellerid") String sellerID,@Param("domain") String domain);
	
	default GetServiceStatusResponse verifyServiceStatus(Domain domain) {
		switch(Variables.MediaType){
		case JSON:	
			if(Variables.SimulationEnabled)
				return verifyServiceStatusJSON(Content.SellerID,"contentmgmt");
			else
				return verifyServiceStatusJSON(Content.SellerID,domain.name());			
		case XML:
			if(Variables.SimulationEnabled)
				return verifyServiceStatusXML(Content.SellerID,"contentmgmt");
			else
				return verifyServiceStatusXML(Content.SellerID,domain.name());
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	
	static OtherCaller buildJSON() {		
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<OtherCaller>()
		.jsonBuild(OtherCaller.class, Variables.LogLevel, Variables.Retryer,OtherClient.genClient());		
	}		
	
	static OtherCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<OtherCaller>()
		.xmlBuild(OtherCaller.class, Variables.LogLevel, Variables.Retryer,OtherClient.genClient());		
	}
}
