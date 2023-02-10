package newegg.marketplace.sdk.datafeed.inner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.datafeed.DataFeedConfig;
import newegg.marketplace.sdk.datafeed.Variables;
import newegg.marketplace.sdk.datafeed.model.ItemPremierMarkFeedRequest;
import newegg.marketplace.sdk.datafeed.model.ItemPremierMarkFeedResponse;
import newegg.marketplace.sdk.datafeed.model.ItemPromotionFeedRequest;
import newegg.marketplace.sdk.datafeed.model.ItemPromotionFeedResponse;
import newegg.marketplace.sdk.datafeed.model.VolumeDiscountFeedRequest;
import newegg.marketplace.sdk.datafeed.model.VolumeDiscountFeedRequest.Message.VolumeDiscountList;
import newegg.marketplace.sdk.datafeed.model.VolumeDiscountFeedRequest.Message.VolumeDiscountList.ItemVolumeDiscountInfo;
import newegg.marketplace.sdk.datafeed.model.VolumeDiscountFeedRequest.Message.VolumeDiscountList.ItemVolumeDiscountInfo.DiscountSetting;
import newegg.marketplace.sdk.datafeed.model.VolumeDiscountFeedRequest.Message.VolumeDiscountList.ItemVolumeDiscountInfo.DiscountSetting.Tier;
import newegg.marketplace.sdk.datafeed.model.VolumeDiscountFeedResponse;

public class SubmitActivityCallerTest {

	private static ConfBack b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(DataFeedConfig.class);
		b = new ConfBack();
	}

	@Test
	public void testMockVolumeDiscountFeed_XML() {
		Variables.SimulationEnabled = true;
		SubmitActivityCaller call = SubmitActivityCaller.buildXML();
		VolumeDiscountFeedRequest request = new VolumeDiscountFeedRequest();
		VolumeDiscountFeedRequest.Message m = new VolumeDiscountFeedRequest.Message();
		VolumeDiscountList vl = new VolumeDiscountList();
		ItemVolumeDiscountInfo vInfo = new ItemVolumeDiscountInfo();
		vInfo.setNeweggItemNumber("9SIA0060004762");
		vInfo.setSellerPartNumber("Lisa123");
		vInfo.setVolumeActivation("True");
		DiscountSetting dis = new DiscountSetting();
		Tier t1 = new Tier();
		t1.setEnableFreeShipping(0);
		t1.setPriority(1);
		t1.setQuantity(10);
		t1.setSellingPrice(new BigDecimal("9999.99"));
		Tier t2 = new Tier();
		t2.setEnableFreeShipping(0);
		t2.setPriority(2);
		t2.setQuantity(20);
		t2.setSellingPrice(new BigDecimal("8888.99"));
		dis.getTier().add(t1);
		dis.getTier().add(t2);
		vInfo.setDiscountSetting(dis);
		vl.getItemVolumeDiscountInfo().add(vInfo);

		ItemVolumeDiscountInfo vInfo1 = new ItemVolumeDiscountInfo();
		vInfo1.setNeweggItemNumber("9SIA0060002417");
		vInfo1.setSellerPartNumber("B0369008");
		vInfo1.setVolumeActivation("False");
		vl.getItemVolumeDiscountInfo().add(vInfo1);

		m.setVolumeDiscountList(vl);
		request.setMessage(m);
		VolumeDiscountFeedResponse r = call.volumeDiscountFeed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("2291326430", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("VOLUME_DISCOUNT_DATA", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}

	@Test
	public void testMockItemPromotionFeed_XML() {
		Calendar cal = Calendar.getInstance();
		Variables.SimulationEnabled = true;
		SubmitActivityCaller call = SubmitActivityCaller.buildXML();
		ItemPromotionFeedRequest request = new ItemPromotionFeedRequest();
		ItemPromotionFeedRequest.Message m = new ItemPromotionFeedRequest.Message();
		ItemPromotionFeedRequest.Message.Item i1 = new ItemPromotionFeedRequest.Message.Item();
		i1.setInventoryLocked("No");
		i1.setLimitQty(new BigInteger("20"));
		i1.setMaxQty(new BigInteger("1000"));
		i1.setMinInventory(new BigInteger("0"));
		i1.setNeweggItemNumber("9SI600185746359");
		i1.setNote("This is a promotion for Back to School");
		cal.set(2014, Calendar.AUGUST, 1);
		i1.setPromoEndDate(cal.getTime());
		i1.setPromoMSRP(new BigDecimal("290.99"));
		i1.setPromoSellingPrice(new BigDecimal("190.99"));
		i1.setPromoShipping("Free");
		cal.set(2014, Calendar.JULY, 27);
		i1.setPromoStartDate(cal.getTime());
		i1.setSellerPartNumber("1234567");

		m.getItem().add(i1);

		ItemPromotionFeedRequest.Message.Item i2 = new ItemPromotionFeedRequest.Message.Item();
		i2.setInventoryLocked("No");
		i2.setLimitQty(new BigInteger("20"));
		i2.setMaxQty(new BigInteger("1000"));
		i2.setMinInventory(new BigInteger("0"));
		i2.setNeweggItemNumber("9SI600185746359");
		i2.setNote("");
		cal.set(2014, Calendar.AUGUST, 1);
		i2.setPromoEndDate(cal.getTime());
		i2.setPromoMSRP(new BigDecimal("290.99"));
		i2.setPromoSellingPrice(new BigDecimal("190.99"));
		i2.setPromoShipping("Free");
		cal.set(2014, Calendar.JULY, 27);
		i2.setPromoStartDate(cal.getTime());
		i2.setSellerPartNumber("1234567");
		m.getItem().add(i2);
		request.setMessage(m);
		ItemPromotionFeedResponse r = call.itemPromotionFeed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("2291326430", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ITEM_PROMOTION_DATA", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}

	@Test
	public void testMockItemPremierMarkFeed_XML() {
		Variables.SimulationEnabled = true;
		SubmitActivityCaller call = SubmitActivityCaller.buildXML();
		ItemPremierMarkFeedRequest request = new ItemPremierMarkFeedRequest();
		ItemPremierMarkFeedRequest.Message m = new ItemPremierMarkFeedRequest.Message();
		ItemPremierMarkFeedRequest.Message.Item i1 = new ItemPremierMarkFeedRequest.Message.Item();
		i1.setPremierMark("FALSE");
		i1.setSellerPartNumber("JACKETEST0921001004");
		m.getItem().add(i1);
		ItemPremierMarkFeedRequest.Message.Item i2 = new ItemPremierMarkFeedRequest.Message.Item();
		i2.setPremierMark("TRUE");
		i2.setSellerPartNumber("JACKETEST0921001003");
		m.getItem().add(i2);
		request.setMessage(m);
		ItemPremierMarkFeedResponse r = call.itemPremierMarkFeed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("2291326430", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ITEM_PREMIER_MARK_DATA", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}
}
