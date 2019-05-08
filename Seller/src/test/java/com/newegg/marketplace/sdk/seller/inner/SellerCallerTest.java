package com.newegg.marketplace.sdk.seller.inner;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.seller.SellerConfig;
import com.newegg.marketplace.sdk.seller.Variables;
import com.newegg.marketplace.sdk.seller.model.GetIndustryListResponse;
import com.newegg.marketplace.sdk.seller.model.DownloadFeedSchemaRequest;
import com.newegg.marketplace.sdk.seller.model.DownloadFeedSchemaRequest.RequestBody.GetFeedSchema;
import com.newegg.marketplace.sdk.seller.model.SellerStatusCheckResponse;

public class SellerCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(SellerConfig.class);
	}

	@Test
	public void testDownloadFeedSchema_XML(){
		SellerCaller call=SellerCaller.buildDownload(MEDIA_TYPE.XML);
		DownloadFeedSchemaRequest request=new DownloadFeedSchemaRequest();
		DownloadFeedSchemaRequest.RequestBody body=new DownloadFeedSchemaRequest.RequestBody();
		GetFeedSchema gfs=new GetFeedSchema();
		gfs.setFeedType(1);
		gfs.setIndustryCode("BA");
		body.setGetFeedSchema(gfs);
		request.setRequestBody(body);
		File f=call.downloadFeedSchema(request);
		assertTrue(f.exists());
		f.deleteOnExit();
	}
	
	@Test
	public void testDownloadFeedSchema_JSON(){
		SellerCaller call=SellerCaller.buildDownload(MEDIA_TYPE.JSON);
		DownloadFeedSchemaRequest request=new DownloadFeedSchemaRequest();
		DownloadFeedSchemaRequest.RequestBody body=new DownloadFeedSchemaRequest.RequestBody();
		GetFeedSchema gfs=new GetFeedSchema();
		gfs.setFeedType(1);
		gfs.setIndustryCode("BA");
		body.setGetFeedSchema(gfs);
		request.setRequestBody(body);
		File f=call.downloadFeedSchema(request);
		assertTrue(f.exists());
		f.deleteOnExit();
	}
	
	@Test
	public void testUSA_JSON() {
		SellerCaller call=SellerCaller.buildJSON();
		SellerStatusCheckResponse r=call.sellerStatus();		
		assertTrue(r.getIsSuccess());
		assertTrue("Test_SandBox_MKTPLS".equals(r.getResponseBody().getSellerName()));		
		GetIndustryListResponse r1=call.getIndustryList("");
		assertTrue(r1.getIsSuccess());
		assertTrue(r1.getResponseBody().getIndustryList().getIndustry().size()>0);
	}

	@Test
	public void testUSA_XML() {
		SellerCaller call=SellerCaller.buildXML();
		SellerStatusCheckResponse r=call.sellerStatus();		
		assertTrue(r.getIsSuccess());
		assertTrue("Test_SandBox_MKTPLS".equals(r.getResponseBody().getSellerName()));		
		GetIndustryListResponse r1=call.getIndustryList("");
		assertTrue(r1.getIsSuccess());
	}

	@Test
	public void testCAN_JSON() {
		Content.Platform=Content.PLATFORM.CAN;
		String Authorization=Content.Authorization;
		Content.Authorization="****************************************";
		String SecretKey=Content.SecretKey;
		Content.SecretKey="********-****-****-****-************";
		String SellerID=Content.SellerID;
		Content.SellerID="A3TV";
		SellerCaller call=SellerCaller.buildJSON();
		SellerStatusCheckResponse r=call.sellerStatus();		
		Content.Platform=Content.PLATFORM.USA;
		Content.Authorization=Authorization;
		Content.SecretKey=SecretKey;
		Content.SellerID=SellerID;
		assertTrue(r.getIsSuccess());
		assertTrue("Test_fortestonly fortest012412".equals(r.getResponseBody().getSellerName()));
	}
	
	@Test
	public void testCAN_XML() {
		Content.Platform=Content.PLATFORM.CAN;
		String Authorization=Content.Authorization;
		Content.Authorization="****************************************";
		String SecretKey=Content.SecretKey;
		Content.SecretKey="********-****-****-****-************";
		String SellerID=Content.SellerID;
		Content.SellerID="A3TV";
		SellerCaller call=SellerCaller.buildXML();
		SellerStatusCheckResponse r=call.sellerStatus();		
		Content.Platform=Content.PLATFORM.USA;
		Content.Authorization=Authorization;
		Content.SecretKey=SecretKey;
		Content.SellerID=SellerID;
		assertTrue(r.getIsSuccess());
		assertTrue("Test_fortestonly fortest012412".equals(r.getResponseBody().getSellerName()));
	}
	
	@Test
	public void testMockUSA() {
		Variables.SimulationEnabled=true;		
		SellerCaller call=SellerCaller.buildXML();
		SellerStatusCheckResponse r=call.sellerStatus();
		GetIndustryListResponse r1=call.getIndustryList("");
		Variables.SimulationEnabled=false;		
		assertTrue(r.getIsSuccess());	
		assertTrue(r1.getIsSuccess());
		
	}
	
	@Test
	public void testMockCAN() {
		Content.Platform=Content.PLATFORM.CAN;
		Variables.SimulationEnabled=true;		
		SellerCaller call=SellerCaller.buildXML();
		SellerStatusCheckResponse r=call.sellerStatus();
		GetIndustryListResponse r1=call.getIndustryList("");
		Variables.SimulationEnabled=false;
		Content.Platform=Content.PLATFORM.USA;
		assertTrue(r.getIsSuccess());	
		assertTrue(r1.getIsSuccess());
	}
	
	@Test
	public void testMockDownloadFeedSchema_XML(){
		Variables.SimulationEnabled=true;
		SellerCaller call=SellerCaller.buildDownload(MEDIA_TYPE.XML);
		DownloadFeedSchemaRequest request=new DownloadFeedSchemaRequest();
		DownloadFeedSchemaRequest.RequestBody body=new DownloadFeedSchemaRequest.RequestBody();
		GetFeedSchema gfs=new GetFeedSchema();
		gfs.setFeedType(1);
		gfs.setIndustryCode("BA");
		body.setGetFeedSchema(gfs);
		request.setRequestBody(body);
		File f=call.downloadFeedSchema(request);
		Variables.SimulationEnabled=false;
		assertTrue(f.exists());		
		f.deleteOnExit();
	}
	
	@Test
	public void testMockDownloadFeedSchema_JSON(){
		Variables.SimulationEnabled=true;
		SellerCaller call=SellerCaller.buildDownload(MEDIA_TYPE.JSON);
		DownloadFeedSchemaRequest request=new DownloadFeedSchemaRequest();
		DownloadFeedSchemaRequest.RequestBody body=new DownloadFeedSchemaRequest.RequestBody();
		GetFeedSchema gfs=new GetFeedSchema();
		gfs.setFeedType(1);
		gfs.setIndustryCode("BA");
		body.setGetFeedSchema(gfs);
		request.setRequestBody(body);
		File f=call.downloadFeedSchema(request);
		Variables.SimulationEnabled=false;
		assertTrue(f.exists());
		f.deleteOnExit();
	}
}
