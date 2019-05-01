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
import com.newegg.marketplace.sdk.item.model.InventoryQueryCriteriaV2;
import com.newegg.marketplace.sdk.item.model.InventoryResultV2;
import com.newegg.marketplace.sdk.item.model.ItemInventoryAndPriceInfo;
import com.newegg.marketplace.sdk.item.model.PriceQueryCriteriaV2;
import com.newegg.marketplace.sdk.item.model.PriceResultV2;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryAndPriceResult;

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
		ItemInventoryAndPriceInfo request=new ItemInventoryAndPriceInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		request.setActive(0);
		request.setCheckoutMAP(0);
		request.setEnableFreeShipping(0);
		request.setFulfillmentOption(0);
		request.setInventory(99);
		request.setMSRP(new BigDecimal("99.77"));
		request.setSellingPrice(new BigDecimal("99.77"));		
		UpdateInventoryAndPriceResult r=call.updateInventoryAndPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getResult(),new Integer("1"));
	}
	
	@Test
	public void testUpdateInventoryAndPrice_JSON() {
		ItemCBCaller call=ItemCBCaller.buildJSON();
		ItemInventoryAndPriceInfo request=new ItemInventoryAndPriceInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		request.setActive(0);
		request.setCheckoutMAP(0);
		request.setEnableFreeShipping(0);
		request.setFulfillmentOption(0);
		request.setInventory(99);
		request.setMSRP(new BigDecimal("99.77"));
		request.setSellingPrice(new BigDecimal("99.77"));		
		UpdateInventoryAndPriceResult r=call.updateInventoryAndPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getResult(),new Integer("1"));
	}
	
	@Test
	public void testGetPrice_XML() {
		ItemCBCaller call=ItemCBCaller.buildXML();
		PriceQueryCriteriaV2 request=new PriceQueryCriteriaV2();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		PriceResultV2 r=call.getPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getMSRP().compareTo(new BigDecimal("99.77")),0);
	}

	@Test
	public void testGetPrice_JSON() {
		ItemCBCaller call=ItemCBCaller.buildJSON();
		PriceQueryCriteriaV2 request=new PriceQueryCriteriaV2();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		PriceResultV2 r=call.getPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getMSRP().compareTo(new BigDecimal("99.77")),0);
	}
	
	@Test
	public void testGetItemInventory_XML() {
		ItemCBCaller call=ItemCBCaller.buildXML();
		InventoryQueryCriteriaV2 request=new InventoryQueryCriteriaV2();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryResultV2 r=call.getItemInventory(request);		
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertTrue(r.getWarehouseAllocation().getWarehouse().size()>0);
	}

	@Test
	public void testGetItemInventory_JSON() {
		ItemCBCaller call=ItemCBCaller.buildJSON();
		InventoryQueryCriteriaV2 request=new InventoryQueryCriteriaV2();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryResultV2 r=call.getItemInventory(request);		
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertTrue(r.getWarehouseAllocation().getWarehouse().size()>0);
	}
	
	
	
	
	@Test
	public void testMockGetItemInventory_XML() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildXML();
		InventoryQueryCriteriaV2 request=new InventoryQueryCriteriaV2();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryResultV2 r=call.getItemInventory(request);	
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertTrue(r.getWarehouseAllocation().getWarehouse().size()>0);
	}

	@Test
	public void testMockGetItemInventory_JSON() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildJSON();
		InventoryQueryCriteriaV2 request=new InventoryQueryCriteriaV2();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryResultV2 r=call.getItemInventory(request);		
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertTrue(r.getWarehouseAllocation().getWarehouse().size()>0);
	}
	
	@Test
	public void testMockGetPrice_XML() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildXML();
		PriceQueryCriteriaV2 request=new PriceQueryCriteriaV2();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		PriceResultV2 r=call.getPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getMSRP().compareTo(new BigDecimal("99.77")),0);
	}

	@Test
	public void testMockGetPrice_JSON() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildJSON();
		PriceQueryCriteriaV2 request=new PriceQueryCriteriaV2();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		PriceResultV2 r=call.getPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getMSRP().compareTo(new BigDecimal("99.77")),0);
	}
	
	@Test
	public void testMockPpdateInventoryAndPrice_XML() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildXML();
		ItemInventoryAndPriceInfo request=new ItemInventoryAndPriceInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		request.setActive(0);
		request.setCheckoutMAP(0);
		request.setEnableFreeShipping(0);
		request.setFulfillmentOption(0);
		request.setInventory(99);
		request.setMSRP(new BigDecimal("99.77"));
		request.setSellingPrice(new BigDecimal("99.77"));		
		UpdateInventoryAndPriceResult r=call.updateInventoryAndPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getResult(),new Integer("1"));
	}
	
	@Test
	public void testMockUpdateInventoryAndPrice_JSON() {
		Variables.SimulationEnabled=true;
		ItemCBCaller call=ItemCBCaller.buildJSON();
		ItemInventoryAndPriceInfo request=new ItemInventoryAndPriceInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		request.setActive(0);
		request.setCheckoutMAP(0);
		request.setEnableFreeShipping(0);
		request.setFulfillmentOption(0);
		request.setInventory(99);
		request.setMSRP(new BigDecimal("99.77"));
		request.setSellingPrice(new BigDecimal("99.77"));		
		UpdateInventoryAndPriceResult r=call.updateInventoryAndPrice(request);
		Variables.SimulationEnabled=false;		
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertEquals("Group-By test Item A",r.getSellerPartNumber());
		assertEquals(r.getResult(),new Integer("1"));
	}
}
