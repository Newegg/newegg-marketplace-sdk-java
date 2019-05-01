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
import com.newegg.marketplace.sdk.item.model.AddManufacturerRequest;
import com.newegg.marketplace.sdk.item.model.AddManufacturerRequest.RequestBody.ManufacturerRequest;
import com.newegg.marketplace.sdk.item.model.AddManufacturerResponse;
import com.newegg.marketplace.sdk.item.model.GetManufacturerProcessStatusRequest;
import com.newegg.marketplace.sdk.item.model.GetManufacturerProcessStatusRequest.RequestBody.ManufacturerList;
import com.newegg.marketplace.sdk.item.model.GetManufacturerProcessStatusResponse;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequest;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequest.RequestBody.RequestCriteria;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequestV2;
import com.newegg.marketplace.sdk.item.model.GetManufacturerResponse;
import com.newegg.marketplace.sdk.item.model.GetManufacturerResponseV2;

public class ManufacturerCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ItemConfig.class);
	}

	@Test
	public void testXMLGetManufacturerRequestStatus() {
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		GetManufacturerProcessStatusRequest request=new GetManufacturerProcessStatusRequest();
		GetManufacturerProcessStatusRequest.RequestBody body=new GetManufacturerProcessStatusRequest.RequestBody();
		ManufacturerList mf=new ManufacturerList();
		mf.getManufacturerName().add("sony & wonder");
		body.setManufacturerList(mf);
		request.setRequestBody(body);
		GetManufacturerProcessStatusResponse r=call.getManufacturerRequestStatus(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testJSONGetManufacturerRequestStatus() {
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		GetManufacturerProcessStatusRequest request=new GetManufacturerProcessStatusRequest();
		GetManufacturerProcessStatusRequest.RequestBody body=new GetManufacturerProcessStatusRequest.RequestBody();
		ManufacturerList mf=new ManufacturerList();
		mf.getManufacturerName().add("sony & wonder");
		body.setManufacturerList(mf);
		request.setRequestBody(body);
		GetManufacturerProcessStatusResponse r=call.getManufacturerRequestStatus(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testXMLmanufacturerLookupForInternationalCountry(){
		ManufacturerCaller call=ManufacturerCaller.buildXML();	
		GetManufacturerRequestV2 request=new GetManufacturerRequestV2();
		GetManufacturerRequestV2.RequestBody body=new GetManufacturerRequestV2.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		body.setRestrictedCountryCode("USA");
		GetManufacturerRequestV2.RequestBody.RequestCriteria rc=new GetManufacturerRequestV2.RequestBody.RequestCriteria();
		rc.setManufacturerName("Panasonic");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);		
		GetManufacturerResponseV2 r=call.manufacturerLookupForInternationalCountry(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getMappedNameList().getMappedName().size()>0);
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getRestrictedSubcategoryList().getSubcategory().size()>0);
		
	}

	@Test
	public void testJSONmanufacturerLookupForInternationalCountry(){
		ManufacturerCaller call=ManufacturerCaller.buildJSON();	
		GetManufacturerRequestV2 request=new GetManufacturerRequestV2();
		GetManufacturerRequestV2.RequestBody body=new GetManufacturerRequestV2.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		body.setRestrictedCountryCode("USA");
		GetManufacturerRequestV2.RequestBody.RequestCriteria rc=new GetManufacturerRequestV2.RequestBody.RequestCriteria();
		rc.setManufacturerName("Panasonic");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);		
		GetManufacturerResponseV2 r=call.manufacturerLookupForInternationalCountry(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getMappedNameList().getMappedName().size()>0);
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getRestrictedSubcategoryList().getSubcategory().size()>0);
		
	}
	
	@Test
	public void testXMLSubmitManufacturerRequest() {
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		AddManufacturerRequest request=new AddManufacturerRequest();
		AddManufacturerRequest.RequestBody body=new AddManufacturerRequest.RequestBody();
		ManufacturerRequest mr=new ManufacturerRequest();
		mr.setName("sony & wonder");
		mr.setURL("www.sonywonder.com");
		body.setManufacturerRequest(mr);
		request.setRequestBody(body);
		AddManufacturerResponse r2=call.submitManufacturerRequest(request);			
		assertTrue(r2.getIsSuccess());
		assertTrue(r2.getResponseBody().getManufacturerRequest().getRequestDate().length()>0);
	}
	
	@Test
	public void testJSONSubmitManufacturerRequest() {
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		AddManufacturerRequest request=new AddManufacturerRequest();
		AddManufacturerRequest.RequestBody body=new AddManufacturerRequest.RequestBody();
		ManufacturerRequest mr=new ManufacturerRequest();
		mr.setName("sony & wonder");
		mr.setURL("www.sonywonder.com");
		body.setManufacturerRequest(mr);
		request.setRequestBody(body);
		AddManufacturerResponse r2=call.submitManufacturerRequest(request);			
		assertTrue(r2.getIsSuccess());
		assertTrue(r2.getResponseBody().getManufacturerRequest().getRequestDate().length()>0);
	}
	
	@Test
	public void testXMLManufacturerLookup() {
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		GetManufacturerRequest request=new GetManufacturerRequest();
		GetManufacturerRequest.RequestBody body=new GetManufacturerRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		RequestCriteria rc=new RequestCriteria();
		rc.setManufacturerName("D-Link");
		//rc.setCreatedDateFrom("1900-08-30 14:20:00");
		//rc.setCreatedDateTo("2019-08-30 14:20:00");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);
		GetManufacturerResponse r=call.manufacturerLookup(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testJSONManufacturerLookup() {
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		GetManufacturerRequest request=new GetManufacturerRequest();
		GetManufacturerRequest.RequestBody body=new GetManufacturerRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		RequestCriteria rc=new RequestCriteria();
		rc.setManufacturerName("D-Link");
		//rc.setCreatedDateFrom("1900-08-30 14:20:00");
		//rc.setCreatedDateTo("2019-08-30 14:20:00");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);
		GetManufacturerResponse r=call.manufacturerLookup(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testMockXMLSubmitManufacturerRequest() {			
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		AddManufacturerResponse r2=call.submitManufacturerRequest(new AddManufacturerRequest());			
		Variables.SimulationEnabled=false;
		assertTrue(r2.getIsSuccess());
		assertTrue("2/22/2012 16:50:03".equals(r2.getResponseBody().getManufacturerRequest().getRequestDate()));
	}

	@Test
	public void testMockJSONSubmitManufacturerRequest() {			
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		AddManufacturerResponse r2=call.submitManufacturerRequest(new AddManufacturerRequest());			
		Variables.SimulationEnabled=false;
		assertTrue(r2.getIsSuccess());
		assertTrue("2/22/2012 16:50:03".equals(r2.getResponseBody().getManufacturerRequest().getRequestDate()));
	}
	
	@Test
	public void testMockXMLManufacturerLookup() {
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		GetManufacturerRequest request=new GetManufacturerRequest();
		request.setOperationType("GetManufacturerRequest");
		GetManufacturerRequest.RequestBody body=new GetManufacturerRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		RequestCriteria rc=new RequestCriteria();
		rc.setManufacturerName("D-Link");
		//rc.setCreatedDateFrom("1900-08-30 14:20:00");
		//rc.setCreatedDateTo("2019-08-30 14:20:00");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);
		GetManufacturerResponse r=call.manufacturerLookup(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testMockJSONManufacturerLookup() {
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		GetManufacturerRequest request=new GetManufacturerRequest();
		request.setOperationType("GetManufacturerRequest");
		GetManufacturerRequest.RequestBody body=new GetManufacturerRequest.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		RequestCriteria rc=new RequestCriteria();
		rc.setManufacturerName("D-Link");
		//rc.setCreatedDateFrom("1900-08-30 14:20:00");
		//rc.setCreatedDateTo("2019-08-30 14:20:00");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);
		GetManufacturerResponse r=call.manufacturerLookup(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testMpckXMLmanufacturerLookupForInternationalCountry(){
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildXML();	
		GetManufacturerRequestV2 request=new GetManufacturerRequestV2();
		request.setOperationType("GetManufacturerRequest");
		GetManufacturerRequestV2.RequestBody body=new GetManufacturerRequestV2.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		body.setRestrictedCountryCode("USA");
		GetManufacturerRequestV2.RequestBody.RequestCriteria rc=new GetManufacturerRequestV2.RequestBody.RequestCriteria();
		rc.setManufacturerName("Panasonic");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);		
		GetManufacturerResponseV2 r=call.manufacturerLookupForInternationalCountry(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getMappedNameList().getMappedName().size()>0);
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getRestrictedSubcategoryList().getSubcategory().size()>0);
		
	}

	@Test
	public void testMpckJSONmanufacturerLookupForInternationalCountry(){
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildJSON();	
		GetManufacturerRequestV2 request=new GetManufacturerRequestV2();
		request.setOperationType("GetManufacturerRequest");
		GetManufacturerRequestV2.RequestBody body=new GetManufacturerRequestV2.RequestBody();
		body.setPageIndex(1);
		body.setPageSize(10);
		body.setRestrictedCountryCode("USA");
		GetManufacturerRequestV2.RequestBody.RequestCriteria rc=new GetManufacturerRequestV2.RequestBody.RequestCriteria();
		rc.setManufacturerName("Panasonic");
		body.setRequestCriteria(rc);
		request.setRequestBody(body);		
		GetManufacturerResponseV2 r=call.manufacturerLookupForInternationalCountry(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getMappedNameList().getMappedName().size()>0);
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().get(0).getRestrictedSubcategoryList().getSubcategory().size()>0);		
	}
	
	@Test
	public void testMockXMLGetManufacturerRequestStatus() {
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildXML();
		GetManufacturerProcessStatusRequest request=new GetManufacturerProcessStatusRequest();
		GetManufacturerProcessStatusRequest.RequestBody body=new GetManufacturerProcessStatusRequest.RequestBody();
		ManufacturerList mf=new ManufacturerList();
		mf.getManufacturerName().add("sony & wonder");
		body.setManufacturerList(mf);
		request.setRequestBody(body);
		GetManufacturerProcessStatusResponse r=call.getManufacturerRequestStatus(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
	
	@Test
	public void testMockJSONGetManufacturerRequestStatus() {
		Variables.SimulationEnabled=true;
		ManufacturerCaller call=ManufacturerCaller.buildJSON();
		GetManufacturerProcessStatusRequest request=new GetManufacturerProcessStatusRequest();
		GetManufacturerProcessStatusRequest.RequestBody body=new GetManufacturerProcessStatusRequest.RequestBody();
		ManufacturerList mf=new ManufacturerList();
		mf.getManufacturerName().add("sony & wonder");
		body.setManufacturerList(mf);
		request.setRequestBody(body);
		GetManufacturerProcessStatusResponse r=call.getManufacturerRequestStatus(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getManufacturerList().getManufacturer().size()>0);
	}
}
