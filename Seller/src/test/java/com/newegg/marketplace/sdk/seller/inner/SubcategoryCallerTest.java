package com.newegg.marketplace.sdk.seller.inner;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.seller.SellerConfig;
import com.newegg.marketplace.sdk.seller.Variables;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValuesRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValuesResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryPropertiesRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryPropertiesResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryStatusRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryStatusRequest.RequestBody.GetItemSubcategory;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryStatusRequest.RequestBody.GetItemSubcategory.IndustryCodeList;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryStatusRequest.RequestBody.GetItemSubcategory.SubcategoryIDList;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryStatusForInternationalCountryRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryStatusResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryStatusForInternationalCountryResponse;

public class SubcategoryCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(SellerConfig.class);
	}

	@Test
	public void testGetSubcategoryPropertyValues_XML() {
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcategoryPropertyValuesRequest request=new GetSubcategoryPropertyValuesRequest();
		GetSubcategoryPropertyValuesRequest.RequestBody body=new GetSubcategoryPropertyValuesRequest.RequestBody();
		body.setPropertyName("Costume_Gender");
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertyValuesResponse r=call.getSubcategoryPropertyValues(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getPropertyInfoList().getPropertyInfo().size()>0);
	}
	
	@Test
	public void testGetSubcategoryPropertyValues_JSON() {
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcategoryPropertyValuesRequest request=new GetSubcategoryPropertyValuesRequest();
		GetSubcategoryPropertyValuesRequest.RequestBody body=new GetSubcategoryPropertyValuesRequest.RequestBody();
		body.setPropertyName("Costume_Gender");
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertyValuesResponse r=call.getSubcategoryPropertyValues(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getPropertyInfoList().getPropertyInfo().size()>0);
	}
	
	@Test
	public void testGetSubcategoryProperties_XML() {
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcategoryPropertiesRequest request=new GetSubcategoryPropertiesRequest();
		GetSubcategoryPropertiesRequest.RequestBody body=new GetSubcategoryPropertiesRequest.RequestBody();
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertiesResponse r=call.getSubcategoryProperties(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryPropertyList().getSubcategoryProperty().size()>0);
	}

	@Test
	public void testGetSubcategoryProperties_JSON() {
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcategoryPropertiesRequest request=new GetSubcategoryPropertiesRequest();
		GetSubcategoryPropertiesRequest.RequestBody body=new GetSubcategoryPropertiesRequest.RequestBody();
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertiesResponse r=call.getSubcategoryProperties(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryPropertyList().getSubcategoryProperty().size()>0);
	}
	
	@Test
	public void testGetSubcategory4InternationalCountry_XML() {
		PLATFORM tmp=Content.Platform;
		Content.Platform=PLATFORM.USA;
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcategoryStatusForInternationalCountryRequest request=new GetSubcategoryStatusForInternationalCountryRequest();
		GetSubcategoryStatusForInternationalCountryRequest.RequestBody body=new GetSubcategoryStatusForInternationalCountryRequest.RequestBody();
		body.setCountryCode("USA");
		GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory s=new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory.SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory.IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcategoryStatusForInternationalCountryResponse r=call.getSubcategory4InternationalCountry(request);
		Content.Platform=tmp;
		assertTrue(r.getIsSuccess());
		assertTrue("USA".equals(r.getResponseBody().getCountryCode()));
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}
	
	@Test
	public void testGetSubcategory4InternationalCountry_JSON() {
		PLATFORM tmp=Content.Platform;
		Content.Platform=PLATFORM.USA;
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcategoryStatusForInternationalCountryRequest request=new GetSubcategoryStatusForInternationalCountryRequest();
		GetSubcategoryStatusForInternationalCountryRequest.RequestBody body=new GetSubcategoryStatusForInternationalCountryRequest.RequestBody();
		body.setCountryCode("USA");
		GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory s=new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory.SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory.IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcategoryStatusForInternationalCountryResponse r=call.getSubcategory4InternationalCountry(request);
		Content.Platform=tmp;
		assertTrue(r.getIsSuccess());
		assertTrue("USA".equals(r.getResponseBody().getCountryCode()));
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}
	
	@Test
	public void testGetSubcategoryStatus_XML() {
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcategoryStatusRequest request=new GetSubcategoryStatusRequest();
		GetSubcategoryStatusRequest.RequestBody body=new GetSubcategoryStatusRequest.RequestBody();
		GetItemSubcategory s=new GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcategoryStatusResponse r=call.getSubcategoryStatus(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}

	
	@Test
	public void testGetSubcategoryStatus_JSON() {
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcategoryStatusRequest request=new GetSubcategoryStatusRequest();
		GetSubcategoryStatusRequest.RequestBody body=new GetSubcategoryStatusRequest.RequestBody();
		GetItemSubcategory s=new GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcategoryStatusResponse r=call.getSubcategoryStatus(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}
	
	
	
	@Test
	public void testMockGetSubcategoryStatus_XML() {
		Variables.SimulationEnabled=true;
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcategoryStatusRequest request=new GetSubcategoryStatusRequest();
		GetSubcategoryStatusRequest.RequestBody body=new GetSubcategoryStatusRequest.RequestBody();
		GetItemSubcategory s=new GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(379);
		s.setIndustryCodeList(new IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcategoryStatusResponse r=call.getSubcategoryStatus(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}
	
	@Test
	public void testMockGetSubcategoryStatus_JSON() {
		Variables.SimulationEnabled=true;
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcategoryStatusRequest request=new GetSubcategoryStatusRequest();
		GetSubcategoryStatusRequest.RequestBody body=new GetSubcategoryStatusRequest.RequestBody();
		GetItemSubcategory s=new GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(379);
		s.setIndustryCodeList(new IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcategoryStatusResponse r=call.getSubcategoryStatus(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}
	
	@Test
	public void testMockGetSubcategory4InternationalCountry_XML() {
		Variables.SimulationEnabled=true;
		PLATFORM tmp=Content.Platform;
		Content.Platform=PLATFORM.USA;
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcategoryStatusForInternationalCountryRequest request=new GetSubcategoryStatusForInternationalCountryRequest();
		GetSubcategoryStatusForInternationalCountryRequest.RequestBody body=new GetSubcategoryStatusForInternationalCountryRequest.RequestBody();
		body.setCountryCode("USA");
		GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory s=new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory.SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory.IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcategoryStatusForInternationalCountryResponse r=call.getSubcategory4InternationalCountry(request);
		Variables.SimulationEnabled=false;
		Content.Platform=tmp;
		assertTrue(r.getIsSuccess());
		assertTrue("USA".equals(r.getResponseBody().getCountryCode()));
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}
	
	@Test
	public void testMockGetSubcategory4InternationalCountry_JSON() {
		Variables.SimulationEnabled=true;
		PLATFORM tmp=Content.Platform;
		Content.Platform=PLATFORM.USA;
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcategoryStatusForInternationalCountryRequest request=new GetSubcategoryStatusForInternationalCountryRequest();
		GetSubcategoryStatusForInternationalCountryRequest.RequestBody body=new GetSubcategoryStatusForInternationalCountryRequest.RequestBody();
		body.setCountryCode("USA");
		GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory s=new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory.SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new GetSubcategoryStatusForInternationalCountryRequest.RequestBody.GetItemSubcategory.IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcategoryStatusForInternationalCountryResponse r=call.getSubcategory4InternationalCountry(request);
		Variables.SimulationEnabled=false;
		Content.Platform=tmp;
		assertTrue(r.getIsSuccess());
		assertTrue("USA".equals(r.getResponseBody().getCountryCode()));
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}
	
	@Test
	public void testMockGetSubcategoryProperties_XML() {
		Variables.SimulationEnabled=true;
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcategoryPropertiesRequest request=new GetSubcategoryPropertiesRequest();
		GetSubcategoryPropertiesRequest.RequestBody body=new GetSubcategoryPropertiesRequest.RequestBody();
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertiesResponse r=call.getSubcategoryProperties(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryPropertyList().getSubcategoryProperty().size()>0);
	}

	@Test
	public void testMockGetSubcategoryProperties_JSON() {
		Variables.SimulationEnabled=true;
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcategoryPropertiesRequest request=new GetSubcategoryPropertiesRequest();
		GetSubcategoryPropertiesRequest.RequestBody body=new GetSubcategoryPropertiesRequest.RequestBody();
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertiesResponse r=call.getSubcategoryProperties(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryPropertyList().getSubcategoryProperty().size()>0);
	}
	
	@Test
	public void testMockGetSubcategoryPropertyValues_XML() {
		Variables.SimulationEnabled=true;
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcategoryPropertyValuesRequest request=new GetSubcategoryPropertyValuesRequest();
		GetSubcategoryPropertyValuesRequest.RequestBody body=new GetSubcategoryPropertyValuesRequest.RequestBody();
		body.setPropertyName("Costume_Gender");
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertyValuesResponse r=call.getSubcategoryPropertyValues(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getPropertyInfoList().getPropertyInfo().size()>0);
	}
	
	@Test
	public void testMockGetSubcategoryPropertyValues_JSON() {
		Variables.SimulationEnabled=true;
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcategoryPropertyValuesRequest request=new GetSubcategoryPropertyValuesRequest();
		GetSubcategoryPropertyValuesRequest.RequestBody body=new GetSubcategoryPropertyValuesRequest.RequestBody();
		body.setPropertyName("Costume_Gender");
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertyValuesResponse r=call.getSubcategoryPropertyValues(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getPropertyInfoList().getPropertyInfo().size()>0);
	}
}
