package newegg.marketplace.sdk.shipping.inner;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.shipping.ShipConfig;
import newegg.marketplace.sdk.shipping.Variables;
import newegg.marketplace.sdk.shipping.model.GetPackageListRequest;
import newegg.marketplace.sdk.shipping.model.GetPackageListResponse;
import newegg.marketplace.sdk.shipping.model.GetShippingLabelRequest;
import newegg.marketplace.sdk.shipping.model.GetShippinLabelResponse;

public class ShipOTCallerTest {

	private static ConfBack b;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ShipConfig.class);
		b=new ConfBack();
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
	public void testGetPackageLis_XML() {
		Content.SellerID="A2EU";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOTCaller call=ShipOTCaller.buildXML();
		GetPackageListRequest request=new GetPackageListRequest();
		GetPackageListRequest.RequestBody body=new GetPackageListRequest.RequestBody();
		body.setRequestID("282Q5AUAMQKIE");;
		request.setRequestBody(body);
		GetPackageListResponse r=call.getPackageLis(request);
		b.restore();
		assertTrue(r.getIsSuccess());
		assertEquals("252426189",r.getResponseBody().getOrderNumber());
		assertTrue(r.getResponseBody().getRequestList().getRequest().size()>0);		
	}
	
	@Test
	public void testGetPackageLis_JSON() {
		Content.SellerID="A2EU";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOTCaller call=ShipOTCaller.buildJSON();
		GetPackageListRequest request=new GetPackageListRequest();
		GetPackageListRequest.RequestBody body=new GetPackageListRequest.RequestBody();
		body.setRequestID("282Q5AUAMQKIE");;
		request.setRequestBody(body);
		GetPackageListResponse r=call.getPackageLis(request);
		b.restore();
		assertTrue(r.getIsSuccess());
		assertEquals("252426189",r.getResponseBody().getOrderNumber());
	}

	@Test
	public void testGetShippingLabel_XML() {
		Content.SellerID="A2EU";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOTCaller call=ShipOTCaller.buildXML();
		GetShippingLabelRequest request=new GetShippingLabelRequest();
		GetShippingLabelRequest.RequestBody body=new GetShippingLabelRequest.RequestBody();
		body.setRequestID("282Q5AUAMQKIE");
		body.setOrderNumber("252426189");
		request.setRequestBody(body);
		GetShippinLabelResponse r=call.getShippingLabel(request);
		assertTrue(r.getIsSuccess());
		assertEquals("252426189",r.getResponseBody().getOrderNumber());
		assertTrue(r.getResponseBody().getRequestList().getRequest().size()>0);
	}
	
	@Test
	public void testGetShippingLabel_JSON() {
		Content.SellerID="A2EU";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOTCaller call=ShipOTCaller.buildJSON();
		GetShippingLabelRequest request=new GetShippingLabelRequest();
		GetShippingLabelRequest.RequestBody body=new GetShippingLabelRequest.RequestBody();
		body.setRequestID("282Q5AUAMQKIE");
		body.setOrderNumber("252426189");
		request.setRequestBody(body);
		GetShippinLabelResponse r=call.getShippingLabel(request);
		assertTrue(r.getIsSuccess());
		assertEquals("252426189",r.getResponseBody().getOrderNumber());
		assertTrue(r.getResponseBody().getRequestList().getRequest().size()>0);
	}
	
	
	
	@Test
	public void testMockGetPackageLis_XML() {
		Variables.SimulationEnabled=true;
		Content.SellerID="A2EU";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOTCaller call=ShipOTCaller.buildXML();
		GetPackageListRequest request=new GetPackageListRequest();
		GetPackageListRequest.RequestBody body=new GetPackageListRequest.RequestBody();
		body.setRequestID("282Q5AUAMQKIE");;
		request.setRequestBody(body);
		GetPackageListResponse r=call.getPackageLis(request);
		Variables.SimulationEnabled=false;
		b.restore();
		assertTrue(r.getIsSuccess());
		assertEquals("252426189",r.getResponseBody().getOrderNumber());
		assertTrue(r.getResponseBody().getRequestList().getRequest().size()>0);		
	}
	
	@Test
	public void testMockGetPackageLis_JSON() {
		Variables.SimulationEnabled=true;
		Content.SellerID="A2EU";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOTCaller call=ShipOTCaller.buildJSON();
		GetPackageListRequest request=new GetPackageListRequest();
		GetPackageListRequest.RequestBody body=new GetPackageListRequest.RequestBody();
		body.setRequestID("282Q5AUAMQKIE");;
		request.setRequestBody(body);
		GetPackageListResponse r=call.getPackageLis(request);
		Variables.SimulationEnabled=false;
		b.restore();		
		assertTrue(r.getIsSuccess());
		assertEquals("252426189",r.getResponseBody().getOrderNumber());
	}
	
	@Test
	public void testMockGetShippingLabel_XML() {
		Variables.SimulationEnabled=true;
		Content.SellerID="A2EU";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOTCaller call=ShipOTCaller.buildXML();
		GetShippingLabelRequest request=new GetShippingLabelRequest();
		GetShippingLabelRequest.RequestBody body=new GetShippingLabelRequest.RequestBody();
		body.setRequestID("282Q5AUAMQKIE");
		body.setOrderNumber("252426189");
		request.setRequestBody(body);
		GetShippinLabelResponse r=call.getShippingLabel(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertEquals("252426189",r.getResponseBody().getOrderNumber());
		assertTrue(r.getResponseBody().getRequestList().getRequest().size()>0);
	}
	
	@Test
	public void testMockGetShippingLabel_JSON() {
		Variables.SimulationEnabled=true;
		Content.SellerID="A2EU";
		Content.Authorization="****************************************";
		Content.SecretKey="********-****-****-****-************";
		ShipOTCaller call=ShipOTCaller.buildJSON();
		GetShippingLabelRequest request=new GetShippingLabelRequest();
		GetShippingLabelRequest.RequestBody body=new GetShippingLabelRequest.RequestBody();
		body.setRequestID("282Q5AUAMQKIE");
		body.setOrderNumber("252426189");
		request.setRequestBody(body);
		GetShippinLabelResponse r=call.getShippingLabel(request);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertEquals("252426189",r.getResponseBody().getOrderNumber());
		assertTrue(r.getResponseBody().getRequestList().getRequest().size()>0);
	}
}
