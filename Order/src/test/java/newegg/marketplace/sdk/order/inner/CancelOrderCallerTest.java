package newegg.marketplace.sdk.order.inner;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.NeweggException;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.common.Content.PLATFORM;
import newegg.marketplace.sdk.order.OrderConfig;
import newegg.marketplace.sdk.order.RequireSetting;
import newegg.marketplace.sdk.order.Variables;
import newegg.marketplace.sdk.order.model.CancelOrderRequest;
import newegg.marketplace.sdk.order.model.CancelOrderResponse;

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
	
	private void sendCancelOrder(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm,String orderNumber) {
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
			
			response = sender.sendCancelOrderRequest(request,orderNumber,null);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testSendCancelOrderReques_XML() {	
		
		RequireSetting.authKeySetting("A2EU");
		sendCancelOrder(false, MEDIA_TYPE.XML, PLATFORM.USA,"336754663");
		
		// can
		RequireSetting.authKeySetting("A3TV");
		sendCancelOrder(false, MEDIA_TYPE.XML, PLATFORM.CAN,"292242424");
		
		// b2b
		RequireSetting.authKeySetting("A44S");
		sendCancelOrder(false, MEDIA_TYPE.XML, PLATFORM.USB,"1230247460");
	}
	
	@Test
	public void testSendCancelOrderReques_XML_MOCK() {
		RequireSetting.authKeySetting("A2EU");
		sendCancelOrder(true, MEDIA_TYPE.XML, PLATFORM.USA,"127237320");
	}
	
	//@Test
	public void testSendCancelOrderReques_JSON() {
		
		RequireSetting.authKeySetting("A2EU");
		sendCancelOrder(false, MEDIA_TYPE.JSON, PLATFORM.USA,"336754663");
		
		// can
		RequireSetting.authKeySetting("A3TV");
		sendCancelOrder(false, MEDIA_TYPE.JSON, PLATFORM.CAN,"292242424");
		
		// b2b
		RequireSetting.authKeySetting("A44S");
		sendCancelOrder(false, MEDIA_TYPE.JSON, PLATFORM.USB,"1230247460");
		
	}
	
	//@Test
	public void testSendCancelOrderReques_JSON_MOCK() {
		RequireSetting.authKeySetting("A2EU");
		sendCancelOrder(true, MEDIA_TYPE.JSON, PLATFORM.USA,"127237320");
	}
}
