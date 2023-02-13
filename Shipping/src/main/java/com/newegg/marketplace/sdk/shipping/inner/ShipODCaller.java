package com.newegg.marketplace.sdk.shipping.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.shipping.Variables;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelEstimateRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelEstimateResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelReprintRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelReprintResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingNewLabelSubmitRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingNewLabelSubmitResponse;

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
 * Operation function
 * @author Zack
 *
 */
public interface ShipODCaller {

    @Headers({"Accept: application/json","Content-Type: application/json"})
    @RequestLine("POST /shippingservice/shippinglabel/createshippinglabel?sellerid={sellerid}")
    ShippingNewLabelSubmitResponse shippingNewLabelSubmitRequestJSON(@Param("sellerid") String sellerID,ShippingNewLabelSubmitRequest body);    
    @Headers({"Accept: application/xml","Content-Type: application/xml"})
    @RequestLine("POST /shippingservice/shippinglabel/createshippinglabel?sellerid={sellerid}")
    ShippingNewLabelSubmitResponse shippingNewLabelSubmitRequestXML(@Param("sellerid") String sellerID,ShippingNewLabelSubmitRequest body);
    
    default ShippingNewLabelSubmitResponse shippingNewLabelSubmitRequest(ShippingNewLabelSubmitRequest body) {
        switch(Variables.MediaType){
        case JSON:          
            return shippingNewLabelSubmitRequestJSON(Content.SellerID,body);            
        case XML:
            return shippingNewLabelSubmitRequestXML(Content.SellerID,body);         
        default:
            throw new RuntimeException("Never Happened!");
        }
    }
    
    @Headers({"Accept: application/json","Content-Type: application/json"})
    @RequestLine("POST /shippingservice/shippinglabel/estimateshippinglabel?sellerid={sellerid}")
    ShippingLabelEstimateResponse shippingLabelEstimateRequestJSON(@Param("sellerid") String sellerID,ShippingLabelEstimateRequest body);    
    @Headers({"Accept: application/xml","Content-Type: application/xml"})
    @RequestLine("POST /shippingservice/shippinglabel/estimateshippinglabel?sellerid={sellerid}")
    ShippingLabelEstimateResponse shippingLabelEstimateRequestXML(@Param("sellerid") String sellerID,ShippingLabelEstimateRequest body);
    
    default ShippingLabelEstimateResponse shippingLabelEstimateRequest(ShippingLabelEstimateRequest body) {
        switch(Variables.MediaType){
        case JSON:          
            return shippingLabelEstimateRequestJSON(Content.SellerID,body);            
        case XML:
            return shippingLabelEstimateRequestXML(Content.SellerID,body);         
        default:
            throw new RuntimeException("Never Happened!");
        }
    }
    
    @Headers({"Accept: application/json","Content-Type: application/json"})
    @RequestLine("POST /shippingservice/shippinglabel/reprintshippinglabel?sellerid={sellerid}")
    ShippingLabelReprintResponse shippingLabelReprintRequestJSON(@Param("sellerid") String sellerID,ShippingLabelReprintRequest body);    
    @Headers({"Accept: application/xml","Content-Type: application/xml"})
    @RequestLine("POST /shippingservice/shippinglabel/reprintshippinglabel?sellerid={sellerid}")
    ShippingLabelReprintResponse shippingLabelReprintRequestXML(@Param("sellerid") String sellerID,ShippingLabelReprintRequest body);
    
    default ShippingLabelReprintResponse shippingLabelReprintRequest(ShippingLabelReprintRequest body) {
        switch(Variables.MediaType){
        case JSON:          
            return shippingLabelReprintRequestJSON(Content.SellerID,body);            
        case XML:
            return shippingLabelReprintRequestXML(Content.SellerID,body);         
        default:
            throw new RuntimeException("Never Happened!");
        }
    }
    
    static ShipODCaller buildJSON() {       
        Variables.MediaType=MEDIA_TYPE.JSON;            
        return new CallerFactory<ShipODCaller>()
        .jsonBuild(ShipODCaller.class, Variables.LogLevel, Variables.Retryer,ShipClient.genClient());       
    }           
    
    static ShipODCaller buildXML() {
        Variables.MediaType=MEDIA_TYPE.XML;
        return new CallerFactory<ShipODCaller>()
        .xmlBuild(ShipODCaller.class, Variables.LogLevel, Variables.Retryer,ShipClient.genClient());        
    }
}
