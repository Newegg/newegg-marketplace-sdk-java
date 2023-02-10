package newegg.marketplace.sdk.order.inner;

import static org.junit.Assert.*;

import java.math.BigInteger;

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
import newegg.marketplace.sdk.order.model.OrderConfirmationRequest;
import newegg.marketplace.sdk.order.model.OrderConfirmationResponse;


public class OrderConfirmCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OrderConfig.class);
	}
	
	private OrderConfirmationRequest buildOderConifrmRequest(PLATFORM p) {
		OrderConfirmationRequest request = new OrderConfirmationRequest();
		OrderConfirmationRequest.RequestBody body = new OrderConfirmationRequest.RequestBody();
		OrderConfirmationRequest.RequestBody.DownloadedOrderList downloadList = 
				new OrderConfirmationRequest.RequestBody.DownloadedOrderList();
		
		switch (p) {
		case USA:
			downloadList.getOrderNumber().add(new BigInteger("159243598"));
			body.setDownloadedOrderList(downloadList);
			break;
			
		case CAN:
			downloadList.getOrderNumber().add(new BigInteger("125298620"));
			body.setDownloadedOrderList(downloadList);
			break;
			
		case USB:
			downloadList.getOrderNumber().add(new BigInteger("1230247460"));
			body.setDownloadedOrderList(downloadList);
			break;
			
		default:
			break;
		}
		
		request.setOperationType("OrderConfirmationRequest");
		request.setRequestBody(body);
		
		return request;
	}
	
	private void sendOrderConfirm(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		OrderConfirmationResponse response = null;
		OrderConfirmationRequest request = null;
		OrderConfirmCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			RequireSetting.log.info(RequireSetting.getTestInfo());
			
			request = buildOderConifrmRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = OrderConfirmCaller.buildXML();
			else
				sender = OrderConfirmCaller.buildJSON();
			
			response = sender.sendOrderConfirmRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testSendOrderConfirmRequest_XML() {
		/*OrderConfirmRequest.RequestBody requestBody = new OrderConfirmRequest.RequestBody();
		OrderConfirmRequest.RequestBody.DownloadedOrderList downloadList = new OrderConfirmRequest.RequestBody.DownloadedOrderList();
		
		downloadList.getOrderNumber().add(new BigInteger("159243598"));
		requestBody.setDownloadedOrderList(downloadList);
		OrderConfirmCaller call = OrderConfirmCaller.buildXML();
		OrderConfirmRequest request = new OrderConfirmRequest();
		request.setOperationType("OrderConfirmationRequest");
		request.setRequestBody(requestBody);
		OrderConfirmResponse response = call.sendOrderConfirmRequest(request);
		assertTrue("OrderConfirmCallerTest.sendOrderConfirmRequestXML command fail.", "true".equals(response.getIsSuccess()));*/
	
		RequireSetting.authKeySetting("A006");
		sendOrderConfirm(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		/*RequireSetting.authKeySetting("A3TV");
		sendOrderConfirm(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		sendOrderConfirm(false, MEDIA_TYPE.XML, PLATFORM.USB);*/
	}
	
	@Test
	public void testSendOrderConfirmRequest_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		sendOrderConfirm(true, MEDIA_TYPE.XML, PLATFORM.USA);
	}
	
	//@Test
	public void testSendOrderConfirmRequest_JSON() {
		/*Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		OrderConfirmRequest.RequestBody requestBody = new OrderConfirmRequest.RequestBody();
		OrderConfirmRequest.RequestBody.DownloadedOrderList downloadList = new OrderConfirmRequest.RequestBody.DownloadedOrderList();
		
		downloadList.getOrderNumber().add(new BigInteger("159243598"));
		requestBody.setDownloadedOrderList(downloadList);		
		OrderConfirmCaller call = OrderConfirmCaller.buildJSON();
		OrderConfirmRequest request = new OrderConfirmRequest();
		request.setOperationType("OrderConfirmationRequest");
		request.setRequestBody(requestBody);
		OrderConfirmResponse response = call.sendOrderConfirmRequest(request);
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		assertTrue("OrderConfirmCallerTest.sendOrderConfirmRequestJSON command fail.", "true".equals(response.getIsSuccess()));
		*/
		
		RequireSetting.authKeySetting("A006");
		sendOrderConfirm(true, MEDIA_TYPE.JSON, PLATFORM.USA);
	}

}
