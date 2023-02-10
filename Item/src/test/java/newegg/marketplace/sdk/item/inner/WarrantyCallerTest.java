package newegg.marketplace.sdk.item.inner;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.item.ItemConfig;
import newegg.marketplace.sdk.item.Variables;
import newegg.marketplace.sdk.item.model.ItemWarrantyRequest;
import newegg.marketplace.sdk.item.model.ItemWarrantyRequest.RequestBody.ItemWarrantyList;
import newegg.marketplace.sdk.item.model.ItemWarrantyResponse;
import newegg.marketplace.sdk.item.model.ItemWarrantyRequest.RequestBody.ItemWarrantyList.ItemWarranty;

public class WarrantyCallerTest {

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
	public void testXMLSubmitItemWarrantyRequest() {		
		WarrantyCaller call=WarrantyCaller.buildXML();
		ItemWarrantyRequest request=new ItemWarrantyRequest();
		request.setActionType(1);
		ItemWarrantyRequest.RequestBody body=new ItemWarrantyRequest.RequestBody();
		ItemWarrantyList iwList=new ItemWarrantyList();
		ItemWarranty iw1=new ItemWarranty();
		iw1.setItemManufacturerWarrantyID(new BigInteger("0"));
		iw1.setSellerPartNumber("bg9h2016042003");
		iw1.setPartsDay(0);
		iw1.setLaborDay(0);
		iw1.setServiceProvider("Test");
		iw1.setProviderSupportEmail("test@newegg.com");
		iw1.setProviderSupportURL("http://www.sohnen.com/CustomerSupport.aspx");
		iw1.setProviderCustomerServicePhone("562-946-3531");
		iw1.setCountryCode("USA");
		iw1.setApplyToAllCountryCode(false);
		iwList.getItemWarranty().add(iw1);
		body.setItemWarrantyList(iwList);
		request.setRequestBody(body);
		ItemWarrantyResponse r=call.submitItemWarrantyRequest(request);		
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getItemWarrantyList().getItemWarranty().size()>0);
		assertFalse(r.getResponseBody().getItemWarrantyList().getItemWarranty().get(0).getIsSuccess());		
	}

	
	@Test
	public void testJSONSubmitItemWarrantyRequest() {		
		WarrantyCaller call=WarrantyCaller.buildJSON();
		ItemWarrantyRequest request=new ItemWarrantyRequest();
		request.setActionType(1);
		ItemWarrantyRequest.RequestBody body=new ItemWarrantyRequest.RequestBody();
		ItemWarrantyList iwList=new ItemWarrantyList();
		ItemWarranty iw1=new ItemWarranty();
		iw1.setItemManufacturerWarrantyID(new BigInteger("0"));
		iw1.setSellerPartNumber("bg9h2016042003");
		iw1.setPartsDay(0);
		iw1.setLaborDay(0);
		iw1.setServiceProvider("Test");
		iw1.setProviderSupportEmail("test@newegg.com");
		iw1.setProviderSupportURL("http://www.sohnen.com/CustomerSupport.aspx");
		iw1.setProviderCustomerServicePhone("562-946-3531");
		iw1.setCountryCode("USA");
		iw1.setApplyToAllCountryCode(false);
		iwList.getItemWarranty().add(iw1);
		body.setItemWarrantyList(iwList);
		request.setRequestBody(body);
		ItemWarrantyResponse r=call.submitItemWarrantyRequest(request);		
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getItemWarrantyList().getItemWarranty().size()>0);		
		assertFalse(r.getResponseBody().getItemWarrantyList().getItemWarranty().get(0).getIsSuccess());
		
	}
	
	@Test
	public void testMockXMLSubmitItemWarrantyRequest() {
		Variables.SimulationEnabled=true;
		WarrantyCaller call=WarrantyCaller.buildXML();
		ItemWarrantyRequest request=new ItemWarrantyRequest();
		request.setActionType(1);
		ItemWarrantyRequest.RequestBody body=new ItemWarrantyRequest.RequestBody();
		ItemWarrantyList iwList=new ItemWarrantyList();
		ItemWarranty iw1=new ItemWarranty();
		iw1.setItemManufacturerWarrantyID(new BigInteger("0"));
		iw1.setSellerPartNumber("bg9h2016042003");
		iw1.setPartsDay(0);
		iw1.setLaborDay(0);
		iw1.setServiceProvider("Test");
		iw1.setProviderSupportEmail("test@newegg.com");
		iw1.setProviderSupportURL("http://www.sohnen.com/CustomerSupport.aspx");
		iw1.setProviderCustomerServicePhone("562-946-3531");
		iw1.setCountryCode("USA");
		iw1.setApplyToAllCountryCode(false);
		iwList.getItemWarranty().add(iw1);
		body.setItemWarrantyList(iwList);
		request.setRequestBody(body);
		ItemWarrantyResponse r=call.submitItemWarrantyRequest(request);	
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getItemWarrantyList().getItemWarranty().size()>0);
		assertFalse(r.getResponseBody().getItemWarrantyList().getItemWarranty().get(0).getIsSuccess());		
	}
	
	@Test
	public void testMockJSONSubmitItemWarrantyRequest() {
		Variables.SimulationEnabled=true;
		WarrantyCaller call=WarrantyCaller.buildJSON();
		ItemWarrantyRequest request=new ItemWarrantyRequest();
		request.setActionType(1);
		ItemWarrantyRequest.RequestBody body=new ItemWarrantyRequest.RequestBody();
		ItemWarrantyList iwList=new ItemWarrantyList();
		ItemWarranty iw1=new ItemWarranty();
		iw1.setItemManufacturerWarrantyID(new BigInteger("0"));
		iw1.setSellerPartNumber("bg9h2016042003");
		iw1.setPartsDay(0);
		iw1.setLaborDay(0);
		iw1.setServiceProvider("Test");
		iw1.setProviderSupportEmail("test@newegg.com");
		iw1.setProviderSupportURL("http://www.sohnen.com/CustomerSupport.aspx");
		iw1.setProviderCustomerServicePhone("562-946-3531");
		iw1.setCountryCode("USA");
		iw1.setApplyToAllCountryCode(false);
		iwList.getItemWarranty().add(iw1);
		body.setItemWarrantyList(iwList);
		request.setRequestBody(body);
		ItemWarrantyResponse r=call.submitItemWarrantyRequest(request);	
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getItemWarrantyList().getItemWarranty().size()>0);		
		assertFalse(r.getResponseBody().getItemWarrantyList().getItemWarranty().get(0).getIsSuccess());
		
	}
}
