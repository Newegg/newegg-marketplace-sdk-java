package newegg.marketplace.sdk.item.inner;

import newegg.marketplace.sdk.common.CallerFactory;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.item.Variables;
import newegg.marketplace.sdk.item.model.GetItemInternationalInventoryRequest;
import newegg.marketplace.sdk.item.model.GetItemInternationalInventoryResponse;
import newegg.marketplace.sdk.item.model.UpdateInventoryRequest;
import newegg.marketplace.sdk.item.model.UpdateItemPriceRequest;
import newegg.marketplace.sdk.item.model.GetItemInternationalInventoryListRequest;
import newegg.marketplace.sdk.item.model.GetItemInternationalInventoryListResponse;
import newegg.marketplace.sdk.item.model.GetInternationalItemPriceListRequest;
import newegg.marketplace.sdk.item.model.GetInternationalItemPriceListResponse;
import newegg.marketplace.sdk.item.model.GetInternationalItemPriceRequest;
import newegg.marketplace.sdk.item.model.GetInternationalItemPriceResponse;
import newegg.marketplace.sdk.item.model.UpdateInventoryResponse;
import newegg.marketplace.sdk.item.model.UpdateItemPriceResponse;

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
public interface ItemUSACaller {

	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/international/Pricelist?sellerid={sellerid}")
	GetInternationalItemPriceListResponse getInternationalItemPriceListJSON(@Param("sellerid") String sellerID,GetInternationalItemPriceListRequest body);
	default GetInternationalItemPriceListResponse  getInternationalItemPriceList(GetInternationalItemPriceListRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getInternationalItemPriceListJSON(Content.SellerID,body);			
		default:
			throw new RuntimeException("Sorry, the new version of the service only supports JSON requests.");
		}
	}
	
	
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/international/inventorylist?sellerid={sellerid}")
	GetItemInternationalInventoryListResponse getItemInternationalInventoryListJSON(@Param("sellerid") String sellerID,GetItemInternationalInventoryListRequest body);
	default GetItemInternationalInventoryListResponse  getItemInternationalInventoryList(GetItemInternationalInventoryListRequest batchInventoryRequest) {
		switch(Variables.MediaType){
		case JSON:			
			return getItemInternationalInventoryListJSON(Content.SellerID,batchInventoryRequest);			
		default:
			throw new RuntimeException("Sorry, the new version of the service only supports JSON requests.");
		}
	}
	
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /contentmgmt/item/international/inventory?sellerid={sellerid}")
	GetItemInternationalInventoryResponse getItemInventoryJSON(@Param("sellerid") String sellerID,GetItemInternationalInventoryRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /contentmgmt/item/international/inventory?sellerid={sellerid}")
	GetItemInternationalInventoryResponse getItemInventoryXML(@Param("sellerid") String sellerID,GetItemInternationalInventoryRequest body);
	
	default GetItemInternationalInventoryResponse getItemInventory(GetItemInternationalInventoryRequest body) {
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
	@RequestLine("PUT /contentmgmt/item/international/price?sellerid={sellerid}")
	GetInternationalItemPriceResponse getItemPriceJSON(@Param("sellerid") String sellerID,GetInternationalItemPriceRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /contentmgmt/item/international/price?sellerid={sellerid}")
	GetInternationalItemPriceResponse getItemPriceXML(@Param("sellerid") String sellerID,GetInternationalItemPriceRequest body);
	
	default GetInternationalItemPriceResponse getItemPrice(GetInternationalItemPriceRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getItemPriceJSON(Content.SellerID,body);
		case XML:			
			return getItemPriceXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/international/inventory?sellerid={sellerid}")
	UpdateInventoryResponse updateItemInventoryJSON(@Param("sellerid") String sellerID,UpdateInventoryRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/international/inventory?sellerid={sellerid}")
	UpdateInventoryResponse updateItemInventoryXML(@Param("sellerid") String sellerID,UpdateInventoryRequest body);
	
	default UpdateInventoryResponse updateItemInventory(UpdateInventoryRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return updateItemInventoryJSON(Content.SellerID,body);
		case XML:			
			return updateItemInventoryXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/item/international/price?sellerid={sellerid}")
	UpdateItemPriceResponse updateItemPriceJSON(@Param("sellerid") String sellerID,UpdateItemPriceRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/item/international/price?sellerid={sellerid}")
	UpdateItemPriceResponse updateItemPriceXML(@Param("sellerid") String sellerID,UpdateItemPriceRequest body);

	default UpdateItemPriceResponse updateItemPrice(UpdateItemPriceRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return updateItemPriceJSON(Content.SellerID,body);
		case XML:			
			return updateItemPriceXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static ItemUSACaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<ItemUSACaller>()
		.jsonBuild(ItemUSACaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
	
	static ItemUSACaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<ItemUSACaller>()
		.xmlBuild(ItemUSACaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
}
