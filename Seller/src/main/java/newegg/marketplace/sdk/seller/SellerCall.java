package newegg.marketplace.sdk.seller;

import java.io.File;
import java.util.Optional;

import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.common.PlatformException;
import newegg.marketplace.sdk.seller.inner.SellerCaller;
import newegg.marketplace.sdk.seller.inner.SubcategoryCaller;
import newegg.marketplace.sdk.seller.model.DownloadFeedSchemaRequest;
import newegg.marketplace.sdk.seller.model.GetIndustryListResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertiesRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertiesResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValuesRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValuesResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusForInternationalCountryRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusForInternationalCountryResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusV1Request;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusV1Response;
import newegg.marketplace.sdk.seller.model.GetWarehouseResponse;
import newegg.marketplace.sdk.seller.model.SellerStatusCheckResponse;

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
	 * @return {@linkplain SellerStatusCheckResponse}
	 */
	public SellerStatusCheckResponse sellerStatusCheck() {
		return caller.sellerStatus();
	}
	
	public GetWarehouseResponse getWarehouseList() {
		return caller.getWarehouseList();
	}
	
	/**
	 * <pre>
	 * Get the list of industry that is currently on Newegg Marketplace. 
	 * Response contains Industry Code and Industry Name.
	 * </pre> 
	 * @param industryCode Optional.empty() for none,or  Optional.of("XX") 
	 * @return {@linkplain GetIndustryListResponse}  
	 */
	public GetIndustryListResponse getIndustryList(Optional<String> industryCode) {
		return caller.getIndustryList(industryCode.isPresent()? industryCode.get():"");
	}
	
	/**
	 * <pre>
	 * Download the schema of specified feed type. 
	 * You can download schema files for Item Creation, Inventory Update or Order Shipping.
	 * </pre>
	 * @param body {@linkplain DownloadFeedSchemaRequest} 
	 * @return {@linkplain File}  nullable
	 */
	public File downloadFeedSchema(DownloadFeedSchemaRequest body) {
		return downloadCaller.downloadFeedSchema(body);
	}
	
	/**
	 * <pre>
	 * Get the subcategory status for the specified seller account. 
	 * Subcategory is either enabled or not enabled for a seller.
	 * </pre>
	 * @param body {@linkplain GetSubcategoryStatusRequest} 
	 * @return {@linkplain GetSubcategoryStatusResponse} 
	 */
	public GetSubcategoryStatusResponse getSubcategoryStatus(GetSubcategoryStatusRequest body) {
		return subcategoryCaller.getSubcategoryStatus(body);
	}
	
	public GetSubcategoryStatusV1Response getSubcategoryStatusV1(GetSubcategoryStatusV1Request body) {
		return subcategoryCaller.getSubcategoryStatusV1(body);
	}

	/**
	 * <pre>
	 * Get the subcategory eligibility for a seller on international country. 
	 * Subcategory is either enabled or not enabled for a seller.
	 * 
	 * Only for USA.
	 * </pre>
	 * @param body {@linkplain GetSubcategoryStatusForInternationalCountryRequest} 
	 * @return {@linkplain GetSubcategoryStatusForInternationalCountryResponse} 
	 */
	public GetSubcategoryStatusForInternationalCountryResponse getSubcategoryStatusForInternationalCountry(GetSubcategoryStatusForInternationalCountryRequest body) {
		if(Content.Platform==Content.PLATFORM.USA)
			return subcategoryCaller.getSubcategory4InternationalCountry(body);
		else throw new PlatformException();
	}
	
	/**
	 * Get the subcategory properties for the specified subcategory.
	 * @param body {@linkplain GetSubcategoryPropertiesRequest}
	 * @return {@linkplain GetSubcategoryPropertiesResponse} 
	 */
	public GetSubcategoryPropertiesResponse getSubcategoryProperties(GetSubcategoryPropertiesRequest body) {
		return subcategoryCaller.getSubcategoryProperties(body);
	}
	
	/**
	 * Get the subcategory property value for the specified property.
	 * @param body {@linkplain GetSubcategoryPropertyValuesRequest}
	 * @return {@linkplain GetSubcategoryPropertyValuesResponse} 
	 */
	public GetSubcategoryPropertyValuesResponse getSubcategoryPropertyValues(GetSubcategoryPropertyValuesRequest body) {
		return subcategoryCaller.getSubcategoryPropertyValues(body);
	}
}
