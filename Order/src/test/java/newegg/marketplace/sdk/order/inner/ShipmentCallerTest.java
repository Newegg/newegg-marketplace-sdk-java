package newegg.marketplace.sdk.order.inner;

import static org.junit.Assert.assertTrue;

import javax.xml.bind.JAXBException;

import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.common.Content.PLATFORM;
import newegg.marketplace.sdk.common.NeweggException;
import newegg.marketplace.sdk.order.OrderConfig;
import newegg.marketplace.sdk.order.RequireSetting;
import newegg.marketplace.sdk.order.SerializationObjectParser;
import newegg.marketplace.sdk.order.Variables;
import newegg.marketplace.sdk.order.model.ShipOrderRequest;
import newegg.marketplace.sdk.order.model.ShipOrderRequestJSON;
import newegg.marketplace.sdk.order.model.ShipOrderResponse;
import newegg.marketplace.sdk.order.model.ShipmentRequest;

public class ShipmentCallerTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OrderConfig.class);
	}
	
	private StringBuffer DummyRequestData_XML() {
		StringBuffer cdata = null;
		
		ShipmentRequest request = new ShipmentRequest();
		ShipmentRequest.Header header = new ShipmentRequest.Header();
		header.setSellerID("A006");
		header.setSONumber(159243598);
		request.setHeader(header);
		ShipmentRequest.PackageList packageList = new ShipmentRequest.PackageList();
		ShipmentRequest.PackageList.Package packages = new ShipmentRequest.PackageList.Package();
		ShipmentRequest.PackageList.Package.ItemList itemList = new ShipmentRequest.PackageList.Package.ItemList();
		ShipmentRequest.PackageList.Package.ItemList.Item item = new ShipmentRequest.PackageList.Package.ItemList.Item();
		packages.setTrackingNumber("lztestA0060001");
		packages.setShipCarrier("Other Carrier");
		packages.setShipService("Other Service");
		packageList.getPackage().add(packages);
		item.setSellerPartNumber("A006ZX-35833");
		item.setShippedQty(1);
		itemList.getItem().add(item);
		packages.setItemList(itemList);
		request.setPackageList(packageList);
		
		// put the request into updateOrderStatus structure
		SerializationObjectParser requestObj = new SerializationObjectParser();
		try {
			cdata = requestObj.xmlObjectToString(request);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return cdata;
	}
	
	private ShipOrderRequestJSON DummyRequestDataJSON() {
		ShipOrderRequestJSON newRequestObj = new ShipOrderRequestJSON();
		
		newRequestObj.setAction(2);
		
		ShipOrderRequestJSON.Value.Shipment.PackageList.Package.ItemList[] itmList = 
				new ShipOrderRequestJSON.Value.Shipment.PackageList.Package.ItemList[2];
		itmList[0] = new ShipOrderRequestJSON.Value.Shipment.PackageList.Package.ItemList();
		itmList[1] = new ShipOrderRequestJSON.Value.Shipment.PackageList.Package.ItemList();
		
		ShipOrderRequestJSON.Value.Shipment.PackageList.Package.ItemList.Item[] rowItem = 
				new ShipOrderRequestJSON.Value.Shipment.PackageList.Package.ItemList.Item[3];
		rowItem[0] = new ShipOrderRequestJSON.Value.Shipment.PackageList.Package.ItemList.Item();
		rowItem[1] = new ShipOrderRequestJSON.Value.Shipment.PackageList.Package.ItemList.Item();
		rowItem[2] = new ShipOrderRequestJSON.Value.Shipment.PackageList.Package.ItemList.Item();	
		
		rowItem[0].setSellerPartNumber("A3WG11002378965412586");
		rowItem[0].setShippedQty(1);
		rowItem[1].setSellerPartNumber("A3WG11002378965412583");
		rowItem[1].setShippedQty(1);
		rowItem[2].setSellerPartNumber("A3WG11002378965412584");
		rowItem[2].setShippedQty(1);
		itmList[0].getItem().add(rowItem[0]);
		itmList[1].getItem().add(rowItem[1]);
		itmList[1].getItem().add(rowItem[2]);
		
		ShipOrderRequestJSON.Value.Shipment.PackageList.Package[] pkg = 
				new ShipOrderRequestJSON.Value.Shipment.PackageList.Package[2];
		pkg[0] = new ShipOrderRequestJSON.Value.Shipment.PackageList.Package();
		pkg[1] = new ShipOrderRequestJSON.Value.Shipment.PackageList.Package();
		
		pkg[0].setTrackingNumber("alistestonly1");
		pkg[0].setShipCarrier("Purolator");
		pkg[0].setShipService("3-5");
		pkg[0].setItemList(itmList[0]);
		pkg[1].setTrackingNumber("alistestonly2");
		pkg[1].setShipCarrier("Purolator");
		pkg[1].setShipService("3-5");
		pkg[1].setItemList(itmList[1]);
		
		ShipOrderRequestJSON.Value.Shipment.PackageList pkgList = new ShipOrderRequestJSON.Value.Shipment.PackageList();
		pkgList.getPackage().add(pkg[0]);
		pkgList.getPackage().add(pkg[1]);
		
		ShipOrderRequestJSON.Value.Shipment ship = new ShipOrderRequestJSON.Value.Shipment();
		ship.setPackageList(pkgList);
		
		ShipOrderRequestJSON.Value.Shipment.Header header = new ShipOrderRequestJSON.Value.Shipment.Header();
		header.setSellerID("A006");
		header.setSONumber(159243598);
		ship.setHeader(header);
		
		ShipOrderRequestJSON.Value values = new ShipOrderRequestJSON.Value();
		values.setShipment(ship);
		newRequestObj.setValue(values);
		
		return newRequestObj;
	}
	
	private ShipOrderRequest buildShipOrderRequest(PLATFORM p, String metadata) {
		ShipOrderRequest request = null;
		SerializationObjectParser sop = new SerializationObjectParser();
		
		try {
			request = sop.reBuildRequestXML();
			
			switch (p) {
			case USA:
				request.setAction(2);
				request.setValueElement(metadata);
				break;
				
			case CAN:
				request.setAction(2);
				request.setValueElement(metadata);
				break;
				
			case USB:
				request.setAction(2);
				request.setValueElement(metadata);
				break;
				
			default:
				break;
			}
			
			RequireSetting.log.info(sop.xmlObjectToString(request));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return request;
	}
	
	private void sendShipOrder(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm,String orderNumber) {
		ShipOrderResponse response = null;
		ShipOrderRequest request = null;
		ShipmentCaller sender = null;
		StringBuffer metadata = null;
		ShipOrderRequestJSON JSONRequestObj = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		// only USA
		try {
			Content.Platform = flatofrm;
			RequireSetting.log.info(RequireSetting.getTestInfo());
			
			if (type == MEDIA_TYPE.XML) {
				metadata = DummyRequestData_XML();
				request = buildShipOrderRequest(flatofrm, metadata.toString());
				sender = ShipmentCaller.buildXML();
				response = sender.sendShipmentRequest((ShipOrderRequest)request,orderNumber,null);
			} else {
				JSONRequestObj = DummyRequestDataJSON();
				sender = ShipmentCaller.buildJSON();
				response = sender.sendShipmentRequest(JSONRequestObj,orderNumber,null);
			}
			
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
		
	}
	
	@Test
	public void testSendShipmentRequest_XML() {
		/*StringBuffer cdata;
		
		cdata = DummyRequestData_XML();
		ShipmentCaller caller = ShipmentCaller.buildXML();
		SerializationObjectParser sop = new SerializationObjectParser();
		ShipOrderWrapper newRequest = null;
		
		try {
			newRequest = sop.reBuildRequestXML();
			newRequest.setAction(2);
			newRequest.setValueElement(cdata.toString());
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
		
		ShipmentResponse response = caller.sendShipmentRequest((ShipOrderWrapper)newRequest);
		
		assertTrue("true".equals(response.getIsSuccess()));*/
		
		
		RequireSetting.authKeySetting("A006");
		sendShipOrder(false, MEDIA_TYPE.XML, PLATFORM.USA,"159243598");
	}
	
	
	
	@Test
	public void testSendShipmentRequest_JSON() {
		// put the request into updateOrderStatus structure
		/*ShipmentCaller caller = ShipmentCaller.buildJSON();
		ShipOrderRequest newRequestObj = DummyRequestDataJSON();
		ShipmentResponse response = caller.sendShipmentRequest(newRequestObj);
		assertTrue("true".equals(response.getIsSuccess()));*/
		
		RequireSetting.authKeySetting("A006");
		sendShipOrder(false, MEDIA_TYPE.JSON, PLATFORM.USA,"159243598");
	}
	
	@Test
	public void testSendShipmentRequest_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		sendShipOrder(true, MEDIA_TYPE.XML, PLATFORM.USA,"159243598");
	}
	
	@Test
	public void testSendShipmentRequest_JSON_MOCK() {
		
	}

}
