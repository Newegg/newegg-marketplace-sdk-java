package com.newegg.marketplace.sdk.item.inner;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.item.ItemConfig;
import com.newegg.marketplace.sdk.item.Variables;
import com.newegg.marketplace.sdk.item.model.SubmitManufacturerRequest;
import com.newegg.marketplace.sdk.item.model.SubmitManufacturerRequest.RequestBody.ManufacturerRequest;
import com.newegg.marketplace.sdk.item.model.SubmitManufacturerResponse;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequestStatusRequest;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequestStatusRequest.RequestBody.ManufacturerList;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequestStatusResponse;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupRequest;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupRequest.RequestBody.RequestCriteria;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupForInternationalCountryRequest;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupResponse;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupForInternationalCountryResponse;

public class ManufacturerCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ItemConfig.class);
	}
	
	@Before
	public  void before() {
		Variables.SimulationEnabled=true;
	}
	
	@After
	public  void after() {
		Variables.SimulationEnabled=false;
	}

	@Test
	public void testXMLGetManufacturerRequestStatus() {
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		GetManufacturerRequestStatusRequest request=new GetManufacturerRequestStatusRequest();
		GetManufacturerRequestStatusRequest.RequestBody body=new GetManufacturerRequestStatusRequest.RequestBody();
		ManufacturerList mf=new ManufacturerList();
		mf.getManufacturerName().add("sony & wonder");
		body.setManufacturerList(mf);
		request.setRequestBody(body);
		GetManufacturerRequestStatusResponse r=call.getManufacturerRequestStatus(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testJSONGetManufacturerRequestStatus() {
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		GetManufacturerRequestStatusRequest request=new GetManufacturerRequestStatusRequest();
		GetManufacturerRequestStatusRequest.RequestBody body=new GetManufacturerRequestStatusRequest.RequestBody();
		ManufacturerList mf=new ManufacturerList();
		mf.getManufacturerName().add("sony & wonder");
		body.setManufacturerList(mf);
		request.setRequestBody(body);
		GetManufacturerRequestStatusResponse r=call.getManufacturerRequestStatus(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testXMLmanufacturerLookupForInternationalCountry(){
		ManufacturerCaller call=ManufacturerCaller.buildXML();	
		ManufacturerLookupForInternationalCountryRequest request=new ManufacturerLookupForInternationalCountryRequest();
		ManufacturerLookupForInternationalCountryRequest.RequestBody body=new ManufacturerLookupForInternationalCountryRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		body.setRestrictedCountryCode("USA");
		ManufacturerLookupForInternationalCountryRequest.RequestBody.RequestCriteria rc=new ManufacturerLookupForInternationalCountryRequest.RequestBody.RequestCriteria();
		rc.setManufacturerName("Panasonic");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);		
		ManufacturerLookupForInternationalCountryResponse r=call.manufacturerLookupForInternationalCountry(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getMappedNameList().getMappedName().size()>0);
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getRestrictedSubcategoryList().getSubcategory().size()>0);
		
	}

	@Test
	public void testJSONmanufacturerLookupForInternationalCountry(){
		ManufacturerCaller call=ManufacturerCaller.buildJSON();	
		ManufacturerLookupForInternationalCountryRequest request=new ManufacturerLookupForInternationalCountryRequest();
		ManufacturerLookupForInternationalCountryRequest.RequestBody body=new ManufacturerLookupForInternationalCountryRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		body.setRestrictedCountryCode("USA");
		ManufacturerLookupForInternationalCountryRequest.RequestBody.RequestCriteria rc=new ManufacturerLookupForInternationalCountryRequest.RequestBody.RequestCriteria();
		rc.setManufacturerName("Panasonic");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);		
		ManufacturerLookupForInternationalCountryResponse r=call.manufacturerLookupForInternationalCountry(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getMappedNameList().getMappedName().size()>0);
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getRestrictedSubcategoryList().getSubcategory().size()>0);
		
	}
	
	@Test
	public void testXMLSubmitManufacturerRequest() {
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		SubmitManufacturerRequest request=new SubmitManufacturerRequest();
		SubmitManufacturerRequest.RequestBody body=new SubmitManufacturerRequest.RequestBody();
		ManufacturerRequest mr=new ManufacturerRequest();
		mr.setName("sony & wonder");
		mr.setURL("www.sonywonder.com");
		body.setManufacturerRequest(mr);
		request.setRequestBody(body);
		SubmitManufacturerResponse r2=call.submitManufacturerRequest(request);			
		assertTrue(r2.getIsSuccess());
		assertTrue(r2.getResponseBody().getManufacturerRequest().getRequestDate().length()>0);
	}
	
	@Test
	public void testJSONSubmitManufacturerRequest() {
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		SubmitManufacturerRequest request=new SubmitManufacturerRequest();
		SubmitManufacturerRequest.RequestBody body=new SubmitManufacturerRequest.RequestBody();
		ManufacturerRequest mr=new ManufacturerRequest();
		mr.setName("sony & wonder");
		mr.setURL("www.sonywonder.com");
		body.setManufacturerRequest(mr);
		request.setRequestBody(body);
		SubmitManufacturerResponse r2=call.submitManufacturerRequest(request);			
		assertTrue(r2.getIsSuccess());
		assertTrue(r2.getResponseBody().getManufacturerRequest().getRequestDate().length()>0);
	}
	
	@Test
	public void testXMLManufacturerLookup() {
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		ManufacturerLookupRequest request=new ManufacturerLookupRequest();
		ManufacturerLookupRequest.RequestBody body=new ManufacturerLookupRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		RequestCriteria rc=new RequestCriteria();
		rc.setManufacturerName("D-Link");
		//rc.setCreatedDateFrom("1900-08-30 14:20:00");
		//rc.setCreatedDateTo("2019-08-30 14:20:00");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);
		ManufacturerLookupResponse r=call.manufacturerLookup(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testJSONManufacturerLookup() {
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		ManufacturerLookupRequest request=new ManufacturerLookupRequest();
		ManufacturerLookupRequest.RequestBody body=new ManufacturerLookupRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		RequestCriteria rc=new RequestCriteria();
		rc.setManufacturerName("D-Link");
		//rc.setCreatedDateFrom("1900-08-30 14:20:00");
		//rc.setCreatedDateTo("2019-08-30 14:20:00");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);
		ManufacturerLookupResponse r=call.manufacturerLookup(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testMockXMLSubmitManufacturerRequest() {			
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		SubmitManufacturerResponse r2=call.submitManufacturerRequest(new SubmitManufacturerRequest());			
		Variables.SimulationEnabled=false;
		assertTrue(r2.getIsSuccess());
		assertTrue("2/22/2012 16:50:03".equals(r2.getResponseBody().getManufacturerRequest().getRequestDate()));
	}

	@Test
	public void testMockJSONSubmitManufacturerRequest() {			
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		SubmitManufacturerResponse r2=call.submitManufacturerRequest(new SubmitManufacturerRequest());			
		Variables.SimulationEnabled=false;
		assertTrue(r2.getIsSuccess());
		assertTrue("2/22/2012 16:50:03".equals(r2.getResponseBody().getManufacturerRequest().getRequestDate()));
	}
	
	@Test
	public void testMockXMLManufacturerLookup() {
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		ManufacturerLookupRequest request=new ManufacturerLookupRequest();
		request.setOperationType("GetManufacturerRequest");
		ManufacturerLookupRequest.RequestBody body=new ManufacturerLookupRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		RequestCriteria rc=new RequestCriteria();
		rc.setManufacturerName("D-Link");
		//rc.setCreatedDateFrom("1900-08-30 14:20:00");
		//rc.setCreatedDateTo("2019-08-30 14:20:00");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);
		ManufacturerLookupResponse r=call.manufacturerLookup(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testMockJSONManufacturerLookup() {
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		ManufacturerLookupRequest request=new ManufacturerLookupRequest();
		request.setOperationType("GetManufacturerRequest");
		ManufacturerLookupRequest.RequestBody body=new ManufacturerLookupRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		RequestCriteria rc=new RequestCriteria();
		rc.setManufacturerName("D-Link");
		//rc.setCreatedDateFrom("1900-08-30 14:20:00");
		//rc.setCreatedDateTo("2019-08-30 14:20:00");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);
		ManufacturerLookupResponse r=call.manufacturerLookup(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testMpckXMLmanufacturerLookupForInternationalCountry(){
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildXML();	
		ManufacturerLookupForInternationalCountryRequest request=new ManufacturerLookupForInternationalCountryRequest();
		request.setOperationType("GetManufacturerRequest");
		ManufacturerLookupForInternationalCountryRequest.RequestBody body=new ManufacturerLookupForInternationalCountryRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		body.setRestrictedCountryCode("USA");
		ManufacturerLookupForInternationalCountryRequest.RequestBody.RequestCriteria rc=new ManufacturerLookupForInternationalCountryRequest.RequestBody.RequestCriteria();
		rc.setManufacturerName("Panasonic");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);		
		ManufacturerLookupForInternationalCountryResponse r=call.manufacturerLookupForInternationalCountry(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getMappedNameList().getMappedName().size()>0);
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getRestrictedSubcategoryList().getSubcategory().size()>0);
		
	}

	@Test
	public void testMpckJSONmanufacturerLookupForInternationalCountry(){
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildJSON();	
		ManufacturerLookupForInternationalCountryRequest request=new ManufacturerLookupForInternationalCountryRequest();
		request.setOperationType("GetManufacturerRequest");
		ManufacturerLookupForInternationalCountryRequest.RequestBody body=new ManufacturerLookupForInternationalCountryRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		body.setRestrictedCountryCode("USA");
		ManufacturerLookupForInternationalCountryRequest.RequestBody.RequestCriteria rc=new ManufacturerLookupForInternationalCountryRequest.RequestBody.RequestCriteria();
		rc.setManufacturerName("Panasonic");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);		
		ManufacturerLookupForInternationalCountryResponse r=call.manufacturerLookupForInternationalCountry(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getMappedNameList().getMappedName().size()>0);
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getRestrictedSubcategoryList().getSubcategory().size()>0);		
	}
	
	@Test
	public void testMockXMLGetManufacturerRequestStatus() {
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		GetManufacturerRequestStatusRequest request=new GetManufacturerRequestStatusRequest();
		GetManufacturerRequestStatusRequest.RequestBody body=new GetManufacturerRequestStatusRequest.RequestBody();
		ManufacturerList mf=new ManufacturerList();
		mf.getManufacturerName().add("sony & wonder");
		body.setManufacturerList(mf);
		request.setRequestBody(body);
		GetManufacturerRequestStatusResponse r=call.getManufacturerRequestStatus(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testMockJSONGetManufacturerRequestStatus() {
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		GetManufacturerRequestStatusRequest request=new GetManufacturerRequestStatusRequest();
		GetManufacturerRequestStatusRequest.RequestBody body=new GetManufacturerRequestStatusRequest.RequestBody();
		ManufacturerList mf=new ManufacturerList();
		mf.getManufacturerName().add("sony & wonder");
		body.setManufacturerList(mf);
		request.setRequestBody(body);
		GetManufacturerRequestStatusResponse r=call.getManufacturerRequestStatus(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
}
