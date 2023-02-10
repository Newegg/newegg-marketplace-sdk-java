package newegg.marketplace.sdk.item.inner;

import newegg.marketplace.sdk.common.CallerFactory;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.item.Variables;
import newegg.marketplace.sdk.item.model.GetVolumeDiscountRequestResultRequest;
import newegg.marketplace.sdk.item.model.GetVolumeDiscountRequestResultResponse;
import newegg.marketplace.sdk.item.model.SubmitVolumeDiscountRequest;
import newegg.marketplace.sdk.item.model.SubmitVolumeDiscountResponse;

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
public interface VolumeDiscountCaller {
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /contentmgmt/item/volumediscount?sellerid={sellerid}")
	GetVolumeDiscountRequestResultResponse getVolumeDiscountRequestResultJSON(@Param("sellerid") String sellerID,GetVolumeDiscountRequestResultRequest body);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /contentmgmt/item/volumediscount?sellerid={sellerid}")
	GetVolumeDiscountRequestResultResponse getVolumeDiscountRequestResultXML(@Param("sellerid") String sellerID,GetVolumeDiscountRequestResultRequest body);
	
	default GetVolumeDiscountRequestResultResponse getVolumeDiscountRequestResult(GetVolumeDiscountRequestResultRequest body) {
		switch(Variables.MediaType){
		case JSON:
			return getVolumeDiscountRequestResultJSON(Content.SellerID,body);			
		case XML:
			
			return getVolumeDiscountRequestResultXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/volumediscount?sellerid={sellerid}")
	SubmitVolumeDiscountResponse submitVolumeDiscountJSON(@Param("sellerid") String sellerID,SubmitVolumeDiscountRequest body);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/volumediscount?sellerid={sellerid}")
	SubmitVolumeDiscountResponse submitVolumeDiscountXML(@Param("sellerid") String sellerID,SubmitVolumeDiscountRequest body);
	
	default SubmitVolumeDiscountResponse submitVolumeDiscount(SubmitVolumeDiscountRequest body) {
		switch(Variables.MediaType){
		case JSON:
			return submitVolumeDiscountJSON(Content.SellerID,body);			
		case XML:			
			return submitVolumeDiscountXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static VolumeDiscountCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<VolumeDiscountCaller>()
		.jsonBuild(VolumeDiscountCaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
	
	static VolumeDiscountCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<VolumeDiscountCaller>()
		.xmlBuild(VolumeDiscountCaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
}
