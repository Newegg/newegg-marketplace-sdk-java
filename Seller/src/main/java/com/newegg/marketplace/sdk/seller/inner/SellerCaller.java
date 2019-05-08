package com.newegg.marketplace.sdk.seller.inner;

import java.io.File;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.seller.Variables;
import com.newegg.marketplace.sdk.seller.model.GetIndustryListResponse;
import com.newegg.marketplace.sdk.seller.model.DownloadFeedSchemaRequest;
import com.newegg.marketplace.sdk.seller.model.SellerStatusCheckResponse;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import feign.codec.Encoder;
import feign.jackson.JacksonEncoder;
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
import feign.jaxb.JAXBEncoder;
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
 * @author QB
 *
 */
public interface SellerCaller {
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("GET /sellermgmt/seller/accountstatus?sellerid={sellerid}")
	SellerStatusCheckResponse sellerStatusJSON(@Param("sellerid") String sellerID);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("GET /sellermgmt/seller/accountstatus?sellerid={sellerid}")
	SellerStatusCheckResponse sellerStatusXML(@Param("sellerid") String sellerID);

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("GET /sellermgmt/seller/accountstatus?sellerid={sellerid}&version=307")
	SellerStatusCheckResponse sellerStatusUSA_JSON(@Param("sellerid") String sellerID);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("GET /sellermgmt/seller/accountstatus?sellerid={sellerid}&version=307")
	SellerStatusCheckResponse sellerStatusUSA_XML(@Param("sellerid") String sellerID);
	
	default SellerStatusCheckResponse sellerStatus() {
		switch(Variables.MediaType){
		case JSON:
			if(Content.Platform==Content.PLATFORM.USA) {
				return sellerStatusUSA_JSON(Content.SellerID);
			}
			return sellerStatusJSON(Content.SellerID);			
		case XML:
			if(Content.Platform==Content.PLATFORM.USA) {
				return sellerStatusUSA_XML(Content.SellerID);
			}
			return sellerStatusXML(Content.SellerID);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("GET /sellermgmt/seller/industry?sellerid={sellerid}&industrycode={industrycode}")
	GetIndustryListResponse getIndustryListJSON(@Param("sellerid") String sellerID,@Param("industrycode") String code);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("GET /sellermgmt/seller/industry?sellerid={sellerid}&industrycode={industrycode}")
	GetIndustryListResponse getIndustryListXML(@Param("sellerid") String sellerID,@Param("industrycode") String code);
	
	default GetIndustryListResponse getIndustryList(String industryCode) {
		switch(Variables.MediaType){
		case JSON:		
			if(Variables.SimulationEnabled) {
				return getIndustryListJSON(Content.SellerID,"");	
			}else
				return getIndustryListJSON(Content.SellerID,industryCode);			
		case XML:
			if(Variables.SimulationEnabled) {
				return getIndustryListXML(Content.SellerID,"");	
			}else
				return getIndustryListXML(Content.SellerID,industryCode);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	@Headers({"Accept: application/octet-stream","Content-Type: application/json"})
	@RequestLine("PUT /sellermgmt/seller/feedschema?sellerid={sellerid}")
	File downloadFeedSchemaJSON(@Param("sellerid") String sellerID,DownloadFeedSchemaRequest body);
	
	@Headers({"Accept: application/octet-stream","Content-Type: application/xml"})
	@RequestLine("PUT /sellermgmt/seller/feedschema?sellerid={sellerid}")
	File downloadFeedSchemaXML(@Param("sellerid") String sellerID,DownloadFeedSchemaRequest body);
	
	default File downloadFeedSchema(DownloadFeedSchemaRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return downloadFeedSchemaJSON(Content.SellerID,body);			
		case XML:
			return downloadFeedSchemaXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	static SellerCaller buildJSON() {		
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<SellerCaller>()
		.jsonBuild(SellerCaller.class, Variables.LogLevel, Variables.Retryer,SellerClient.genClient());		
	}		
	
	static SellerCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<SellerCaller>()
		.xmlBuild(SellerCaller.class, Variables.LogLevel, Variables.Retryer,SellerClient.genClient());		
	}
	
	static SellerCaller buildDownload(MEDIA_TYPE media) {
		Variables.MediaType=media;
		Encoder encode=null;
		switch(media){
		case JSON:			
			encode=new JacksonEncoder(Content.JSON_MAPPER);
			break;
		case XML:
			encode=new JAXBEncoder(Content.JAXB_FACTORY);
			break;
		}
		return new CallerFactory<SellerCaller>()
				.downloadBuild(SellerCaller.class, Variables.LogLevel, Variables.Retryer,SellerClient.genClient(),encode);
	}
}
