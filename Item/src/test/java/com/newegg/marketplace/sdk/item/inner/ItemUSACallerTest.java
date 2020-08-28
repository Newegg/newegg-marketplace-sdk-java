package com.newegg.marketplace.sdk.item.inner;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.item.ItemConfig;
import com.newegg.marketplace.sdk.item.Variables;
import com.newegg.marketplace.sdk.item.model.GetItemInternationalInventoryRequest;
import com.newegg.marketplace.sdk.item.model.GetItemInternationalInventoryRequest.WarehouseList;
import com.newegg.marketplace.sdk.item.model.GetItemInternationalInventoryResponse;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryRequest;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryRequest.InventoryList;
import com.newegg.marketplace.sdk.item.model.UpdateItemPriceRequest;
import com.newegg.marketplace.sdk.item.model.GetInternationalItemPriceRequest;
import com.newegg.marketplace.sdk.item.model.GetInternationalItemPriceResponse;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryResponse;
import com.newegg.marketplace.sdk.item.model.UpdateItemPriceResponse;

public class ItemUSACallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ItemConfig.class);
	}

	@Test
	public void testUpdateItemPrice_XML() {
		ItemUSACaller call=ItemUSACaller.buildXML();
		UpdateItemPriceRequest request =new UpdateItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		UpdateItemPriceRequest.PriceList pl=new UpdateItemPriceRequest.PriceList();
		UpdateItemPriceRequest.PriceList.Price e=new UpdateItemPriceRequest.PriceList.Price();
		e.setCountryCode("USA");
		e.setCurrency("USD");
		e.setActive(0);
		e.setCheckoutMAP(0);
		e.setLimitQuantity(30);
		e.setEnableFreeShipping(0);
		e.setMAP(new BigDecimal("0"));
		e.setMSRP(new BigDecimal("99.77"));
		e.setSellingPrice(new BigDecimal("99.77"));	
		pl.getPrice().add(e);
		request.setPriceList(pl);
		UpdateItemPriceResponse r=call.updateItemPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
	
	@Test
	public void testUpdateItemPrice_JSON() {
		ItemUSACaller call=ItemUSACaller.buildJSON();
		UpdateItemPriceRequest request =new UpdateItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		UpdateItemPriceRequest.PriceList pl=new UpdateItemPriceRequest.PriceList();
		UpdateItemPriceRequest.PriceList.Price e=new UpdateItemPriceRequest.PriceList.Price();
		e.setCountryCode("USA");
		e.setCurrency("USD");
		e.setActive(0);
		e.setCheckoutMAP(0);
		e.setEnableFreeShipping(0);
		e.setLimitQuantity(30);
		e.setMAP(new BigDecimal("0"));
		e.setMSRP(new BigDecimal("99.77"));
		e.setSellingPrice(new BigDecimal("99.77"));	
		pl.getPrice().add(e);
		request.setPriceList(pl);
		UpdateItemPriceResponse r=call.updateItemPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
	
	@Test
	public void testUpdateItemInventory_XML() {
		ItemUSACaller call=ItemUSACaller.buildXML();
		UpdateInventoryRequest request =new UpdateInventoryRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryList il=new InventoryList();
		UpdateInventoryRequest.InventoryList.Inventory i=new UpdateInventoryRequest.InventoryList.Inventory();
		i.setAvailableQuantity(new BigInteger("99"));
		i.setWarehouseLocation("USA");
		il.getInventory().add(i);
		request.setInventoryList(il);
		UpdateInventoryResponse r=call.updateItemInventory(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getInventoryList().getInventory().size()>0);
	}

	@Test
	public void testUpdateItemInventory_JSON() {
		ItemUSACaller call=ItemUSACaller.buildJSON();
		UpdateInventoryRequest request =new UpdateInventoryRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryList il=new InventoryList();
		UpdateInventoryRequest.InventoryList.Inventory i=new UpdateInventoryRequest.InventoryList.Inventory();
		i.setAvailableQuantity(new BigInteger("99"));
		i.setWarehouseLocation("USA");
		il.getInventory().add(i);
		request.setInventoryList(il);
		UpdateInventoryResponse r=call.updateItemInventory(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getInventoryList().getInventory().size()>0);
	}
	
	@Test
	public void testGetItemPrice_XML() {
		ItemUSACaller call=ItemUSACaller.buildXML();
		GetInternationalItemPriceRequest request =new GetInternationalItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetInternationalItemPriceResponse r=call.getItemPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getPriceList().getPrice().size()>0);
		
	}
	
	@Test
	public void testGetItemPrice_JSON() {
		ItemUSACaller call=ItemUSACaller.buildJSON();
		GetInternationalItemPriceRequest request =new GetInternationalItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetInternationalItemPriceResponse r=call.getItemPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
	
	@Test
	public void testGetItemInventory_XML() {
		ItemUSACaller call=ItemUSACaller.buildXML();
		GetItemInternationalInventoryRequest request=new GetItemInternationalInventoryRequest();		
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		WarehouseList w1=new WarehouseList();
		w1.getWarehouseLocation().add("USA");
		w1.getWarehouseLocation().add("AUS");
		request.setWarehouseList(w1);
		GetItemInternationalInventoryResponse r=call.getItemInventory(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getInventoryAllocation().getInventory().size()>0);
	}

	@Test
	public void testGetItemInventory_JSON() {
		ItemUSACaller call=ItemUSACaller.buildJSON();
		GetItemInternationalInventoryRequest request=new GetItemInternationalInventoryRequest();		
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		WarehouseList w1=new WarehouseList();
		w1.getWarehouseLocation().add("USA");
		w1.getWarehouseLocation().add("AUS");
		request.setWarehouseList(w1);
		GetItemInternationalInventoryResponse r=call.getItemInventory(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getInventoryAllocation().getInventory().size()>0);
	}
	
	@Test
	public void testMockGetItemInventory_XML() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildXML();
		GetItemInternationalInventoryRequest request=new GetItemInternationalInventoryRequest();		
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		WarehouseList w1=new WarehouseList();
		w1.getWarehouseLocation().add("USA");
		w1.getWarehouseLocation().add("AUS");
		request.setWarehouseList(w1);
		GetItemInternationalInventoryResponse r=call.getItemInventory(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getInventoryAllocation().getInventory().size()>0);
	}

	@Test
	public void testMockGetItemInventory_JSON() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildJSON();
		GetItemInternationalInventoryRequest request=new GetItemInternationalInventoryRequest();		
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		WarehouseList w1=new WarehouseList();
		w1.getWarehouseLocation().add("USA");
		w1.getWarehouseLocation().add("AUS");
		request.setWarehouseList(w1);
		GetItemInternationalInventoryResponse r=call.getItemInventory(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getInventoryAllocation().getInventory().size()>0);
	}
	
	@Test
	public void testMockGetItemPrice_XML() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildXML();
		GetInternationalItemPriceRequest request =new GetInternationalItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetInternationalItemPriceResponse r=call.getItemPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getPriceList().getPrice().size()>0);
		
	}
	
	@Test
	public void testMockGetItemPrice_JSON() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildJSON();
		GetInternationalItemPriceRequest request =new GetInternationalItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		GetInternationalItemPriceResponse r=call.getItemPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
	
	@Test
	public void testMockUpdateItemInventory_XML() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildXML();
		UpdateInventoryRequest request =new UpdateInventoryRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryList il=new InventoryList();
		UpdateInventoryRequest.InventoryList.Inventory i=new UpdateInventoryRequest.InventoryList.Inventory();
		i.setAvailableQuantity(new BigInteger("99"));
		i.setWarehouseLocation("USA");
		il.getInventory().add(i);
		request.setInventoryList(il);
		UpdateInventoryResponse r=call.updateItemInventory(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getInventoryList().getInventory().size()>0);
	}

	@Test
	public void testMockUpdateItemInventory_JSON() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildJSON();
		UpdateInventoryRequest request =new UpdateInventoryRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryList il=new InventoryList();
		UpdateInventoryRequest.InventoryList.Inventory i=new UpdateInventoryRequest.InventoryList.Inventory();
		i.setAvailableQuantity(new BigInteger("99"));
		i.setWarehouseLocation("USA");
		il.getInventory().add(i);
		request.setInventoryList(il);
		UpdateInventoryResponse r=call.updateItemInventory(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getInventoryList().getInventory().size()>0);
	}
	
	@Test
	public void testMockUpdateItemPrice_XML() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildXML();
		UpdateItemPriceRequest request =new UpdateItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		UpdateItemPriceRequest.PriceList pl=new UpdateItemPriceRequest.PriceList();
		UpdateItemPriceRequest.PriceList.Price e=new UpdateItemPriceRequest.PriceList.Price();
		e.setCountryCode("USA");
		e.setCurrency("USD");
		e.setActive(0);
		e.setCheckoutMAP(0);
		e.setEnableFreeShipping(0);
		e.setMAP(new BigDecimal("0"));
		e.setMSRP(new BigDecimal("99.77"));
		e.setSellingPrice(new BigDecimal("99.77"));	
		pl.getPrice().add(e);
		request.setPriceList(pl);
		UpdateItemPriceResponse r=call.updateItemPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
	
	@Test
	public void testMockUpdateItemPrice_JSON() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildJSON();
		UpdateItemPriceRequest request =new UpdateItemPriceRequest();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		UpdateItemPriceRequest.PriceList pl=new UpdateItemPriceRequest.PriceList();
		UpdateItemPriceRequest.PriceList.Price e=new UpdateItemPriceRequest.PriceList.Price();
		e.setCountryCode("USA");
		e.setCurrency("USD");
		e.setActive(0);
		e.setCheckoutMAP(0);
		e.setEnableFreeShipping(0);
		e.setMAP(new BigDecimal("0"));
		e.setMSRP(new BigDecimal("99.77"));
		e.setSellingPrice(new BigDecimal("99.77"));	
		pl.getPrice().add(e);
		request.setPriceList(pl);
		UpdateItemPriceResponse r=call.updateItemPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
}
