package newegg.marketplace.sdk.item.inner;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.item.ItemConfig;
import newegg.marketplace.sdk.item.Variables;
import newegg.marketplace.sdk.item.model.GetVolumeDiscountRequestResultRequest;
import newegg.marketplace.sdk.item.model.GetVolumeDiscountRequestResultResponse;
import newegg.marketplace.sdk.item.model.SubmitVolumeDiscountRequest;
import newegg.marketplace.sdk.item.model.SubmitVolumeDiscountResponse;
import newegg.marketplace.sdk.item.model.SubmitVolumeDiscountRequest.RequestBody.ItemVolumeDiscountInfo;
import newegg.marketplace.sdk.item.model.SubmitVolumeDiscountRequest.RequestBody.ItemVolumeDiscountInfo.DiscountSetting;
import newegg.marketplace.sdk.item.model.SubmitVolumeDiscountRequest.RequestBody.ItemVolumeDiscountInfo.DiscountSetting.Tier;


public class VolumeDiscountCallerTest {

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
	public void testJSONGetVolumeDiscountRequestResult() {			
		VolumeDiscountCaller call=VolumeDiscountCaller.buildJSON();
		GetVolumeDiscountRequestResultRequest obj=new GetVolumeDiscountRequestResultRequest();
		obj.setOperationType("GetVolumeDiscountRequest");
		GetVolumeDiscountRequestResultRequest.RequestBody body=new GetVolumeDiscountRequestResultRequest.RequestBody();
		body.setNeweggItemNumber("9SIA0062TT3677");
		obj.setRequestBody(body);
		
		GetVolumeDiscountRequestResultResponse r=call.getVolumeDiscountRequestResult(obj);
		
		assertTrue("B0147001".equals(r.getResponseBody().getItemVolumeDiscountInfo().getSellerPartNumber()));
		assertTrue(r.getIsSuccess());
	}
	
	@Test
	public void testXMLGetVolumeDiscountRequestResult() {			
		VolumeDiscountCaller call=VolumeDiscountCaller.buildXML();
		GetVolumeDiscountRequestResultRequest obj=new GetVolumeDiscountRequestResultRequest();
		obj.setOperationType("GetVolumeDiscountRequest");
		GetVolumeDiscountRequestResultRequest.RequestBody body=new GetVolumeDiscountRequestResultRequest.RequestBody();
		body.setNeweggItemNumber("9SIA0062TT3677");
		obj.setRequestBody(body);
		
		GetVolumeDiscountRequestResultResponse r=call.getVolumeDiscountRequestResult(obj);
		
		assertTrue("B0147001".equals(r.getResponseBody().getItemVolumeDiscountInfo().getSellerPartNumber()));
		assertTrue(r.getIsSuccess());
	}
	
	public void testJSONSubmitVolumeDiscount(){
		VolumeDiscountCaller call=VolumeDiscountCaller.buildJSON();		
		SubmitVolumeDiscountRequest request=new SubmitVolumeDiscountRequest();
		request.setOperationType("SubmitVolumeDiscountRequest");
		SubmitVolumeDiscountRequest.RequestBody body=new SubmitVolumeDiscountRequest.RequestBody();
		ItemVolumeDiscountInfo info=new ItemVolumeDiscountInfo();
		info.setNeweggItemNumber("9SIA0062TT3677");
		info.setVolumeActivation(true);
		DiscountSetting setting=new DiscountSetting();
		Tier t1=new Tier();
		t1.setEnableFreeShipping(0);
		t1.setPriority(1);
		t1.setQuantity(10);
		t1.setSellingPrice(new BigDecimal("0.98"));
		Tier t2=new Tier();
		t2.setEnableFreeShipping(0);
		t2.setPriority(2);
		t2.setQuantity(100);
		t2.setSellingPrice(new BigDecimal("0.90"));
		setting.getTier().add(t1);
		setting.getTier().add(t2);
		info.setDiscountSetting(setting);
		body.setItemVolumeDiscountInfo(info);
		request.setRequestBody(body);

		SubmitVolumeDiscountResponse r=call.submitVolumeDiscount(request);		
		assertFalse(r.isIsSuccess());
	}
	
	@Test
	public void testXMLSubmitVolumeDiscount(){
		VolumeDiscountCaller call=VolumeDiscountCaller.buildXML();		
		SubmitVolumeDiscountRequest request=new SubmitVolumeDiscountRequest();
		request.setOperationType("SubmitVolumeDiscountRequest");
		SubmitVolumeDiscountRequest.RequestBody body=new SubmitVolumeDiscountRequest.RequestBody();
		ItemVolumeDiscountInfo info=new ItemVolumeDiscountInfo();
		info.setNeweggItemNumber("9SIA0062TT3677");
		info.setVolumeActivation(true);
		DiscountSetting setting=new DiscountSetting();
		Tier t1=new Tier();
		t1.setEnableFreeShipping(0);
		t1.setPriority(1);
		t1.setQuantity(10);
		t1.setSellingPrice(new BigDecimal("0.98"));
		Tier t2=new Tier();
		t2.setEnableFreeShipping(0);
		t2.setPriority(2);
		t2.setQuantity(100);
		t2.setSellingPrice(new BigDecimal("0.90"));
		setting.getTier().add(t1);
		setting.getTier().add(t2);
		info.setDiscountSetting(setting);
		body.setItemVolumeDiscountInfo(info);
		request.setRequestBody(body);

		SubmitVolumeDiscountResponse r=call.submitVolumeDiscount(request);		
		assertTrue(r.isIsSuccess());
		assertTrue(r.getResponseBody().getItemVolumeDiscountInfo().getDiscountSetting().getTier().size()==2);
	}
	
	@Test
	public void testMockGetVolumeDiscountRequestResult() {			
		Variables.SimulationEnabled=true;
		VolumeDiscountCaller call=VolumeDiscountCaller.buildJSON();
		GetVolumeDiscountRequestResultRequest obj=new GetVolumeDiscountRequestResultRequest();				
		obj.setOperationType("GetVolumeDiscountRequest");
		GetVolumeDiscountRequestResultRequest.RequestBody body=new GetVolumeDiscountRequestResultRequest.RequestBody();
		body.setNeweggItemNumber("9SIA2EU6M00666");
		obj.setRequestBody(body);		
		GetVolumeDiscountRequestResultResponse r=call.getVolumeDiscountRequestResult(obj);
		Variables.SimulationEnabled=false;
		assertTrue("B0147001".equals(r.getResponseBody().getItemVolumeDiscountInfo().getSellerPartNumber()));
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getItemVolumeDiscountInfo().getDiscountSetting().getTier().size()==2);
	}
	
	@Test
	public void testMockSubmitVolumeDiscount() {			
		Variables.SimulationEnabled=true;
		VolumeDiscountCaller call=VolumeDiscountCaller.buildXML();		
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		SubmitVolumeDiscountResponse r1=call.submitVolumeDiscount(new SubmitVolumeDiscountRequest());			
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		Variables.SimulationEnabled=false;
		assertTrue(r1.isIsSuccess());
		assertTrue("B0147001".equals(r1.getResponseBody().getItemVolumeDiscountInfo().getSellerPartNumber()));
	}

}
