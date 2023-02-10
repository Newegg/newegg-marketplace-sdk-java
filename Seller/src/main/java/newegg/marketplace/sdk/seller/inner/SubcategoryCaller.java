package newegg.marketplace.sdk.seller.inner;

import newegg.marketplace.sdk.common.CallerFactory;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.seller.Variables;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValuesRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValuesResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertiesRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertiesResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusForInternationalCountryRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusV1Request;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusV1Response;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusForInternationalCountryResponse;

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
	GetSubcategoryStatusResponse getSubcategoryStatusJSON(@Param("sellerid") String sellerID,GetSubcategoryStatusRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sellermgmt/seller/subcategory?sellerid={sellerid}")
	GetSubcategoryStatusResponse getSubcategoryStatusXML(@Param("sellerid") String sellerID,GetSubcategoryStatusRequest body);
	
	default GetSubcategoryStatusResponse getSubcategoryStatus(GetSubcategoryStatusRequest body) {
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
	@RequestLine("PUT /sellermgmt/seller/subcategory/v1.1?sellerid={sellerid}")
	GetSubcategoryStatusV1Response getSubcategoryStatusV1JSON(@Param("sellerid") String sellerID,GetSubcategoryStatusV1Request body);	
	
	default GetSubcategoryStatusV1Response getSubcategoryStatusV1(GetSubcategoryStatusV1Request body) {
		switch(Variables.MediaType){
		case JSON:			
			return getSubcategoryStatusV1JSON(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /sellermgmt/seller/subcategory/V2?sellerid={sellerid}")
	GetSubcategoryStatusForInternationalCountryResponse getSubcategory4InternationalCountryJSON(@Param("sellerid") String sellerID,GetSubcategoryStatusForInternationalCountryRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sellermgmt/seller/subcategory/V2?sellerid={sellerid}")
	GetSubcategoryStatusForInternationalCountryResponse getSubcategory4InternationalCountryXML(@Param("sellerid") String sellerID,GetSubcategoryStatusForInternationalCountryRequest body);	
	
	default GetSubcategoryStatusForInternationalCountryResponse getSubcategory4InternationalCountry(GetSubcategoryStatusForInternationalCountryRequest body) {
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
	GetSubcategoryPropertiesResponse getSubcategoryPropertiesJSON(@Param("sellerid") String sellerID,GetSubcategoryPropertiesRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sellermgmt/seller/subcategoryproperty?sellerid={sellerid}")
	GetSubcategoryPropertiesResponse getSubcategoryPropertiesXML(@Param("sellerid") String sellerID,GetSubcategoryPropertiesRequest body);
	
	default GetSubcategoryPropertiesResponse getSubcategoryProperties(GetSubcategoryPropertiesRequest body) {
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
	GetSubcategoryPropertyValuesResponse getSubcategoryPropertyValuesJSON(@Param("sellerid") String sellerID,GetSubcategoryPropertyValuesRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sellermgmt/seller/propertyvalue?sellerid={sellerid}")
	GetSubcategoryPropertyValuesResponse getSubcategoryPropertyValuesXML(@Param("sellerid") String sellerID,GetSubcategoryPropertyValuesRequest body);
	
	default GetSubcategoryPropertyValuesResponse getSubcategoryPropertyValues(GetSubcategoryPropertyValuesRequest body) {
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
