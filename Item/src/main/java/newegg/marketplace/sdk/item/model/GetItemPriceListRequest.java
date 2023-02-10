package newegg.marketplace.sdk.item.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetItemPriceListRequest {
	@JsonProperty("Type")
	protected int type;
	
	@JsonProperty("Values")
	protected List<String> values;
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

}
