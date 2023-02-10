package newegg.marketplace.sdk.order.inner;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.common.Content.PLATFORM;
import newegg.marketplace.sdk.common.NeweggException;
import newegg.marketplace.sdk.order.OrderConfig;
import newegg.marketplace.sdk.order.RequireSetting;
import newegg.marketplace.sdk.order.Variables;
import newegg.marketplace.sdk.order.model.GetOrderInformationRequest;
import newegg.marketplace.sdk.order.model.GetOrderInformationResponse;

public class OrderInfoCallerTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OrderConfig.class);
	}
	
	private GetOrderInformationRequest buildOrderInfoRequest(PLATFORM p) {
		GetOrderInformationRequest request = new GetOrderInformationRequest();
		GetOrderInformationRequest.RequestBody body = new GetOrderInformationRequest.RequestBody();
		GetOrderInformationRequest.RequestBody.RequestCriteria criteria = new GetOrderInformationRequest.RequestBody.RequestCriteria();
		GetOrderInformationRequest.RequestBody.RequestCriteria.OrderNumberList orderList = 
				new GetOrderInformationRequest.RequestBody.RequestCriteria.OrderNumberList();
		GetOrderInformationRequest.RequestBody.RequestCriteria.SellerOrderNumberList sellerList = 
				new GetOrderInformationRequest.RequestBody.RequestCriteria.SellerOrderNumberList();
		
		
		switch (p) {
		case USA:
			orderList.getOrderNumber().add(348459749);
			sellerList.getSellerOrderNumber().add("348441549");
			criteria.setSellerOrderNumberList(sellerList);
//			criteria.setOrderNumberList(orderList);
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
	
	private void sendOrderInfo(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm,String verson) {
		GetOrderInformationResponse response = null;
		GetOrderInformationRequest request = null;
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
			
			response = sender.sendOrderInfoRequest(request,verson);
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
		GetOrderInformationRequest request = new GetOrderInformationRequest();
		GetOrderInformationRequest.RequestBody body = new GetOrderInformationRequest.RequestBody();
		
		request.setOperationType("GetOrderInfoRequest");
		body.setPageIndex(1);
		body.setPageSize(10);
		GetOrderInformationRequest.RequestBody.RequestCriteria criteria = new GetOrderInformationRequest.RequestBody.RequestCriteria();
		GetOrderInformationRequest.RequestBody.RequestCriteria.OrderNumberList orderNumberList = 
				new GetOrderInformationRequest.RequestBody.RequestCriteria.OrderNumberList();
		orderNumberList.getOrderNumber().add(159243598);
		orderNumberList.getOrderNumber().add(41473642);
		criteria.setOrderNumberList(orderNumberList);
		GetOrderInformationRequest.RequestBody.RequestCriteria.SellerOrderNumberList sellerOrderNumberList = 
				new GetOrderInformationRequest.RequestBody.RequestCriteria.SellerOrderNumberList(); 
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
		GetOrderInformationResponse response = call.sendOrderInfoRequest(request,"304");
		Variables.MediaType = saveType;
		assertTrue("true".equals(response.getIsSuccess()));
	}
	
	@Test
	public void testSendOrderInfoRequest_XML_USA() {
		//testSendOrderInfoRequest_XML();
		

		RequireSetting.authKeySetting("A2GS");
		sendOrderInfo(true, MEDIA_TYPE.XML, PLATFORM.USA,"304");
	}
	
	@Test
	public void testSendOrderInfoRequest_XML_USB() {
		//Content.Platform = Content.PLATFORM.USB;
		//testSendOrderInfoRequest_XML();
		
		RequireSetting.authKeySetting("A44S");
		sendOrderInfo(false, MEDIA_TYPE.XML, PLATFORM.USB,"304");
	}
	
	@Test
	public void testSendOrderInfoRequest_XML_CAN() {
		//Content.Platform = Content.PLATFORM.CAN;
		//testSendOrderInfoRequest_XML();
		
		RequireSetting.authKeySetting("A3TV");
		sendOrderInfo(false, MEDIA_TYPE.XML, PLATFORM.CAN,"304");
	}
	
	
	@Test
	public void testSendOrderInfoRequest_XML_MOCK() {
		RequireSetting.authKeySetting("A3TV");
		sendOrderInfo(true, MEDIA_TYPE.XML, PLATFORM.CAN,"304");
	}
	
	@Test
	public void testSendOrderInfoRequest_JSON() {
//		RequireSetting.authKeySetting("A2GS");
		sendOrderInfo(true, MEDIA_TYPE.JSON, PLATFORM.USA,"310");
	}
	
	//@Test
	public void testSendOrderInfoRequest_JSON_MOCK() {
		RequireSetting.authKeySetting("A2GS");
		sendOrderInfo(true, MEDIA_TYPE.JSON, PLATFORM.USA,"304");
	}
	
}
