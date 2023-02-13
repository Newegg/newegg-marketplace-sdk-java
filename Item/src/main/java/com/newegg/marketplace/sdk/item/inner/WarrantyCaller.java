package com.newegg.marketplace.sdk.item.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.item.Variables;
import com.newegg.marketplace.sdk.item.model.ItemWarrantyRequest;
import com.newegg.marketplace.sdk.item.model.ItemWarrantyResponse;

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
 * 
 * @author QB
 *
 */
public interface WarrantyCaller {
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/warranty?sellerid={sellerid}")
	ItemWarrantyResponse submitItemWarrantyRequestJSON(@Param("sellerid") String sellerID,ItemWarrantyRequest body);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/warranty?sellerid={sellerid}")
	ItemWarrantyResponse submitItemWarrantyRequestXML(@Param("sellerid") String sellerID,ItemWarrantyRequest body);
	
	default ItemWarrantyResponse submitItemWarrantyRequest(ItemWarrantyRequest body) {
		switch(Variables.MediaType){
		case JSON:
			return submitItemWarrantyRequestJSON(Content.SellerID,body);			
		case XML:			
			return submitItemWarrantyRequestXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static WarrantyCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<WarrantyCaller>()
		.jsonBuild(WarrantyCaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
	
	static WarrantyCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<WarrantyCaller>()
		.xmlBuild(WarrantyCaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
	
}
