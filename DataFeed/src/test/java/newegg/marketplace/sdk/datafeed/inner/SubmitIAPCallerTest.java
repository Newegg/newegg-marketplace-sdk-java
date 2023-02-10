package newegg.marketplace.sdk.datafeed.inner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.datafeed.DataFeedConfig;
import newegg.marketplace.sdk.datafeed.Variables;
import newegg.marketplace.sdk.datafeed.model.InventoryAndPriceFeedRequest;
import newegg.marketplace.sdk.datafeed.model.InventoryAndPriceFeedResponse;
import newegg.marketplace.sdk.datafeed.model.InventoryUpdateFeedRequest;
import newegg.marketplace.sdk.datafeed.model.InventoryUpdateFeedResponse;
import newegg.marketplace.sdk.datafeed.model.PriceUpdateFeedRequest;
import newegg.marketplace.sdk.datafeed.model.PriceUpdateFeedResponse;

public class SubmitIAPCallerTest {

	private static ConfBack b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(DataFeedConfig.class);
		b = new ConfBack();
	}

	@Test
	public void testMockInventoryAndPriceFeed_XML() {
		Variables.SimulationEnabled = true;
		SubmitIAPCaller call = SubmitIAPCaller.buildXML();
		InventoryAndPriceFeedRequest request = new InventoryAndPriceFeedRequest();
		request.setOverwrite("No");
		InventoryAndPriceFeedRequest.Message m = new InventoryAndPriceFeedRequest.Message();
		InventoryAndPriceFeedRequest.Message.Inventory inv = new InventoryAndPriceFeedRequest.Message.Inventory();
		InventoryAndPriceFeedRequest.Message.Inventory.Item i = new InventoryAndPriceFeedRequest.Message.Inventory.Item();
		i.setActivationMark("False");
		i.setCurrency("USD");
		i.setFulfillmentOption("Merchant");
		i.setInventory(new BigInteger("159"));
		i.setMSRP(new BigDecimal("129.99"));
		i.setNeweggItemNumber("9SIawes01X1339");
		i.setSellerPartNumber("JACKETEST0921001004");
		i.setSellingPrice(new BigDecimal("127.92"));
		i.setShipping("free");
		inv.getItem().add(i);
		m.setInventory(inv);
		request.setMessage(m);
		InventoryAndPriceFeedResponse r = call.inventoryAndPriceFeed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("23J9KC7M3JY0J", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("INVENTORY_AND_PRICE_DATA", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}

	@Test
	public void testMockPriceUpdateFeed_XML() {
		Variables.SimulationEnabled = true;
		SubmitIAPCaller call = SubmitIAPCaller.buildXML();
		PriceUpdateFeedRequest request = new PriceUpdateFeedRequest();
		PriceUpdateFeedRequest.Message m = new PriceUpdateFeedRequest.Message();
		PriceUpdateFeedRequest.Message.Price p = new PriceUpdateFeedRequest.Message.Price();
		PriceUpdateFeedRequest.Message.Price.Item i = new PriceUpdateFeedRequest.Message.Price.Item();
		i.setSellerPartNumber("a006-test-001");
		i.setNeweggItemNumber("9SIAWE50008504");
		i.setCountryCode("USA");
		i.setCurrency("USD");
		i.setMSRP(new BigDecimal("100.00"));
		i.setMAP(new BigDecimal("9.99"));
		i.setCheckoutMAP("True");
		i.setSellingPrice(new BigDecimal("100.00"));
		i.setShipping("default");
		i.setActivationMark("True");
		p.getItem().add(i);
		m.setPrice(p);
		request.setMessage(m);
		PriceUpdateFeedResponse r = call.priceUpdateFeed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("21XOSPLA4FUKV", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("PRICE_DATA", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}

	@Test
	public void testMockInventoryUpdateFeed_XML() {
		Variables.SimulationEnabled = true;
		SubmitIAPCaller call = SubmitIAPCaller.buildXML();
		InventoryUpdateFeedRequest request = new InventoryUpdateFeedRequest();
		InventoryUpdateFeedRequest.Message m = new InventoryUpdateFeedRequest.Message();
		InventoryUpdateFeedRequest.Message.Inventory inv = new InventoryUpdateFeedRequest.Message.Inventory();
		InventoryUpdateFeedRequest.Message.Inventory.Item i1 = new InventoryUpdateFeedRequest.Message.Inventory.Item();
		i1.setSellerPartNumber("a006-test-001");
		i1.setNeweggItemNumber("9SIAWE50008504");
		i1.setWarehouseLocation("USA");
		i1.setFulfillmentOption("Seller");
		i1.setInventory(new BigInteger("200"));
		inv.getItem().add(i1);
		m.setInventory(inv);
		request.setMessage(m);
		InventoryUpdateFeedResponse r = call.inventoryUpdateFeed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("23COGPPOGWE5Z", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("INVENTORY_DATA", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}
}
