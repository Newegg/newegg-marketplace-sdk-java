package newegg.marketplace.sdk.report;

import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.PlatformException;
import newegg.marketplace.sdk.report.inner.CAPropSixtyFiveReportCaller;
import newegg.marketplace.sdk.report.inner.DailyInventBtoBCANCaller;
import newegg.marketplace.sdk.report.inner.DailyInventoryCaller;
import newegg.marketplace.sdk.report.inner.DailyPriceCaller;
import newegg.marketplace.sdk.report.inner.ItemBasicInformatioCaller;
import newegg.marketplace.sdk.report.inner.ItemChinaTaxSettingCaller;
import newegg.marketplace.sdk.report.inner.ItemLookupCaller;
import newegg.marketplace.sdk.report.inner.OrderListReportCaller;
import newegg.marketplace.sdk.report.inner.PremierItemCaller;
import newegg.marketplace.sdk.report.inner.RMAListCaller;
import newegg.marketplace.sdk.report.inner.ReportStatusCaller;
import newegg.marketplace.sdk.report.inner.SettlementSummaryCaller;
import newegg.marketplace.sdk.report.inner.SettlementTransactionCaller;
import newegg.marketplace.sdk.report.model.get.CAProp65WarningReportRequest;
import newegg.marketplace.sdk.report.model.get.CAProp65WarningReportResponse;
import newegg.marketplace.sdk.report.model.get.GetDailyInventoryReportB2bCanRequest;
import newegg.marketplace.sdk.report.model.get.GetDailyInventoryReportB2bCanResponse;
import newegg.marketplace.sdk.report.model.get.GetDailyInventoryReportRequest;
import newegg.marketplace.sdk.report.model.get.GetDailyInventoryReportResponse;
import newegg.marketplace.sdk.report.model.get.GetDailyPriceReportRequest;
import newegg.marketplace.sdk.report.model.get.GetDailyPriceReportResponse;
import newegg.marketplace.sdk.report.model.get.GetItemBasicInformationReportRequest;
import newegg.marketplace.sdk.report.model.get.GetItemBasicInformationReportResponse;
import newegg.marketplace.sdk.report.model.get.GetItemLookupReportRequest;
import newegg.marketplace.sdk.report.model.get.GetItemLookupReportResponse;
import newegg.marketplace.sdk.report.model.get.GetNeweggPremierItemReportRequest;
import newegg.marketplace.sdk.report.model.get.GetNeweggPremierItemReportResponse;
import newegg.marketplace.sdk.report.model.get.GetRMAListReportRequest;
import newegg.marketplace.sdk.report.model.get.GetRMAListReportResponse;
import newegg.marketplace.sdk.report.model.get.GetReportStatusRequest;
import newegg.marketplace.sdk.report.model.get.GetReportStatusResponse;
import newegg.marketplace.sdk.report.model.get.GetSettlementSummaryInfoResponse;
import newegg.marketplace.sdk.report.model.get.GetSettlementSummaryReportRequest;
import newegg.marketplace.sdk.report.model.get.GetSettlementTransactionReportRequest;
import newegg.marketplace.sdk.report.model.get.GetSettlementTransactionReportResponse;
import newegg.marketplace.sdk.report.model.get.GetTaxSettingReportRequest;
import newegg.marketplace.sdk.report.model.get.GetTaxSettingReportResponse;
import newegg.marketplace.sdk.report.model.get.OrderListReportRequest;
import newegg.marketplace.sdk.report.model.get.OrderListReportResponse;
import newegg.marketplace.sdk.report.model.submit.CAProp65ReportRequest;
import newegg.marketplace.sdk.report.model.submit.CAProp65ReportResponse;
import newegg.marketplace.sdk.report.model.submit.DailyInventoryReportRequest;
import newegg.marketplace.sdk.report.model.submit.DailyInventoryReportResponse;
import newegg.marketplace.sdk.report.model.submit.DailyPriceReportRequest;
import newegg.marketplace.sdk.report.model.submit.DailyPriceReportResponse;
import newegg.marketplace.sdk.report.model.submit.ItemChinaTaxSettingReportRequest;
import newegg.marketplace.sdk.report.model.submit.ItemChinaTaxSettingReportResponse;
import newegg.marketplace.sdk.report.model.submit.ItemLookupRequest;
import newegg.marketplace.sdk.report.model.submit.ItemLookupResponse;
import newegg.marketplace.sdk.report.model.submit.PremierItemReportRequest;
import newegg.marketplace.sdk.report.model.submit.PremierItemReportResponse;
import newegg.marketplace.sdk.report.model.submit.SettlementSummaryReportRequest;
import newegg.marketplace.sdk.report.model.submit.SettlementSummaryReportResponse;
import newegg.marketplace.sdk.report.model.submit.SettlementTransactionRequest;
import newegg.marketplace.sdk.report.model.submit.SettlementTransactionResponse;
import newegg.marketplace.sdk.report.model.submit.SubmitItemBasicInformationReportRequest;
import newegg.marketplace.sdk.report.model.submit.SubmitItemBasicInformationReportResponse;
import newegg.marketplace.sdk.report.model.submit.SubmitOrderListReportRequest;
import newegg.marketplace.sdk.report.model.submit.SubmitOrderListReportResponse;
import newegg.marketplace.sdk.report.model.submit.SubmitRMAListReportRequest;
import newegg.marketplace.sdk.report.model.submit.SubmitRMAListReportResponse;

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
	private DailyInventBtoBCANCaller InventoryBtoBCANCaller = null;
	private PremierItemCaller premierItemCaller = null;
	private CAPropSixtyFiveReportCaller CAPSFCaller = null;
	private ItemChinaTaxSettingCaller itemChinaTaxSetCaller = null;
	
	private ItemBasicInformatioCaller itemBasicInformatioCaller=null;
			
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
			InventoryBtoBCANCaller = DailyInventBtoBCANCaller.buildXML();
			premierItemCaller = PremierItemCaller.buildXML();
			CAPSFCaller = CAPropSixtyFiveReportCaller.buildXML();
			itemChinaTaxSetCaller = ItemChinaTaxSettingCaller.buildXML();
			itemBasicInformatioCaller=ItemBasicInformatioCaller.buildXML();
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
			InventoryBtoBCANCaller = DailyInventBtoBCANCaller.buildJSON();
			premierItemCaller = PremierItemCaller.buildJSON();
			CAPSFCaller = CAPropSixtyFiveReportCaller.buildJSON();
			itemChinaTaxSetCaller = ItemChinaTaxSettingCaller.buildJSON();
			itemBasicInformatioCaller=ItemBasicInformatioCaller.buildJSON();
			break;
			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	public SubmitItemBasicInformationReportResponse submitItemBasicInformationReportJSON(SubmitItemBasicInformationReportRequest body) {
		SubmitItemBasicInformationReportResponse r = itemBasicInformatioCaller.submitItemBasicInformationReport(body);
		return r;
	}
	public GetItemBasicInformationReportResponse getItemBasicInformationReport(GetItemBasicInformationReportRequest body) {
		GetItemBasicInformationReportResponse r = itemBasicInformatioCaller.getItemBasicInformationReport(body);
		return r;
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
	
	public OrderListReportResponse getOrderListReport(OrderListReportRequest body,String version) {
		return orderListCaller.sendOrderListReportRequest(body,version);
	}
	
	public GetSettlementSummaryInfoResponse getSettlementSummaryReport(GetSettlementSummaryReportRequest body) {
		return ssCaller.sendSettlementSummaryRequest(body);
	}
	
	public GetSettlementTransactionReportResponse getSettlementTransactionReport(GetSettlementTransactionReportRequest body) {
		return stCaller.sendSettlementTransactionRequest(body);
	}
	
	public GetRMAListReportResponse getRMAListReport(GetRMAListReportRequest body,String version) {
		return RMACaller.sendRMAListRequest(body,version);
	}
	
	public GetItemLookupReportResponse getItemLookupReport(GetItemLookupReportRequest body) {
		return itemLookupCaller.sendItemLookupRequest(body);
	}
	
	public GetDailyInventoryReportResponse getDailyInventoryReport(GetDailyInventoryReportRequest body) {
		if (Content.Platform ==  Content.PLATFORM.USA) {
			return dailyInventoryCaller.sendDailyInventoryRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	//public GetDailyInventoryReportResponse getDailyInventoryReportB2bCan(GetDailyInventoryReportRequest body) {
	public GetDailyInventoryReportB2bCanResponse getDailyInventoryReportB2bCan(GetDailyInventoryReportB2bCanRequest body) {
		if (Content.Platform ==  Content.PLATFORM.USA) {
			throw new PlatformException(Content.PLATFORM.USA.name());
		} else {
			//return dailyInventoryCaller.sendDailyInventoryRequest(body);
			return InventoryBtoBCANCaller.sendDailyInventBtoBCANRequest(body);
		}
	}
	
	public GetDailyPriceReportResponse getDailyPriceReport(GetDailyPriceReportRequest body) {
		if (Content.Platform ==  Content.PLATFORM.USA) {
			return dailyPriceCaller.sendDailyPriceRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	@Deprecated
	public GetNeweggPremierItemReportResponse getNeweggPremierItemReport(GetNeweggPremierItemReportRequest body) {
		if (Content.Platform ==  Content.PLATFORM.USA) {
			return premierItemCaller.sendPremierItemRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	public CAProp65WarningReportResponse getCaliforniasProposition65WarningReport(CAProp65WarningReportRequest body) {
		if (Content.Platform ==  Content.PLATFORM.CAN) {
			throw new PlatformException(Content.PLATFORM.CAN.name());
		} else {
			return CAPSFCaller.sendCAPropSixtyFiveReportRequest(body);
		}
	}
	
	@Deprecated
	public GetTaxSettingReportResponse getTaxSettingReportforItemsEnabledforChina(GetTaxSettingReportRequest body) {
		if (Content.Platform ==  Content.PLATFORM.USA) {
			return itemChinaTaxSetCaller.sendItemChinaTaxSettingRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	
	// submit
	public SubmitOrderListReportResponse submitOrderListReport(SubmitOrderListReportRequest body) {
		return orderListCaller.sendSubmitOrderListReportRequest(body);
	}
	
	public SettlementSummaryReportResponse submitSettlementSummaryReport(SettlementSummaryReportRequest body) {
		return ssCaller.sendSubmitSettlementSummaryRequest(body);
	}
	
	public SettlementTransactionResponse submitSettlementTransactionReport(SettlementTransactionRequest body) {
		return stCaller.sendSubmitSettlementTransactionRequest(body);
	}
	
	public SubmitRMAListReportResponse submitRMAListReport(SubmitRMAListReportRequest body) {
		return RMACaller.sendSubmitRMAListRequest(body);
	}
	
	public ItemLookupResponse submitItemLookupReport(ItemLookupRequest body) {
		return itemLookupCaller.sendSubmitItemLookupRequest(body);
	}
	
	public DailyInventoryReportResponse submitDailyInventoryReport(DailyInventoryReportRequest body,String version) {
		if (Content.Platform == Content.PLATFORM.USA) {
			return dailyInventoryCaller.sendSubmitDailyInventoryRequest(body,version);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	public DailyInventoryReportResponse submitDailyInventoryReportB2BCAN(DailyInventoryReportRequest body,String version) {
		if (Content.Platform == Content.PLATFORM.USA) {
			throw new PlatformException(Content.PLATFORM.USA.name());
		} else {
			return dailyInventoryCaller.sendSubmitDailyInventoryRequest(body,version);
		}
	}
	
	public DailyPriceReportResponse submitDailyPriceReport(DailyPriceReportRequest body,String version) {
		if (Content.Platform == Content.PLATFORM.USA) {
			return dailyPriceCaller.sendSubmitDailyPriceRequest(body,version);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	@Deprecated
	public PremierItemReportResponse submitNeweggPremierItemReport(PremierItemReportRequest body) {
		if (Content.Platform == Content.PLATFORM.USA) {
			return premierItemCaller.sendSubmitPremierItemRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
	public CAProp65ReportResponse submitCaliforniasProposition65WarningReport(CAProp65ReportRequest body) {
		if (Content.Platform == Content.PLATFORM.CAN) {
			throw new PlatformException(Content.PLATFORM.CAN.name());
		} else {
			return CAPSFCaller.sendSubmitCAPropSixtyFiveReportRequest(body);
		}
	}
	
	@Deprecated
	public ItemChinaTaxSettingReportResponse submitTaxSettingReportforItemsEnabledforChina(ItemChinaTaxSettingReportRequest body) {
		if (Content.Platform == Content.PLATFORM.USA) {
			return itemChinaTaxSetCaller.sendSubmitItemChinaTaxSettingRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.CAN.name() + ", " + Content.PLATFORM.USB.name());
		}
	}
	
}
