package com.newegg.marketplace.sdk.report;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


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
public class SerializationObjectParser<T> {
	protected JAXBContext jaxbXML;
	protected Marshaller marshallerObject;
	
	public StringBuffer xmlObjectToString(T bound) throws JAXBException {
		JAXBContext jaxbContent = JAXBContext.newInstance(bound.getClass()); 
		Marshaller jaxbMarshaller = jaxbContent.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
		jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
		StringWriter strWriter = new StringWriter();
		jaxbMarshaller.marshal(bound, strWriter);
		
		return new StringBuffer(strWriter.toString());
	}
	

	
}
