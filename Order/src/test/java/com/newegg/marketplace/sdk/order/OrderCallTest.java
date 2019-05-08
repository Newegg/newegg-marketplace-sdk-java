package com.newegg.marketplace.sdk.order;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.order.model.ShipOrderRequest;
import com.newegg.marketplace.sdk.order.model.ShipOrderResponse;

public class OrderCallTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OrderConfig.class);
	}
	
	@Test
	public void testOrderConfirmation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOrderStatus() {
		fail("Not yet implemented");
	}

	@Test
	public void testCancelOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAdditionalOrderInformation() {
		fail("Not yet implemented");
	}

	@Test
	public void testShipOrder() {
		Variables.SimulationEnabled = true;
		OrderCall call = new OrderCall();
		ShipOrderRequest request = new ShipOrderRequest();
		request.setAction(2);
		request.setValueElement("<Shipment><Header><SellerID>A006</SellerID><SONumber>159243598</SONumber></Header><PackageList><Package><TrackingNumber>lztestA0060001</TrackingNumber><ShipCarrier>Other Carrier</ShipCarrier><ShipService>Other Service</ShipService><ItemList><Item><SellerPartNumber>A006ZX-35833</SellerPartNumber><ShippedQty>1</ShippedQty></Item></ItemList></Package></PackageList></Shipment>");
		//ShipOrderResponse response = call.shipOrder(request);
	}

	@Test
	public void testGetOrderInformation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSBNOrderCancellationRequestResult() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

}
