package com.newegg.marketplace.sdk.item;

import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.item.inner.ItemCBCaller;
import com.newegg.marketplace.sdk.item.inner.ItemUSACaller;
import com.newegg.marketplace.sdk.item.inner.ManufacturerCaller;
import com.newegg.marketplace.sdk.item.inner.VolumeDiscountCaller;
import com.newegg.marketplace.sdk.item.inner.WarrantyCaller;
import com.newegg.marketplace.sdk.item.model.GetInternationalItemPriceRequest;
import com.newegg.marketplace.sdk.item.model.GetInternationalItemPriceResponse;
import com.newegg.marketplace.sdk.item.model.GetItemInternationalInventoryRequest;
import com.newegg.marketplace.sdk.item.model.GetItemInternationalInventoryResponse;
import com.newegg.marketplace.sdk.item.model.GetItemInventoryRequest;
import com.newegg.marketplace.sdk.item.model.GetItemInventoryResponse;
import com.newegg.marketplace.sdk.item.model.GetItemPriceRequest;
import com.newegg.marketplace.sdk.item.model.GetItemPriceResponse;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequestStatusRequest;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequestStatusResponse;
import com.newegg.marketplace.sdk.item.model.GetVolumeDiscountRequestResultRequest;
import com.newegg.marketplace.sdk.item.model.GetVolumeDiscountRequestResultResponse;
import com.newegg.marketplace.sdk.item.model.ItemWarrantyRequest;
import com.newegg.marketplace.sdk.item.model.ItemWarrantyResponse;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupForInternationalCountryRequest;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupForInternationalCountryResponse;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupRequest;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupResponse;
import com.newegg.marketplace.sdk.item.model.SubmitManufacturerRequest;
import com.newegg.marketplace.sdk.item.model.SubmitManufacturerResponse;
import com.newegg.marketplace.sdk.item.model.SubmitVolumeDiscountRequest;
import com.newegg.marketplace.sdk.item.model.SubmitVolumeDiscountResponse;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryRequest;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryResponse;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryandPriceRequest;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryandPriceResponse;
import com.newegg.marketplace.sdk.item.model.UpdateItemPriceRequest;
import com.newegg.marketplace.sdk.item.model.UpdateItemPriceResponse;

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
public class ItemCall {

	private VolumeDiscountCaller vdCaller;
	private ManufacturerCaller mfCaller;
	private WarrantyCaller wrCaller;
	private ItemUSACaller itemUSACaller;
	private ItemCBCaller itemCBCaller;
	
	public ItemCall() {
		this(Content.MEDIA_TYPE.XML);
	}
	
	private ItemCall(Content.MEDIA_TYPE mrdiaType) {						
		switch(mrdiaType){
		case JSON:
			vdCaller=VolumeDiscountCaller.buildJSON();
			mfCaller=ManufacturerCaller.buildJSON();
			wrCaller=WarrantyCaller.buildJSON();
			itemUSACaller=ItemUSACaller.buildJSON();
			itemCBCaller=ItemCBCaller.buildJSON();
			break;			
		case XML:
			vdCaller=VolumeDiscountCaller.buildXML();
			mfCaller=ManufacturerCaller.buildXML();
			wrCaller=WarrantyCaller.buildXML();
			itemUSACaller=ItemUSACaller.buildXML();
			itemCBCaller=ItemCBCaller.buildXML();
			break;			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	
	/**
	 * @param body {@linkplain GetVolumeDiscountRequestResultRequest} 
	 * @return {@linkplain GetVolumeDiscountRequestResultResponse} 
	 */
	public GetVolumeDiscountRequestResultResponse getVolumeDiscountRequestResult(GetVolumeDiscountRequestResultRequest body) {
		return vdCaller.getVolumeDiscountRequestResult(body);
	}
	
	
	/**
	 * <pre>
	 * A volume discount is an adjustment to the price of a product based on the quantity of that product in an order. 
	 * By offering volume discounts, sellers are able to reward those who purchase a multiple quantity of goods.
	 * Newegg Marketplace volume discount is designed as a 3-tier calculation. 
	 * Volume discount creation/adjustment can only be submitted with the following rules:
	 *  &gt; Purchase Quantity: Minimum Purchase Quantity (If any) ≤ tier-1 &lt; tier-2 &lt; tier-3
	 *  &gt; Price per Product: Regular Selling Price &gt; tier-1 &gt; tier-2 &gt; tier-3
	 *  &gt; Shipping setting: tier-1 &gt; tier-2 &gt; tier-3
	 * </pre>
	 * @param body {@linkplain SubmitVolumeDiscountRequest} 
	 * @return {@linkplain SubmitVolumeDiscountResponse} 
	 */
	public SubmitVolumeDiscountResponse submitVolumeDiscount(SubmitVolumeDiscountRequest body) {
		//Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		SubmitVolumeDiscountResponse r= vdCaller.submitVolumeDiscount(body);
		//Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		return r;
	}
	
	/**
	 * <pre>
	 * Manufacturer is one of the required information for creating new items in Newegg Marketplace. 
	 * Only pre-defined values from our system can be used. 
	 * A complete manufacturer list can be retrieved using Manufacturer Lookup. 
	 * If the manufacturer(s) for your items are not available from our system, 
	 * you can submit new manufacturer creation request to Newegg Marketplace.
	 * </pre>
	 * @param body {@linkplain SubmitManufacturerRequest} 
	 * @return {@linkplain SubmitManufacturerResponse} 
	 */
	public SubmitManufacturerResponse submitManufacturerRequest(SubmitManufacturerRequest body) {
		return mfCaller.submitManufacturerRequest(body);
	}
	
	/**
	 * Query available manufacturer list from Newegg.
	 * @param body {@linkplain ManufacturerLookupRequest} 
	 * @return {@linkplain ManufacturerLookupResponse} 
	 */
	public ManufacturerLookupResponse manufacturerLookup(ManufacturerLookupRequest body) {
		return mfCaller.manufacturerLookup(body);
	}
	
	/**
	 * Query available manufacturer list on international country from Newegg.
	 * @param body {@linkplain ManufacturerLookupForInternationalCountryRequest} 
	 * @return {@linkplain ManufacturerLookupForInternationalCountryResponse} 
	 */
	public ManufacturerLookupForInternationalCountryResponse ManufacturerLookupForInternationalCountry(ManufacturerLookupForInternationalCountryRequest body) {
		if(Content.Platform==Content.PLATFORM.USA )
			return mfCaller.manufacturerLookupForInternationalCountry(body);
		else throw new PlatformException();
	}
	
	/**
	 * Check the status for the manufacturer request submitted previously.
	 * @param body {@linkplain GetManufacturerRequestStatusRequest} 
	 * @return {@linkplain GetManufacturerRequestStatusResponse} 
	 */
	public GetManufacturerRequestStatusResponse getManufacturerRequestStatus(GetManufacturerRequestStatusRequest body) {
		return mfCaller.getManufacturerRequestStatus(body);
	}
	
	/**
	 * Specifying warranty services for refurbished and used items selling on Newegg Marketplace.
	 * @param body {@linkplain ItemWarrantyRequest} 
	 * @return {@linkplain ItemWarrantyResponse} 
	 */
	public ItemWarrantyResponse submitItemWarrantyRequest(ItemWarrantyRequest body) {
		return wrCaller.submitItemWarrantyRequest(body);
	}
	
	/**
	 * <pre>
	 * Tracking the inventory quantity of items in all registered warehouses around the world, 
	 * including the United States.
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain GetItemInternationalInventoryRequest} 
	 * @return {@linkplain GetItemInternationalInventoryResponse}
	 */
	public GetItemInternationalInventoryResponse getItemInternationalInventory(GetItemInternationalInventoryRequest body) {
		if(Content.Platform==Content.PLATFORM.USA )
			return itemUSACaller.getItemInventory(body);
		else throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
	}
	
	/**
	 * <pre>
	 * Tracking the price related information of items for destination countries, 
	 * including the United States.
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain GetInternationalItemPriceRequest} 
	 * @return {@linkplain GetInternationalItemPriceResponse} 
	 */
	public GetInternationalItemPriceResponse getInternationalItemPrice(GetInternationalItemPriceRequest body) {
		if(Content.Platform==Content.PLATFORM.USA )
			return itemUSACaller.getItemPrice(body);
		else throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
	}	
	
	/**
	 * <pre>
	 * Maintaining the inventory quantity of items in all registered warehouses around the world, 
	 * including the United States.
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain UpdateInventoryRequest}
	 * @return {@linkplain UpdateInventoryResponse}
	 */
	public UpdateInventoryResponse updateItemInventory(UpdateInventoryRequest body) {
		if(Content.Platform==Content.PLATFORM.USA )
			return itemUSACaller.updateItemInventory(body);
		else throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
	}	
	
	/**
	 * <pre>
	 * Maintaining the price information, shipping, and/or status of items in all eligible countries, 
	 * including the United States.
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain UpdateItemPriceRequest}
	 * @return {@linkplain UpdateItemPriceResponse}
	 */
	public UpdateItemPriceResponse updateItemPrice(UpdateItemPriceRequest body) {
		if(Content.Platform==Content.PLATFORM.USA )
			return itemUSACaller.updateItemPrice(body);
		else throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
	}
	
	
	/**
	 * <pre>
	 * Tracking the inventory quantity of items in default warehouse.
	 * Only for USB,CAN
	 * </pre>
	 * @param body {@linkplain GetItemInventoryRequest}
	 * @return {@linkplain GetItemInventoryResponse}
	 */
	public GetItemInventoryResponse getItemInventory(GetItemInventoryRequest body) {
		if(Content.Platform==Content.PLATFORM.USB || Content.Platform==Content.PLATFORM.CAN)
			return itemCBCaller.getItemInventory(body);
		else throw new PlatformException(PLATFORM.USA.name());
	}
	
	/**
	 * <pre>
	 * Tracking the price related information of items.
	 * Only for USB,CAN
	 * </pre>
	 * @param body {@linkplain GetItemPriceRequest}
	 * @return {@linkplain GetItemPriceResponse}
	 */
	public GetItemPriceResponse getItemPrice(GetItemPriceRequest body) {
		if(Content.Platform==Content.PLATFORM.USB || Content.Platform==Content.PLATFORM.CAN)
			return itemCBCaller.getPrice(body);
		else throw new PlatformException(PLATFORM.USA.name());		
	}
	
	/**
	 * <pre>
	 * Update items inventory, price information, shipping and status.
	 * Note: Once an item has been deactivated, all price and inventory update requests shall be disregarded. 
	 * You may update price and inventory again when you re-activate your item.
	 * Only for USB,CAN
	 * </pre>
	 * @param body {@linkplain UpdateInventoryandPriceRequest}
	 * @return {@linkplain UpdateInventoryandPriceResponse}
	 */
	public UpdateInventoryandPriceResponse updateInventoryAndPrice(UpdateInventoryandPriceRequest body) {
		if(Content.Platform==Content.PLATFORM.USB || Content.Platform==Content.PLATFORM.CAN)
			return itemCBCaller.updateInventoryAndPrice(body);
		else throw new PlatformException(PLATFORM.USA.name());	
	}
}
