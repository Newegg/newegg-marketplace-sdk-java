package newegg.marketplace.sdk.common;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import newegg.marketplace.sdk.common.Errors;


public class ErrorsTest {

	@Test
	public void testXML() throws JAXBException {
		Map<String, Object> properties = new HashMap<>();
		JAXBContext jaxb= JAXBContext.newInstance(new Class[]{Errors.class} ,properties);
		Marshaller marshaller =jaxb.createMarshaller();
		StringWriter w=new StringWriter();
		
		Errors errors=new Errors();
		Errors.Error e=new Errors.Error();
		e.setCode("100");
		e.setMessage("This is test message");
		errors.getError().add(e);
		
		marshaller.marshal(errors,w);
		//System.out.println(w.toString());
		assertTrue(w.toString().contains("100"));
	}

	@Test
	public void testJSON() throws JsonProcessingException {		
		ObjectMapper objectMapper = Content.JSON_MAPPER;
		Errors errors=new Errors();
		Errors.Error e=new Errors.Error();
		e.setCode("101");
		e.setMessage("This is test message for json");
		errors.getError().add(e);
		
		Errors.Error e1=new Errors.Error();
		e1.setCode("102");
		e1.setMessage("This is test1 message for json");
		errors.getError().add(e1);
		String str=objectMapper.writeValueAsString(errors);
		System.out.println(str);
		assertTrue(str.contains("101"));
	}
	
	@Test
	public void testJSN2() throws JsonParseException, JsonMappingException, IOException {
		String tmp="[{\"Code\":\"101\",\"Message\":\"This is test message for json\"},{\"Code\":\"102\",\"Message\":\"This is test1 message for json\"}]";
		ObjectMapper objectMapper = Content.JSON_MAPPER;
		CollectionType collectionType = objectMapper.getTypeFactory().constructCollectionType(List.class, Errors.Error.class);
		List<Errors.Error> l=objectMapper.readValue(tmp, collectionType);
		assertTrue(l.size()>0);
	}
}
