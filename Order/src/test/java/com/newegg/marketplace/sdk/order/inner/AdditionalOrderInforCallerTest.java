package com.newegg.marketplace.sdk.order.inner;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.common.NeweggException;
import com.newegg.marketplace.sdk.order.OrderConfig;
import com.newegg.marketplace.sdk.order.RequireSetting;
import com.newegg.marketplace.sdk.order.Variables;
import com.newegg.marketplace.sdk.order.model.GetAddOrderInfoRequest;
import com.newegg.marketplace.sdk.order.model.GetAddOrderInfoResponse;

public class AdditionalOrderInforCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OrderConfig.class);
	}
	
	private GetAddOrderInfoRequest buildAdditionalOrderInforRequest(PLATFORM p) {
		GetAddOrderInfoRequest request = new GetAddOrderInfoRequest();
		GetAddOrderInfoRequest.RequestBody body =  new GetAddOrderInfoRequest.RequestBody();
		GetAddOrderInfoRequest.RequestBody.RequestCriteria criteria = new GetAddOrderInfoRequest.RequestBody.RequestCriteria();
		GetAddOrderInfoRequest.RequestBody.RequestCriteria.OrderNumberList list =
				new GetAddOrderInfoRequest.RequestBody.RequestCriteria.OrderNumberList();
		
		switch (p) {
		case USA:
			list.getOrderNumber().add(126239540);
			criteria.setStatus(0);
			criteria.setType(1);
			criteria.setOrderNumberList(list);
			criteria.setOrderDateFrom("2017-01-01 09:30:47");
			criteria.setOrderDateTo("2019-12-17 09:30:47");
			criteria.setOrderDownloaded(0);
			criteria.setCountryCode("USA");
			break;
			
		case CAN:
			
			break;
			
		case USB:
			
			break;
			
		default:
			break;
		}
		
		body.setRequestCriteria(criteria);
		request.setRequestBody(body);
		request.setOperationType("GetAddOrderInfoRequest");
		
		return request;
	}
	
	private void sendAdditionalOrderInfo(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		GetAddOrderInfoResponse response = null;
		AdditionalOrderInforCaller sender = null;
		GetAddOrderInfoRequest request = null;
		
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			RequireSetting.log.info(RequireSetting.getTestInfo());
			
			request = buildAdditionalOrderInforRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = AdditionalOrderInforCaller.buildXML();
			else
				sender = AdditionalOrderInforCaller.buildJSON();
			
			response = sender.sendAdditionalOrderInforRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testSendAdditionalOrderInforRequest_XML() {
		RequireSetting.authKeySetting("A2GS");
		sendAdditionalOrderInfo(false, MEDIA_TYPE.XML, PLATFORM.USA); 	// only USA
	}
	
	@Test
	public void testSendAdditionalOrderInforRequest_XML_MOCK() {
		RequireSetting.authKeySetting("A2GS");
		sendAdditionalOrderInfo(true, MEDIA_TYPE.XML, PLATFORM.USA); 	// only USA
	}
	
	@Test
	public void testSendAdditionalOrderInforRequest_JSON() {
		RequireSetting.authKeySetting("A2GS");
		sendAdditionalOrderInfo(false, MEDIA_TYPE.JSON, PLATFORM.USA); 	// only USA
	}
	
	@Test
	public void testSendAdditionalOrderInforRequest_JSON_MOCK() {
		RequireSetting.authKeySetting("A2GS");
		sendAdditionalOrderInfo(true, MEDIA_TYPE.JSON, PLATFORM.USA); 	// only USA
	}

}
