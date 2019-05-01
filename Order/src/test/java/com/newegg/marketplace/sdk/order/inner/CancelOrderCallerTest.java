package com.newegg.marketplace.sdk.order.inner;

import static org.junit.Assert.assertTrue;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
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
import com.newegg.marketplace.sdk.order.model.CancelOrderRequest;
import com.newegg.marketplace.sdk.order.model.CancelOrderResponse;

public class CancelOrderCallerTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OrderConfig.class);
	}
	
	private CancelOrderRequest buildCancelOrderRequest(PLATFORM p) {
		CancelOrderRequest request = new CancelOrderRequest();
		
		switch (p) {
		case USA:
			request.setAction(1);
			request.setValue(72);
			break;
			
		case CAN:
			request.setAction(1);
			request.setValue(72);
			break;
			
		case USB:
			request.setAction(1);
			request.setValue(72);
			break;
			
		default:
			break;
		}
		
		return request;
	}
	
	private void sendCancelOrder(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		CancelOrderResponse response = null;
		CancelOrderRequest request = null;
		CancelOrderCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		// only USA
		try {
			Content.Platform = flatofrm;
			RequireSetting.log.info(RequireSetting.getTestInfo());
			
			request = buildCancelOrderRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = CancelOrderCaller.buildXML();
			else
				sender = CancelOrderCaller.buildJSON();
			
			response = sender.sendCancelOrderRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testSendCancelOrderReques_XML() {
		Variables.version = "304"; // fixed for cancel order command
		
		Variables.orderNumber = "336754663"; // fake data will throw exception
		RequireSetting.authKeySetting("A2EU");
		sendCancelOrder(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		// can
		Variables.orderNumber = "292242424"; // fake data will throw exception
		RequireSetting.authKeySetting("A3TV");
		sendCancelOrder(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		// b2b
		Variables.orderNumber = "1230247460"; // fake data will throw exception
		RequireSetting.authKeySetting("A44S");
		sendCancelOrder(false, MEDIA_TYPE.XML, PLATFORM.USB);
	}
	
	@Test
	public void testSendCancelOrderReques_XML_MOCK() {
		Variables.version = "304"; // fixed for cancel order command
		Variables.orderNumber = "127237320";
		RequireSetting.authKeySetting("A2EU");
		sendCancelOrder(true, MEDIA_TYPE.XML, PLATFORM.USA);
	}
	
	//@Test
	public void testSendCancelOrderReques_JSON() {
		Variables.version = "304"; // fixed for cancel order command
		
		Variables.orderNumber = "336754663"; // fake data will throw exception
		RequireSetting.authKeySetting("A2EU");
		sendCancelOrder(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		// can
		Variables.orderNumber = "292242424"; // fake data will throw exception
		RequireSetting.authKeySetting("A3TV");
		sendCancelOrder(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		// b2b
		Variables.orderNumber = "1230247460"; // fake data will throw exception
		RequireSetting.authKeySetting("A44S");
		sendCancelOrder(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
	}
	
	//@Test
	public void testSendCancelOrderReques_JSON_MOCK() {
		Variables.version = "304"; // fixed for cancel order command
		Variables.orderNumber = "127237320";
		RequireSetting.authKeySetting("A2EU");
		sendCancelOrder(true, MEDIA_TYPE.JSON, PLATFORM.USA);
	}
}
