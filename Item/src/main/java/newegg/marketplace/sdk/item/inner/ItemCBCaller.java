package newegg.marketplace.sdk.item.inner;

import newegg.marketplace.sdk.common.CallerFactory;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.item.Variables;
import newegg.marketplace.sdk.item.model.GetItemInventoryListRequest;
import newegg.marketplace.sdk.item.model.GetItemInventoryListResponse;
import newegg.marketplace.sdk.item.model.GetItemInventoryRequest;
import newegg.marketplace.sdk.item.model.GetItemInventoryResponse;
import newegg.marketplace.sdk.item.model.GetItemPriceListRequest;
import newegg.marketplace.sdk.item.model.GetItemPriceListResponse;
import newegg.marketplace.sdk.item.model.GetItemPriceRequest;
import newegg.marketplace.sdk.item.model.GetItemPriceResponse;
import newegg.marketplace.sdk.item.model.UpdateInventoryandPriceRequest;
import newegg.marketplace.sdk.item.model.UpdateInventoryandPriceResponse;

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
public interface ItemCBCaller {

	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/Pricelist?sellerid={sellerid}")
	GetItemPriceListResponse getItemPriceListJSON(@Param("sellerid")String sellerID, GetItemPriceListRequest body);
	default GetItemPriceListResponse getItemPriceList(GetItemPriceListRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getItemPriceListJSON(Content.SellerID,body);			
		default:
			throw new RuntimeException("Sorry, the new version of the service only supports JSON requests.");
		}
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/inventorylist?sellerid={sellerid}")
	GetItemInventoryListResponse getItemInventoryListJSON(@Param("sellerid")String sellerID, GetItemInventoryListRequest body);
	default GetItemInventoryListResponse getItemInventoryList(GetItemInventoryListRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getItemInventoryListJSON(Content.SellerID,body);			
		default:
			throw new RuntimeException("Sorry, the new version of the service only supports JSON requests.");
		}
	}
	

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/inventory?sellerid={sellerid}&version=304")
	GetItemInventoryResponse getItemInventoryJSON(@Param("sellerid") String sellerID,GetItemInventoryRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/inventory?sellerid={sellerid}&version=304")
	GetItemInventoryResponse getItemInventoryXML(@Param("sellerid") String sellerID,GetItemInventoryRequest body);
	
	default GetItemInventoryResponse getItemInventory(GetItemInventoryRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getItemInventoryJSON(Content.SellerID,body);
		case XML:			
			return getItemInventoryXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/price?sellerid={sellerid}")
	GetItemPriceResponse getPriceJSON(@Param("sellerid") String sellerID,GetItemPriceRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/price?sellerid={sellerid}")
	GetItemPriceResponse getPriceXML(@Param("sellerid") String sellerID,GetItemPriceRequest body);

	default GetItemPriceResponse getPrice(GetItemPriceRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getPriceJSON(Content.SellerID,body);
		case XML:			
			return getPriceXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /contentmgmt/item/inventoryandprice?sellerid={sellerid}")
	UpdateInventoryandPriceResponse updateInventoryAndPriceJSON(@Param("sellerid") String sellerID,UpdateInventoryandPriceRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /contentmgmt/item/inventoryandprice?sellerid={sellerid}")
	UpdateInventoryandPriceResponse updateInventoryAndPriceXML(@Param("sellerid") String sellerID,UpdateInventoryandPriceRequest body);
	
	default UpdateInventoryandPriceResponse updateInventoryAndPrice(UpdateInventoryandPriceRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return updateInventoryAndPriceJSON(Content.SellerID,body);
		case XML:			
			return updateInventoryAndPriceXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
			
	}
	
	
	
	static ItemCBCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<ItemCBCaller>()
		.jsonBuild(ItemCBCaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
	
	static ItemCBCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<ItemCBCaller>()
		.xmlBuild(ItemCBCaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
}
