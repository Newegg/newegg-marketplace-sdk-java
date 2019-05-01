package com.newegg.marketplace.sdk.datafeed.inner;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.datafeed.DataFeedConfig;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.AddingCAProp65;
import com.newegg.marketplace.sdk.datafeed.model.ItemChinaTaxSetting;
import com.newegg.marketplace.sdk.datafeed.model.ItemChinaTaxSetting.Message.ChinaTaxSetting;
import com.newegg.marketplace.sdk.datafeed.model.ItemSubscription;
import com.newegg.marketplace.sdk.datafeed.model.SubmitFeedResponse;

public class SubmitOtherCallerTest {

	private static ConfBack b;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(DataFeedConfig.class);
		b=new ConfBack();
	}

	@Test
	public void testMockItemChinaTaxSettingFeed_XML() {
		Variables.SimulationEnabled=true;
		SubmitOtherCaller call=SubmitOtherCaller.buildXML();
		ItemChinaTaxSetting request=new ItemChinaTaxSetting();
		ItemChinaTaxSetting.Message m=new ItemChinaTaxSetting.Message();
		ChinaTaxSetting cts=new ChinaTaxSetting();
		ItemChinaTaxSetting.Message.ChinaTaxSetting.Item i=new ItemChinaTaxSetting.Message.ChinaTaxSetting.Item();
		i.setImportType("EEP");
		i.setNeweggItemNumber("9SIAWE50008504");
		i.setSellerPartNumber("a006-test-001");
		i.setTaxDutyType("Default");
		cts.getItem().add(i);
		m.getChinaTaxSetting().add(cts);
		request.setMessage(m);		
		SubmitFeedResponse r=call.itemChinaTaxSettingFeed(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());		
		assertEquals("2291326430",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ITEM_CHINATAXSETTING_DATA",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}
	
	@Test
	public void testMockItemCAProp65Feed_XML() {
		Variables.SimulationEnabled=true;
		SubmitOtherCaller call=SubmitOtherCaller.buildXML();
		AddingCAProp65 request=new AddingCAProp65();
		AddingCAProp65.Message m=new AddingCAProp65.Message();
		AddingCAProp65.Message.Itemfeed is=new AddingCAProp65.Message.Itemfeed();
		AddingCAProp65.Message.Itemfeed.Item i=new AddingCAProp65.Message.Itemfeed.Item();
		i.setChemicalNameBoth("Acetaldehyde, Acetamide");
		i.setChemicalNameCarcinogen("");
		i.setChemicalNameReproductiveToxicant("");
		i.setNeweggItemNumber("9SIAWE50008504");
		i.setSellerPartNumber("a006-test-001");
		i.setWarningTypeID("103");
		is.getItem().add(i);
		m.getItemfeed().add(is);
		request.setMessage(m);
		SubmitFeedResponse r=call.itemCAProp65Feed(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());		
		assertEquals("2291326430",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ITEM_CAPROP65_DATA",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}
	
	@Test
	public void testMockItemSubscriptionFeed_XML() {
		Variables.SimulationEnabled=true;
		SubmitOtherCaller call=SubmitOtherCaller.buildXML();
		ItemSubscription request=new ItemSubscription();
		ItemSubscription.Message m=new ItemSubscription.Message();
		ItemSubscription.Message.Item i1=new ItemSubscription.Message.Item();
		i1.setSellerPartNumber("JACKETEST0921001004");
		i1.setAction("Add");
		m.getItem().add(i1);
		ItemSubscription.Message.Item i2=new ItemSubscription.Message.Item();
		i2.setSellerPartNumber("JACKETEST0921001003");
		i2.setAction("Remove");
		m.getItem().add(i2);
		request.setMessage(m);		
		SubmitFeedResponse r=call.itemSubscriptionFeed(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());		
		assertEquals("2291326430",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ITEM_SUBSCRIPTION",r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}
}
