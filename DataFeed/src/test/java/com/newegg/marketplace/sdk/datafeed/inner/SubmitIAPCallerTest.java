package com.newegg.marketplace.sdk.datafeed.inner;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.datafeed.DataFeedConfig;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.InventoryAndPrice;
import com.newegg.marketplace.sdk.datafeed.model.InventoryUpdate;
import com.newegg.marketplace.sdk.datafeed.model.PriceUpdate;
import com.newegg.marketplace.sdk.datafeed.model.SubmitFeedResponse;

public class SubmitIAPCallerTest {

	private static ConfBack b;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(DataFeedConfig.class);
		b=new ConfBack();
	}

	@Test
	public void testMockInventoryAndPriceFeed_XML() {
		Variables.SimulationEnabled=true;
		SubmitIAPCaller call=SubmitIAPCaller.buildXML();
		InventoryAndPrice request=new InventoryAndPrice();
		request.setOverwrite("No");
		InventoryAndPrice.Message m=new InventoryAndPrice.Message();
		InventoryAndPrice.Message.Inventory inv=new InventoryAndPrice.Message.Inventory();
		InventoryAndPrice.Message.Inventory.Item i=new InventoryAndPrice.Message.Inventory.Item();
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
		SubmitFeedResponse r=call.inventoryAndPriceFeed(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());		
		assertEquals("23J9KC7M3JY0J",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("INVENTORY_AND_PRICE_DATA",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}

	@Test
	public void testMockPriceUpdateFeed_XML() {
		Variables.SimulationEnabled=true;
		SubmitIAPCaller call=SubmitIAPCaller.buildXML();
		PriceUpdate request=new PriceUpdate();
		PriceUpdate.Message m =new PriceUpdate.Message();
		PriceUpdate.Message.Price p=new PriceUpdate.Message.Price();
		PriceUpdate.Message.Price.Item i =new PriceUpdate.Message.Price.Item();
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
		SubmitFeedResponse r=call.priceUpdateFeed(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());		
		assertEquals("21XOSPLA4FUKV",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("PRICE_DATA",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}
	
	@Test
	public void testMockInventoryUpdateFeed_XML() {
		Variables.SimulationEnabled=true;
		SubmitIAPCaller call=SubmitIAPCaller.buildXML();
		InventoryUpdate request=new InventoryUpdate();
		InventoryUpdate.Message m=new InventoryUpdate.Message();
		InventoryUpdate.Message.Inventory inv=new InventoryUpdate.Message.Inventory();
		InventoryUpdate.Message.Inventory.Item i1=new InventoryUpdate.Message.Inventory.Item();
		i1.setSellerPartNumber("a006-test-001");
		i1.setNeweggItemNumber("9SIAWE50008504");
		i1.setWarehouseLocation("USA");
		i1.setFulfillmentOption("Seller");
		i1.setInventory(new BigInteger("200"));
		inv.getItem().add(i1);
		m.setInventory(inv);
		request.setMessage(m);
		SubmitFeedResponse r=call.inventoryUpdateFeed(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());		
		assertEquals("23COGPPOGWE5Z",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("INVENTORY_DATA",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}
}
