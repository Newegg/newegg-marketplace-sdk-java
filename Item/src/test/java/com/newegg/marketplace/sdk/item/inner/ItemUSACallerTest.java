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
import com.newegg.marketplace.sdk.item.model.InventoryQueryCriteria;
import com.newegg.marketplace.sdk.item.model.InventoryQueryCriteria.WarehouseList;
import com.newegg.marketplace.sdk.item.model.InventoryResult;
import com.newegg.marketplace.sdk.item.model.ItemInventoryInfo;
import com.newegg.marketplace.sdk.item.model.ItemInventoryInfo.InventoryList;
import com.newegg.marketplace.sdk.item.model.ItemPriceInfo;
import com.newegg.marketplace.sdk.item.model.PriceQueryCriteria;
import com.newegg.marketplace.sdk.item.model.PriceResult;
import com.newegg.marketplace.sdk.item.model.UpdateInventoryResult;
import com.newegg.marketplace.sdk.item.model.UpdatePriceResult;

public class ItemUSACallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ItemConfig.class);
	}

	@Test
	public void testUpdateItemPrice_XML() {
		ItemUSACaller call=ItemUSACaller.buildXML();
		ItemPriceInfo request =new ItemPriceInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		ItemPriceInfo.PriceList pl=new ItemPriceInfo.PriceList();
		ItemPriceInfo.PriceList.Price e=new ItemPriceInfo.PriceList.Price();
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
		UpdatePriceResult r=call.updateItemPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
	
	@Test
	public void testUpdateItemPrice_JSON() {
		ItemUSACaller call=ItemUSACaller.buildJSON();
		ItemPriceInfo request =new ItemPriceInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		ItemPriceInfo.PriceList pl=new ItemPriceInfo.PriceList();
		ItemPriceInfo.PriceList.Price e=new ItemPriceInfo.PriceList.Price();
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
		UpdatePriceResult r=call.updateItemPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
	
	@Test
	public void testUpdateItemInventory_XML() {
		ItemUSACaller call=ItemUSACaller.buildXML();
		ItemInventoryInfo request =new ItemInventoryInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryList il=new InventoryList();
		ItemInventoryInfo.InventoryList.Inventory i=new ItemInventoryInfo.InventoryList.Inventory();
		i.setAvailableQuantity(new BigInteger("99"));
		i.setWarehouseLocation("USA");
		il.getInventory().add(i);
		request.setInventoryList(il);
		UpdateInventoryResult r=call.updateItemInventory(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getInventoryList().getInventory().size()>0);
	}

	@Test
	public void testUpdateItemInventory_JSON() {
		ItemUSACaller call=ItemUSACaller.buildJSON();
		ItemInventoryInfo request =new ItemInventoryInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryList il=new InventoryList();
		ItemInventoryInfo.InventoryList.Inventory i=new ItemInventoryInfo.InventoryList.Inventory();
		i.setAvailableQuantity(new BigInteger("99"));
		i.setWarehouseLocation("USA");
		il.getInventory().add(i);
		request.setInventoryList(il);
		UpdateInventoryResult r=call.updateItemInventory(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getInventoryList().getInventory().size()>0);
	}
	
	@Test
	public void testGetItemPrice_XML() {
		ItemUSACaller call=ItemUSACaller.buildXML();
		PriceQueryCriteria request =new PriceQueryCriteria();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		PriceResult r=call.getItemPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getPriceList().getPrice().size()>0);
		
	}
	
	@Test
	public void testGetItemPrice_JSON() {
		ItemUSACaller call=ItemUSACaller.buildJSON();
		PriceQueryCriteria request =new PriceQueryCriteria();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		PriceResult r=call.getItemPrice(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
	
	@Test
	public void testGetItemInventory_XML() {
		ItemUSACaller call=ItemUSACaller.buildXML();
		InventoryQueryCriteria request=new InventoryQueryCriteria();		
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		WarehouseList w1=new WarehouseList();
		w1.getWarehouseLocation().add("USA");
		w1.getWarehouseLocation().add("AUS");
		request.setWarehouseList(w1);
		InventoryResult r=call.getItemInventory(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getInventoryAllocation().getInventory().size()>0);
	}

	@Test
	public void testGetItemInventory_JSON() {
		ItemUSACaller call=ItemUSACaller.buildJSON();
		InventoryQueryCriteria request=new InventoryQueryCriteria();		
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		WarehouseList w1=new WarehouseList();
		w1.getWarehouseLocation().add("USA");
		w1.getWarehouseLocation().add("AUS");
		request.setWarehouseList(w1);
		InventoryResult r=call.getItemInventory(request);
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getInventoryAllocation().getInventory().size()>0);
	}
	
	@Test
	public void testMockGetItemInventory_XML() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildXML();
		InventoryQueryCriteria request=new InventoryQueryCriteria();		
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		WarehouseList w1=new WarehouseList();
		w1.getWarehouseLocation().add("USA");
		w1.getWarehouseLocation().add("AUS");
		request.setWarehouseList(w1);
		InventoryResult r=call.getItemInventory(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getInventoryAllocation().getInventory().size()>0);
	}

	@Test
	public void testMockGetItemInventory_JSON() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildJSON();
		InventoryQueryCriteria request=new InventoryQueryCriteria();		
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		WarehouseList w1=new WarehouseList();
		w1.getWarehouseLocation().add("USA");
		w1.getWarehouseLocation().add("AUS");
		request.setWarehouseList(w1);
		InventoryResult r=call.getItemInventory(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getInventoryAllocation().getInventory().size()>0);
	}
	
	@Test
	public void testMockGetItemPrice_XML() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildXML();
		PriceQueryCriteria request =new PriceQueryCriteria();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		PriceResult r=call.getItemPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getPriceList().getPrice().size()>0);
		
	}
	
	@Test
	public void testMockGetItemPrice_JSON() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildJSON();
		PriceQueryCriteria request =new PriceQueryCriteria();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		PriceResult r=call.getItemPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
	
	@Test
	public void testMockUpdateItemInventory_XML() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildXML();
		ItemInventoryInfo request =new ItemInventoryInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryList il=new InventoryList();
		ItemInventoryInfo.InventoryList.Inventory i=new ItemInventoryInfo.InventoryList.Inventory();
		i.setAvailableQuantity(new BigInteger("99"));
		i.setWarehouseLocation("USA");
		il.getInventory().add(i);
		request.setInventoryList(il);
		UpdateInventoryResult r=call.updateItemInventory(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getInventoryList().getInventory().size()>0);
	}

	@Test
	public void testMockUpdateItemInventory_JSON() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildJSON();
		ItemInventoryInfo request =new ItemInventoryInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		InventoryList il=new InventoryList();
		ItemInventoryInfo.InventoryList.Inventory i=new ItemInventoryInfo.InventoryList.Inventory();
		i.setAvailableQuantity(new BigInteger("99"));
		i.setWarehouseLocation("USA");
		il.getInventory().add(i);
		request.setInventoryList(il);
		UpdateInventoryResult r=call.updateItemInventory(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getInventoryList().getInventory().size()>0);
	}
	
	@Test
	public void testMockUpdateItemPrice_XML() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildXML();
		ItemPriceInfo request =new ItemPriceInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		ItemPriceInfo.PriceList pl=new ItemPriceInfo.PriceList();
		ItemPriceInfo.PriceList.Price e=new ItemPriceInfo.PriceList.Price();
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
		UpdatePriceResult r=call.updateItemPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
	
	@Test
	public void testMockUpdateItemPrice_JSON() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildJSON();
		ItemPriceInfo request =new ItemPriceInfo();
		request.setType(0);
		request.setValue("9SIA0062TT3677");
		ItemPriceInfo.PriceList pl=new ItemPriceInfo.PriceList();
		ItemPriceInfo.PriceList.Price e=new ItemPriceInfo.PriceList.Price();
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
		UpdatePriceResult r=call.updateItemPrice(request);
		Variables.SimulationEnabled=false;
		assertTrue(Content.SellerID.equals(r.getSellerID()));
		assertTrue("Group-By test Item A".equals(r.getSellerPartNumber()));
		assertTrue(r.getPriceList().getPrice().size()>0);
	}
}
