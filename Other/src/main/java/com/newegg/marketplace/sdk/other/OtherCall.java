package com.newegg.marketplace.sdk.other;

import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.other.inner.OtherCaller;
import com.newegg.marketplace.sdk.other.model.Domain;
import com.newegg.marketplace.sdk.other.model.GetServiceStatusResponse;

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
 * 
 * @author QB
 *
 */
public class OtherCall {

	private OtherCaller otherCaller;
	
	public OtherCall() {
		this(Content.MEDIA_TYPE.XML);
	}
	
	private OtherCall(Content.MEDIA_TYPE mrdiaType) {
		switch(mrdiaType){
		case JSON:
			otherCaller=OtherCaller.buildJSON();
			break;			
		case XML:
			otherCaller=OtherCaller.buildXML();
			break;			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	/**
	 * </pre>
	 * Newegg Marketplace API provides an interface in every major service group to allow you to check whether the service you are invoking is available or not. 
	 * Each major service group is listed in the Parameters section, domain field description.  
	 * Return each major service group’s availability. 
	 * </pre>
	 * @param domain {@linkplain Domain} 
	 * @return {@linkplain GetServiceStatusResponse} 
	 */
	public GetServiceStatusResponse verifyServiceStatus(Domain domain) {
		return otherCaller.verifyServiceStatus(domain);
	}
}
