package com.newegg.marketplace.sdk.datafeed.inner;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.datafeed.DataFeedConfig;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.MultiChannelOrderRequest;
import com.newegg.marketplace.sdk.datafeed.model.MultiChannelOrderRequest.Message.MultiChannelOrder;
import com.newegg.marketplace.sdk.datafeed.model.MultiChannelOrderRequest.Message.MultiChannelOrder.Order;
import com.newegg.marketplace.sdk.datafeed.model.MultiChannelOrderRequest.Message.MultiChannelOrder.Order.ItemList;
import com.newegg.marketplace.sdk.datafeed.model.ShipNoticeRequest;
import com.newegg.marketplace.sdk.datafeed.model.ShipNoticeRequest.Message.ShipNotice;
import com.newegg.marketplace.sdk.datafeed.model.ShipNoticeRequest.Message.ShipNotice.Package.ItemInformation;
import com.newegg.marketplace.sdk.datafeed.model.SubmitFeedResponse;

public class SubmitOrderCallerTest {

	private static ConfBack b;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(DataFeedConfig.class);
		b=new ConfBack();
	}

	@Test
	public void testMockOrderShipNoticeFeed_XML() {
		Variables.SimulationEnabled=true;
		SubmitOrderCaller call=SubmitOrderCaller.buildXML();
		ShipNoticeRequest request=new ShipNoticeRequest();
		ShipNoticeRequest.Message m=new ShipNoticeRequest.Message();
		ShipNotice sn=new ShipNotice();
		ShipNoticeRequest.Message.ShipNotice.Package pk=new ShipNoticeRequest.Message.ShipNotice.Package();		
		pk.setActualShippingCarrier("UPS");
		pk.setActualShippingMethod("UPS ");
		pk.setOrderNumber("11006035");
		pk.setTrackingNumber("20110922002");
		ItemInformation iif=new ItemInformation();
		ShipNoticeRequest.Message.ShipNotice.Package.ItemInformation.Item i1=new ShipNoticeRequest.Message.ShipNotice.Package.ItemInformation.Item();
		i1.setNeweggItemNumber("9SIAWES000CY64");
		i1.setSellerPartNumber("data_MP_329_00976");
		i1.setShippedQuantity(1);
		ShipNoticeRequest.Message.ShipNotice.Package.ItemInformation.Item i2=new ShipNoticeRequest.Message.ShipNotice.Package.ItemInformation.Item();
		i2.setNeweggItemNumber("9SIAWES000CY58");
		i2.setSellerPartNumber("data_MP_329_00975");
		i2.setShippedQuantity(2);
		iif.getItem().add(i1);
		iif.getItem().add(i2);
		pk.setItemInformation(iif);
		sn.getPackage().add(pk);
		m.setShipNotice(sn);
		request.setMessage(m);
		SubmitFeedResponse r=call.orderShipNoticeFeed(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());		
		assertEquals("2291326430",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ORDER_SHIP_NOTICE_DATA",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}

	
	@Test
	public void testMockMultiChannelOrderFeed_XML() {
		Variables.SimulationEnabled=true;
		SubmitOrderCaller call=SubmitOrderCaller.buildXML();
		MultiChannelOrderRequest request=new MultiChannelOrderRequest();
		MultiChannelOrderRequest.Message m=new MultiChannelOrderRequest.Message();
		MultiChannelOrder mOrder=new MultiChannelOrder();
		Order o=new Order();
		o.setOrderDate("05/30/2013");
		o.setSalesChannel("3rd channel");
		o.setSellerOrderID("2153930");
		o.setShippingMethod("Expedited Shipping (3-5 business days)");
		o.setShipToFirstName("Carol");
		o.setShipToLastName("Chaste");
		o.setShipToCompany("");
		o.setShipToAddressLine1("248 River Trace Ct");
		o.setShipToAddressLine2("");
		o.setShipToCity("McDonough");
		o.setShipToState("GA");
		o.setShipToPostalCode("30253");
		o.setShipToCountry("USA");
		o.setShipToPhoneNumber("770-898-1921");
		ItemList il=new ItemList();
		MultiChannelOrderRequest.Message.MultiChannelOrder.Order.ItemList.Item i=new MultiChannelOrderRequest.Message.MultiChannelOrder.Order.ItemList.Item();
		i.setNeweggItemNumber("");
		i.setSellerPartNumber("PTV3000-100NAS");
		i.setQuantity(10);
		il.getItem().add(i);
		MultiChannelOrderRequest.Message.MultiChannelOrder.Order.ItemList.Item i2=new MultiChannelOrderRequest.Message.MultiChannelOrder.Order.ItemList.Item();
		i2.setNeweggItemNumber("");
		i2.setSellerPartNumber("CTB-212312S");
		i2.setQuantity(20);
		il.getItem().add(i2);
		o.setItemList(il);
		mOrder.getOrder().add(o);
		m.setMultiChannelOrder(mOrder);
		request.setMessage(m);
		SubmitFeedResponse r=call.multiChannelOrderFeed(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());		
		assertEquals("26LBR9HE2P1XK",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("MULTICHANNEL_ORDER_DATA",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}
}
