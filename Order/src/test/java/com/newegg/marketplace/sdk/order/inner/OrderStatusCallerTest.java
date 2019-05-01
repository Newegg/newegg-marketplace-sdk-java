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
import com.newegg.marketplace.sdk.order.model.GetOrderStatusResponse;

public class OrderStatusCallerTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OrderConfig.class);
	}
	
	private void sendGetReportStatus(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		GetOrderStatusResponse response = null;
		OrderStatusCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		int orderStatusCode = -1;	// -1 is not define in spec.
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		// only USA
		try {
			Content.Platform = flatofrm;
			RequireSetting.log.info(RequireSetting.getTestInfo());
			
			if (type == MEDIA_TYPE.XML)
				sender = OrderStatusCaller.buildXML();
			else
				sender = OrderStatusCaller.buildJSON();
			
			response = sender.sendOrderStatusRequest();
			orderStatusCode = response.getOrderStatusCode();
			assertTrue(orderStatusCode >= 0 && orderStatusCode <= 4);
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void sendOrderStatusRequest_XML() {
		Variables.version = "304";	// only 304
		
		Variables.orderNumber = "10513704";
		//Variables.orderNumber = "1200207029";	// fail response
		RequireSetting.authKeySetting("A006");
		sendGetReportStatus(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		// can
		Variables.orderNumber = "291536424";
		RequireSetting.authKeySetting("A3TV");
		sendGetReportStatus(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		// b2b
		Variables.orderNumber = "1229724460";
		RequireSetting.authKeySetting("A44S");
		sendGetReportStatus(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
	}
	
	@Test
	public void sendOrderStatusRequest_XML_MOCK() {
		Variables.orderNumber = "105137040";
		sendGetReportStatus(true, MEDIA_TYPE.XML, PLATFORM.USA);
	}
	
	//@Test
	public void sendOrderStatusReques_JSON() {
		Variables.version = "304";	// only 304
		
		Variables.orderNumber = "10513704";
		//Variables.orderNumber = "1200207029";	// fail response
		RequireSetting.authKeySetting("A006");
		sendGetReportStatus(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		// can
		Variables.orderNumber = "291536424";
		RequireSetting.authKeySetting("A3TV");
		sendGetReportStatus(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		// b2b
		Variables.orderNumber = "1229724460";
		RequireSetting.authKeySetting("A44S");
		sendGetReportStatus(false, MEDIA_TYPE.JSON, PLATFORM.USB);
	}
	
	//@Test
	public void sendOrderStatusReques_JSON_MOCK() {
		Variables.orderNumber = "105137040";
		sendGetReportStatus(true, MEDIA_TYPE.JSON, PLATFORM.USA);
	}
}
