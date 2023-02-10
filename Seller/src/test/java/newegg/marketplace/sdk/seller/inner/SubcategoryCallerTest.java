package newegg.marketplace.sdk.seller.inner;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.common.Content.PLATFORM;
import newegg.marketplace.sdk.seller.SellerConfig;
import newegg.marketplace.sdk.seller.Variables;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertiesRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertiesResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValuesRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryPropertyValuesResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusForInternationalCountryRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusForInternationalCountryResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusRequest;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusRequest.RequestBody.GetItemSubcategory;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusRequest.RequestBody.GetItemSubcategory.IndustryCodeList;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusRequest.RequestBody.GetItemSubcategory.SubcategoryIDList;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusResponse;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusV1Request;
import newegg.marketplace.sdk.seller.model.GetSubcategoryStatusV1Response;

public class SubcategoryCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(SellerConfig.class);
	}
	@Before
	public void before() {
		Variables.SimulationEnabled = true;
	}
	
	@After
	public void After() {
		Variables.SimulationEnabled = false;
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
	public void testGetSubcategoryStatusV1_JSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
//		Variables.SimulationEnabled = true;
		PLATFORM tmp=Content.Platform;
		Content.Platform=PLATFORM.USA;
		SubcategoryCaller call=SubcategoryCaller.buildJSON();
		
		GetSubcategoryStatusV1Request body=new GetSubcategoryStatusV1Request();
		GetSubcategoryStatusV1Request.RequestBody requestBody=new GetSubcategoryStatusV1Request.RequestBody();
		body.setRequestBody(requestBody);
		GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory getItemSubcategory=new 		GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory();
		requestBody.setGetItemSubcategory(getItemSubcategory);
		
		GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory.SubcategoryIDList subcategoryIDList=new GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory.SubcategoryIDList();
		List<Integer> webSiteCategoryIDList=new ArrayList<>();
		webSiteCategoryIDList.add(402);
		subcategoryIDList.setWebSiteCategoryID(webSiteCategoryIDList);
		subcategoryIDList.setWebSiteCatalogName("CH");
		getItemSubcategory.setSubcategoryIDList(subcategoryIDList);
		GetSubcategoryStatusV1Response res = call.getSubcategoryStatusV1(body);
		System.out.println(res);
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
