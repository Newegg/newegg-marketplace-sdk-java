package newegg.marketplace.sdk.item.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetInternationalItemPriceListRequest {
	@JsonProperty("Type")
    protected int type;
    
	@JsonProperty("Values")
    protected List<String> values;
    
	
	@JsonProperty("CountryList")
    protected List<String> countryList;


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public List<String> getValues() {
		return values;
	}


	public void setValues(List<String> values) {
		this.values = values;
	}


	public List<String> getCountryList() {
		return countryList;
	}


	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}



}
