package com.newegg.marketplace.sdk.item;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.newegg.marketplace.sdk.item.ItemCall;
import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.common.Errors;
import com.newegg.marketplace.sdk.common.NeweggException;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.item.ItemConfig;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequestV2;
import com.newegg.marketplace.sdk.item.model.GetVolumeDiscountRequest;
import com.newegg.marketplace.sdk.item.model.GetVolumeDiscountResponse;
import com.newegg.marketplace.sdk.item.model.SubmitVolumeDiscountRequest;
import com.newegg.marketplace.sdk.item.model.SubmitVolumeDiscountRequest.RequestBody.ItemVolumeDiscountInfo;
import com.newegg.marketplace.sdk.item.model.SubmitVolumeDiscountRequest.RequestBody.ItemVolumeDiscountInfo.DiscountSetting;
import com.newegg.marketplace.sdk.item.model.SubmitVolumeDiscountRequest.RequestBody.ItemVolumeDiscountInfo.DiscountSetting.Tier;


import com.newegg.marketplace.sdk.item.model.SubmitVolumeDiscountResponse;


public class ItemCallTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		APIConfig.load(ItemConfig.class);	
	}
	
	@Test
	public void testRetry() throws feign.RetryableException {	
		String tmp=Content.HostURL;
		Content.HostURL="https://xxx.newegg.xbh/marketplace";
		ItemCall call=new ItemCall();
		Content.HostURL=tmp;
		GetVolumeDiscountRequest obj=new GetVolumeDiscountRequest();
		obj.setOperationType("GetVolumeDiscountRequest");
		GetVolumeDiscountRequest.RequestBody body=new GetVolumeDiscountRequest.RequestBody();
		body.setNeweggItemNumber("9SIA0062TT3677");
		obj.setRequestBody(body);	
		thrown.expect(feign.RetryableException.class);
		call.getVolumeDiscountRequestResult(obj);		
		
	}
	
	@Test
	public void testGetVolumeDiscount() {
		ItemCall call=new ItemCall();
		GetVolumeDiscountRequest request=new GetVolumeDiscountRequest();
		request.setOperationType("GetVolumeDiscountRequest");
		GetVolumeDiscountRequest.RequestBody body=new GetVolumeDiscountRequest.RequestBody();
		body.setNeweggItemNumber("9SIA0062TT3677");
		request.setRequestBody(body);		
		GetVolumeDiscountResponse r=call.getVolumeDiscountRequestResult(request);				
		assertTrue("Group-By test Item A".equals(r.getResponseBody().getItemVolumeDiscountInfo().getSellerPartNumber()));
		assertTrue(r.getIsSuccess());
	}

	
	@Test
	public void testSubmitVolumeDiscount() {
		ItemCall call=new ItemCall();		
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
	}
	
	@Test
	public void testNoneUSAManufacturerLookupForInternationalCountry(){
		boolean assertFlag=false;
		Content.PLATFORM tmp=Content.Platform;		
		Content.Platform=Content.PLATFORM.CAN;
		ItemCall call=new ItemCall();
		GetManufacturerRequestV2 request=new GetManufacturerRequestV2();
		//thrown.expect(PlatformException.class);
		try {
			call.ManufacturerLookupForInternationalCountry(request);
		}catch(PlatformException ex) {
			assertFlag=true;
		}
		Content.Platform=tmp;	
		assertTrue(assertFlag);
	}
	
	/*@Test
	public void testErrorResponse_JSON() {
		ItemCall call=new ItemCall(MEDIA_TYPE.JSON);
		GetVolumeDiscountRequest request=new GetVolumeDiscountRequest();
		request.setOperationType("GetVolumeDiscountRequest");
		GetVolumeDiscountRequest.RequestBody body=new GetVolumeDiscountRequest.RequestBody();
		body.setNeweggItemNumber("9SIA0677");//9SIA0062TT3677
		request.setRequestBody(body);
		boolean assertFlag=false;
		try {
		GetVolumeDiscountResponse r=call.getVolumeDiscount(request);		
		}catch(NeweggException e) {
			Errors err=e.genErors();
			err.getError().forEach( o ->{
					System.out.println(o.getCode()+" "+o.getMessage());
				});
			assertFlag=err.getError().size()>0? true:false;
		}
		assertTrue(assertFlag);
	}*/
	
	@Test
	public void testErrorResponse_XML() {
		ItemCall call=new ItemCall();
		GetVolumeDiscountRequest request=new GetVolumeDiscountRequest();
		request.setOperationType("GetVolumeDiscountRequest");
		GetVolumeDiscountRequest.RequestBody body=new GetVolumeDiscountRequest.RequestBody();
		body.setNeweggItemNumber("9SIA0677");
		request.setRequestBody(body);
		boolean assertFlag=false;
		try {
		GetVolumeDiscountResponse r=call.getVolumeDiscountRequestResult(request);		
		}catch(NeweggException e) {
			Errors err=e.genErors();
			err.getError().forEach( o ->{
					System.out.println(o.getCode()+" "+o.getMessage());
				});
			assertFlag=err.getError().size()>0? true:false;
		}
		assertTrue(assertFlag);
	}
}
