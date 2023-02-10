package newegg.marketplace.sdk.order;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import newegg.marketplace.sdk.order.model.*;


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
public class SerializationObjectParser {
	protected JAXBContext jaxbXML;
	protected Marshaller marshallerObject;
	
	public StringBuffer xmlObjectToString(ShipmentRequest bound) throws JAXBException {
		JAXBContext jaxbContent = JAXBContext.newInstance(ShipmentRequest.class); 
		Marshaller jaxbMarshaller = jaxbContent.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
		jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
		StringWriter strWriter = new StringWriter();
		jaxbMarshaller.marshal(bound, strWriter);
		
		return new StringBuffer(strWriter.toString());
	}
	
	public StringBuffer xmlObjectToString(ShipOrderRequest bound) throws JAXBException {
		JAXBContext jaxbContent = JAXBContext.newInstance(ShipOrderRequest.class); 
		Marshaller jaxbMarshaller = jaxbContent.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		//jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
		
		// ignore < > of CDATA metdata that don't translation < to &lt;
		/*jaxbMarshaller.setProperty(CharacterEscapeHandler.class.getName(),
							new CharacterEscapeHandler() {
						@Override
						public void escape(char[] ch, int start, int length, boolean isAttVal, Writer out)
									throws IOException {
							out.write(ch, start, length);
						}
					}
				   );*/
		
		StringWriter strWriter = new StringWriter();
		jaxbMarshaller.marshal(bound, strWriter);
		
		return new StringBuffer(strWriter.toString());
	}
	
	public ShipOrderRequest reBuildRequestXML() throws JAXBException {
		ShipOrderRequest sop = new ShipOrderRequest();
		
		jaxbXML = JAXBContext.newInstance(ShipOrderRequest.class);
		marshallerObject = jaxbXML.createMarshaller();
		marshallerObject.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);	// xml format
		marshallerObject.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		marshallerObject.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);	// true is remove <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
		
		/*marshallerObject.setProperty(CharacterEscapeHandler.class.getName(),
		//marshallerObject.setProperty("com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler",
				new CharacterEscapeHandler() {
					@Override
					public void escape(char[] ch, int start, int length, boolean isAttVal, Writer out)
								throws IOException {
						out.write(ch, start, length);
					}
				}
			   );*/
		
		return sop;
	}
}
