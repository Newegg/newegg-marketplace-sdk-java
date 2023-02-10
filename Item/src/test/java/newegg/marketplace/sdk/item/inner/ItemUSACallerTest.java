package newegg.marketplace.sdk.item.inner;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.item.ItemConfig;
import newegg.marketplace.sdk.item.Variables;
import newegg.marketplace.sdk.item.model.GetInternationalItemPriceListRequest;
import newegg.marketplace.sdk.item.model.GetInternationalItemPriceListResponse;
import newegg.marketplace.sdk.item.model.GetInternationalItemPriceRequest;
import newegg.marketplace.sdk.item.model.GetInternationalItemPriceResponse;
import newegg.marketplace.sdk.item.model.GetItemInternationalInventoryListRequest;
import newegg.marketplace.sdk.item.model.GetItemInternationalInventoryListResponse;
import newegg.marketplace.sdk.item.model.GetItemInternationalInventoryRequest;
import newegg.marketplace.sdk.item.model.GetItemInternationalInventoryRequest.WarehouseList;
import newegg.marketplace.sdk.item.model.GetItemInternationalInventoryResponse;
import newegg.marketplace.sdk.item.model.UpdateInventoryRequest;
import newegg.marketplace.sdk.item.model.UpdateInventoryRequest.InventoryList;
import newegg.marketplace.sdk.item.model.UpdateInventoryResponse;
import newegg.marketplace.sdk.item.model.UpdateItemPriceRequest;
import newegg.marketplace.sdk.item.model.UpdateItemPriceResponse;

public class ItemUSACallerTest {
	
	@Before
	public  void before() {
		Variables.SimulationEnabled=true;
	}
	
	@After
	public  void after() {
		Variables.SimulationEnabled=false;
	}
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ItemConfig.class);
	}
	
	@Test
	public void testMockGetInternationalItemPriceList_JSON() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildJSON();
		GetInternationalItemPriceListRequest request =new GetInternationalItemPriceListRequest();
		request.setType(0);
		List<String> values=new ArrayList<>();
		values.add("9SIAE1AJPX3007");
		request.setValues(values);
		
		List<String> countryList=new ArrayList<>();
		countryList.add("USA");
		request.setCountryList(countryList);
		
		GetInternationalItemPriceListResponse r = call.getInternationalItemPriceList(request);
		Variables.SimulationEnabled=false;

	    assertTrue(r.isSuccess());
	    assertTrue(r.getResponseBody().getTotalCount()==3);
	    
	    assertTrue(r.getResponseBody().getItemList().get(0).getItemNumber().equals("9SIA00603V5190"));
	    assertTrue(r.getResponseBody().getItemList().get(0).getPriceList().get(0).getMap().toPlainString().equals("25.99"));
	    assertTrue(r.getResponseBody().getItemList().get(0).getPriceList().get(0).getCountryCode().equals("USA"));
		Variables.SimulationEnabled=false;

		
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
	public void testGetItemPrice_JSON() {
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
	public void testGetItemInventory_XML() {
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
	public void testGetItemInventory_JSON() {
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
		Variables.SimulationEnabled=true;
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
	
	@Test
	public void testMockGetItemInternationalInventoryList_JSON() {
		Variables.SimulationEnabled=true;
		ItemUSACaller call=ItemUSACaller.buildJSON();
		
		 GetItemInternationalInventoryListRequest body=new GetItemInternationalInventoryListRequest();
		 body.setType("0");
		 List<String> values=new  ArrayList<>();
		 values.add("9SIA1EA0K66589");
		 body.setValues(values);
		 List<String>warehouseList=new ArrayList<String>();
		 warehouseList.add("USA");
		 body.setWarehouseList(warehouseList);

		 GetItemInternationalInventoryListResponse r = call.getItemInternationalInventoryList(body);
	    assertTrue(r.isSuccess());
	    assertTrue(r.getResponseBody().getTotalCount()==3);
		Variables.SimulationEnabled=false;
		
	}
}
