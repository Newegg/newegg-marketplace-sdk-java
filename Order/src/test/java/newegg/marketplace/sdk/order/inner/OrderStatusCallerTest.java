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
import newegg.marketplace.sdk.order.model.GetOrderStatusResponse;

public class OrderStatusCallerTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OrderConfig.class);
	}
	
	private void sendGetReportStatus(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm,String orderNumber) {
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
			
			response = sender.sendOrderStatusRequest(orderNumber,null);
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
		
		
		//Variables.orderNumber = "1200207029";	// fail response
		RequireSetting.authKeySetting("A006");
		sendGetReportStatus(false, MEDIA_TYPE.XML, PLATFORM.USA,"10513704");
		
		// can	
		RequireSetting.authKeySetting("A3TV");
		sendGetReportStatus(false, MEDIA_TYPE.XML, PLATFORM.CAN,"291536424");
		
		// b2b
		RequireSetting.authKeySetting("A44S");
		sendGetReportStatus(false, MEDIA_TYPE.XML, PLATFORM.USB,"1229724460");
		
	}
	
	@Test
	public void sendOrderStatusRequest_XML_MOCK() {
		sendGetReportStatus(true, MEDIA_TYPE.XML, PLATFORM.USA,"105137040");
	}
	
	//@Test
	public void sendOrderStatusReques_JSON() {
		
				
		//Variables.orderNumber = "1200207029";	// fail response
		RequireSetting.authKeySetting("A006");
		sendGetReportStatus(false, MEDIA_TYPE.JSON, PLATFORM.USA,"10513704");
		
		// can		
		RequireSetting.authKeySetting("A3TV");
		sendGetReportStatus(false, MEDIA_TYPE.JSON, PLATFORM.CAN,"291536424");
		
		// b2b
		RequireSetting.authKeySetting("A44S");
		sendGetReportStatus(false, MEDIA_TYPE.JSON, PLATFORM.USB,"1229724460");
	}
	
	//@Test
	public void sendOrderStatusReques_JSON_MOCK() {		
		sendGetReportStatus(true, MEDIA_TYPE.JSON, PLATFORM.USA,"105137040");
	}
}
