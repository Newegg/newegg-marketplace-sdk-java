package com.newegg.marketplace.sdk.report.inner;

import static org.junit.Assert.assertTrue;

import javax.xml.bind.JAXBException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.common.NeweggException;
import com.newegg.marketplace.sdk.report.ReportConfig;
import com.newegg.marketplace.sdk.report.RequireSetting;
import com.newegg.marketplace.sdk.report.SerializationObjectParser;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.model.get.OrderListRequest;
import com.newegg.marketplace.sdk.report.model.get.OrderListResponse;
import com.newegg.marketplace.sdk.report.model.submit.SOrderListRequest;
import com.newegg.marketplace.sdk.report.model.submit.SOrderListResponse;

public class OrderListReportCallerTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private SOrderListRequest buildSubmitOrderListRequest(PLATFORM p) {
		SOrderListRequest submitRequest = new SOrderListRequest();
		SOrderListRequest.RequestBody submitBody = new SOrderListRequest.RequestBody();
		SOrderListRequest.RequestBody.OrderReportCriteria orderCriteria = 
				new SOrderListRequest.RequestBody.OrderReportCriteria();
		
		switch (p) {
		case USA:
			orderCriteria.setKeywordsType(0);
			orderCriteria.setStatus(3);
			orderCriteria.setType(0);
			orderCriteria.setOrderDateFrom("2018-01-01");
			orderCriteria.setOrderDateTo("2019-06-14");
			orderCriteria.setOrderDownloaded("false");
			break;
			
		case CAN:
			orderCriteria.setKeywordsType(0);
			orderCriteria.setStatus(3);
			orderCriteria.setType(0);
			orderCriteria.setOrderDateFrom("2018-01-01");
			orderCriteria.setOrderDateTo("2019-06-14");
			orderCriteria.setOrderDownloaded("false");
			break;
			
		case USB:
			orderCriteria.setKeywordsType(0);
			orderCriteria.setStatus(3);
			orderCriteria.setType(0);
			orderCriteria.setOrderDateFrom("2018-01-01");
			orderCriteria.setOrderDateTo("2019-06-14");
			orderCriteria.setOrderDownloaded("false");
			break;
			
		default:
			break;
		}
		
		orderCriteria.setRequestType("ORDER_LIST_REPORT");
		submitBody.setOrderReportCriteria(orderCriteria);
		submitRequest.setRequestBody(submitBody);
		submitRequest.setOperationType("OrderListReportRequest");
		
		return submitRequest;
	}
	
	private OrderListRequest buildGetOrderListRequest(PLATFORM p) {
		OrderListRequest request = new OrderListRequest();
		OrderListRequest.RequestBody body = new OrderListRequest.RequestBody();
		OrderListRequest.RequestBody.PageInfo page = new OrderListRequest.RequestBody.PageInfo();
		
		switch (p) {
		case USA:
			page.setPageIndex(2);
			page.setPageSize(10);
			body.setRequestID("23NPUG2D8V21U");
			break;
			
		case CAN:
			page.setPageIndex(2);
			page.setPageSize(10);
			body.setRequestID("22MZFTW09GQVU");
			break;
			
		case USB:
			page.setPageIndex(2);
			page.setPageSize(10);
			body.setRequestID("2524NA6NYM2KH");
			break;
			
		default:
			break;
		}
		
		body.setPageInfo(page);
		request.setRequestBody(body);
		request.setOperationType("OrderListReportRequest");
		
		return request;
	}
	
	private void sendGetOrderList(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		OrderListResponse response = null;
		OrderListRequest request = null;
		OrderListReportCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			
			request = buildGetOrderListRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = OrderListReportCaller.buildXML();
			else
				sender = OrderListReportCaller.buildJSON();
			
			response = sender.sendOrderListReportRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	private void sendSubmitOrderList(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		SOrderListResponse response = null;
		SOrderListRequest request = null;
		OrderListReportCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			
			request = buildSubmitOrderListRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = OrderListReportCaller.buildXML();
			else
				sender = OrderListReportCaller.buildJSON();
			
			response = sender.sendSubmitOrderListReportRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testOrderListReportCaller_XML() {
		RequireSetting.authKeySetting("A006");
		Variables.version = "306"; // 305, 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetOrderList(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		Variables.version = "305"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetOrderList(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		Variables.version = "309"; // 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetOrderList(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testOrderListReportCaller_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		Variables.version = "306"; // 305, 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetOrderList(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testOrderListReportCaller_JSON() {
		RequireSetting.authKeySetting("A006");
		Variables.version = "306"; // 305, 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetOrderList(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		Variables.version = "305"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetOrderList(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		Variables.version = "309"; // 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetOrderList(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testOrderListReportCaller_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		Variables.version = "306"; // 305, 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetOrderList(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}

	@Test
	public void testSendSubmitOrderListReportRequest_XML() throws JAXBException {
		/*SerializationObjectParser<SOrderListRequest> parser = new SerializationObjectParser<SOrderListRequest>();
		buildSubmitRequest();
		StringBuffer st = parser.xmlObjectToString(submitRequest);
		log.info(st.toString());*/
		
		RequireSetting.authKeySetting("A006");
		Variables.version = "306"; // 305, 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitOrderList(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		Variables.version = "305"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitOrderList(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		Variables.version = "309"; // 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitOrderList(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitOrderListReportRequest_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		Variables.version = "306"; // 305, 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitOrderList(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitOrderListReportRequest_JSON() {
		RequireSetting.authKeySetting("A006");
		Variables.version = "306"; // 305, 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitOrderList(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		Variables.version = "305"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitOrderList(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		Variables.version = "309"; // 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitOrderList(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitOrderListReportRequest_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		Variables.version = "306"; // 305, 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitOrderList(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
}
