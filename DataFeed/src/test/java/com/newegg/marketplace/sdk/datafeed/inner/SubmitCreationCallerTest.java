package com.newegg.marketplace.sdk.datafeed.inner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.datafeed.DataFeedConfig;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.ExistingItemCreationFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ExistingItemCreationFeedRequest.Message.Itemfeed.Item.BasicInfo.UsedItemImages;
import com.newegg.marketplace.sdk.datafeed.model.ExistingItemCreationFeedRequest.Message.Itemfeed.SummaryInfo;
import com.newegg.marketplace.sdk.datafeed.model.ExistingItemCreationFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemBasicInformationFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemBasicInformationFeedRequest.Message.Itemfeed.Item.BasicInfo.ItemDimension;
import com.newegg.marketplace.sdk.datafeed.model.ItemBasicInformationFeedRequest.Message.Itemfeed.Item.BasicInfo.ItemImages;
import com.newegg.marketplace.sdk.datafeed.model.ItemBasicInformationFeedRequest.Message.Itemfeed.Item.BasicInfo.Warning;
import com.newegg.marketplace.sdk.datafeed.model.ItemBasicInformationFeedRequest.Message.Itemfeed.Item.BasicInfo.Warning.ChokingHazard;
import com.newegg.marketplace.sdk.datafeed.model.ItemBasicInformationFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemCreationOrUpdateFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.SubCategoryProperty;
import com.newegg.marketplace.sdk.datafeed.model.ItemCreationOrUpdateFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.sub.Propertys;

public class SubmitCreationCallerTest {

	private static ConfBack b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(DataFeedConfig.class);
		b = new ConfBack();
	}

	@Test
	public void testMockItemBasicInformationFeed_XML() {
		Variables.SimulationEnabled = true;
		SubmitCreationCaller call = SubmitCreationCaller.buildXML();
		ItemBasicInformationFeedRequest request = new ItemBasicInformationFeedRequest();

		ItemBasicInformationFeedRequest.Message m = new ItemBasicInformationFeedRequest.Message();
		ItemBasicInformationFeedRequest.Message.Itemfeed ifeed = new ItemBasicInformationFeedRequest.Message.Itemfeed();
		ItemBasicInformationFeedRequest.Message.Itemfeed.Item i1 = new ItemBasicInformationFeedRequest.Message.Itemfeed.Item();
		i1.setAction("Update Item");
		ItemBasicInformationFeedRequest.Message.Itemfeed.Item.BasicInfo bi = new ItemBasicInformationFeedRequest.Message.Itemfeed.Item.BasicInfo();
		bi.setSellerPartNumber("A006Leon_Test_001");
		bi.setWebsiteShortTitle("Test for Leon");
		bi.setProductDescription("Test for Leon");
		ItemDimension idim = new ItemDimension();
		idim.setItemLength(new BigDecimal("2.0"));
		idim.setItemWidth(new BigDecimal("2.0"));
		idim.setItemHeight(new BigDecimal("2.0"));
		bi.setItemDimension(idim);
		bi.setItemWeight(new BigDecimal("2.0"));
		bi.setActivationMark("False");
		ItemImages igs = new ItemImages();
		ItemBasicInformationFeedRequest.Message.Itemfeed.Item.BasicInfo.ItemImages.Image img = new ItemBasicInformationFeedRequest.Message.Itemfeed.Item.BasicInfo.ItemImages.Image();
		img.setImageUrl("url");
		img.setIsPrimary(true);
		igs.getImage().add(img);
		bi.setItemImages(igs);
		bi.setBulletDescription("Test_BulletDescript01^^Test_BulletDescript02^^Test_BulletDescript03");
		Warning w = new Warning();
		w.setProp65("No");
		w.setProp65Motherboard("Yes");
		w.setCountryOfOrigin("USA");
		w.setOverAge18Verification("No");
		ChokingHazard ch = new ChokingHazard();
		ch.setBalloons("Yes");
		ch.setMarble("Contains a marble");
		ch.setSmallBall("Is a small ball");
		ch.setSmallParts("Yes");
		w.setChokingHazard(ch);
		bi.setWarning(w);
		i1.setBasicInfo(bi);
		ifeed.getItem().add(i1);
		m.getItemfeed().add(ifeed);
		request.setMessage(m);
		ItemBasicInformationFeedResponse r = call.itemBasicInformationFeed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("21F8WK59NLRHD", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ITEM_DATA", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}

	@Test
	public void testMockExistingItemCreationFeed_XML() {
		Variables.SimulationEnabled = true;
		SubmitCreationCaller call = SubmitCreationCaller.buildXML();
		ExistingItemCreationFeedRequest request = new ExistingItemCreationFeedRequest();
		ExistingItemCreationFeedRequest.Message m = new ExistingItemCreationFeedRequest.Message();
		ExistingItemCreationFeedRequest.Message.Itemfeed iFeed = new ExistingItemCreationFeedRequest.Message.Itemfeed();
		iFeed.setSummaryInfo(new SummaryInfo());
		ExistingItemCreationFeedRequest.Message.Itemfeed.Item i1 = new ExistingItemCreationFeedRequest.Message.Itemfeed.Item();
		ExistingItemCreationFeedRequest.Message.Itemfeed.Item.BasicInfo bi = new ExistingItemCreationFeedRequest.Message.Itemfeed.Item.BasicInfo();
		bi.setSellerPartNumber("a006-test-008");
		bi.setManufacturer("Newegg");
		bi.setManufacturerPartsNumber("manu-008");
		bi.setUPCOrISBN("123456789012");
		bi.setNeweggItemNumber("9SIAWE50389435");
		bi.setMSRP(new BigDecimal("99.99"));
		bi.setMAP(new BigDecimal("5.00"));
		bi.setCheckoutMAP("True");
		bi.setSellingPrice(new BigDecimal("9.99"));
		bi.setShipping("Default");
		bi.setInventory(99);
		bi.setItemCondition("UsedGood");
		bi.setPacksOrSets(1);
		bi.setActivationMark("True");
		bi.setConditionDetails("Works fine, almost like new, missing original plastics cover");
		UsedItemImages ui = new UsedItemImages();
		ExistingItemCreationFeedRequest.Message.Itemfeed.Item.BasicInfo.UsedItemImages.Image ig = new ExistingItemCreationFeedRequest.Message.Itemfeed.Item.BasicInfo.UsedItemImages.Image();
		ig.setImageUrl("http://10.1.24.143:4567/images/Used.gif");
		ui.getImage().add(ig);
		bi.setUsedItemImages(ui);
		i1.setBasicInfo(bi);
		iFeed.getItem().add(i1);
		m.getItemfeed().add(iFeed);
		request.setMessage(m);
		ExistingItemCreationFeedResponse r = call.existingItemCreationFeed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("2329HCY1YGR11", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ITEM_DATA", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());
	}

	@Test
	public void testMockItemCreationFeed_XML() {
		Variables.SimulationEnabled = true;
		SubmitCreationCaller call = SubmitCreationCaller.buildXML();
		ItemCreationOrUpdateFeedRequest request = new ItemCreationOrUpdateFeedRequest();
		ItemCreationOrUpdateFeedRequest.Message m = new ItemCreationOrUpdateFeedRequest.Message();
		ItemCreationOrUpdateFeedRequest.Message.Itemfeed ifeed = new ItemCreationOrUpdateFeedRequest.Message.Itemfeed();
		ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item i = new ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item();
		SubCategoryProperty sub = new SubCategoryProperty();

		/*
		 * Microphone obj=new Microphone(); GroupHeadsetColor g=new GroupHeadsetColor(); g.setValue(GroupHeadsetColorValueList.BLACK); obj.setGroupHeadsetColor(g);
		 */

		/*
		 * MIAcousticGuitars mi=new MIAcousticGuitars(); MIAcousticGuitars.GlobalElectricalOutletPlugType geopt=new MIAcousticGuitars.GlobalElectricalOutletPlugType(); geopt.setValue(GlobalElectricalOutletPlugTypeValueList.PLUG_TYPE_G_IRELAND_UK_SINGAPORE); geopt.setPropertyType("String"); mi.setGlobalElectricalOutletPlugType(geopt);
		 */

		Propertys p = new Propertys();
		p.addEntry("BeltsColor", "Coyote Tan");
		p.addEntry("BeltsGender", "Male");
		p.addEntry("BeltsSize", "56");
		p.addEntry("BeltsType", "Belts");

		sub.setAny(p);
		i.setSubCategoryProperty(sub);
		i.setAction("Create Item");
		ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo binfo = new ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo();
		binfo.setSellerPartNumber("JACKETEST0921001002");
		binfo.setManufacturer("AMD");
		binfo.setManufacturerPartsNumber("JACKETEST0921001002");
		binfo.setUPCOrISBN("");
		binfo.setRelatedSellerPartNumber("");
		binfo.setWebsiteShortTitle("Sick1111111");
		binfo.setProductDescription("hello222222");
		ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo.ItemDimension idm = new ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo.ItemDimension();
		idm.setItemLength(new BigDecimal("4"));
		idm.setItemWidth(new BigDecimal("5"));
		idm.setItemHeight(new BigDecimal("6"));
		binfo.setItemDimension(idm);
		binfo.setItemWeight(new BigDecimal("3"));
		binfo.setPacksOrSets(1);
		binfo.setItemCondition("New");
		binfo.setItemPackage("OEM");
		binfo.setShippingRestriction("Yes");
		binfo.setCurrency("USD");
		binfo.setMSRP(new BigDecimal("500"));
		binfo.setSellingPrice(new BigDecimal("100"));
		binfo.setShipping("Free");
		binfo.setInventory(100);
		binfo.setActivationMark("True");
		ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo.ItemImages images = new ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo.ItemImages();
		ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo.ItemImages.Image ig = new ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo.ItemImages.Image();
		ig.setImageUrl("http://10.1.24.143:4567/images/20.gif");
		images.getImage().add(ig);
		binfo.setItemImages(images);
		ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo.Warning w = new ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo.Warning();
		w.setProp65("No");
		w.setProp65Motherboard("Yes");
		w.setOverAge18Verification("Yes");
		ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo.Warning.ChokingHazard c = new ItemCreationOrUpdateFeedRequest.Message.Itemfeed.Item.BasicInfo.Warning.ChokingHazard();
		c.setSmallParts("Yes");
		c.setSmallBall("Is a small ball");
		c.setBalloons("Yes");
		c.setMarble("Is a marble");
		w.setChokingHazard(c);
		binfo.setWarning(w);
		i.setBasicInfo(binfo);
		ifeed.getItem().add(i);
		ItemCreationOrUpdateFeedRequest.Message.Itemfeed.SummaryInfo sum = new ItemCreationOrUpdateFeedRequest.Message.Itemfeed.SummaryInfo();
		sum.setSubCategoryID("13905");
		ifeed.setSummaryInfo(sum);
		m.getItemfeed().add(ifeed);
		request.setMessage(m);
		ItemCreationOrUpdateFeedResponse r = call.itemCreationFeed(request);
		Variables.SimulationEnabled = false;
		assertTrue(r.getIsSuccess());
		assertEquals("22SL4Q1I1XS9B", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
		assertEquals("ITEM_DATA", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestType());

	}
}
