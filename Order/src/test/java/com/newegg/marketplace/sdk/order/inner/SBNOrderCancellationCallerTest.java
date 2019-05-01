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
import com.newegg.marketplace.sdk.order.model.SBNOrderCancellationResponse;

public class SBNOrderCancellationCallerTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OrderConfig.class);
	}
	
	private void sendSBNOrderCancellation(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		SBNOrderCancellationResponse response = null;
		SBNOrderCancellationCaller sender = null;
		
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			RequireSetting.log.info(RequireSetting.getTestInfo());
			
			if (type == MEDIA_TYPE.XML)
				sender = SBNOrderCancellationCaller.buildXML();
			else
				sender = SBNOrderCancellationCaller.buildJSON();
			
			response = sender.sendSBNOrderCancellationCallerRequest();
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testSendSBNOrderCancellationCallerRequest_XML() {
		/*SBNOrderCancellationCaller call = SBNOrderCancellationCaller.buildXML();
		SBNOrderCancellationResponse response = call.sendSBNOrderCancellationCallerRequest();
		assertTrue("true".equals(response.getIsSuccess()));*/
		
		Variables.orderNumber = "138120116"; 
		RequireSetting.authKeySetting("A006");
		sendSBNOrderCancellation(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		// CAN
		Variables.orderNumber = "279176564"; 
		RequireSetting.authKeySetting("A3TV");
		sendSBNOrderCancellation(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		// B2B
		Variables.orderNumber = "1233511920"; 
		RequireSetting.authKeySetting("V047");
		sendSBNOrderCancellation(false, MEDIA_TYPE.XML, PLATFORM.USB);
	}
	
	@Test
	public void testSendSBNOrderCancellationCallerRequest_XML_MOCK() {
		Variables.orderNumber = "138120116"; 
		RequireSetting.authKeySetting("A006");
		sendSBNOrderCancellation(true, MEDIA_TYPE.XML, PLATFORM.USA);
	}
	
	//@Test
	public void testSendSBNOrderCancellationCallerRequest_JSON() {
		/*SBNOrderCancellationCaller call = SBNOrderCancellationCaller.buildJSON();
		SBNOrderCancellationResponse response = call.sendSBNOrderCancellationCallerRequest();
		assertTrue("true".equals(response.getIsSuccess()));*/
		
		Variables.orderNumber = "138120116"; 
		RequireSetting.authKeySetting("A006");
		sendSBNOrderCancellation(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		// CAN
		Variables.orderNumber = "279176564"; 
		RequireSetting.authKeySetting("A3TV");
		sendSBNOrderCancellation(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		// B2B
		Variables.orderNumber = "1233511920"; 
		RequireSetting.authKeySetting("V047");
		sendSBNOrderCancellation(false, MEDIA_TYPE.JSON, PLATFORM.USB);
	}
	
	//@Test
	public void testSendSBNOrderCancellationCallerRequest_JSON_MOCK() {
		Variables.orderNumber = "138120116"; 
		RequireSetting.authKeySetting("A006");
		sendSBNOrderCancellation(false, MEDIA_TYPE.JSON, PLATFORM.USA);
	}

}
