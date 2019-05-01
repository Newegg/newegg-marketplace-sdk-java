package com.newegg.marketplace.sdk.seller;

import java.io.File;
import java.util.Optional;

import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.seller.inner.SellerCaller;
import com.newegg.marketplace.sdk.seller.inner.SubcategoryCaller;
import com.newegg.marketplace.sdk.seller.model.GetIndustryResponse;
import com.newegg.marketplace.sdk.seller.model.GetSchemaRequest;
import com.newegg.marketplace.sdk.seller.model.GetSellerAccountStatusResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValueRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValueResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryPropertiesRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryPropertiesResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryRequestV2;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryResponseV2;

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
public class SellerCall {

	private SellerCaller caller;
	private SellerCaller downloadCaller;
	private SubcategoryCaller subcategoryCaller;
	
	public SellerCall() {
		this(Content.MEDIA_TYPE.XML);
	}
	
	private SellerCall(Content.MEDIA_TYPE mrdiaType) {
		switch(mrdiaType){
		case JSON:
			caller=SellerCaller.buildJSON();			
			downloadCaller=SellerCaller.buildDownload(MEDIA_TYPE.JSON);			
			subcategoryCaller=SubcategoryCaller.buildJSON();
			break;			
		case XML:
			caller=SellerCaller.buildXML();
			downloadCaller=SellerCaller.buildDownload(MEDIA_TYPE.XML);
			subcategoryCaller=SubcategoryCaller.buildXML();
			break;			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	/**
	 * <pre>
	 * Get the seller account status.
	 * Additional for Newegg.com, it includes the seller’s warehouse location and shipping destination information.
	 * Only for USA,CAN
	 * </pre>
	 * @return {@linkplain GetSellerAccountStatusResponse}
	 */
	public GetSellerAccountStatusResponse sellerStatusCheck() {
		return caller.sellerStatus();
	}
	
	/**
	 * <pre>
	 * Get the list of industry that is currently on Newegg Marketplace. 
	 * Response contains Industry Code and Industry Name.
	 * </pre> 
	 * @param industryCode Optional.empty() for none,or  Optional.of("XX") 
	 * @return {@linkplain GetIndustryResponse}  
	 */
	public GetIndustryResponse getIndustryList(Optional<String> industryCode) {
		return caller.getIndustryList(industryCode.isPresent()? industryCode.get():"");
	}
	
	/**
	 * <pre>
	 * Download the schema of specified feed type. 
	 * You can download schema files for Item Creation, Inventory Update or Order Shipping.
	 * </pre>
	 * @param body {@linkplain GetSchemaRequest} 
	 * @return {@linkplain File}  nullable
	 */
	public File downloadFeedSchema(GetSchemaRequest body) {
		return downloadCaller.downloadFeedSchema(body);
	}
	
	/**
	 * <pre>
	 * Get the subcategory status for the specified seller account. 
	 * Subcategory is either enabled or not enabled for a seller.
	 * </pre>
	 * @param body {@linkplain GetSubcatetoryRequest} 
	 * @return {@linkplain GetSubcatetoryResponse} 
	 */
	public GetSubcatetoryResponse getSubcategoryStatus(GetSubcatetoryRequest body) {
		return subcategoryCaller.getSubcategoryStatus(body);
	}

	/**
	 * <pre>
	 * Get the subcategory eligibility for a seller on international country. 
	 * Subcategory is either enabled or not enabled for a seller.
	 * 
	 * Only for USA.
	 * </pre>
	 * @param body {@linkplain GetSubcatetoryRequestV2} 
	 * @return {@linkplain GetSubcatetoryResponseV2} 
	 */
	public GetSubcatetoryResponseV2 getSubcategoryStatusForInternationalCountry(GetSubcatetoryRequestV2 body) {
		if(Content.Platform==Content.PLATFORM.USA)
			return subcategoryCaller.getSubcategory4InternationalCountry(body);
		else throw new PlatformException();
	}
	
	/**
	 * Get the subcategory properties for the specified subcategory.
	 * @param body {@linkplain GetSubcatetoryPropertiesRequest}
	 * @return {@linkplain GetSubcatetoryPropertiesResponse} 
	 */
	public GetSubcatetoryPropertiesResponse getSubcategoryProperties(GetSubcatetoryPropertiesRequest body) {
		return subcategoryCaller.getSubcategoryProperties(body);
	}
	
	/**
	 * Get the subcategory property value for the specified property.
	 * @param body {@linkplain GetSubcategoryPropertyValueRequest}
	 * @return {@linkplain GetSubcategoryPropertyValueResponse} 
	 */
	public GetSubcategoryPropertyValueResponse getSubcategoryPropertyValues(GetSubcategoryPropertyValueRequest body) {
		return subcategoryCaller.getSubcategoryPropertyValues(body);
	}
}
