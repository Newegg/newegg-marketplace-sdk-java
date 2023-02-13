package com.newegg.marketplace.sdk.datafeed.model.sub;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Propertys")
@XmlType
public class Propertys {

	@XmlAnyElement
	private List<JAXBElement<String>> list;

	public Propertys() {
		list=new ArrayList<>();
	}
	
	public List<JAXBElement<String>> getList() {
		return list;
	}


	public void addEntry(String key,String value) {
		JAXBElement<String> e=new JAXBElement<String>(new QName(key),String.class,value);
		list.add(e);
	}
	
}
