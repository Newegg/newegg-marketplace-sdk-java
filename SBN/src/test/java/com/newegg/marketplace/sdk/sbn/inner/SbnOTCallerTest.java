package com.newegg.marketplace.sdk.sbn.inner;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.sbn.SbnConfig;
import com.newegg.marketplace.sdk.sbn.Variables;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentListRequest;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentListRequest.RequestBody.PageInfo;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentListResponse;
import com.newegg.marketplace.sdk.sbn.model.GetWarehouseListRequest;
import com.newegg.marketplace.sdk.sbn.model.GetWarehouseListResponse;

public class SbnOTCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(SbnConfig.class);
	}

	@Test
	public void testGetInboundShipmentList_XML() {
		SbnOTCaller call=SbnOTCaller.buildXML();
		GetShipmentListRequest request=new GetShipmentListRequest();
		GetShipmentListRequest.RequestBody body =new GetShipmentListRequest.RequestBody();
		body.setKeywordsType(new BigInteger("1"));
		body.setKeywordsValue("21UYNT6Z2217K");
		body.setLastUpdateDateFrom("01/01/2018");
		body.setLastUpdateDateTo("04/30/2019");
		PageInfo pinf=new PageInfo();
		pinf.setPageIndex(new BigInteger("1"));
		pinf.setPageSize(new BigInteger("10"));
		body.setPageInfo(pinf);
		body.setStatus(new BigInteger("0"));
		request.setRequestBody(body);
		GetShipmentListResponse r=call.getInboundShipmentList(request);
		assertTrue(r.getIsSuccess());		
	}

	@Test
	public void testGetInboundShipmentList_JSON() {
		SbnOTCaller call=SbnOTCaller.buildJSON();
		GetShipmentListRequest request=new GetShipmentListRequest();
		GetShipmentListRequest.RequestBody body =new GetShipmentListRequest.RequestBody();
		body.setKeywordsType(new BigInteger("1"));
		body.setKeywordsValue("21UYNT6Z2217K");
		body.setLastUpdateDateFrom("01/01/2018");
		body.setLastUpdateDateTo("04/30/2019");
		PageInfo pinf=new PageInfo();
		pinf.setPageIndex(new BigInteger("1"));
		pinf.setPageSize(new BigInteger("10"));
		body.setPageInfo(pinf);
		body.setStatus(new BigInteger("0"));
		request.setRequestBody(body);
		GetShipmentListResponse r=call.getInboundShipmentList(request);
		assertTrue(r.getIsSuccess());		
	}
	
	@Test
	public void testGetWarehouseList_XML() {
		SbnOTCaller call=SbnOTCaller.buildXML();
		GetWarehouseListRequest request=new GetWarehouseListRequest();
		GetWarehouseListRequest.RequestBody body=new GetWarehouseListRequest.RequestBody();
		body.setWarehouseCode("06");	
		request.setRequestBody(body);
		GetWarehouseListResponse r=call.getWarehouseList(request);
		assertTrue(r.getIsSuccess());
		assertEquals("38141",r.getResponseBody().getWarehouseList().getWarehouse().get(0).getShipToZipCode());
	}	

	@Test
	public void testGetWarehouseList_JSON() {
		SbnOTCaller call=SbnOTCaller.buildJSON();
		GetWarehouseListRequest request=new GetWarehouseListRequest();
		GetWarehouseListRequest.RequestBody body=new GetWarehouseListRequest.RequestBody();
		body.setWarehouseCode("06");	
		request.setRequestBody(body);
		GetWarehouseListResponse r=call.getWarehouseList(request);
		assertTrue(r.getIsSuccess());
		assertEquals("38141",r.getResponseBody().getWarehouseList().getWarehouse().get(0).getShipToZipCode());
	}
	
	@Test
	public void testMockGetInboundShipmentList_XML() {
		Variables.SimulationEnabled=true;
		SbnOTCaller call=SbnOTCaller.buildXML();
		GetShipmentListRequest request=new GetShipmentListRequest();
		GetShipmentListRequest.RequestBody body =new GetShipmentListRequest.RequestBody();
		body.setKeywordsType(new BigInteger("1"));
		body.setKeywordsValue("21UYNT6Z2217K");
		body.setLastUpdateDateFrom("01/01/2018");
		body.setLastUpdateDateTo("04/30/2019");
		PageInfo pinf=new PageInfo();
		pinf.setPageIndex(new BigInteger("1"));
		pinf.setPageSize(new BigInteger("10"));
		body.setPageInfo(pinf);
		body.setStatus(new BigInteger("0"));
		request.setRequestBody(body);
		GetShipmentListResponse r=call.getInboundShipmentList(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());		
		assertTrue(r.getResponseBody().getShipmentList().getShipment().get(0).getItemList().getItem().size()>0);
		assertTrue(r.getResponseBody().getShipmentList().getShipment().get(0).getPackageList().getPackage().size()>0);
		/*System.out.println(r.getResponseBody().getShipmentList().getShipment().get(0).getItemList().getItem().get(0).getSellerPartNumber());
		System.out.println(r.getResponseBody().getShipmentList().getShipment().get(0).getPackageList().getPackage().get(0).getTrackingNumber());
		*/
	}

	@Test
	public void testMockGetInboundShipmentList_JSON() {
		Variables.SimulationEnabled=true;
		SbnOTCaller call=SbnOTCaller.buildJSON();
		GetShipmentListRequest request=new GetShipmentListRequest();
		GetShipmentListRequest.RequestBody body =new GetShipmentListRequest.RequestBody();
		body.setKeywordsType(new BigInteger("1"));
		body.setKeywordsValue("21UYNT6Z2217K");
		body.setLastUpdateDateFrom("01/01/2018");
		body.setLastUpdateDateTo("04/30/2019");
		PageInfo pinf=new PageInfo();
		pinf.setPageIndex(new BigInteger("1"));
		pinf.setPageSize(new BigInteger("10"));
		body.setPageInfo(pinf);
		body.setStatus(new BigInteger("0"));
		request.setRequestBody(body);
		GetShipmentListResponse r=call.getInboundShipmentList(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());		
		assertTrue(r.getResponseBody().getShipmentList().getShipment().get(0).getItemList().getItem().size()>0);
		assertTrue(r.getResponseBody().getShipmentList().getShipment().get(0).getPackageList().getPackage().size()>0);
		
		/*System.out.println(r.getResponseBody().getShipmentList().getShipment().get(0).getItemList().getItem().get(0).getSellerPartNumber());
		System.out.println(r.getResponseBody().getShipmentList().getShipment().get(0).getPackageList().getPackage().get(0).getTrackingNumber());
		*/
	}
	
	@Test
	public void testMockGetWarehouseList_XML() {
		Variables.SimulationEnabled=true;
		SbnOTCaller call=SbnOTCaller.buildXML();
		GetWarehouseListRequest request=new GetWarehouseListRequest();
		GetWarehouseListRequest.RequestBody body=new GetWarehouseListRequest.RequestBody();
		body.setWarehouseCode("06");	
		request.setRequestBody(body);
		GetWarehouseListResponse r=call.getWarehouseList(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertEquals("38141",r.getResponseBody().getWarehouseList().getWarehouse().get(0).getShipToZipCode());
		assertEquals("6100 East Holmes Road, Suite 103-104",r.getResponseBody().getWarehouseList().getWarehouse().get(0).getShipToAddress1());
	}	

	@Test
	public void testMockGetWarehouseList_JSON() {
		Variables.SimulationEnabled=true;
		SbnOTCaller call=SbnOTCaller.buildJSON();
		GetWarehouseListRequest request=new GetWarehouseListRequest();
		GetWarehouseListRequest.RequestBody body=new GetWarehouseListRequest.RequestBody();
		body.setWarehouseCode("06");	
		request.setRequestBody(body);
		GetWarehouseListResponse r=call.getWarehouseList(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertEquals("38141",r.getResponseBody().getWarehouseList().getWarehouse().get(0).getShipToZipCode());
		assertEquals("6100 East Holmes Road, Suite 103-104",r.getResponseBody().getWarehouseList().getWarehouse().get(0).getShipToAddress1());
	}
}
