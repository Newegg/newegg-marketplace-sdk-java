package com.newegg.marketplace.sdk.item.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetItemInventoryListResponse {

	@JsonProperty("IsSuccess")
	protected boolean success;

	@JsonProperty("OperationType")
	protected String operationType;

	@JsonProperty("SellerID")
	protected String sellerID;

	
	@JsonProperty("ResponseDate")
	protected String responseDate;

	@JsonProperty("ResponseBody")
	protected ResponseBody responseBody;

	public static class ResponseBody {

		@JsonProperty("TotalCount")
		protected int totalCount;
		
		@JsonProperty("ItemList")
		protected List<GetItemInventoryListResponse.Item> itemList;

		public int getTotalCount() {
			return totalCount;
		}

		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}

		public List<GetItemInventoryListResponse.Item> getItemList() {
			return itemList;
		}

		public void setItemList(List<GetItemInventoryListResponse.Item> itemList) {
			this.itemList = itemList;
		}

		
	}

	public static class Item {
		@JsonProperty("ItemNumber")
		protected String itemNumber;
		@JsonProperty("SellerPartNumber")
		protected String sellerPartNumber;
		@JsonProperty("FulfillmentOption")
		protected String fulfillmentOption;
		@JsonProperty("Active")
		protected String active;
		@JsonProperty("AvailableQuantity")
		protected int availableQuantity;
		@JsonProperty("WarehouseAllocation")
		protected List<GetItemInventoryListResponse.WarehouseAllocation> warehouseAllocation;
		public String getItemNumber() {
			return itemNumber;
		}
		public void setItemNumber(String itemNumber) {
			this.itemNumber = itemNumber;
		}
		public String getSellerPartNumber() {
			return sellerPartNumber;
		}
		public void setSellerPartNumber(String sellerPartNumber) {
			this.sellerPartNumber = sellerPartNumber;
		}
		public String getFulfillmentOption() {
			return fulfillmentOption;
		}
		public void setFulfillmentOption(String fulfillmentOption) {
			this.fulfillmentOption = fulfillmentOption;
		}
		public String getActive() {
			return active;
		}
		public void setActive(String active) {
			this.active = active;
		}
		public int getAvailableQuantity() {
			return availableQuantity;
		}
		public void setAvailableQuantity(int availableQuantity) {
			this.availableQuantity = availableQuantity;
		}
		public List<GetItemInventoryListResponse.WarehouseAllocation> getWarehouseAllocation() {
			return warehouseAllocation;
		}
		public void setWarehouseAllocation(List<GetItemInventoryListResponse.WarehouseAllocation> warehouseAllocation) {
			this.warehouseAllocation = warehouseAllocation;
		}

		
	}

	public static class WarehouseAllocation {
		@JsonProperty("WarehouseCode")
		protected String warehouseCode;
		@JsonProperty("Quantity")
		protected int quantity;
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getWarehouseCode() {
			return warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

		
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
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

	public ResponseBody getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(ResponseBody responseBody) {
		this.responseBody = responseBody;
	}

	
}
