package newegg.marketplace.sdk.datafeed.inner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.datafeed.DataFeedConfig;
import newegg.marketplace.sdk.datafeed.Variables;
import newegg.marketplace.sdk.datafeed.model.ItemCAProp65FeedRequest;
import newegg.marketplace.sdk.datafeed.model.ItemCAProp65FeedResponse;
import newegg.marketplace.sdk.datafeed.model.ItemChinaTaxSettingFeedRequest;
import newegg.marketplace.sdk.datafeed.model.ItemChinaTaxSettingFeedRequest.Message.ChinaTaxSetting;
import newegg.marketplace.sdk.datafeed.model.ItemChinaTaxSettingFeedResponse;
import newegg.marketplace.sdk.datafeed.model.ItemSubscriptionFeedRequest;
import newegg.marketplace.sdk.datafeed.model.ItemSubscriptionFeedResponse;

public class SubmitOtherCallerTest {

	private static ConfBack b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(DataFeedConfig.class);
		b = new ConfBack();
	}

	@Test
	public void testMockItemChinaTaxSettingFeed_XML() {
		Variables.SimulationEnabled = true;
		SubmitOtherCaller call = SubmitOtherCaller.buildXML();
		ItemChinaTaxSettingFeedRequest request = new ItemChinaTaxSettingFeedRequest();
		ItemChinaTaxSettingFeedRequest.Message m = new ItemChinaTaxSettingFeedRequest.Message();
		ChinaTaxSetting cts = new ChinaTaxSetting();
		ItemChinaTaxSettingFeedRequest.Message.ChinaTaxSetting.Item i = new ItemChinaTaxSettingFeedRequest.Message.ChinaTaxSetting.Item();
		i.setImportType("EEP");
		i.setNeweggItemNumber("9SIAWE50008504");
		i.setSellerPartNumber("a006-test-001");
		i.setTaxDutyType("Default");
		cts.getItem().add(i);
		m.getChinaTaxSetting().add(cts);
		request.setMessage(m);
		ItemChinaTaxSettingFeedResponse r = call.itemChinaTaxSettingFeed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("2291326430", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ITEM_CHINATAXSETTING_DATA", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}

	@Test
	public void testMockItemCAProp65Feed_XML() {
		Variables.SimulationEnabled = true;
		SubmitOtherCaller call = SubmitOtherCaller.buildXML();
		ItemCAProp65FeedRequest request = new ItemCAProp65FeedRequest();
		ItemCAProp65FeedRequest.Message m = new ItemCAProp65FeedRequest.Message();
		ItemCAProp65FeedRequest.Message.Itemfeed is = new ItemCAProp65FeedRequest.Message.Itemfeed();
		ItemCAProp65FeedRequest.Message.Itemfeed.Item i = new ItemCAProp65FeedRequest.Message.Itemfeed.Item();
		i.setChemicalNameBoth("Acetaldehyde, Acetamide");
		i.setChemicalNameCarcinogen("");
		i.setChemicalNameReproductiveToxicant("");
		i.setNeweggItemNumber("9SIAWE50008504");
		i.setSellerPartNumber("a006-test-001");
		i.setWarningTypeID("103");
		is.getItem().add(i);
		m.getItemfeed().add(is);
		request.setMessage(m);
		ItemCAProp65FeedResponse r = call.itemCAProp65Feed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("2291326430", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ITEM_CAPROP65_DATA", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}

	@Test
	public void testMockItemSubscriptionFeed_XML() {
		Variables.SimulationEnabled = true;
		SubmitOtherCaller call = SubmitOtherCaller.buildXML();
		ItemSubscriptionFeedRequest request = new ItemSubscriptionFeedRequest();
		ItemSubscriptionFeedRequest.Message m = new ItemSubscriptionFeedRequest.Message();
		ItemSubscriptionFeedRequest.Message.Item i1 = new ItemSubscriptionFeedRequest.Message.Item();
		i1.setSellerPartNumber("JACKETEST0921001004");
		i1.setAction("Add");
		m.getItem().add(i1);
		ItemSubscriptionFeedRequest.Message.Item i2 = new ItemSubscriptionFeedRequest.Message.Item();
		i2.setSellerPartNumber("JACKETEST0921001003");
		i2.setAction("Remove");
		m.getItem().add(i2);
		request.setMessage(m);
		ItemSubscriptionFeedResponse r = call.itemSubscriptionFeed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("2291326430", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ITEM_SUBSCRIPTION", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}
}
