package com.newegg.marketplace.sdk.report;

import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.report.inner.CAPropSixtyFiveReportCaller;
import com.newegg.marketplace.sdk.report.inner.DailyInventoryCaller;
import com.newegg.marketplace.sdk.report.inner.DailyPriceCaller;
import com.newegg.marketplace.sdk.report.inner.ItemChinaTaxSettingCaller;
import com.newegg.marketplace.sdk.report.inner.ItemLookupCaller;
import com.newegg.marketplace.sdk.report.inner.OrderListReportCaller;
import com.newegg.marketplace.sdk.report.inner.PremierItemCaller;
import com.newegg.marketplace.sdk.report.inner.RMAListCaller;
import com.newegg.marketplace.sdk.report.inner.ReportStatusCaller;
import com.newegg.marketplace.sdk.report.inner.SettlementSummaryCaller;
import com.newegg.marketplace.sdk.report.inner.SettlementTransactionCaller;
import com.newegg.marketplace.sdk.report.model.get.CAPropSixtyFiveReportRequest;
import com.newegg.marketplace.sdk.report.model.get.CAPropSixtyFiveReportResponse;
import com.newegg.marketplace.sdk.report.model.get.DailyInventoryRequest;
import com.newegg.marketplace.sdk.report.model.get.DailyInventoryResponse;
import com.newegg.marketplace.sdk.report.model.get.DailyPriceRequest;
import com.newegg.marketplace.sdk.report.model.get.DailyPriceResponse;
import com.newegg.marketplace.sdk.report.model.get.GetReportStatusRequest;
import com.newegg.marketplace.sdk.report.model.get.GetReportStatusResponse;
import com.newegg.marketplace.sdk.report.model.get.ItemChinaTaxSettingRequest;
import com.newegg.marketplace.sdk.report.model.get.ItemChinaTaxSettingResponse;
import com.newegg.marketplace.sdk.report.model.get.ItemLookupRequest;
import com.newegg.marketplace.sdk.report.model.get.ItemLookupResponse;
import com.newegg.marketplace.sdk.report.model.get.OrderListRequest;
import com.newegg.marketplace.sdk.report.model.get.OrderListResponse;
import com.newegg.marketplace.sdk.report.model.get.PremierItemRequest;
import com.newegg.marketplace.sdk.report.model.get.PremierItemResponse;
import com.newegg.marketplace.sdk.report.model.get.RMAListRequest;
import com.newegg.marketplace.sdk.report.model.get.RMAListResponse;
import com.newegg.marketplace.sdk.report.model.get.SettlementSummaryRequest;
import com.newegg.marketplace.sdk.report.model.get.SettlementSummaryResponse;
import com.newegg.marketplace.sdk.report.model.get.SettlementTransactionRequest;
import com.newegg.marketplace.sdk.report.model.get.SettlementTransactionResponse;
import com.newegg.marketplace.sdk.report.model.submit.SCAPropSixtyFiveRequest;
import com.newegg.marketplace.sdk.report.model.submit.SCAPropSixtyFiveResponse;
import com.newegg.marketplace.sdk.report.model.submit.SDailyInventoryRequest;
import com.newegg.marketplace.sdk.report.model.submit.SDailyInventoryResponse;
import com.newegg.marketplace.sdk.report.model.submit.SDailyPriceRequest;
import com.newegg.marketplace.sdk.report.model.submit.SDailyPriceResponse;
import com.newegg.marketplace.sdk.report.model.submit.SItemChinaTaxSettingRequest;
import com.newegg.marketplace.sdk.report.model.submit.SItemChinaTaxSettingResponse;
import com.newegg.marketplace.sdk.report.model.submit.SItemLookupRequest;
import com.newegg.marketplace.sdk.report.model.submit.SItemLookupResponse;
import com.newegg.marketplace.sdk.report.model.submit.SOrderListRequest;
import com.newegg.marketplace.sdk.report.model.submit.SOrderListResponse;
import com.newegg.marketplace.sdk.report.model.submit.SPremierItemRequest;
import com.newegg.marketplace.sdk.report.model.submit.SPremierItemResponse;
import com.newegg.marketplace.sdk.report.model.submit.SRMAListRequest;
import com.newegg.marketplace.sdk.report.model.submit.SRMAListResponse;
import com.newegg.marketplace.sdk.report.model.submit.SSettlementSummaryRequest;
import com.newegg.marketplace.sdk.report.model.submit.SSettlementSummaryResponse;
import com.newegg.marketplace.sdk.report.model.submit.SSettlementTransactionRequest;
import com.newegg.marketplace.sdk.report.model.submit.SSettlementTransactionResponse;

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
 * @author Zack.J.Hung
 *
 */
public class ReportCall {
	private ReportStatusCaller reCaller = null;
	private OrderListReportCaller orderListCaller = null;
	private SettlementSummaryCaller ssCaller = null;
	private SettlementTransactionCaller stCaller = null;
	private RMAListCaller RMACaller = null;
	private ItemLookupCaller itemLookupCaller = null;
	private DailyInventoryCaller dailyInventoryCaller = null;
	private DailyPriceCaller dailyPriceCaller = null;
	//private DailyInventBtoBCANCaller InventoryBtoBCANCaller = null;
	private PremierItemCaller premierItemCaller = null;
	private CAPropSixtyFiveReportCaller CAPSFCaller = null;
	private ItemChinaTaxSettingCaller itemChinaTaxSetCaller = null;
			
	public ReportCall() {
		this(Content.MEDIA_TYPE.XML);
		//this(Variables.MediaType);
	}

	private ReportCall(Content.MEDIA_TYPE mediaType) {
		switch (mediaType) {
		case XML:
			reCaller = ReportStatusCaller.buildXML();
			orderListCaller = OrderListReportCaller.buildXML();
			ssCaller = SettlementSummaryCaller.buildXML();
			stCaller = SettlementTransactionCaller.buildXML();
			RMACaller = RMAListCaller.buildXML();
			itemLookupCaller = ItemLookupCaller.buildXML();
			dailyInventoryCaller = DailyInventoryCaller.buildXML();
			dailyPriceCaller = DailyPriceCaller.buildXML();
			//InventoryBtoBCANCaller = DailyInventBtoBCANCaller.buildXML();
			premierItemCaller = PremierItemCaller.buildXML();
			CAPSFCaller = CAPropSixtyFiveReportCaller.buildXML();
			itemChinaTaxSetCaller = ItemChinaTaxSettingCaller.buildXML();
			break;
			
		case JSON:
			reCaller = ReportStatusCaller.buildJSON();
			orderListCaller = OrderListReportCaller.buildJSON();
			ssCaller = SettlementSummaryCaller.buildJSON();
			stCaller = SettlementTransactionCaller.buildJSON();
			RMACaller = RMAListCaller.buildJSON();
			itemLookupCaller = ItemLookupCaller.buildJSON();
			dailyInventoryCaller = DailyInventoryCaller.buildJSON();
			dailyPriceCaller = DailyPriceCaller.buildJSON();
			//InventoryBtoBCANCaller = DailyInventBtoBCANCaller.buildJSON();
			premierItemCaller = PremierItemCaller.buildJSON();
			CAPSFCaller = CAPropSixtyFiveReportCaller.buildJSON();
			itemChinaTaxSetCaller = ItemChinaTaxSettingCaller.buildJSON();
			break;
			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	/**
	 * This method is implemented according 
	 * <a href="https://developer.newegg.com/newegg_marketplace_api/reports_management/" >
	 * Reports Management
	 * </a> Newegg Marketplace API.
	 * 
	 * @param body the type of elements description in HTTP request detail.
	 * @return Returns the HTTP response structure that include XML or JSON metadata in the body section.
	 */
	public GetReportStatusResponse getReportStatus(GetReportStatusRequest body) {
		GetReportStatusResponse r = reCaller.sendReportStatusRequest(body);
		return r;
	}
	
	public OrderListResponse getOrderListReport(OrderListRequest body) {
		return orderListCaller.sendOrderListReportRequest(body);
	}
	
	public SettlementSummaryResponse getSettlementSummaryReport(SettlementSummaryRequest body) {
		return ssCaller.sendSettlementSummaryRequest(body);
	}
	
	public SettlementTransactionResponse getSettlementTransactionReport(SettlementTransactionRequest body) {
		return stCaller.sendSettlementTransactionRequest(body);
	}
	
	public RMAListResponse getRMAListReport(RMAListRequest body) {
		return RMACaller.sendRMAListRequest(body);
	}
	
	public ItemLookupResponse getItemLookupReport(ItemLookupRequest body) {
		return itemLookupCaller.sendItemLookupRequest(body);
	}
	
	public DailyInventoryResponse getDailyInventoryReport(DailyInventoryRequest body) {
		if (Content.Platform ==  Content.PLATFORM.USA) {
			return dailyInventoryCaller.sendDailyInventoryRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	public DailyInventoryResponse getDailyInventoryReportB2bCan(DailyInventoryRequest body) {
		if (Content.Platform ==  Content.PLATFORM.USA) {
			throw new PlatformException(Content.PLATFORM.USA.name());
		} else {
			return dailyInventoryCaller.sendDailyInventoryRequest(body);
		}
	}
	
	public DailyPriceResponse getDailyPriceReport(DailyPriceRequest body) {
		if (Content.Platform ==  Content.PLATFORM.USA) {
			return dailyPriceCaller.sendDailyPriceRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	/*public DailyInventBtoBCANResponse sendDailyInventBtoBCANRequest(DailyInventBtoBCANRequest body) {
		return InventoryBtoBCANCaller.sendDailyInventBtoBCANRequest(body);
	}*/
	
	public PremierItemResponse getNeweggPremierItemReport(PremierItemRequest body) {
		if (Content.Platform ==  Content.PLATFORM.USA) {
			return premierItemCaller.sendPremierItemRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	public CAPropSixtyFiveReportResponse getCaliforniasProposition65WarningReport(CAPropSixtyFiveReportRequest body) {
		if (Content.Platform ==  Content.PLATFORM.CAN) {
			throw new PlatformException(Content.PLATFORM.CAN.name());
		} else {
			return CAPSFCaller.sendCAPropSixtyFiveReportRequest(body);
		}
	}
	
	public ItemChinaTaxSettingResponse getTaxSettingReportforItemsEnabledforChina(ItemChinaTaxSettingRequest body) {
		if (Content.Platform ==  Content.PLATFORM.USA) {
			return itemChinaTaxSetCaller.sendItemChinaTaxSettingRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	
	// submit
	public SOrderListResponse submitOrderListReport(SOrderListRequest body) {
		return orderListCaller.sendSubmitOrderListReportRequest(body);
	}
	
	public SSettlementSummaryResponse submitSettlementSummaryReport(SSettlementSummaryRequest body) {
		return ssCaller.sendSubmitSettlementSummaryRequest(body);
	}
	
	public SSettlementTransactionResponse submitSettlementTransactionReport(SSettlementTransactionRequest body) {
		return stCaller.sendSubmitSettlementTransactionRequest(body);
	}
	
	public SRMAListResponse submitRMAListReport(SRMAListRequest body) {
		return RMACaller.sendSubmitRMAListRequest(body);
	}
	
	public SItemLookupResponse submitItemLookupReport(SItemLookupRequest body) {
		return itemLookupCaller.sendSubmitItemLookupRequest(body);
	}
	
	public SDailyInventoryResponse submitDailyInventoryReport(SDailyInventoryRequest body) {
		if (Content.Platform == Content.PLATFORM.USA) {
			return dailyInventoryCaller.sendSubmitDailyInventoryRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	public SDailyInventoryResponse submitDailyInventoryReportB2BCAN(SDailyInventoryRequest body) {
		if (Content.Platform == Content.PLATFORM.USA) {
			throw new PlatformException(Content.PLATFORM.USA.name());
		} else {
			return dailyInventoryCaller.sendSubmitDailyInventoryRequest(body);
		}
	}
	
	public SDailyPriceResponse submitDailyPriceReport(SDailyPriceRequest body) {
		if (Content.Platform == Content.PLATFORM.USA) {
			return dailyPriceCaller.sendSubmitDailyPriceRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	/*public SDailyInventBtoBCANResponse sendSubmitDailyInventBtoBCANRequest(SDailyInventBtoBCANRequest body) {
		return InventoryBtoBCANCaller.sendSubmitDailyInventBtoBCANRequest(body);
	}*/
	
	public SPremierItemResponse submitNeweggPremierItemReport(SPremierItemRequest body) {
		if (Content.Platform == Content.PLATFORM.USA) {
			return premierItemCaller.sendSubmitPremierItemRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	public SCAPropSixtyFiveResponse submitCaliforniasProposition65WarningReport(SCAPropSixtyFiveRequest body) {
		if (Content.Platform == Content.PLATFORM.CAN) {
			throw new PlatformException(Content.PLATFORM.CAN.name());
		} else {
			return CAPSFCaller.sendSubmitCAPropSixtyFiveReportRequest(body);
		}
	}
	
	public SItemChinaTaxSettingResponse submitTaxSettingReportforItemsEnabledforChina(SItemChinaTaxSettingRequest body) {
		if (Content.Platform == Content.PLATFORM.USA) {
			return itemChinaTaxSetCaller.sendSubmitItemChinaTaxSettingRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
}
