package newegg.marketplace.sdk.shipping.inner;

import newegg.marketplace.sdk.common.CallerFactory;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.shipping.Variables;
import newegg.marketplace.sdk.shipping.model.GetPackageListRequest;
import newegg.marketplace.sdk.shipping.model.GetPackageListResponse;
import newegg.marketplace.sdk.shipping.model.GetShippingLabelRequest;
import newegg.marketplace.sdk.shipping.model.GetShippinLabelResponse;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
/**
Copyright (c) 2000-present, Newegg Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */


/**
 * Other function
 * @author QB
 *
 */
public interface ShipOTCaller {

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /shippingservice/shippinglabel/packagelist?sellerid={sellerid}")
	GetPackageListResponse getPackageListJSON(@Param("sellerid") String sellerID,GetPackageListRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /shippingservice/shippinglabel/packagelist?sellerid={sellerid}")
	GetPackageListResponse getPackageListXML(@Param("sellerid") String sellerID,GetPackageListRequest body);
	
	default GetPackageListResponse getPackageLis(GetPackageListRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getPackageListJSON(Content.SellerID,body);			
		case XML:
			return getPackageListXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /shippingservice/shippinglabel/shippinglabels?sellerid={sellerid}")
	GetShippinLabelResponse getShippingLabelJSON(@Param("sellerid") String sellerID,GetShippingLabelRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /shippingservice/shippinglabel/shippinglabels?sellerid={sellerid}")
	GetShippinLabelResponse getShippingLabelXML(@Param("sellerid") String sellerID,GetShippingLabelRequest body);
	
	default GetShippinLabelResponse getShippingLabel(GetShippingLabelRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getShippingLabelJSON(Content.SellerID,body);			
		case XML:
			return getShippingLabelXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	
	static ShipOTCaller buildJSON() {		
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<ShipOTCaller>()
		.jsonBuild(ShipOTCaller.class, Variables.LogLevel, Variables.Retryer,ShipClient.genClient());		
	}			
	
	static ShipOTCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<ShipOTCaller>()
		.xmlBuild(ShipOTCaller.class, Variables.LogLevel, Variables.Retryer,ShipClient.genClient());		
	}
}
