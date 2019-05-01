package com.newegg.marketplace.sdk.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @deprecated
 * @author QB
 *
 */
public class DateTimeAdapter extends XmlAdapter<String, Date> {

	private final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a",Locale.ENGLISH); 
	
	@Override
	public Date unmarshal(String v) throws Exception {
		return dateFormat.parse(v);
	}

	@Override
	public String marshal(Date v) throws Exception {
		return dateFormat.format(v);
	}

}
