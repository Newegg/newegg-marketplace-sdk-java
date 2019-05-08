package com.newegg.marketplace.sdk.sbn.inner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.NeweggException;
import com.newegg.marketplace.sdk.sbn.SbnConfig;
import com.newegg.marketplace.sdk.sbn.Variables;
import com.newegg.marketplace.sdk.sbn.model.GetInboundShipmentPlanRequest;
import com.newegg.marketplace.sdk.sbn.model.GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion;
import com.newegg.marketplace.sdk.sbn.model.GetInboundShipmentPlanResponse;
import com.newegg.marketplace.sdk.sbn.model.GetInboundShipmentResultResponse;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentStatusRequest;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentStatusRequest.RequestBody.GetRequestStatus;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentStatusResponse;
import com.newegg.marketplace.sdk.sbn.model.SubmitInboundShipmentRequest;
import com.newegg.marketplace.sdk.sbn.model.SubmitInboundShipmentResponse;
import com.newegg.marketplace.sdk.sbn.model.SubmitVoidInboundShipmentRequest;
import com.newegg.marketplace.sdk.sbn.model.SubmitVoidInboundShipmentResponse;

public class SbnOPCallerTest {

	private static ConfBack b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(SbnConfig.class);
		b = new ConfBack();
	}

	@Test
	public void testGetInboundShipmentPlanSuggestion_XML() {
		SbnOPCaller call = SbnOPCaller.buildXML();
		GetInboundShipmentPlanRequest request = new GetInboundShipmentPlanRequest();
		GetInboundShipmentPlanRequest.RequestBody body = new GetInboundShipmentPlanRequest.RequestBody();
		PlanSuggestion pl = new PlanSuggestion();
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList il = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList();
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item i1 = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item();
		i1.setPlannedQuantity(20);
		i1.setQuantityPerCarton(10);
		i1.setSellerPartNumber("423440");
		il.getItem().add(i1);
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item i2 = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item();
		i2.setPlannedQuantity(30);
		i2.setQuantityPerCarton(10);
		i2.setSellerPartNumber("380026");
		il.getItem().add(i2);
		pl.setItemList(il);
		body.setPlanSuggestion(pl);
		request.setRequestBody(body);
		GetInboundShipmentPlanResponse r = call.getInboundShipmentPlanSuggestion(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getShipmentList().getShipment().size() > 0);
	}

	@Test
	public void testGetInboundShipmentPlanSuggestion_JSON() {
		SbnOPCaller call = SbnOPCaller.buildJSON();
		GetInboundShipmentPlanRequest request = new GetInboundShipmentPlanRequest();
		GetInboundShipmentPlanRequest.RequestBody body = new GetInboundShipmentPlanRequest.RequestBody();
		PlanSuggestion pl = new PlanSuggestion();
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList il = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList();
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item i1 = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item();
		i1.setPlannedQuantity(20);
		i1.setQuantityPerCarton(10);
		i1.setSellerPartNumber("423440");
		il.getItem().add(i1);
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item i2 = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item();
		i2.setPlannedQuantity(30);
		i2.setQuantityPerCarton(10);
		i2.setSellerPartNumber("380026");
		il.getItem().add(i2);
		pl.setItemList(il);
		body.setPlanSuggestion(pl);
		request.setRequestBody(body);
		GetInboundShipmentPlanResponse r = call.getInboundShipmentPlanSuggestion(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getShipmentList().getShipment().size() > 0);
	}

	@Test
	public void testGetInboundShipmentStatusRequest_XML() {
		Content.SellerID = "A3VV";
		Content.Authorization = "****************************************";
		Content.SecretKey = "********-****-****-****-************";
		SbnOPCaller call = SbnOPCaller.buildXML();
		GetShipmentStatusRequest request = new GetShipmentStatusRequest();
		GetShipmentStatusRequest.RequestBody body = new GetShipmentStatusRequest.RequestBody();
		GetRequestStatus s = new GetRequestStatus();
		s.setActionCode(new BigInteger("1"));
		s.setMaxCount(new BigInteger("100"));
		s.setRequestStatus("ALL");
		s.setRequestDateFrom("");
		s.setRequestDateTo("");
		GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList rl = new GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList();
		rl.getRequestID().add("24UQBFFT2NE9A");
		s.setRequestIDList(rl);
		body.setGetRequestStatus(s);
		request.setRequestBody(body);
		GetShipmentStatusResponse r = call.getInboundShipmentStatusRequest(request);
		b.restore();
		assertTrue(r.getIsSuccess());
		assertNotNull(r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestStatus());
	}

	@Test
	public void testGetInboundShipmentStatusRequest_JSON() {
		Content.SellerID = "A3VV";
		Content.Authorization = "****************************************";
		Content.SecretKey = "********-****-****-****-************";
		SbnOPCaller call = SbnOPCaller.buildJSON();
		GetShipmentStatusRequest request = new GetShipmentStatusRequest();
		GetShipmentStatusRequest.RequestBody body = new GetShipmentStatusRequest.RequestBody();
		GetRequestStatus s = new GetRequestStatus();
		s.setActionCode(new BigInteger("1"));
		s.setMaxCount(new BigInteger("100"));
		s.setRequestStatus("ALL");
		s.setRequestDateFrom("");
		s.setRequestDateTo("");
		GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList rl = new GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList();
		rl.getRequestID().add("24UQBFFT2NE9A");
		s.setRequestIDList(rl);
		body.setGetRequestStatus(s);
		request.setRequestBody(body);
		GetShipmentStatusResponse r = call.getInboundShipmentStatusRequest(request);
		b.restore();
		assertTrue(r.getIsSuccess());
		assertNotNull(r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestStatus());
	}

	@Test
	public void testGetInboundShipmentRequestResult_XML() {
		Content.SellerID = "A3VV";
		Content.Authorization = "****************************************";
		Content.SecretKey = "********-****-****-****-************";
		SbnOPCaller call = SbnOPCaller.buildXML();
		try {
			GetInboundShipmentResultResponse r = call.getInboundShipmentRequestResult("24UQBFFT2NE9A");
		} catch (NeweggException e) {

		}
		b.restore();
		// assertTrue(r.getIsSuccess());
	}

	@Test
	public void testGetInboundShipmentRequestResult_JSON() {
		Content.SellerID = "A3VV";
		Content.Authorization = "****************************************";
		Content.SecretKey = "********-****-****-****-************";
		SbnOPCaller call = SbnOPCaller.buildJSON();
		try {
			GetInboundShipmentResultResponse r = call.getInboundShipmentRequestResult("24UQBFFT2NE9A");
		} catch (NeweggException e) {

		}
		b.restore();
		// assertTrue(r.getIsSuccess());
	}

	@Test
	public void testMockGetInboundShipmentPlanSuggestion_XML() {
		Variables.SimulationEnabled = true;
		SbnOPCaller call = SbnOPCaller.buildXML();
		GetInboundShipmentPlanRequest request = new GetInboundShipmentPlanRequest();
		GetInboundShipmentPlanRequest.RequestBody body = new GetInboundShipmentPlanRequest.RequestBody();
		PlanSuggestion pl = new PlanSuggestion();
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList il = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList();
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item i1 = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item();
		i1.setPlannedQuantity(20);
		i1.setQuantityPerCarton(10);
		i1.setSellerPartNumber("423440");
		il.getItem().add(i1);
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item i2 = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item();
		i2.setPlannedQuantity(30);
		i2.setQuantityPerCarton(10);
		i2.setSellerPartNumber("380026");
		il.getItem().add(i2);
		pl.setItemList(il);
		body.setPlanSuggestion(pl);
		request.setRequestBody(body);
		GetInboundShipmentPlanResponse r = call.getInboundShipmentPlanSuggestion(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getShipmentList().getShipment().size() > 0);
	}

	@Test
	public void testMockGetInboundShipmentPlanSuggestion_JSON() {
		Variables.SimulationEnabled = true;
		SbnOPCaller call = SbnOPCaller.buildJSON();
		GetInboundShipmentPlanRequest request = new GetInboundShipmentPlanRequest();
		GetInboundShipmentPlanRequest.RequestBody body = new GetInboundShipmentPlanRequest.RequestBody();
		PlanSuggestion pl = new PlanSuggestion();
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList il = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList();
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item i1 = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item();
		i1.setPlannedQuantity(20);
		i1.setQuantityPerCarton(10);
		i1.setSellerPartNumber("423440");
		il.getItem().add(i1);
		GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item i2 = new GetInboundShipmentPlanRequest.RequestBody.PlanSuggestion.ItemList.Item();
		i2.setPlannedQuantity(30);
		i2.setQuantityPerCarton(10);
		i2.setSellerPartNumber("380026");
		il.getItem().add(i2);
		pl.setItemList(il);
		body.setPlanSuggestion(pl);
		request.setRequestBody(body);
		GetInboundShipmentPlanResponse r = call.getInboundShipmentPlanSuggestion(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getShipmentList().getShipment().size() > 0);
	}

	@Test
	public void testMockGetInboundShipmentStatusRequest_XML() {
		Variables.SimulationEnabled = true;
		Content.SellerID = "A3VV";
		Content.Authorization = "****************************************";
		Content.SecretKey = "********-****-****-****-************";
		SbnOPCaller call = SbnOPCaller.buildXML();
		GetShipmentStatusRequest request = new GetShipmentStatusRequest();
		GetShipmentStatusRequest.RequestBody body = new GetShipmentStatusRequest.RequestBody();
		GetRequestStatus s = new GetRequestStatus();
		s.setActionCode(new BigInteger("1"));
		s.setMaxCount(new BigInteger("100"));
		s.setRequestStatus("ALL");
		s.setRequestDateFrom("");
		s.setRequestDateTo("");
		GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList rl = new GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList();
		rl.getRequestID().add("24UQBFFT2NE9A");
		s.setRequestIDList(rl);
		body.setGetRequestStatus(s);
		request.setRequestBody(body);
		GetShipmentStatusResponse r = call.getInboundShipmentStatusRequest(request);
		b.restore();
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertNotNull(r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestStatus());
	}

	@Test
	public void testMockGetInboundShipmentStatusRequest_JSON() {
		Variables.SimulationEnabled = true;
		Content.SellerID = "A3VV";
		Content.Authorization = "****************************************";
		Content.SecretKey = "********-****-****-****-************";
		SbnOPCaller call = SbnOPCaller.buildJSON();
		GetShipmentStatusRequest request = new GetShipmentStatusRequest();
		GetShipmentStatusRequest.RequestBody body = new GetShipmentStatusRequest.RequestBody();
		GetRequestStatus s = new GetRequestStatus();
		s.setActionCode(new BigInteger("1"));
		s.setMaxCount(new BigInteger("100"));
		s.setRequestStatus("ALL");
		s.setRequestDateFrom("");
		s.setRequestDateTo("");
		GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList rl = new GetShipmentStatusRequest.RequestBody.GetRequestStatus.RequestIDList();
		rl.getRequestID().add("24UQBFFT2NE9A");
		s.setRequestIDList(rl);
		body.setGetRequestStatus(s);
		request.setRequestBody(body);
		GetShipmentStatusResponse r = call.getInboundShipmentStatusRequest(request);
		b.restore();
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertNotNull(r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestStatus());
	}

	@Test
	public void testMockGetInboundShipmentRequestResult_XML() {
		Variables.SimulationEnabled = true;
		SbnOPCaller call = SbnOPCaller.buildXML();
		GetInboundShipmentResultResponse r = call.getInboundShipmentRequestResult("24UQBFFT2NE9A");
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getShipment().getLabelURLList().getLabel().size() > 0);
		assertTrue(r.getResponseBody().getShipment().getErrorList().getError().size() == 0);
	}

	@Test
	public void testMockGetInboundShipmentRequestResult_JSON() {
		Variables.SimulationEnabled = true;
		SbnOPCaller call = SbnOPCaller.buildJSON();
		GetInboundShipmentResultResponse r = call.getInboundShipmentRequestResult("24UQBFFT2NE9A");
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getShipment().getLabelURLList().getLabel().size() > 0);
		assertTrue(r.getResponseBody().getShipment().getErrorList().getError().size() == 0);
	}

	@Test
	public void testMockSubmitCreateInboundShipmentPlanSuggestion_XML() {
		Variables.SimulationEnabled = true;
		SbnOPCaller call = SbnOPCaller.buildXML();
		SubmitInboundShipmentRequest request = new SubmitInboundShipmentRequest();
		SubmitInboundShipmentRequest.RequestBody body = new SubmitInboundShipmentRequest.RequestBody();
		SubmitInboundShipmentRequest.RequestBody.Shipment ship = new SubmitInboundShipmentRequest.RequestBody.Shipment();
		ship.setActionCode(new BigInteger("1"));
		ship.setShipFromPhoneNumber("123456789");
		ship.setShipToWarehouseCode("08");
		ship.setShippingMethodCode(new BigInteger("1"));
		ship.setShippingCarrierCode(new BigInteger("99"));
		ship.setOtherCarrierName("newegg");
		SubmitInboundShipmentRequest.RequestBody.Shipment.PackageList pl = new SubmitInboundShipmentRequest.RequestBody.Shipment.PackageList();
		SubmitInboundShipmentRequest.RequestBody.Shipment.PackageList.Package pk = new SubmitInboundShipmentRequest.RequestBody.Shipment.PackageList.Package();
		pk.setTrackingNumber("SBNAPI-123456789");
		pk.setPackageWeight(new BigDecimal("10.00"));
		pk.setPackageLength(new BigDecimal("8.00"));
		pk.setPackageHeight(new BigDecimal("7.00"));
		pk.setPackageWidth(new BigDecimal("7.00"));
		pl.getPackage().add(pk);
		ship.setPackageList(pl);
		SubmitInboundShipmentRequest.RequestBody.Shipment.ItemList il = new SubmitInboundShipmentRequest.RequestBody.Shipment.ItemList();
		SubmitInboundShipmentRequest.RequestBody.Shipment.ItemList.Item item = new SubmitInboundShipmentRequest.RequestBody.Shipment.ItemList.Item();
		item.setSellerPartNumber("SS0120130516683100755");
		item.setQuantity(4);
		item.setNumberofPackage(2);
		item.setORMD(1);
		item.setMSDSURL("http://tesipaddress/MSDS/testMSDS.pdf");
		il.getItem().add(item);
		ship.setItemList(il);
		body.setShipment(ship);
		request.setRequestBody(body);
		SubmitInboundShipmentResponse r = call.submitCreateInboundShipmentRequest(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
	}

	@Test
	public void testMockSubmitVoidInboundShipmentRequest_XML() {
		Variables.SimulationEnabled = true;
		SbnOPCaller call = SbnOPCaller.buildXML();
		SubmitVoidInboundShipmentRequest request = new SubmitVoidInboundShipmentRequest();
		SubmitVoidInboundShipmentRequest.RequestBody body = new SubmitVoidInboundShipmentRequest.RequestBody();
		SubmitVoidInboundShipmentRequest.RequestBody.Shipment ship = new SubmitVoidInboundShipmentRequest.RequestBody.Shipment();
		ship.setActionCode(new BigInteger("2"));
		ship.setShipmentID("2771551");
		body.setShipment(ship);
		request.setRequestBody(body);
		SubmitVoidInboundShipmentResponse r = call.submitVoidInboundShipmentRequest(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
	}
}
