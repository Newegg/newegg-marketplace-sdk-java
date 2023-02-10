package newegg.marketplace.sdk.order.inner;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.common.Content.PLATFORM;
import newegg.marketplace.sdk.common.NeweggException;
import newegg.marketplace.sdk.order.RequireSetting;
import newegg.marketplace.sdk.order.Variables;
import newegg.marketplace.sdk.order.model.RemoveItemRequest;
import newegg.marketplace.sdk.order.model.RemoveItemResponse;

public class RemoveItemCallerTest {

	private RemoveItemRequest buildRemoveItemRequest(PLATFORM p) {
		RemoveItemRequest request = new RemoveItemRequest();
		RemoveItemRequest.RequestBody body = new RemoveItemRequest.RequestBody();
		RemoveItemRequest.RequestBody.KillItem killItem = new RemoveItemRequest.RequestBody.KillItem();
		RemoveItemRequest.RequestBody.KillItem.Order order = new RemoveItemRequest.RequestBody.KillItem.Order();
		RemoveItemRequest.RequestBody.KillItem.Order.ItemList list = 
				new RemoveItemRequest.RequestBody.KillItem.Order.ItemList();
		RemoveItemRequest.RequestBody.KillItem.Order.ItemList.Item item = 
				new RemoveItemRequest.RequestBody.KillItem.Order.ItemList.Item();
		
		switch (p) {
		case USA:
			item.setSellerPartNumber("Test_SP181001101657566");
			list.getItem().add(item);
			break;
			
		case CAN:
			item.setSellerPartNumber("Test_SP181001101657566");
			list.getItem().add(item);
			break;
			
		case USB:
			item.setSellerPartNumber("Test_SP181001101657566");
			list.getItem().add(item);
			break;
			
		default:
			break;
		}
		
		order.setItemList(list);
		killItem.setOrder(order);
		body.setKillItem(killItem);
		request.setOperationType("KillItemRequest");
		request.setRequestBody(body);
		
		return request;
	}
	
	private void sendRemoveItem(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm,String orderNumber) {
		RemoveItemResponse response = null;
		RemoveItemRequest request = null;
		RemoveItemCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			RequireSetting.log.info(RequireSetting.getTestInfo());
			
			request = buildRemoveItemRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = RemoveItemCaller.buildXML();
			else
				sender = RemoveItemCaller.buildJSON();
			
			response = sender.sendRemoveItemRequest(request,orderNumber);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testRemoveItemCaller_XML_MOCK() {
		
		RequireSetting.authKeySetting("A006");
		sendRemoveItem(true, MEDIA_TYPE.XML, PLATFORM.USA,"230103635");
	}

}
