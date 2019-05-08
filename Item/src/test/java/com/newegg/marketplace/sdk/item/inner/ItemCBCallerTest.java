package com.newegg.marketplace.sdk.item.inner;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
//import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.item.ItemConfig;
import com.newegg.marketplace.sdk.item.Variables;
import com.newegg.marketplace.sdk.item.model.GetItemInventoryRequest;
import com.newegg.marketplace.sdk.item.model.GetItemInventoryResponse;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryandPriceRequest;
import com.newegg.marketplace.sdk.item.model.GetItemPriceRequest;
import com.newegg.marketplace.sdk.item.model.GetItemPriceResponse;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryandPriceResponse;

public class ItemCBCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ItemConfig.class);
		/*Content.Platform=PLATFORM.CAN;
		Content.SellerID="A3TV";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";*/
		//TODO
	}

	@Test
	public void testUpdateInventoryAndPrice_XML() {
		ItemCBCaller call=ItemCBCaller.buildXML();
		UpdateInventoryandPriceRequest request=new UpdateInventoryandPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		request.setActive(0);
		request.setCheckoutMAP(0);
		request.setEnableFreeShipping(0);
		request.setFulfillmentOption(0);
		request.setInventory(99);
		request.setMSRP(new BigDecimal("99.77"));
		request.setSellingPrice(new BigDecimal("99.77"));		
		UpdateInventoryandPriceResponse r=call.updateInventoryAndPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getResult(),new Integer("1"));
	}
	
	@Test
	public void testUpdateInventoryAndPrice_JSON() {
		ItemCBCaller call=ItemCBCaller.buildJSON();
		UpdateInventoryandPriceRequest request=new UpdateInventoryandPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		request.setActive(0);
		request.setCheckoutMAP(0);
		request.setEnableFreeShipping(0);
		request.setFulfillmentOption(0);
		request.setInventory(99);
		request.setMSRP(new BigDecimal("99.77"));
		request.setSellingPrice(new BigDecimal("99.77"));		
		UpdateInventoryandPriceResponse r=call.updateInventoryAndPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getResult(),new Integer("1"));
	}
	
	@Test
	public void testGetPrice_XML() {
		ItemCBCaller call=ItemCBCaller.buildXML();
		GetItemPriceRequest request=new GetItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetItemPriceResponse r=call.getPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getMSRP().compareTo(new BigDecimal("99.77")),0);
	}

	@Test
	public void testGetPrice_JSON() {
		ItemCBCaller call=ItemCBCaller.buildJSON();
		GetItemPriceRequest request=new GetItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetItemPriceResponse r=call.getPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getMSRP().compareTo(new BigDecimal("99.77")),0);
	}
	
	@Test
	public void testGetItemInventory_XML() {
		ItemCBCaller call=ItemCBCaller.buildXML();
		GetItemInventoryRequest request=new GetItemInventoryRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetItemInventoryResponse r=call.getItemInventory(request);		
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertTrue(r.getWarehouseAllocation().getWarehouse().size()>0);
	}

	@Test
	public void testGetItemInventory_JSON() {
		ItemCBCaller call=ItemCBCaller.buildJSON();
		GetItemInventoryRequest request=new GetItemInventoryRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetItemInventoryResponse r=call.getItemInventory(request);		
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertTrue(r.getWarehouseAllocation().getWarehouse().size()>0);
	}
	
	
	
	
	@Test
	public void testMockGetItemInventory_XML() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildXML();
		GetItemInventoryRequest request=new GetItemInventoryRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetItemInventoryResponse r=call.getItemInventory(request);	
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertTrue(r.getWarehouseAllocation().getWarehouse().size()>0);
	}

	@Test
	public void testMockGetItemInventory_JSON() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildJSON();
		GetItemInventoryRequest request=new GetItemInventoryRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetItemInventoryResponse r=call.getItemInventory(request);		
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertTrue(r.getWarehouseAllocation().getWarehouse().size()>0);
	}
	
	@Test
	public void testMockGetPrice_XML() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildXML();
		GetItemPriceRequest request=new GetItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetItemPriceResponse r=call.getPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getMSRP().compareTo(new BigDecimal("99.77")),0);
	}

	@Test
	public void testMockGetPrice_JSON() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildJSON();
		GetItemPriceRequest request=new GetItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetItemPriceResponse r=call.getPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getMSRP().compareTo(new BigDecimal("99.77")),0);
	}
	
	@Test
	public void testMockPpdateInventoryAndPrice_XML() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildXML();
		UpdateInventoryandPriceRequest request=new UpdateInventoryandPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		request.setActive(0);
		request.setCheckoutMAP(0);
		request.setEnableFreeShipping(0);
		request.setFulfillmentOption(0);
		request.setInventory(99);
		request.setMSRP(new BigDecimal("99.77"));
		request.setSellingPrice(new BigDecimal("99.77"));		
		UpdateInventoryandPriceResponse r=call.updateInventoryAndPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getResult(),new Integer("1"));
	}
	
	@Test
	public void testMockUpdateInventoryAndPrice_JSON() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildJSON();
		UpdateInventoryandPriceRequest request=new UpdateInventoryandPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		request.setActive(0);
		request.setCheckoutMAP(0);
		request.setEnableFreeShipping(0);
		request.setFulfillmentOption(0);
		request.setInventory(99);
		request.setMSRP(new BigDecimal("99.77"));
		request.setSellingPrice(new BigDecimal("99.77"));		
		UpdateInventoryandPriceResponse r=call.updateInventoryAndPrice(request);
		Variables.SimulationEnabled=false;		
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getResult(),new Integer("1"));
	}
}
