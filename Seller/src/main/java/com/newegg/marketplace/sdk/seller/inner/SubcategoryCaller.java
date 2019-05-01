package com.newegg.marketplace.sdk.seller.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.seller.Variables;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValueRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValueResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryPropertiesRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryPropertiesResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryRequestV2;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryResponseV2;

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
 * @author QB
 *
 */
public interface SubcategoryCaller {

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /sellermgmt/seller/subcategory?sellerid={sellerid}")
	GetSubcatetoryResponse getSubcategoryStatusJSON(@Param("sellerid") String sellerID,GetSubcatetoryRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sellermgmt/seller/subcategory?sellerid={sellerid}")
	GetSubcatetoryResponse getSubcategoryStatusXML(@Param("sellerid") String sellerID,GetSubcatetoryRequest body);
	
	default GetSubcatetoryResponse getSubcategoryStatus(GetSubcatetoryRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getSubcategoryStatusJSON(Content.SellerID,body);			
		case XML:
			return getSubcategoryStatusXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /sellermgmt/seller/subcategory/V2?sellerid={sellerid}")
	GetSubcatetoryResponseV2 getSubcategory4InternationalCountryJSON(@Param("sellerid") String sellerID,GetSubcatetoryRequestV2 body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sellermgmt/seller/subcategory/V2?sellerid={sellerid}")
	GetSubcatetoryResponseV2 getSubcategory4InternationalCountryXML(@Param("sellerid") String sellerID,GetSubcatetoryRequestV2 body);	
	
	default GetSubcatetoryResponseV2 getSubcategory4InternationalCountry(GetSubcatetoryRequestV2 body) {
		switch(Variables.MediaType){
		case JSON:			
			return getSubcategory4InternationalCountryJSON(Content.SellerID,body);			
		case XML:
			return getSubcategory4InternationalCountryXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /sellermgmt/seller/subcategoryproperty?sellerid={sellerid}")
	GetSubcatetoryPropertiesResponse getSubcategoryPropertiesJSON(@Param("sellerid") String sellerID,GetSubcatetoryPropertiesRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sellermgmt/seller/subcategoryproperty?sellerid={sellerid}")
	GetSubcatetoryPropertiesResponse getSubcategoryPropertiesXML(@Param("sellerid") String sellerID,GetSubcatetoryPropertiesRequest body);
	
	default GetSubcatetoryPropertiesResponse getSubcategoryProperties(GetSubcatetoryPropertiesRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getSubcategoryPropertiesJSON(Content.SellerID,body);			
		case XML:
			return getSubcategoryPropertiesXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /sellermgmt/seller/propertyvalue?sellerid={sellerid}")
	GetSubcategoryPropertyValueResponse getSubcategoryPropertyValuesJSON(@Param("sellerid") String sellerID,GetSubcategoryPropertyValueRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sellermgmt/seller/propertyvalue?sellerid={sellerid}")
	GetSubcategoryPropertyValueResponse getSubcategoryPropertyValuesXML(@Param("sellerid") String sellerID,GetSubcategoryPropertyValueRequest body);
	
	default GetSubcategoryPropertyValueResponse getSubcategoryPropertyValues(GetSubcategoryPropertyValueRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getSubcategoryPropertyValuesJSON(Content.SellerID,body);			
		case XML:
			return getSubcategoryPropertyValuesXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	
	static SubcategoryCaller buildJSON() {		
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<SubcategoryCaller>()
		.jsonBuild(SubcategoryCaller.class, Variables.LogLevel, Variables.Retryer,SellerClient.genClient());		
	}			
	
	static SubcategoryCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<SubcategoryCaller>()
		.xmlBuild(SubcategoryCaller.class, Variables.LogLevel, Variables.Retryer,SellerClient.genClient());		
	}
}
