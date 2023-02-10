package newegg.marketplace.sdk.item.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 *<pre>
 *&lt;ContentQueryCriteria&gt;
 * &lt;Type&gt;1&lt;/Type&gt;
  *&lt;Values&gt;
  *  &lt;Key&gt;A006-TestItem-001&lt;/Key&gt;
   * &lt;Key&gt;A006-TestItem-002&lt;/Key&gt;
   * &lt;Key&gt;A006-TestItem-003&lt;/Key&gt;
  *&lt;/Values&gt;
 * &lt;WarehouseList&gt;
  *  &lt;WarehouseLocation&gt;USA&lt;/WarehouseLocation&gt;
   * &lt;WarehouseLocation&gt;AUS&lt;/WarehouseLocation&gt;
 * &lt;/WarehouseList&gt;
 * &lt;/ContentQueryCriteria&gt;
 *</pre>;
 **/
public class GetItemInternationalInventoryListRequest {

	@JsonProperty("Type")
    protected String type;
    
	@JsonProperty("Values")
    protected List<String> values;
    
	
	@JsonProperty("WarehouseList")
    protected List<String> warehouseList;


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public List<String> getValues() {
		return values;
	}


	public void setValues(List<String> values) {
		this.values = values;
	}


	public List<String> getWarehouseList() {
		return warehouseList;
	}


	public void setWarehouseList(List<String> warehouseList) {
		this.warehouseList = warehouseList;
	}


    
}
