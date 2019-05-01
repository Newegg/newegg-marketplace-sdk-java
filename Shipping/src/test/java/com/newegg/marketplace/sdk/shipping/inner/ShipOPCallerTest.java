package com.newegg.marketplace.sdk.shipping.inner;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.shipping.ShipConfig;
import com.newegg.marketplace.sdk.shipping.Variables;
import com.newegg.marketplace.sdk.shipping.model.ShippingComfirmRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingComfirmResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingDetailRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingDetailResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingSubmitRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingSubmitRequest.RequestBody.Shipment;


import com.newegg.marketplace.sdk.shipping.model.ShippingSubmitResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingVoidRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingVoidResponse;

public class ShipOPCallerTest {

	private static ConfBack b;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ShipConfig.class);
		b=new ConfBack();
	}

	//@Test
	public void testSubmitShippingRequest_XML() {ShipOPCaller call=ShipOPCaller.buildXML();
	ShippingSubmitRequest request=new ShippingSubmitRequest();
	ShippingSubmitRequest.RequestBody body=new ShippingSubmitRequest.RequestBody();
	Shipment sm=new Shipment();
	sm.setOrderNumber(299945004);
	sm.setShippingCarrierCode(200);
	sm.setShippingServiceCode(201);
	sm.setShipFromFirstName("testa testb");
	sm.setShipFromLastName("testa testb");
	sm.setShipFromAddress1("18308 Colima Rd");
	sm.setShipFromAddress2("");
	sm.setShipFromPhoneNumber("626-271-9700");
	sm.setShipFromCityName("Rowland Heights");
	sm.setShipFromStateCode("CA");
	sm.setShipFromZipCode("91748");
	sm.setShipFromCountryCode("USA");
	ShippingSubmitRequest.RequestBody.Shipment.PackageList pl=new ShippingSubmitRequest.RequestBody.Shipment.PackageList();
	ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package p=new ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package();
	p.setPackageWeight(new BigDecimal("28.26"));
	p.setPackageLength(new BigDecimal("12"));
	p.setPackageWidth(new BigDecimal("12"));
	p.setPackageHeight(new BigDecimal("12"));
	ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList il=new ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList();
	ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item i=new ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
	i.setQuantity(2);
	i.setSellerPartNumber("TestSP#A2EU_20181030_0001");
	il.getItem().add(i);
	p.setItemList(il);
	pl.getPackage().add(p);
	sm.setPackageList(pl);
	body.setShipment(sm);
	request.setRequestBody(body);
	ShippingSubmitResponse r=call.submitShippingRequest(request);
	Variables.SimulationEnabled=false;
	assertTrue(r.isIsSuccess());
	assertEquals("26JI88ODVOVBA",r.getResponseBody().getRequestID());}
	
	@Test
	public void testGetShippingRequestDetail_XML() {
		Content.SellerID="A2GS";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOPCaller call=ShipOPCaller.buildXML();
		ShippingDetailRequest request=new ShippingDetailRequest();
		ShippingDetailRequest.RequestBody body=new ShippingDetailRequest.RequestBody();		
		body.setRequestID("245BWZ383S93Y");
		request.setRequestBody(body);
		ShippingDetailResponse r=call.getShippingRequestDetail(request);
		b.restore();
		assertTrue(r.isIsSuccess());
		assertEquals(257760329,r.getResponseBody().getOrderNumber());
	}
	
	@Test
	public void testGetShippingRequestDetail_JSON() {
		Content.SellerID="A2GS";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOPCaller call=ShipOPCaller.buildJSON();
		ShippingDetailRequest request=new ShippingDetailRequest();
		ShippingDetailRequest.RequestBody body=new ShippingDetailRequest.RequestBody();		
		body.setRequestID("245BWZ383S93Y");
		request.setRequestBody(body);
		ShippingDetailResponse r=call.getShippingRequestDetail(request);
		b.restore();
		assertTrue(r.isIsSuccess());
		assertEquals(257760329,r.getResponseBody().getOrderNumber());
	}

	@Test
	public void testMockConfirmShippingRequest_XML() {
		Variables.SimulationEnabled=true;
		ShipOPCaller call=ShipOPCaller.buildXML();
		ShippingComfirmRequest request=new ShippingComfirmRequest();
		ShippingComfirmRequest.RequestBody  body=new ShippingComfirmRequest.RequestBody();
		ShippingComfirmRequest.RequestBody.RequestIDList list=new ShippingComfirmRequest.RequestBody.RequestIDList();
		list.getRequestID().add("245BWZ383S93Y");
		//list.getRequestID().add("2PQCX3SPZ3QBF");
		body.setRequestIDList(list);
		request.setRequestBody(body);
		ShippingComfirmResponse r=call.confirmShippingRequest(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
	}
	
	@Test
	public void testVoidShippingRequest_XML() {
		Variables.SimulationEnabled=true;
		ShipOPCaller call=ShipOPCaller.buildXML();
		ShippingVoidRequest request=new ShippingVoidRequest();
		ShippingVoidRequest.RequestBody body=new ShippingVoidRequest.RequestBody();
		ShippingVoidRequest.RequestBody.RequestIDList  list=new ShippingVoidRequest.RequestBody.RequestIDList();
		list.getRequestID().add("2PQBYWH4V68ZP");
		list.getRequestID().add("2PQCX3SPZ3QBF");
		body.setRequestIDList(list);
		request.setRequestBody(body);
		ShippingVoidResponse r=call.voidShippingRequest(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
	}
	
	
	
	@Test
	public void testMockSubmitShippingRequest_XML() {
		Variables.SimulationEnabled=true;
		ShipOPCaller call=ShipOPCaller.buildXML();
		ShippingSubmitRequest request=new ShippingSubmitRequest();
		ShippingSubmitRequest.RequestBody body=new ShippingSubmitRequest.RequestBody();
		Shipment sm=new Shipment();
		sm.setOrderNumber(299945004);
		sm.setShippingCarrierCode(200);
		sm.setShippingServiceCode(201);
		sm.setShipFromFirstName("testa testb");
		sm.setShipFromLastName("testa testb");
		sm.setShipFromAddress1("18308 Colima Rd");
		sm.setShipFromAddress2("");
		sm.setShipFromPhoneNumber("626-271-9700");
		sm.setShipFromCityName("Rowland Heights");
		sm.setShipFromStateCode("CA");
		sm.setShipFromZipCode("91748");
		sm.setShipFromCountryCode("USA");
		ShippingSubmitRequest.RequestBody.Shipment.PackageList pl=new ShippingSubmitRequest.RequestBody.Shipment.PackageList();
		ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package p=new ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package();
		p.setPackageWeight(new BigDecimal("28.26"));
		p.setPackageLength(new BigDecimal("12"));
		p.setPackageWidth(new BigDecimal("12"));
		p.setPackageHeight(new BigDecimal("12"));
		ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList il=new ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList();
		ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item i=new ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
		i.setQuantity(2);
		i.setSellerPartNumber("TestSP#A2EU_20181030_0001");
		il.getItem().add(i);
		p.setItemList(il);
		pl.getPackage().add(p);
		sm.setPackageList(pl);
		body.setShipment(sm);
		request.setRequestBody(body);
		ShippingSubmitResponse r=call.submitShippingRequest(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.isIsSuccess());
		assertEquals("26JI88ODVOVBA",r.getResponseBody().getRequestID());
	}
	
	//@Test
	public void testMockSubmitShippingRequest_JSON() {
		Variables.SimulationEnabled=true;
		ShipOPCaller call=ShipOPCaller.buildJSON();
		ShippingSubmitRequest request=new ShippingSubmitRequest();
		ShippingSubmitRequest.RequestBody body=new ShippingSubmitRequest.RequestBody();
		Shipment sm=new Shipment();
		sm.setOrderNumber(299945004);
		sm.setShippingCarrierCode(200);
		sm.setShippingServiceCode(201);
		sm.setShipFromFirstName("testa testb");
		sm.setShipFromLastName("testa testb");
		sm.setShipFromAddress1("18308 Colima Rd");
		sm.setShipFromAddress2("");
		sm.setShipFromPhoneNumber("626-271-9700");
		sm.setShipFromCityName("Rowland Heights");
		sm.setShipFromStateCode("CA");
		sm.setShipFromZipCode("91748");
		sm.setShipFromCountryCode("USA");
		ShippingSubmitRequest.RequestBody.Shipment.PackageList pl=new ShippingSubmitRequest.RequestBody.Shipment.PackageList();
		ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package p=new ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package();
		p.setPackageWeight(new BigDecimal("28.26"));
		p.setPackageLength(new BigDecimal("12"));
		p.setPackageWidth(new BigDecimal("12"));
		p.setPackageHeight(new BigDecimal("12"));
		ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList il=new ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList();
		ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item i=new ShippingSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
		i.setQuantity(2);
		i.setSellerPartNumber("TestSP#A2EU_20181030_0001");
		il.getItem().add(i);
		p.setItemList(il);
		pl.getPackage().add(p);
		sm.setPackageList(pl);
		body.setShipment(sm);
		request.setRequestBody(body);
		ShippingSubmitResponse r=call.submitShippingRequest(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.isIsSuccess());
		assertEquals("26JI88ODVOVBA",r.getResponseBody().getRequestID());
	}
	
	@Test
	public void testMockGetShippingRequestDetail_XML() {
		Variables.SimulationEnabled=true;
		Content.SellerID="A2GS";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOPCaller call=ShipOPCaller.buildXML();
		ShippingDetailRequest request=new ShippingDetailRequest();
		ShippingDetailRequest.RequestBody body=new ShippingDetailRequest.RequestBody();		
		body.setRequestID("245BWZ383S93Y");
		request.setRequestBody(body);
		ShippingDetailResponse r=call.getShippingRequestDetail(request);
		b.restore();
		Variables.SimulationEnabled=false;;
		assertTrue(r.isIsSuccess());
		assertEquals(257760329,r.getResponseBody().getOrderNumber());
	}
	
	@Test
	public void testMockGetShippingRequestDetail_JSON() {
		Variables.SimulationEnabled=true;
		Content.SellerID="A2GS";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOPCaller call=ShipOPCaller.buildJSON();
		ShippingDetailRequest request=new ShippingDetailRequest();
		ShippingDetailRequest.RequestBody body=new ShippingDetailRequest.RequestBody();		
		body.setRequestID("245BWZ383S93Y");
		request.setRequestBody(body);
		ShippingDetailResponse r=call.getShippingRequestDetail(request);
		b.restore();
		Variables.SimulationEnabled=false;
		assertTrue(r.isIsSuccess());
		assertEquals(257760329,r.getResponseBody().getOrderNumber());
	}
}
