package newegg.marketplace.sdk.shipping.inner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.shipping.ShipConfig;
import newegg.marketplace.sdk.shipping.Variables;
import newegg.marketplace.sdk.shipping.model.ConfirmShipRequest;
import newegg.marketplace.sdk.shipping.model.ConfirmShipResponse;
import newegg.marketplace.sdk.shipping.model.GetShippingDetailRequest;
import newegg.marketplace.sdk.shipping.model.GetShippingDetailResponse;
import newegg.marketplace.sdk.shipping.model.SubmitShippingRequest;
import newegg.marketplace.sdk.shipping.model.SubmitShippingRequest.RequestBody.Shipment;
import newegg.marketplace.sdk.shipping.model.SubmitShippingResponse;
import newegg.marketplace.sdk.shipping.model.VoidShippingRequest;
import newegg.marketplace.sdk.shipping.model.VoidShippingResponse;

public class ShipOPCallerTest {

	private static ConfBack b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ShipConfig.class);
		b = new ConfBack();
	}

	@Before
	public void before() {
		Variables.SimulationEnabled = true;
	}

	@After
	public void After() {
		Variables.SimulationEnabled = false;
	}

	// @Test
	public void testSubmitShippingRequest_XML() {
		ShipOPCaller call = ShipOPCaller.buildXML();
		SubmitShippingRequest request = new SubmitShippingRequest();
		SubmitShippingRequest.RequestBody body = new SubmitShippingRequest.RequestBody();
		Shipment sm = new Shipment();
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
		SubmitShippingRequest.RequestBody.Shipment.PackageList pl = new SubmitShippingRequest.RequestBody.Shipment.PackageList();
		SubmitShippingRequest.RequestBody.Shipment.PackageList.Package p = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package();
		p.setPackageWeight(new BigDecimal("28.26"));
		p.setPackageLength(new BigDecimal("12"));
		p.setPackageWidth(new BigDecimal("12"));
		p.setPackageHeight(new BigDecimal("12"));
		SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList il = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList();
		SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item i = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
		i.setQuantity(2);
		i.setSellerPartNumber("TestSP#A2EU_20181030_0001");
		il.getItem().add(i);
		p.setItemList(il);
		pl.getPackage().add(p);
		sm.setPackageList(pl);
		body.setShipment(sm);
		request.setRequestBody(body);
		SubmitShippingResponse r = call.submitShippingRequest(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.isIsSuccess());
		assertEquals("26JI88ODVOVBA", r.getResponseBody().getRequestID());
	}

	@Test
	public void testGetShippingRequestDetail_XML() {
		Content.SellerID = "A2GS";
		Content.Authorization = "****************************************";
		Content.SecretKey = "********-****-****-****-************";
		ShipOPCaller call = ShipOPCaller.buildXML();
		GetShippingDetailRequest request = new GetShippingDetailRequest();
		GetShippingDetailRequest.RequestBody body = new GetShippingDetailRequest.RequestBody();
		body.setRequestID("245BWZ383S93Y");
		request.setRequestBody(body);
		GetShippingDetailResponse r = call.getShippingRequestDetail(request);
		b.restore();
		assertTrue(r.isIsSuccess());
		assertEquals(257760329, r.getResponseBody().getOrderNumber());
	}

	@Test
	public void testGetShippingRequestDetail_JSON() {
		Content.SellerID = "A2GS";
		Content.Authorization = "****************************************";
		Content.SecretKey = "********-****-****-****-************";
		ShipOPCaller call = ShipOPCaller.buildJSON();
		GetShippingDetailRequest request = new GetShippingDetailRequest();
		GetShippingDetailRequest.RequestBody body = new GetShippingDetailRequest.RequestBody();
		body.setRequestID("245BWZ383S93Y");
		request.setRequestBody(body);
		GetShippingDetailResponse r = call.getShippingRequestDetail(request);
		b.restore();
		assertTrue(r.isIsSuccess());
		assertEquals(257760329, r.getResponseBody().getOrderNumber());
	}

	@Test
	public void testMockConfirmShippingRequest_XML() {
		Variables.SimulationEnabled = true;
		ShipOPCaller call = ShipOPCaller.buildXML();
		ConfirmShipRequest request = new ConfirmShipRequest();
		ConfirmShipRequest.RequestBody body = new ConfirmShipRequest.RequestBody();
		ConfirmShipRequest.RequestBody.RequestIDList list = new ConfirmShipRequest.RequestBody.RequestIDList();
		list.getRequestID().add("245BWZ383S93Y");
		// list.getRequestID().add("2PQCX3SPZ3QBF");
		body.setRequestIDList(list);
		request.setRequestBody(body);
		ConfirmShipResponse r = call.confirmShippingRequest(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
	}

	@Test
	public void testMockVoidShippingRequest_XML() {
		Variables.SimulationEnabled = true;
		ShipOPCaller call = ShipOPCaller.buildXML();
		VoidShippingRequest request = new VoidShippingRequest();
		VoidShippingRequest.RequestBody body = new VoidShippingRequest.RequestBody();
		VoidShippingRequest.RequestBody.RequestIDList list = new VoidShippingRequest.RequestBody.RequestIDList();
		list.getRequestID().add("2PQBYWH4V68ZP");
		list.getRequestID().add("2PQCX3SPZ3QBF");
		body.setRequestIDList(list);
		request.setRequestBody(body);
		VoidShippingResponse r = call.voidShippingRequest(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
	}

	@Test
	public void testMockSubmitShippingRequest_XML() {
		Variables.SimulationEnabled = true;
		ShipOPCaller call = ShipOPCaller.buildXML();
		SubmitShippingRequest request = new SubmitShippingRequest();
		SubmitShippingRequest.RequestBody body = new SubmitShippingRequest.RequestBody();
		Shipment sm = new Shipment();
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
		SubmitShippingRequest.RequestBody.Shipment.PackageList pl = new SubmitShippingRequest.RequestBody.Shipment.PackageList();
		SubmitShippingRequest.RequestBody.Shipment.PackageList.Package p = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package();
		p.setPackageWeight(new BigDecimal("28.26"));
		p.setPackageLength(new BigDecimal("12"));
		p.setPackageWidth(new BigDecimal("12"));
		p.setPackageHeight(new BigDecimal("12"));
		SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList il = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList();
		SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item i = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
		i.setQuantity(2);
		i.setSellerPartNumber("TestSP#A2EU_20181030_0001");
		il.getItem().add(i);
		p.setItemList(il);
		pl.getPackage().add(p);
		sm.setPackageList(pl);
		body.setShipment(sm);
		request.setRequestBody(body);
		SubmitShippingResponse r = call.submitShippingRequest(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.isIsSuccess());
		assertEquals("26JI88ODVOVBA", r.getResponseBody().getRequestID());
	}

	// @Test
	public void testMockSubmitShippingRequest_JSON() {
		Variables.SimulationEnabled = true;
		ShipOPCaller call = ShipOPCaller.buildJSON();
		SubmitShippingRequest request = new SubmitShippingRequest();
		SubmitShippingRequest.RequestBody body = new SubmitShippingRequest.RequestBody();
		Shipment sm = new Shipment();
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
		SubmitShippingRequest.RequestBody.Shipment.PackageList pl = new SubmitShippingRequest.RequestBody.Shipment.PackageList();
		SubmitShippingRequest.RequestBody.Shipment.PackageList.Package p = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package();
		p.setPackageWeight(new BigDecimal("28.26"));
		p.setPackageLength(new BigDecimal("12"));
		p.setPackageWidth(new BigDecimal("12"));
		p.setPackageHeight(new BigDecimal("12"));
		SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList il = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList();
		SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item i = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
		i.setQuantity(2);
		i.setSellerPartNumber("TestSP#A2EU_20181030_0001");
		il.getItem().add(i);
		p.setItemList(il);
		pl.getPackage().add(p);
		sm.setPackageList(pl);
		body.setShipment(sm);
		request.setRequestBody(body);
		SubmitShippingResponse r = call.submitShippingRequest(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.isIsSuccess());
		assertEquals("26JI88ODVOVBA", r.getResponseBody().getRequestID());
	}

	@Test
	public void testMockGetShippingRequestDetail_XML() {
		Variables.SimulationEnabled = true;
		Content.SellerID = "A2GS";
		Content.Authorization = "****************************************";
		Content.SecretKey = "********-****-****-****-************";
		ShipOPCaller call = ShipOPCaller.buildXML();
		GetShippingDetailRequest request = new GetShippingDetailRequest();
		GetShippingDetailRequest.RequestBody body = new GetShippingDetailRequest.RequestBody();
		body.setRequestID("245BWZ383S93Y");
		request.setRequestBody(body);
		GetShippingDetailResponse r = call.getShippingRequestDetail(request);
		b.restore();
		Variables.SimulationEnabled = false;
		;
		assertTrue(r.isIsSuccess());
		assertEquals(257760329, r.getResponseBody().getOrderNumber());
	}

	@Test
	public void testMockGetShippingRequestDetail_JSON() {
		Variables.SimulationEnabled = true;
		Content.SellerID = "A2GS";
		Content.Authorization = "****************************************";
		Content.SecretKey = "********-****-****-****-************";
		ShipOPCaller call = ShipOPCaller.buildJSON();
		GetShippingDetailRequest request = new GetShippingDetailRequest();
		GetShippingDetailRequest.RequestBody body = new GetShippingDetailRequest.RequestBody();
		body.setRequestID("245BWZ383S93Y");
		request.setRequestBody(body);
		GetShippingDetailResponse r = call.getShippingRequestDetail(request);
		b.restore();
		Variables.SimulationEnabled = false;
		assertTrue(r.isIsSuccess());
		assertEquals(257760329, r.getResponseBody().getOrderNumber());
	}
}
