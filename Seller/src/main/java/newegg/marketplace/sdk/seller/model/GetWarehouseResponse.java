package newegg.marketplace.sdk.seller.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetWarehouseResponse {
	@JsonProperty("IsSuccess")
	private String success;
	@JsonProperty("OperationType")
	private String operationType="GetSellerWarehouseResponse";
	@JsonProperty("SellerID")
	private String sellerID;
	@JsonProperty("ResponseDate")
	private String responseDate;
	@JsonProperty("Memo")
	protected  String memo;
	@JsonProperty("ResponseBody")
    private GetWarehouseResponse.ResponseBody responseBody;
	public static class ResponseBody{
	  @JsonProperty("WarehouseList")
	  protected List<GetWarehouseResponse.ResponseBody.WarehouseList> warehouseList;
		public static  class WarehouseList{
	     @JsonProperty("WarehouseLocation")
	     protected String warehouseLocation;
	     @JsonProperty("Status")
	     protected int status;
	     @JsonProperty("ShippingDestination")
	     protected List<String> shippingDestination;
		public String getWarehouseLocation() {
			return warehouseLocation;
		}
		public void setWarehouseLocation(String warehouseLocation) {
			this.warehouseLocation = warehouseLocation;
		}
		public List<String> getShippingDestination() {
			return shippingDestination;
		}
		public void setShippingDestination(List<String> shippingDestination) {
			this.shippingDestination = shippingDestination;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		}
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getSellerID() {
		return sellerID;
	}
	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}
	public String getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(String responseDate) {
		this.responseDate = responseDate;
	}
	public GetWarehouseResponse.ResponseBody getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(GetWarehouseResponse.ResponseBody responseBody) {
		this.responseBody = responseBody;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
