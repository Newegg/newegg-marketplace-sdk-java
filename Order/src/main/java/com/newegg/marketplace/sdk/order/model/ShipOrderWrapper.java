package com.newegg.marketplace.sdk.order.model;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



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
 * @author Zack.J.Hung
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "UpdateOrderStatus")
public class ShipOrderWrapper implements ShipOrderImpl {
	@XmlElement(name = "Action", required = true)
	protected int actionElement; 
	
	//@XmlJavaTypeAdapter(value = SerializationObjectParser.class)
	@XmlCDATA
	@XmlElement(name = "Value", required = true)
	protected String valueElement;
	
	public void setAction(int s) {
		this.actionElement = s; 
	}
	
	public int getAction() {
		return this.actionElement; 
	}
	
	public String getValueElement() {
		return this.valueElement;
	}
	
	public void setValueElement(String s) {
		this.valueElement = s; 
	}
}
