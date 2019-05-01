package com.newegg.marketplace.sdk.seller.inner;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.seller.SellerConfig;
import com.newegg.marketplace.sdk.seller.Variables;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValueRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValueResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryPropertiesRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryPropertiesResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryRequest;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryRequest.RequestBody.GetItemSubcategory;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryRequest.RequestBody.GetItemSubcategory.IndustryCodeList;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryRequest.RequestBody.GetItemSubcategory.SubcategoryIDList;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryRequestV2;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryResponseV2;

public class SubcategoryCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(SellerConfig.class);
	}

	@Test
	public void testGetSubcategoryPropertyValues_XML() {
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcategoryPropertyValueRequest request=new GetSubcategoryPropertyValueRequest();
		GetSubcategoryPropertyValueRequest.RequestBody body=new GetSubcategoryPropertyValueRequest.RequestBody();
		body.setPropertyName("Costume_Gender");
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertyValueResponse r=call.getSubcategoryPropertyValues(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getPropertyInfoList().getPropertyInfo().size()>0);
	}
	
	@Test
	public void testGetSubcategoryPropertyValues_JSON() {
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcategoryPropertyValueRequest request=new GetSubcategoryPropertyValueRequest();
		GetSubcategoryPropertyValueRequest.RequestBody body=new GetSubcategoryPropertyValueRequest.RequestBody();
		body.setPropertyName("Costume_Gender");
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertyValueResponse r=call.getSubcategoryPropertyValues(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getPropertyInfoList().getPropertyInfo().size()>0);
	}
	
	@Test
	public void testGetSubcategoryProperties_XML() {
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcatetoryPropertiesRequest request=new GetSubcatetoryPropertiesRequest();
		GetSubcatetoryPropertiesRequest.RequestBody body=new GetSubcatetoryPropertiesRequest.RequestBody();
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcatetoryPropertiesResponse r=call.getSubcategoryProperties(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryPropertyList().getSubcategoryProperty().size()>0);
	}

	@Test
	public void testGetSubcategoryProperties_JSON() {
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcatetoryPropertiesRequest request=new GetSubcatetoryPropertiesRequest();
		GetSubcatetoryPropertiesRequest.RequestBody body=new GetSubcatetoryPropertiesRequest.RequestBody();
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcatetoryPropertiesResponse r=call.getSubcategoryProperties(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryPropertyList().getSubcategoryProperty().size()>0);
	}
	
	@Test
	public void testGetSubcategory4InternationalCountry_XML() {
		PLATFORM tmp=Content.Platform;
		Content.Platform=PLATFORM.USA;
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcatetoryRequestV2 request=new GetSubcatetoryRequestV2();
		GetSubcatetoryRequestV2.RequestBody body=new GetSubcatetoryRequestV2.RequestBody();
		body.setCountryCode("USA");
		GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory s=new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory.SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory.IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcatetoryResponseV2 r=call.getSubcategory4InternationalCountry(request);
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
		GetSubcatetoryRequestV2 request=new GetSubcatetoryRequestV2();
		GetSubcatetoryRequestV2.RequestBody body=new GetSubcatetoryRequestV2.RequestBody();
		body.setCountryCode("USA");
		GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory s=new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory.SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory.IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcatetoryResponseV2 r=call.getSubcategory4InternationalCountry(request);
		Content.Platform=tmp;
		assertTrue(r.getIsSuccess());
		assertTrue("USA".equals(r.getResponseBody().getCountryCode()));
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}
	
	@Test
	public void testGetSubcategoryStatus_XML() {
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcatetoryRequest request=new GetSubcatetoryRequest();
		GetSubcatetoryRequest.RequestBody body=new GetSubcatetoryRequest.RequestBody();
		GetItemSubcategory s=new GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcatetoryResponse r=call.getSubcategoryStatus(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}

	
	@Test
	public void testGetSubcategoryStatus_JSON() {
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcatetoryRequest request=new GetSubcatetoryRequest();
		GetSubcatetoryRequest.RequestBody body=new GetSubcatetoryRequest.RequestBody();
		GetItemSubcategory s=new GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcatetoryResponse r=call.getSubcategoryStatus(request);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}
	
	
	
	@Test
	public void testMockGetSubcategoryStatus_XML() {
		Variables.SimulationEnabled=true;
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcatetoryRequest request=new GetSubcatetoryRequest();
		GetSubcatetoryRequest.RequestBody body=new GetSubcatetoryRequest.RequestBody();
		GetItemSubcategory s=new GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(379);
		s.setIndustryCodeList(new IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcatetoryResponse r=call.getSubcategoryStatus(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryList().getSubcategory().size()>0);
	}
	
	@Test
	public void testMockGetSubcategoryStatus_JSON() {
		Variables.SimulationEnabled=true;
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcatetoryRequest request=new GetSubcatetoryRequest();
		GetSubcatetoryRequest.RequestBody body=new GetSubcatetoryRequest.RequestBody();
		GetItemSubcategory s=new GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(379);
		s.setIndustryCodeList(new IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcatetoryResponse r=call.getSubcategoryStatus(request);
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
		GetSubcatetoryRequestV2 request=new GetSubcatetoryRequestV2();
		GetSubcatetoryRequestV2.RequestBody body=new GetSubcatetoryRequestV2.RequestBody();
		body.setCountryCode("USA");
		GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory s=new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory.SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory.IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcatetoryResponseV2 r=call.getSubcategory4InternationalCountry(request);
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
		GetSubcatetoryRequestV2 request=new GetSubcatetoryRequestV2();
		GetSubcatetoryRequestV2.RequestBody body=new GetSubcatetoryRequestV2.RequestBody();
		body.setCountryCode("USA");
		GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory s=new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory();
		s.setEnabled(1);
		s.setSubcategoryIDList(new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory.SubcategoryIDList());		
		s.getSubcategoryIDList().getSubcategoryID().add(397);
		s.setIndustryCodeList(new GetSubcatetoryRequestV2.RequestBody.GetItemSubcategory.IndustryCodeList());
		s.getIndustryCodeList().getIndustryCode().add("CH");
		body.setGetItemSubcategory(s);
		request.setRequestBody(body);
		GetSubcatetoryResponseV2 r=call.getSubcategory4InternationalCountry(request);
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
		GetSubcatetoryPropertiesRequest request=new GetSubcatetoryPropertiesRequest();
		GetSubcatetoryPropertiesRequest.RequestBody body=new GetSubcatetoryPropertiesRequest.RequestBody();
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcatetoryPropertiesResponse r=call.getSubcategoryProperties(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryPropertyList().getSubcategoryProperty().size()>0);
	}

	@Test
	public void testMockGetSubcategoryProperties_JSON() {
		Variables.SimulationEnabled=true;
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcatetoryPropertiesRequest request=new GetSubcatetoryPropertiesRequest();
		GetSubcatetoryPropertiesRequest.RequestBody body=new GetSubcatetoryPropertiesRequest.RequestBody();
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcatetoryPropertiesResponse r=call.getSubcategoryProperties(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getSubcategoryPropertyList().getSubcategoryProperty().size()>0);
	}
	
	@Test
	public void testMockGetSubcategoryPropertyValues_XML() {
		Variables.SimulationEnabled=true;
		SubcategoryCaller call=SubcategoryCaller.buildXML();
		GetSubcategoryPropertyValueRequest request=new GetSubcategoryPropertyValueRequest();
		GetSubcategoryPropertyValueRequest.RequestBody body=new GetSubcategoryPropertyValueRequest.RequestBody();
		body.setPropertyName("Costume_Gender");
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertyValueResponse r=call.getSubcategoryPropertyValues(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getPropertyInfoList().getPropertyInfo().size()>0);
	}
	
	@Test
	public void testMockGetSubcategoryPropertyValues_JSON() {
		Variables.SimulationEnabled=true;
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		GetSubcategoryPropertyValueRequest request=new GetSubcategoryPropertyValueRequest();
		GetSubcategoryPropertyValueRequest.RequestBody body=new GetSubcategoryPropertyValueRequest.RequestBody();
		body.setPropertyName("Costume_Gender");
		body.setSubcategoryID(1045);
		request.setRequestBody(body);
		GetSubcategoryPropertyValueResponse r=call.getSubcategoryPropertyValues(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getPropertyInfoList().getPropertyInfo().size()>0);
	}
}
