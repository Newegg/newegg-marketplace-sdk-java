package com.newegg.marketplace.sdk.datafeed.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "messageType",
    "message"
})
@XmlRootElement(name = "NeweggEnvelope")
public class MultiChannelOrderFeedRequest {

    @XmlElement(name = "Header", required = true)
    protected MultiChannelOrderFeedRequest.Header header=new MultiChannelOrderFeedRequest.Header();
    @XmlElement(name = "MessageType", required = true)
    protected String messageType="MultiChannelOrderCreation";
    @XmlElement(name = "Message", required = true)
    protected MultiChannelOrderFeedRequest.Message message;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link MultiChannelOrderFeedRequest.Header }
     *     
     */
    public MultiChannelOrderFeedRequest.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiChannelOrderFeedRequest.Header }
     *     
     */
    public void setHeader(MultiChannelOrderFeedRequest.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link MultiChannelOrderFeedRequest.Message }
     *     
     */
    public MultiChannelOrderFeedRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiChannelOrderFeedRequest.Message }
     *     
     */
    public void setMessage(MultiChannelOrderFeedRequest.Message value) {
        this.message = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "documentVersion"
    })
    public static class Header {

        @XmlElement(name = "DocumentVersion", required = true)
        protected BigDecimal documentVersion=new BigDecimal("1.0");

        /**
         * Gets the value of the documentVersion property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public BigDecimal getDocumentVersion() {
            return documentVersion;
        }

        /**
         * Sets the value of the documentVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDocumentVersion(BigDecimal value) {
            this.documentVersion = value;
        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "multiChannelOrder"
    })
    public static class Message {

        @XmlElement(name = "MultiChannelOrder", required = true)
        protected MultiChannelOrderFeedRequest.Message.MultiChannelOrder multiChannelOrder;

        public MultiChannelOrderFeedRequest.Message.MultiChannelOrder getMultiChannelOrder() {
			return multiChannelOrder;
		}

		public void setMultiChannelOrder(MultiChannelOrderFeedRequest.Message.MultiChannelOrder multiChannelOrder) {
			this.multiChannelOrder = multiChannelOrder;
		}




		@XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "order"
        })
        public static class MultiChannelOrder {

            @XmlElement(name = "Order", required = true)
            protected List<MultiChannelOrderFeedRequest.Message.MultiChannelOrder.Order> order;

 
            public List<MultiChannelOrderFeedRequest.Message.MultiChannelOrder.Order> getOrder() {
                if (order == null) {
                    order = new ArrayList<MultiChannelOrderFeedRequest.Message.MultiChannelOrder.Order>();
                }
                return this.order;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
 
            })
            public static class Order {

                @XmlElement(name = "OrderDate", required = true)
                protected String orderDate;
                @XmlElement(name = "SalesChannel", required = true)
                protected String salesChannel;
                @XmlElement(name = "SellerOrderID", required = true)
                protected String sellerOrderID;
                @XmlElement(name = "ShippingMethod", required = true)
                protected String shippingMethod;

                @XmlElement(name = "ShipToFirstName", required = true)
                protected String shipToFirstName;
                @XmlElement(name = "ShipToLastName", required = true)
                protected String shipToLastName;
                @XmlElement(name = "ShipToCompany")
                protected String shipToCompany;
                @XmlElement(name = "ShipToAddressLine1", required = true)
                protected String shipToAddressLine1;
                @XmlElement(name = "ShipToAddressLine2")
                protected String shipToAddressLine2;
                @XmlElement(name = "ShipToCity", required = true)
                protected String shipToCity;
                @XmlElement(name = "ShipToState", required = true)
                protected String shipToState;
                @XmlElement(name = "ShipToPostalCode", required = true)
                protected String shipToPostalCode;
                @XmlElement(name = "ShipToCountry")
                protected String shipToCountry;
                @XmlElement(name = "ShipToPhoneNumber", required = true)
                protected String shipToPhoneNumber;
                @XmlElement(name = "ItemList", required = true)
                protected ItemList itemList;
                
                
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
     
                })
                public static class ItemList{
                	
                	 @XmlElement(name = "Item", required = true)
                	protected List<MultiChannelOrderFeedRequest.Message.MultiChannelOrder.Order.ItemList.Item> item;
                	
                	 public List<MultiChannelOrderFeedRequest.Message.MultiChannelOrder.Order.ItemList.Item> getItem() {
                		 if(item==null) {
                			 item=new ArrayList<MultiChannelOrderFeedRequest.Message.MultiChannelOrder.Order.ItemList.Item>();
                		 }
						return this.item;
					}

					@XmlAccessorType(XmlAccessType.FIELD)
                     @XmlType(name = "", propOrder = {
          
                     })
                	public static class Item{
                		 @XmlElement(name = "SellerPartNumber", required = true)
                         protected String sellerPartNumber;
                         @XmlElement(name = "NeweggItemNumber")
                         protected String neweggItemNumber;
                         @XmlElement(name = "Quantity", required = true)
                         protected int quantity;
                         
						public String getSellerPartNumber() {
							return sellerPartNumber;
						}
						public void setSellerPartNumber(String sellerPartNumber) {
							this.sellerPartNumber = sellerPartNumber;
						}
						public String getNeweggItemNumber() {
							return neweggItemNumber;
						}
						public void setNeweggItemNumber(String neweggItemNumber) {
							this.neweggItemNumber = neweggItemNumber;
						}
						public int getQuantity() {
							return quantity;
						}
						public void setQuantity(int quantity) {
							this.quantity = quantity;
						}
                	}
                }


				public String getOrderDate() {
					return orderDate;
				}


				public void setOrderDate(String orderDate) {
					this.orderDate = orderDate;
				}


				public String getSalesChannel() {
					return salesChannel;
				}


				public void setSalesChannel(String salesChannel) {
					this.salesChannel = salesChannel;
				}


				public String getSellerOrderID() {
					return sellerOrderID;
				}


				public void setSellerOrderID(String sellerOrderID) {
					this.sellerOrderID = sellerOrderID;
				}


				public String getShippingMethod() {
					return shippingMethod;
				}


				public void setShippingMethod(String shippingMethod) {
					this.shippingMethod = shippingMethod;
				}


				public String getShipToFirstName() {
					return shipToFirstName;
				}


				public void setShipToFirstName(String shipToFirstName) {
					this.shipToFirstName = shipToFirstName;
				}


				public String getShipToLastName() {
					return shipToLastName;
				}


				public void setShipToLastName(String shipToLastName) {
					this.shipToLastName = shipToLastName;
				}


				public String getShipToCompany() {
					return shipToCompany;
				}


				public void setShipToCompany(String shipToCompany) {
					this.shipToCompany = shipToCompany;
				}


				public String getShipToAddressLine1() {
					return shipToAddressLine1;
				}


				public void setShipToAddressLine1(String shipToAddressLine1) {
					this.shipToAddressLine1 = shipToAddressLine1;
				}


				public String getShipToAddressLine2() {
					return shipToAddressLine2;
				}


				public void setShipToAddressLine2(String shipToAddressLine2) {
					this.shipToAddressLine2 = shipToAddressLine2;
				}


				public String getShipToCity() {
					return shipToCity;
				}


				public void setShipToCity(String shipToCity) {
					this.shipToCity = shipToCity;
				}


				public String getShipToState() {
					return shipToState;
				}


				public void setShipToState(String shipToState) {
					this.shipToState = shipToState;
				}


				public String getShipToPostalCode() {
					return shipToPostalCode;
				}


				public void setShipToPostalCode(String shipToPostalCode) {
					this.shipToPostalCode = shipToPostalCode;
				}


				public String getShipToCountry() {
					return shipToCountry;
				}


				public void setShipToCountry(String shipToCountry) {
					this.shipToCountry = shipToCountry;
				}


				public String getShipToPhoneNumber() {
					return shipToPhoneNumber;
				}


				public void setShipToPhoneNumber(String shipToPhoneNumber) {
					this.shipToPhoneNumber = shipToPhoneNumber;
				}


				public ItemList getItemList() {
					return itemList;
				}


				public void setItemList(ItemList itemList) {
					this.itemList = itemList;
				}

            }

        }

    }

}
