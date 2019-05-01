package com.newegg.marketplace.sdk.item;

import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.item.inner.ItemCBCaller;
import com.newegg.marketplace.sdk.item.inner.ItemUSACaller;
import com.newegg.marketplace.sdk.item.inner.ManufacturerCaller;
import com.newegg.marketplace.sdk.item.inner.VolumeDiscountCaller;
import com.newegg.marketplace.sdk.item.inner.WarrantyCaller;
import com.newegg.marketplace.sdk.item.model.AddManufacturerRequest;
import com.newegg.marketplace.sdk.item.model.AddManufacturerResponse;
import com.newegg.marketplace.sdk.item.model.InventoryQueryCriteria;
import com.newegg.marketplace.sdk.item.model.InventoryQueryCriteriaV2;
import com.newegg.marketplace.sdk.item.model.GetManufacturerProcessStatusRequest;
import com.newegg.marketplace.sdk.item.model.GetManufacturerProcessStatusResponse;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequest;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequestV2;
import com.newegg.marketplace.sdk.item.model.GetManufacturerResponse;
import com.newegg.marketplace.sdk.item.model.GetManufacturerResponseV2;
import com.newegg.marketplace.sdk.item.model.GetVolumeDiscountRequest;
import com.newegg.marketplace.sdk.item.model.GetVolumeDiscountResponse;
import com.newegg.marketplace.sdk.item.model.InventoryResult;
import com.newegg.marketplace.sdk.item.model.InventoryResultV2;
import com.newegg.marketplace.sdk.item.model.ItemInventoryAndPriceInfo;
import com.newegg.marketplace.sdk.item.model.ItemInventoryInfo;
import com.newegg.marketplace.sdk.item.model.ItemPriceInfo;
import com.newegg.marketplace.sdk.item.model.ItemWarrantyRequest;
import com.newegg.marketplace.sdk.item.model.ItemWarrantyResponse;
import com.newegg.marketplace.sdk.item.model.PriceQueryCriteria;
import com.newegg.marketplace.sdk.item.model.PriceQueryCriteriaV2;
import com.newegg.marketplace.sdk.item.model.PriceResult;
import com.newegg.marketplace.sdk.item.model.PriceResultV2;
import com.newegg.marketplace.sdk.item.model.SubmitVolumeDiscountRequest;
import com.newegg.marketplace.sdk.item.model.SubmitVolumeDiscountResponse;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryAndPriceResult;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryResult;
import com.newegg.marketplace.sdk.item.model.UpdatePriceResult;

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
	 * @param body {@linkplain GetVolumeDiscountRequest} 
	 * @return {@linkplain GetVolumeDiscountResponse} 
	 */
	public GetVolumeDiscountResponse getVolumeDiscountRequestResult(GetVolumeDiscountRequest body) {
		return vdCaller.getVolumeDiscountRequestResult(body);
	}
	
	
	/**
	 * <pre>
	 * A volume discount is an adjustment to the price of a product based on the quantity of that product in an order. 
	 * By offering volume discounts, sellers are able to reward those who purchase a multiple quantity of goods.
	 * Newegg Marketplace volume discount is designed as a 3-tier calculation. 
	 * Volume discount creation/adjustment can only be submitted with the following rules:
	 *  > Purchase Quantity: Minimum Purchase Quantity (If any) ≤ tier-1 &lt; tier-2 &lt; tier-3
	 *  > Price per Product: Regular Selling Price &gt; tier-1 &gt; tier-2 &gt; tier-3
	 *  > Shipping setting: tier-1 ≥ tier-2 ≥ tier-3
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
	 * @param body {@linkplain AddManufacturerRequest} 
	 * @return {@linkplain AddManufacturerResponse} 
	 */
	public AddManufacturerResponse submitManufacturerRequest(AddManufacturerRequest body) {
		return mfCaller.submitManufacturerRequest(body);
	}
	
	/**
	 * Query available manufacturer list from Newegg.
	 * @param body {@linkplain GetManufacturerRequest} 
	 * @return {@linkplain GetManufacturerResponse} 
	 */
	public GetManufacturerResponse manufacturerLookup(GetManufacturerRequest body) {
		return mfCaller.manufacturerLookup(body);
	}
	
	/**
	 * Query available manufacturer list on international country from Newegg.
	 * @param body {@linkplain GetManufacturerRequestV2} 
	 * @return {@linkplain GetManufacturerResponseV2} 
	 */
	public GetManufacturerResponseV2 ManufacturerLookupForInternationalCountry(GetManufacturerRequestV2 body) {
		if(Content.Platform==Content.PLATFORM.USA )
			return mfCaller.manufacturerLookupForInternationalCountry(body);
		else throw new PlatformException();
	}
	
	/**
	 * Check the status for the manufacturer request submitted previously.
	 * @param body {@linkplain GetManufacturerProcessStatusRequest} 
	 * @return {@linkplain GetManufacturerProcessStatusResponse} 
	 */
	public GetManufacturerProcessStatusResponse getManufacturerRequestStatus(GetManufacturerProcessStatusRequest body) {
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
	 * @param body {@linkplain InventoryQueryCriteria} 
	 * @return {@linkplain InventoryResult}
	 */
	public InventoryResult getItemInternationalInventory(InventoryQueryCriteria body) {
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
	 * @param body {@linkplain PriceQueryCriteria} 
	 * @return {@linkplain PriceResult} 
	 */
	public PriceResult getInternationalItemPrice(PriceQueryCriteria body) {
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
	 * @param body {@linkplain ItemInventoryInfo}
	 * @return {@linkplain UpdateInventoryResult}
	 */
	public UpdateInventoryResult updateItemInventory(ItemInventoryInfo body) {
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
	 * @param body {@linkplain ItemPriceInfo}
	 * @return {@linkplain UpdatePriceResult}
	 */
	public UpdatePriceResult updateItemPrice(ItemPriceInfo body) {
		if(Content.Platform==Content.PLATFORM.USA )
			return itemUSACaller.updateItemPrice(body);
		else throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
	}
	
	
	/**
	 * <pre>
	 * Tracking the inventory quantity of items in default warehouse.
	 * Only for USB,CAN
	 * </pre>
	 * @param body {@linkplain InventoryQueryCriteriaV2}
	 * @return {@linkplain InventoryResultV2}
	 */
	public InventoryResultV2 getItemInventory(InventoryQueryCriteriaV2 body) {
		if(Content.Platform==Content.PLATFORM.USB || Content.Platform==Content.PLATFORM.CAN)
			return itemCBCaller.getItemInventory(body);
		else throw new PlatformException(PLATFORM.USA.name());
	}
	
	/**
	 * <pre>
	 * Tracking the price related information of items.
	 * Only for USB,CAN
	 * </pre>
	 * @param body {@linkplain PriceQueryCriteriaV2}
	 * @return {@linkplain PriceResultV2}
	 */
	public PriceResultV2 getItemPrice(PriceQueryCriteriaV2 body) {
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
	 * @param body {@linkplain ItemInventoryAndPriceInfo}
	 * @return {@linkplain UpdateInventoryAndPriceResult}
	 */
	public UpdateInventoryAndPriceResult updateInventoryAndPrice(ItemInventoryAndPriceInfo body) {
		if(Content.Platform==Content.PLATFORM.USB || Content.Platform==Content.PLATFORM.CAN)
			return itemCBCaller.updateInventoryAndPrice(body);
		else throw new PlatformException(PLATFORM.USA.name());	
	}
}
