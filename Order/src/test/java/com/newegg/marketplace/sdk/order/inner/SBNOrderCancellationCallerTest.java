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
import com.newegg.marketplace.sdk.order.model.GetSBNOrderCancellationRequestResultResponse;

public class SBNOrderCancellationCallerTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OrderConfig.class);
	}
	
	private void sendSBNOrderCancellation(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm,String orderNumber) {
		GetSBNOrderCancellationRequestResultResponse response = null;
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
			
			response = sender.sendSBNOrderCancellationCallerRequest(orderNumber);
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
				
		RequireSetting.authKeySetting("A006");
		sendSBNOrderCancellation(false, MEDIA_TYPE.XML, PLATFORM.USA,"138120116");
		
		// CAN		
		RequireSetting.authKeySetting("A3TV");
		sendSBNOrderCancellation(false, MEDIA_TYPE.XML, PLATFORM.CAN,"279176564");
		
		// B2B
		RequireSetting.authKeySetting("V047");
		sendSBNOrderCancellation(false, MEDIA_TYPE.XML, PLATFORM.USB,"1233511920");
	}
	
	@Test
	public void testSendSBNOrderCancellationCallerRequest_XML_MOCK() {		
		RequireSetting.authKeySetting("A006");
		sendSBNOrderCancellation(true, MEDIA_TYPE.XML, PLATFORM.USA,"138120116");
	}
	
	//@Test
	public void testSendSBNOrderCancellationCallerRequest_JSON() {
		/*SBNOrderCancellationCaller call = SBNOrderCancellationCaller.buildJSON();
		SBNOrderCancellationResponse response = call.sendSBNOrderCancellationCallerRequest();
		assertTrue("true".equals(response.getIsSuccess()));*/
		
	
		RequireSetting.authKeySetting("A006");
		sendSBNOrderCancellation(false, MEDIA_TYPE.JSON, PLATFORM.USA,"138120116");
		
		// CAN
		RequireSetting.authKeySetting("A3TV");
		sendSBNOrderCancellation(false, MEDIA_TYPE.JSON, PLATFORM.CAN,"279176564");
		
		// B2B
		RequireSetting.authKeySetting("V047");
		sendSBNOrderCancellation(false, MEDIA_TYPE.JSON, PLATFORM.USB,"1233511920");
	}
	
	//@Test
	public void testSendSBNOrderCancellationCallerRequest_JSON_MOCK() {
	
		RequireSetting.authKeySetting("A006");
		sendSBNOrderCancellation(false, MEDIA_TYPE.JSON, PLATFORM.USA,"138120116");
	}

}
