package com.newegg.marketplace.sdk.datafeed;

import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.datafeed.inner.DataFeedCaller;
import com.newegg.marketplace.sdk.datafeed.inner.SubmitActivityCaller;
import com.newegg.marketplace.sdk.datafeed.inner.SubmitCreationCaller;
import com.newegg.marketplace.sdk.datafeed.inner.SubmitIAPCaller;
import com.newegg.marketplace.sdk.datafeed.inner.SubmitOrderCaller;
import com.newegg.marketplace.sdk.datafeed.inner.SubmitOtherCaller;
import com.newegg.marketplace.sdk.datafeed.model.AddingCAProp65;
import com.newegg.marketplace.sdk.datafeed.model.ExistingFeed;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusRequest;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusResponse;
import com.newegg.marketplace.sdk.datafeed.model.InventoryAndPrice;
import com.newegg.marketplace.sdk.datafeed.model.InventoryUpdate;
import com.newegg.marketplace.sdk.datafeed.model.ItemChinaTaxSetting;
import com.newegg.marketplace.sdk.datafeed.model.ItemPromotion;
import com.newegg.marketplace.sdk.datafeed.model.ItemSubscription;
import com.newegg.marketplace.sdk.datafeed.model.ItemUpdate;
import com.newegg.marketplace.sdk.datafeed.model.ItemfeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.MultiChannelOrderRequest;
import com.newegg.marketplace.sdk.datafeed.model.PremierItemMark;
import com.newegg.marketplace.sdk.datafeed.model.PriceUpdate;
import com.newegg.marketplace.sdk.datafeed.model.ProcessingReportResponse;
import com.newegg.marketplace.sdk.datafeed.model.ShipNoticeRequest;
import com.newegg.marketplace.sdk.datafeed.model.SubmitFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.VolumeDiscount;


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
public class DataFeedCall {

	private DataFeedCaller dataFeedCaller;
	private SubmitOtherCaller submitOtherCaller;
	private SubmitOrderCaller submitOrderCaller;
	private SubmitIAPCaller submitIAPCaller;
	private SubmitCreationCaller submitCreationCaller;
	private SubmitActivityCaller submitActivityCaller;
	
	public DataFeedCall() {
		this(Content.MEDIA_TYPE.XML);
	}
	
	private DataFeedCall(Content.MEDIA_TYPE mrdiaType) {
		switch(mrdiaType){
		case JSON:
			dataFeedCaller=DataFeedCaller.buildJSON();
			submitOtherCaller=SubmitOtherCaller.buildJSON();
			submitOrderCaller=SubmitOrderCaller.buildJSON();
			submitIAPCaller=SubmitIAPCaller.buildJSON();
			submitCreationCaller=SubmitCreationCaller.buildJSON();
			submitActivityCaller=SubmitActivityCaller.buildJSON();
			break;			
		case XML:
			dataFeedCaller=DataFeedCaller.buildXML();
			submitOtherCaller=SubmitOtherCaller.buildXML();
			submitOrderCaller=SubmitOrderCaller.buildXML();
			submitIAPCaller=SubmitIAPCaller.buildXML();
			submitCreationCaller=SubmitCreationCaller.buildXML();
			submitActivityCaller=SubmitActivityCaller.buildXML();
			break;			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}

	/**
	 * Get the status of specified feed request by specified query conditions.
	 * @param body {@linkplain GetFeedStatusRequest} 
	 * @return {@linkplain GetFeedStatusResponse} 
	 */
	public GetFeedStatusResponse getFeedStatus(GetFeedStatusRequest body) {
		return dataFeedCaller.getFeedStatus(body);
	}
	
	
	/**
	 * <pre>
	 * When “Get Feed Status” result is FINISHED, 
	 * use this request to get the ready/completed processing report for review.
	 * </pre>
	 * @param Requestid
	 * @return {@linkplain ProcessingReportResponse}
	 */
	public ProcessingReportResponse getFeedResult(String Requestid) {
		return dataFeedCaller.getFeedResult(Requestid);
	}
		
	/**
	 * <pre>
	 * Batch set the tax type of items that is enabled for shipping to China.
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain ItemChinaTaxSetting} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_ItemChinaTaxSettingFeed(ItemChinaTaxSetting body) {
		if(Content.Platform==Content.PLATFORM.USB||Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
		else
			return submitOtherCaller.itemChinaTaxSettingFeed(body);
	}
	
	/**
	 * <pre>
	 * Batch add California’s Proposition 65 (“Prop 65”) Warnings for Items.
	 * Only for USA,USB
	 * </pre>
	 * @param body {@linkplain AddingCAProp65} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_ItemCAProp65Feed(AddingCAProp65 body) {
		if(Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.CAN.name());
		else
			return submitOtherCaller.itemCAProp65Feed(body);
	}
	
	/**
	 * <pre>
	 * Batch add/update/remove items for Volume Discount program.
	 * </pre>
	 * @param body {@linkplain VolumeDiscount} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_VolumeDiscountFeed(VolumeDiscount body){
		return submitActivityCaller.volumeDiscountFeed(body);
	}

	/**
	 * <pre>
	 * Batch add/update/remove items for Volume Discount program.
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain ItemPromotion} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_ItemPromotionFeed(ItemPromotion body) {
		if(Content.Platform==Content.PLATFORM.USB||Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
		else
			return submitActivityCaller.itemPromotionFeed(body);
	}
	
	/**
	 * <pre>
	 * Batch enroll/remove items for Premier program for participating sellers.
	 * To participate in this program sellers must enroll in Newegg Shipping Label Service and Newegg  Premier Seller Program, 
	 * go to Newegg Seller Portal > Add-on Services to enroll.
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain PremierItemMark} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_ItemPremierMarkFeed(PremierItemMark body) {
		if(Content.Platform==Content.PLATFORM.USB||Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
		else
			return submitActivityCaller.itemPremierMarkFeed(body);
	}
	
	/**
	 * <pre>
	 * Batch add/remove items for Subscription & Save program.
	 * 
	 * Subscribe & Save is Newegg’s subscription service. 
	 * It is available for most items in different categories.
	 * This program allows customers to subscribe to certain items for repeat uses and have them shipped every few months with certain percentage of discount. 
	 * 
	 * Note: By submitting seller’s item, all listed items will automatically join/leave for all the ongoing Newegg’s subscription programs.
	 * </pre>
	 * @param body {@linkplain ItemSubscription} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_ItemSubscriptionFeed(ItemSubscription body) {
		return submitOtherCaller.itemSubscriptionFeed(body);
	}
	
	/**
	 * <pre>
	 * Batch ship orders that is placed on Newegg that seller’s will be responsible to fulfill.
	 * This request will allow seller’s to update shipment of one or all items in an order. 
	 * When the order has been completely fulfilled (i.e. all the item(s) in order shipped), the order process is completed.
	 * </pre>
	 * @param body {@linkplain ShipNoticeRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_OrderShipNoticeFeed(ShipNoticeRequest body) {
		return submitOrderCaller.orderShipNoticeFeed(body);
	}
		
	/**
	 * <pre>
	 * Batch create multi-channel orders that are not placed on Newegg.com.  
	 * Seller’s may fulfill orders from other channels, if and only If the items is fulfilled by SBN (Shipped by Newegg).
	 * </pre>
	 * @param body {@linkplain MultiChannelOrderRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_MultiChannelOrderFeed(MultiChannelOrderRequest body) {
		if(Content.Platform==Content.PLATFORM.USB)
			throw new PlatformException(PLATFORM.USB.name());
		else
			return submitOrderCaller.multiChannelOrderFeed(body);
	}
	
	/**
	 * <pre>
	 * Batch update items inventory, price information, shipping, and/or activation.
	 * 
	 * Note: once an item has been deactivated, all price and inventory update requests shall be disregarded. 
	 * You may update price and inventory again when you re-activate your item.
	 * Only for USB,CAN
	 * </pre>
	 * @param body {@linkplain InventoryAndPrice} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_InventoryAndPriceFeed(InventoryAndPrice body) {
		if(Content.Platform==Content.PLATFORM.USA)
			throw new PlatformException(PLATFORM.USA.name());
		else
			return submitIAPCaller.inventoryAndPriceFeed(body);
	}
	
	/**
	 * <pre>
	 * Batch update items price information, shipping, and/or activation for targeted country.
	 * 
	 * Note: If not enable to ship to different countries, default country is USA.
	 * To enable different countries to ship, you may manage at 
	 * Newegg Seller Portal > Manage Account > Shipping Settings, 
	 * please refer to our <a href="https://www.newegg.com/sellers/index.php/global-seller-program/"> Newegg Global Program </a> for more details. 
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain PriceUpdate} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_PriceUpdateFeed(PriceUpdate body) {
		if(Content.Platform==Content.PLATFORM.USB||Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
		else
			return submitIAPCaller.priceUpdateFeed(body);
	}
	
	/**
	 * <pre>
	 * Batch update items inventory where warehouse(s) is located locally or different region, 
	 * only one warehouse per region.
	 * 
	 * Note: Setup of seller’s warehouse(s) is managed at 
	 * Newegg Seller Portal > Manage Account > Shipping Settings. 
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain InventoryUpdate} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_InventoryUpdateFeed(InventoryUpdate body) {
		if(Content.Platform==Content.PLATFORM.USB||Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
		else
			return submitIAPCaller.inventoryUpdateFeed(body);
	}
	
	/**
	 * <pre>
	 * Batch updating basic information for items without having to specify item subcategory.
	 * 
	 * This template can only be used to update common item fields such as “Website Short Title”, 
	 * Product Description”, “Item Images”, etc.
	 * </pre>
	 * @param body {@linkplain ItemUpdate} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_ItemBasicInformationFeed(ItemUpdate body) {
		return submitCreationCaller.itemBasicInformationFeed(body);
	}	
	
	/**
	 * <pre>
	 * Batch create items by matching against existing items in Newegg catalog.
	 * 
	 * The main intent of this approach is to let sellers listing an item using ISBN, UPC, Manufacturer Part Number, 
	 * or Newegg Item Number without specifying sub-category related information. 
	 * This helps sellers creating the items more quickly.
	 * </pre>
	 * @param body {@linkplain ExistingFeed} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_ExistingItemCreationFeed(ExistingFeed body) {
		return submitCreationCaller.existingItemCreationFeed(body);
	}

	/**
	 * <pre>
	 * Batch create or update items based on specified subcategories.
	 * Each subcategory, there’s a category schema that needs to be followed (different subcategory requires different property input per item). 
	 * 
	 * </pre>
	 * @param body {@linkplain ItemfeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public SubmitFeedResponse submitFeed_ItemCreationOrUpdateFeed(ItemfeedRequest body) {
		return submitCreationCaller.itemCreationFeed(body);
	}
	
}
