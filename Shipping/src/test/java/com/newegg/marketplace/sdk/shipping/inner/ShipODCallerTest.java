package com.newegg.marketplace.sdk.shipping.inner;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.shipping.ShipConfig;
import com.newegg.marketplace.sdk.shipping.Variables;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelEstimateRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelEstimateResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelReprintRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelReprintResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingNewLabelSubmitRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingNewLabelSubmitResponse;

public class ShipODCallerTest {
    private static ConfBack b;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        APIConfig.load(ShipConfig.class);
        b=new ConfBack();
    }
    @Before
	public void before() {
		Variables.SimulationEnabled=true;
	}
	
	@After
	public void After() {
		Variables.SimulationEnabled = false;
	}
//    @Test
    public void testShippingLabelReprintRequestJSONbyUSA() {
        Content.Platform = PLATFORM.USA;
        String orderNumber = "230316095";
        
        ShipODCaller call = ShipODCaller.buildJSON();
        ShippingLabelReprintRequest request = new ShippingLabelReprintRequest();
        request.setSellerID(Content.SellerID);
        ShippingLabelReprintRequest.RequestBody body = new ShippingLabelReprintRequest.RequestBody();
        ShippingLabelReprintRequest.RequestBody.Shipment shipment = 
                new ShippingLabelReprintRequest.RequestBody.Shipment();
        shipment.setOrderNumber(orderNumber);
        body.setShipment(shipment);
        request.setRequestBody(body);
        ShippingLabelReprintResponse response = call.shippingLabelReprintRequest(request);
        b.restore();
        
        assertNotNull(response);
        System.out.println("jackSonStr=" + deserializeToJsonString(response));
        
        assertEquals(orderNumber, String.valueOf(response.getResponseBody().getShipment().getOrderNumber()));
        System.out.println("getPackage=" + response.getResponseBody().getShipment().getPackageList().getPackage().size());
        assertTrue(response.getResponseBody().getShipment().getPackageList().getPackage().size() > 0); 
    }

    @Test
    public void testShippingLabelReprintRequestXMLbyUSA() {
        Content.Platform = PLATFORM.USA;
        String orderNumber = "230316095";
        
        ShipODCaller call = ShipODCaller.buildXML();
        ShippingLabelReprintRequest request = new ShippingLabelReprintRequest();
        request.setSellerID(Content.SellerID);
        ShippingLabelReprintRequest.RequestBody body = new ShippingLabelReprintRequest.RequestBody();
        ShippingLabelReprintRequest.RequestBody.Shipment shipment = 
                new ShippingLabelReprintRequest.RequestBody.Shipment();
        shipment.setOrderNumber(orderNumber);
        body.setShipment(shipment);
        request.setRequestBody(body);
        ShippingLabelReprintResponse response = call.shippingLabelReprintRequest(request);
        b.restore();
        
        assertNotNull(response);
        assertEquals("2135751360", String.valueOf(response.getResponseBody().getShipment().getOrderNumber()));
        System.out.println("getPackage=" + response.getResponseBody().getShipment().getPackageList().getPackage().size());
        assertTrue(response.getResponseBody().getShipment().getPackageList().getPackage().size() > 0); 
    }
    
//    @Test
    public void testShippingLabelEstimateRequestJSONbyUSA() {
        Content.Platform = PLATFORM.USA;
        String orderNumber = "230316095";
        
        ShipODCaller call = ShipODCaller.buildJSON();
        ShippingLabelEstimateRequest request = new ShippingLabelEstimateRequest();
        request.setSellerID(Content.SellerID);
        ShippingLabelEstimateRequest.RequestBody body = new ShippingLabelEstimateRequest.RequestBody();
        ShippingLabelEstimateRequest.RequestBody.Shipment shipment = new
                ShippingLabelEstimateRequest.RequestBody.Shipment();
        
        shipment.setOrderNumber(230316095);
        shipment.setShippingCarrierCode(100);
        shipment.setShippingServiceCode(101);
        shipment.setShipFromFirstName("John");
        shipment.setShipFromLastName("Doe");
        shipment.setShipFromPhoneNumber("6266171420");
        shipment.setShipFromAddress1("18045 Rowland Street");
        shipment.setShipFromCityName("City Of Industry");
        shipment.setShipFromStateCode("CA");
        shipment.setShipFromZipCode("91748");
        shipment.setShipFromCountryCode("USA");
        ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList packageList = 
                new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList();
        ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package packages = 
                new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package();
        packages.setPackageWeight(new BigDecimal(5));
        packages.setPackageLength(new BigDecimal(5.00));
        packages.setPackageHeight(new BigDecimal(4.00));
        packages.setPackageWidth(new BigDecimal(3.00));
        packages.setSignatureOptions("Regular");
        
        ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList itemList = 
                new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList();
        ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item item = 
                new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("bank05");
        item.setQuantity(3);
        itemList.getItem().add(item);
        packages.setItemList(itemList);
        
        item = new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("bank02");
        item.setQuantity(4);
        itemList.getItem().add(item);
        packages.setItemList(itemList);
        packageList.getPackage().add(packages);
        
        packages = new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package();
        packages.setPackageWeight(new BigDecimal(1.5));
        packages.setPackageLength(new BigDecimal(2.00));
        packages.setPackageHeight(new BigDecimal(3.00));
        packages.setPackageWidth(new BigDecimal(4.00));
        
        itemList = new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList();
        item = new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("Test_SP1080923090607401-m-s");
        item.setQuantity(3);
        itemList.getItem().add(item);
        packages.setItemList(itemList);
        packageList.getPackage().add(packages);
        
        shipment.setPackageList(packageList);
        body.setShipment(shipment);
        request.setRequestBody(body);
        
        ShippingLabelEstimateResponse response = call.shippingLabelEstimateRequest(request);
        b.restore();
        assertNotNull(response);
        System.out.println("jackSonStr=" + deserializeToJsonString(response));
        
        assertEquals(orderNumber, String.valueOf(response.getResponseBody().getShipment().getOrderNumber()));
        System.out.println("getPackage=" + response.getResponseBody().getShipment().getPackageList().getPackage().size());
        assertTrue(response.getResponseBody().getShipment().getPackageList().getPackage().size() > 0); 
    }
    
    @Test
    public void testShippingLabelEstimateRequestXmlbyUSA() {
        Content.Platform = PLATFORM.USA;
        String orderNumber = "230316095";
        
        ShipODCaller call = ShipODCaller.buildXML();
        ShippingLabelEstimateRequest request = new ShippingLabelEstimateRequest();
        request.setSellerID(Content.SellerID);
        ShippingLabelEstimateRequest.RequestBody body = new ShippingLabelEstimateRequest.RequestBody();
        ShippingLabelEstimateRequest.RequestBody.Shipment shipment = new
                ShippingLabelEstimateRequest.RequestBody.Shipment();
        
        shipment.setOrderNumber(230316095);
        shipment.setShippingCarrierCode(100);
        shipment.setShippingServiceCode(101);
        shipment.setShipFromFirstName("John");
        shipment.setShipFromLastName("Doe");
        shipment.setShipFromPhoneNumber("6266171420");
        shipment.setShipFromAddress1("18045 Rowland Street");
        shipment.setShipFromCityName("City Of Industry");
        shipment.setShipFromStateCode("CA");
        shipment.setShipFromZipCode("91748");
        shipment.setShipFromCountryCode("USA");
        ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList packageList = 
                new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList();
        ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package packages = 
                new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package();
        packages.setPackageWeight(new BigDecimal(5));
        packages.setPackageLength(new BigDecimal(5.00));
        packages.setPackageHeight(new BigDecimal(4.00));
        packages.setPackageWidth(new BigDecimal(3.00));
        packages.setSignatureOptions("Regular");
        
        ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList itemList = 
                new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList();
        ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item item = 
                new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("bank05");
        item.setQuantity(3);
        itemList.getItem().add(item);
        packages.setItemList(itemList);
        
        item = new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("bank02");
        item.setQuantity(4);
        itemList.getItem().add(item);
        packages.setItemList(itemList);
        packageList.getPackage().add(packages);
        
        packages = new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package();
        packages.setPackageWeight(new BigDecimal(1.5));
        packages.setPackageLength(new BigDecimal(2.00));
        packages.setPackageHeight(new BigDecimal(3.00));
        packages.setPackageWidth(new BigDecimal(4.00));
        
        itemList = new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList();
        item = new ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("Test_SP1080923090607401-m-s");
        item.setQuantity(3);
        itemList.getItem().add(item);
        packages.setItemList(itemList);
        packageList.getPackage().add(packages);
        
        shipment.setPackageList(packageList);
        body.setShipment(shipment);
        request.setRequestBody(body);
        
        ShippingLabelEstimateResponse response = call.shippingLabelEstimateRequest(request);
        b.restore();
        assertNotNull(response);
        assertEquals("2135751360", String.valueOf(response.getResponseBody().getShipment().getOrderNumber()));
        System.out.println("getPackage=" + response.getResponseBody().getShipment().getPackageList().getPackage().size());
        assertTrue(response.getResponseBody().getShipment().getPackageList().getPackage().size() > 0); 
    }
    
//    @Test
    public void testShippingNewLabelSubmitRequestJSONbyUSA() {
        Content.Platform = PLATFORM.USA;
        String orderNumber = "230316095";
        
        ShipODCaller call = ShipODCaller.buildJSON();
        ShippingNewLabelSubmitRequest request = new ShippingNewLabelSubmitRequest();
        request.setSellerID(Content.SellerID);
        ShippingNewLabelSubmitRequest.RequestBody body = new ShippingNewLabelSubmitRequest.RequestBody();
        ShippingNewLabelSubmitRequest.RequestBody.Shipment shipment = 
                new ShippingNewLabelSubmitRequest.RequestBody.Shipment();
        shipment.setOrderNumber(Integer.valueOf(orderNumber));
        shipment.setShippingCarrierCode(100);
        shipment.setShippingServiceCode(101);
        shipment.setShipFromFirstName("John");
        shipment.setShipFromLastName("Doe");
        shipment.setShipFromPhoneNumber("6266171420");
        shipment.setShipFromAddress1("18045 Rowland Street");
        shipment.setShipFromCityName("City Of Industry");
        shipment.setShipFromStateCode("CA");
        shipment.setShipFromZipCode("91748");
        shipment.setShipFromCountryCode("USA");
        
        ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList packageList =
                new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList();
        ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package packages =
                new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package();
        packages.setPackageWeight(new BigDecimal("5"));
        packages.setPackageLength(new BigDecimal("5.00"));
        packages.setPackageHeight(new BigDecimal("4.00"));
        packages.setPackageWidth(new BigDecimal("3.00"));
        packages.setSignatureOptions("Regular");
        
        ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList itemList =
                new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList();
        
        ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item item = 
                new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("bank05");
        item.setQuantity(3);
        itemList.getItem().add(item);
        
        item = new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("bank02");
        item.setQuantity(4);
        itemList.getItem().add(item);
        packages.setItemList(itemList);
        packageList.getPackage().add(packages);
        
        packages = new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package();
        packages.setPackageWeight(new BigDecimal("1.5"));
        packages.setPackageLength(new BigDecimal("2.00"));
        packages.setPackageHeight(new BigDecimal("3.00"));
        packages.setPackageWidth(new BigDecimal("4.00"));
        itemList = new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList();
        item = new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("Test_SP1080923090607401-m-s");
        item.setQuantity(3);
        itemList.getItem().add(item);
        packages.setItemList(itemList);
        packageList.getPackage().add(packages);
        
        shipment.setPackageList(packageList);
        body.setShipment(shipment);
        request.setRequestBody(body);
        ShippingNewLabelSubmitResponse response = call.shippingNewLabelSubmitRequest(request);
        b.restore();
        assertNotNull(response);
        System.out.println("jackSonStr=" + deserializeToJsonString(response));
        
        assertEquals(orderNumber, String.valueOf(response.getResponseBody().getShipment().getOrderNumber()));
        System.out.println("getPackage=" + response.getResponseBody().getShipment().getPackageList().getPackage().size());
        assertTrue(response.getResponseBody().getShipment().getPackageList().getPackage().size() > 0);
    }
    
    @Test
    public void testShippingNewLabelSubmitRequestXmlbyUSA() {
        Content.Platform = PLATFORM.USA;
        String orderNumber = "230316095";
        
        ShipODCaller call = ShipODCaller.buildXML();
        ShippingNewLabelSubmitRequest request = new ShippingNewLabelSubmitRequest();
        request.setSellerID(Content.SellerID);
        ShippingNewLabelSubmitRequest.RequestBody body = new ShippingNewLabelSubmitRequest.RequestBody();
        ShippingNewLabelSubmitRequest.RequestBody.Shipment shipment = 
                new ShippingNewLabelSubmitRequest.RequestBody.Shipment();
        shipment.setOrderNumber(Integer.valueOf(orderNumber));
        shipment.setShippingCarrierCode(100);
        shipment.setShippingServiceCode(101);
        shipment.setShipFromFirstName("John");
        shipment.setShipFromLastName("Doe");
        shipment.setShipFromPhoneNumber("6266171420");
        shipment.setShipFromAddress1("18045 Rowland Street");
        shipment.setShipFromCityName("City Of Industry");
        shipment.setShipFromStateCode("CA");
        shipment.setShipFromZipCode("91748");
        shipment.setShipFromCountryCode("USA");
        
        ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList packageList =
                new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList();
        ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package packages =
                new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package();
        packages.setPackageWeight(new BigDecimal("5"));
        packages.setPackageLength(new BigDecimal("5.00"));
        packages.setPackageHeight(new BigDecimal("4.00"));
        packages.setPackageWidth(new BigDecimal("3.00"));
        packages.setSignatureOptions("Regular");
        
        ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList itemList =
                new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList();
        
        ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item item = 
                new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("bank05");
        item.setQuantity(3);
        itemList.getItem().add(item);
        
        item = new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("bank02");
        item.setQuantity(4);
        itemList.getItem().add(item);
        packages.setItemList(itemList);
        packageList.getPackage().add(packages);
        
        packages = new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package();
        packages.setPackageWeight(new BigDecimal("1.5"));
        packages.setPackageLength(new BigDecimal("2.00"));
        packages.setPackageHeight(new BigDecimal("3.00"));
        packages.setPackageWidth(new BigDecimal("4.00"));
        itemList = new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList();
        item = new ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
        item.setSellerPartNumber("Test_SP1080923090607401-m-s");
        item.setQuantity(3);
        itemList.getItem().add(item);
        packages.setItemList(itemList);
        packageList.getPackage().add(packages);
        
        shipment.setPackageList(packageList);
        body.setShipment(shipment);
        request.setRequestBody(body);
        ShippingNewLabelSubmitResponse response = call.shippingNewLabelSubmitRequest(request);
        b.restore();
        assertNotNull(response);
        
        assertEquals("2135751360", String.valueOf(response.getResponseBody().getShipment().getOrderNumber()));
        System.out.println("getPackage=" + response.getResponseBody().getShipment().getPackageList().getPackage().size());
        assertTrue(response.getResponseBody().getShipment().getPackageList().getPackage().size() > 0);
    }
    
    private <T> String deserializeToJsonString(T pojo) {
        ObjectMapper Obj = new ObjectMapper();
        VisibilityChecker vc = null;
        vc = Obj.getVisibilityChecker();
        vc.withFieldVisibility(JsonAutoDetect.Visibility.ANY);
        vc.withGetterVisibility(JsonAutoDetect.Visibility.NONE);
        vc.withSetterVisibility(JsonAutoDetect.Visibility.NONE);
        vc.withCreatorVisibility(JsonAutoDetect.Visibility.NONE);
        Obj.setVisibility(vc);
        Obj.setSerializationInclusion(Include.NON_NULL);
        try {
            return Obj.writeValueAsString(pojo);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
    

}
