package com.newegg.marketplace.sdk.datafeed;

import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.datafeed.inner.DataFeedCaller;
import com.newegg.marketplace.sdk.datafeed.inner.SubmitActivityCaller;
import com.newegg.marketplace.sdk.datafeed.inner.SubmitCreationCaller;
import com.newegg.marketplace.sdk.datafeed.inner.SubmitIAPCaller;
import com.newegg.marketplace.sdk.datafeed.inner.SubmitOrderCaller;
import com.newegg.marketplace.sdk.datafeed.inner.SubmitOtherCaller;
import com.newegg.marketplace.sdk.datafeed.model.ExistingItemCreationFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ExistingItemCreationFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusRequest;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusResponse;
import com.newegg.marketplace.sdk.datafeed.model.InventoryAndPriceFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.InventoryAndPriceFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.InventoryUpdateFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.InventoryUpdateFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemBasicInformationFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemBasicInformationFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemCAProp65FeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemCAProp65FeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemChinaTaxSettingFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemChinaTaxSettingFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemCreationOrUpdateFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemCreationOrUpdateFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemPremierMarkFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemPremierMarkFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemPromotionFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemPromotionFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemSubscriptionFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemSubscriptionFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.MultiChannelOrderFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.MultiChannelOrderFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.OrderShipNoticeFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.OrderShipNoticeFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.PriceUpdateFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.PriceUpdateFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ProcessingReportResponse;
import com.newegg.marketplace.sdk.datafeed.model.SubmitFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.VolumeDiscountFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.VolumeDiscountFeedResponse;


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
	 * 	   allowed object is
     *     {@link String }
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
	 * @param body {@linkplain ItemChinaTaxSettingFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	@Deprecated
	public ItemChinaTaxSettingFeedResponse submitFeed_ItemChinaTaxSettingFeed(ItemChinaTaxSettingFeedRequest body) {
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
	 * @param body {@linkplain ItemCAProp65FeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public ItemCAProp65FeedResponse submitFeed_ItemCAProp65Feed(ItemCAProp65FeedRequest body) {
		if(Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.CAN.name());
		else
			return submitOtherCaller.itemCAProp65Feed(body);
	}
	
	/**
	 * <pre>
	 * Batch add/update/remove items for Volume Discount program.
	 * </pre>
	 * @param body {@linkplain VolumeDiscountFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public VolumeDiscountFeedResponse submitFeed_VolumeDiscountFeed(VolumeDiscountFeedRequest body){
		return submitActivityCaller.volumeDiscountFeed(body);
	}

	/**
	 * <pre>
	 * Batch add/update/remove items for Volume Discount program.
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain ItemPromotionFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	@Deprecated
	public ItemPromotionFeedResponse submitFeed_ItemPromotionFeed(ItemPromotionFeedRequest body) {
		if(Content.Platform==Content.PLATFORM.USB||Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
		else
			return submitActivityCaller.itemPromotionFeed(body);
	}
	
	/**
	 * <pre>
	 * Batch enroll/remove items for Premier program for participating sellers.
	 * To participate in this program sellers must enroll in Newegg Shipping Label Service and Newegg  Premier Seller Program, 
	 * go to Newegg Seller Portal &gt; Add-on Services to enroll.
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain ItemPremierMarkFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	@Deprecated
	public ItemPremierMarkFeedResponse submitFeed_ItemPremierMarkFeed(ItemPremierMarkFeedRequest body) {
		if(Content.Platform==Content.PLATFORM.USB||Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.USB.name()+","+PLATFORM.CAN.name());
		else
			return submitActivityCaller.itemPremierMarkFeed(body);
	}
	
	/**
	 * <pre>
	 * Batch add/remove items for Subscription &amp; Save program.
	 * 
	 * Subscribe &amp; Save is Newegg’s subscription service. 
	 * It is available for most items in different categories.
	 * This program allows customers to subscribe to certain items for repeat uses and have them shipped every few months with certain percentage of discount. 
	 * 
	 * Note: By submitting seller’s item, all listed items will automatically join/leave for all the ongoing Newegg’s subscription programs.
	 * </pre>
	 * @param body {@linkplain ItemSubscriptionFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	@Deprecated
	public ItemSubscriptionFeedResponse submitFeed_ItemSubscriptionFeed(ItemSubscriptionFeedRequest body) {
		return submitOtherCaller.itemSubscriptionFeed(body);
	}
	
	/**
	 * <pre>
	 * Batch ship orders that is placed on Newegg that seller’s will be responsible to fulfill.
	 * This request will allow seller’s to update shipment of one or all items in an order. 
	 * When the order has been completely fulfilled (i.e. all the item(s) in order shipped), the order process is completed.
	 * </pre>
	 * @param body {@linkplain OrderShipNoticeFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public OrderShipNoticeFeedResponse submitFeed_OrderShipNoticeFeed(OrderShipNoticeFeedRequest body) {
		return submitOrderCaller.orderShipNoticeFeed(body);
	}
		
	/**
	 * <pre>
	 * Batch create multi-channel orders that are not placed on Newegg.com.  
	 * Seller’s may fulfill orders from other channels, if and only If the items is fulfilled by SBN (Shipped by Newegg).
	 * </pre>
	 * @param body {@linkplain MultiChannelOrderFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public MultiChannelOrderFeedResponse submitFeed_MultiChannelOrderFeed(MultiChannelOrderFeedRequest body) {
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
	 * @param body {@linkplain InventoryAndPriceFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public InventoryAndPriceFeedResponse submitFeed_InventoryAndPriceFeed(InventoryAndPriceFeedRequest body) {
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
	 * Newegg Seller Portal &gt; Manage Account &gt; Shipping Settings, 
	 * please refer to our <a href="https://www.newegg.com/sellers/index.php/global-seller-program/"> Newegg Global Program </a> for more details. 
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain PriceUpdateFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public PriceUpdateFeedResponse submitFeed_PriceUpdateFeed(PriceUpdateFeedRequest body) {
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
	 * Newegg Seller Portal &gt; Manage Account &gt; Shipping Settings. 
	 * Only for USA
	 * </pre>
	 * @param body {@linkplain InventoryUpdateFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public InventoryUpdateFeedResponse submitFeed_InventoryUpdateFeed(InventoryUpdateFeedRequest body) {
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
	 * @param body {@linkplain ItemBasicInformationFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public ItemBasicInformationFeedResponse submitFeed_ItemBasicInformationFeed(ItemBasicInformationFeedRequest body) {
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
	 * @param body {@linkplain ExistingItemCreationFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public ExistingItemCreationFeedResponse submitFeed_ExistingItemCreationFeed(ExistingItemCreationFeedRequest body) {
		return submitCreationCaller.existingItemCreationFeed(body);
	}

	/**
	 * <pre>
	 * Batch create or update items based on specified subcategories.
	 * Each subcategory, there’s a category schema that needs to be followed (different subcategory requires different property input per item). 
	 * 
	 * </pre>
	 * @param body {@linkplain ItemCreationOrUpdateFeedRequest} 
	 * @return {@linkplain SubmitFeedResponse} 
	 */
	public ItemCreationOrUpdateFeedResponse submitFeed_ItemCreationOrUpdateFeed(ItemCreationOrUpdateFeedRequest body) {
		return submitCreationCaller.itemCreationFeed(body);
	}
	
}
