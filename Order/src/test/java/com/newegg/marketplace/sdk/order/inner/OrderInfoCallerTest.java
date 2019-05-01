package com.newegg.marketplace.sdk.order.inner;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.NeweggException;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.order.OrderConfig;
import com.newegg.marketplace.sdk.order.RequireSetting;
import com.newegg.marketplace.sdk.order.Variables;
import com.newegg.marketplace.sdk.order.model.OrderInfoRequest;
import com.newegg.marketplace.sdk.order.model.OrderInfoResponse;

public class OrderInfoCallerTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OrderConfig.class);
	}
	
	private OrderInfoRequest buildOrderInfoRequest(PLATFORM p) {
		OrderInfoRequest request = new OrderInfoRequest();
		OrderInfoRequest.RequestBody body = new OrderInfoRequest.RequestBody();
		OrderInfoRequest.RequestBody.RequestCriteria criteria = new OrderInfoRequest.RequestBody.RequestCriteria();
		OrderInfoRequest.RequestBody.RequestCriteria.OrderNumberList orderList = 
				new OrderInfoRequest.RequestBody.RequestCriteria.OrderNumberList();
		OrderInfoRequest.RequestBody.RequestCriteria.SellerOrderNumberList sellerList = 
				new OrderInfoRequest.RequestBody.RequestCriteria.SellerOrderNumberList();
		
		
		switch (p) {
		case USA:
			orderList.getOrderNumber().add(126239540);
			criteria.setOrderNumberList(orderList);
			criteria.setStatus(3);
			criteria.setType(0);
			criteria.setOrderDateFrom("2018-01-01 09:30:47");
			criteria.setOrderDateTo("2018-12-17 09:30:47");
			criteria.setOrderDownloaded(0);
			body.setPageIndex(1);
			body.setPageSize(100);
			body.setRequestCriteria(criteria);
			break;
			
		case CAN:
			orderList.getOrderNumber().add(299963364);
			criteria.setOrderNumberList(orderList);
			criteria.setStatus(3);
			criteria.setType(0);
			criteria.setOrderDateFrom("2018-01-01 09:30:47");
			criteria.setOrderDateTo("2018-12-17 09:30:47");
			criteria.setOrderDownloaded(0);
			body.setPageIndex(1);
			body.setPageSize(5);
			body.setRequestCriteria(criteria);
			break;
			
		case USB:
			orderList.getOrderNumber().add(1233434480);
			criteria.setOrderNumberList(orderList);
			criteria.setStatus(3);
			criteria.setType(0);
			criteria.setOrderDateFrom("2018-01-01 09:30:47");
			criteria.setOrderDateTo("2018-12-17 09:30:47");
			criteria.setOrderDownloaded(0);
			body.setPageIndex(1);
			body.setPageSize(5);
			body.setRequestCriteria(criteria);
			break;
			
		default:
			break;
		}
		
		request.setOperationType("GetOrderInfoRequest");
		request.setRequestBody(body);
		
		return request;
	}
	
	private void sendOrderInfo(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		OrderInfoResponse response = null;
		OrderInfoRequest request = null;
		OrderInfoCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		// only USA
		try {
			Content.Platform = flatofrm;
			RequireSetting.log.info(RequireSetting.getTestInfo());
			
			request = buildOrderInfoRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = OrderInfoCaller.buildXML();
			else
				sender = OrderInfoCaller.buildJSON();
			
			response = sender.sendOrderInfoRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	private void testSendOrderInfoRequest_XML() {
		MEDIA_TYPE saveType = Variables.MediaType;
		
		Variables.MediaType = MEDIA_TYPE.XML;
		OrderInfoCaller call = OrderInfoCaller.buildXML();
		OrderInfoRequest request = new OrderInfoRequest();
		OrderInfoRequest.RequestBody body = new OrderInfoRequest.RequestBody();
		
		request.setOperationType("GetOrderInfoRequest");
		body.setPageIndex(1);
		body.setPageSize(10);
		OrderInfoRequest.RequestBody.RequestCriteria criteria = new OrderInfoRequest.RequestBody.RequestCriteria();
		OrderInfoRequest.RequestBody.RequestCriteria.OrderNumberList orderNumberList = 
				new OrderInfoRequest.RequestBody.RequestCriteria.OrderNumberList();
		orderNumberList.getOrderNumber().add(159243598);
		orderNumberList.getOrderNumber().add(41473642);
		criteria.setOrderNumberList(orderNumberList);
		OrderInfoRequest.RequestBody.RequestCriteria.SellerOrderNumberList sellerOrderNumberList = 
				new OrderInfoRequest.RequestBody.RequestCriteria.SellerOrderNumberList(); 
		sellerOrderNumberList.getSellerOrderNumber().add("SO159243598");
		sellerOrderNumberList.getSellerOrderNumber().add("SO41473642");
		criteria.setSellerOrderNumberList(sellerOrderNumberList);
		criteria.setStatus(1);
		criteria.setType(1);
		criteria.setOrderDateFrom("2011-01-01 09:30:47");
		criteria.setOrderDateTo("2011-12-17 09:30:47");
		criteria.setOrderDownloaded(0);
		criteria.setCountryCode("USA");
		criteria.setPremierOrder(1);
		body.setRequestCriteria(criteria);
		request.setRequestBody(body);
		OrderInfoResponse response = call.sendOrderInfoRequest(request);
		Variables.MediaType = saveType;
		assertTrue("true".equals(response.getIsSuccess()));
	}
	
	@Test
	public void testSendOrderInfoRequest_XML_USA() {
		//testSendOrderInfoRequest_XML();
		
		Variables.version = "304";	// 304, 305, 306, 307
		RequireSetting.authKeySetting("A2GS");
		sendOrderInfo(false, MEDIA_TYPE.XML, PLATFORM.USA);
	}
	
	@Test
	public void testSendOrderInfoRequest_XML_USB() {
		//Content.Platform = Content.PLATFORM.USB;
		//testSendOrderInfoRequest_XML();
		
		Variables.version = "304";	// 304, 305
		RequireSetting.authKeySetting("A44S");
		sendOrderInfo(false, MEDIA_TYPE.XML, PLATFORM.USB);
	}
	
	@Test
	public void testSendOrderInfoRequest_XML_CAN() {
		//Content.Platform = Content.PLATFORM.CAN;
		//testSendOrderInfoRequest_XML();
		
		Variables.version = "304";	// 304, 305
		RequireSetting.authKeySetting("A3TV");
		sendOrderInfo(false, MEDIA_TYPE.XML, PLATFORM.CAN);
	}
	
	
	@Test
	public void testSendOrderInfoRequest_XML_MOCK() {
		Variables.version = "304";	// 304, 305
		RequireSetting.authKeySetting("A3TV");
		sendOrderInfo(true, MEDIA_TYPE.XML, PLATFORM.CAN);
	}
	
	//@Test
	public void testSendOrderInfoRequest_JSON() {
		Variables.version = "304";	// 304, 305, 306, 307
		RequireSetting.authKeySetting("A2GS");
		sendOrderInfo(false, MEDIA_TYPE.JSON, PLATFORM.USA);
	}
	
	//@Test
	public void testSendOrderInfoRequest_JSON_MOCK() {
		Variables.version = "304";	// 304, 305, 306, 307
		RequireSetting.authKeySetting("A2GS");
		sendOrderInfo(true, MEDIA_TYPE.JSON, PLATFORM.USA);
	}
	
}
