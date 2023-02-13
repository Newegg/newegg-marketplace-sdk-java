//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2020.02.05 於 04:18:03 PM CST 
//
package com.newegg.marketplace.sdk.shipping.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "NeweggAPIRequest")
public class ShippingLabelEstimateRequest {

    @XmlElement(name = "OperationType", required = true)
    @JsonProperty(value = "OperationType", required = true)
    protected String operationType = "EstimateShippingLabel";
    
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty(value = "SellerID", required = true)
    protected String sellerID;
    
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty(value = "RequestBody", required = true)
    protected ShippingLabelEstimateRequest.RequestBody requestBody;

    /**
     * 取得 operationType 特性的值.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * 設定 operationType 特性的值.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * 取得 sellerID 特性的值.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSellerID() {
        return sellerID;
    }

    /**
     * 設定 sellerID 特性的值.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSellerID(String value) {
        this.sellerID = value;
    }

    /**
     * 取得 requestBody 特性的值.
     * 
     * @return possible object is {@link ShippingLabelReprintRequest.RequestBody }
     * 
     */
    public ShippingLabelEstimateRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * 設定 requestBody 特性的值.
     * 
     * @param value allowed object is {@link ShippingLabelReprintRequest.RequestBody }
     * 
     */
    public void setRequestBody(ShippingLabelEstimateRequest.RequestBody value) {
        this.requestBody = value;
    }

 
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "shipment" })
    public static class RequestBody {

        @XmlElement(name = "Shipment", required = true)
        @JsonProperty(value = "Shipment", required = true)
        protected ShippingLabelEstimateRequest.RequestBody.Shipment shipment;

        /**
         * 取得 shipment 特性的值.
         * 
         * @return possible object is {@link ShippingLabelReprintRequest.RequestBody.Shipment }
         * 
         */
        public ShippingLabelEstimateRequest.RequestBody.Shipment getShipment() {
            return shipment;
        }

        /**
         * 設定 shipment 特性的值.
         * 
         * @param value allowed object is {@link ShippingLabelReprintRequest.RequestBody.Shipment }
         * 
         */
        public void setShipment(ShippingLabelEstimateRequest.RequestBody.Shipment value) {
            this.shipment = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Shipment {

            @XmlElement(name = "OrderNumber", required = true)
            @JsonProperty(value = "OrderNumber", required = true)
            protected Integer orderNumber;
            
            @XmlElement(name = "ShippingCarrierCode", required = true)
            @JsonProperty(value = "ShippingCarrierCode", required = true)
            protected Integer shippingCarrierCode;
            
            @XmlElement(name = "ShippingServiceCode", defaultValue = "100")
            @JsonProperty(value = "ShippingServiceCode")
            protected Integer shippingServiceCode;
            
            @XmlElement(name = "ShipFromFirstName", required = true)
            @JsonProperty(value = "ShipFromFirstName", required = true)
            protected String shipFromFirstName;
            
            @XmlElement(name = "ShipFromLastName", required = true)
            @JsonProperty(value = "ShipFromLastName", required = true)
            protected String shipFromLastName;
            
            @XmlElement(name = "ShipFromPhoneNumber", required = true)
            @JsonProperty(value = "ShipFromPhoneNumber", required = true)
            protected String shipFromPhoneNumber;
            
            @XmlElement(name = "ShipFromAddress1", required = true)
            @JsonProperty(value = "ShipFromAddress1", required = true)
            protected String shipFromAddress1;
            
            @XmlElement(name = "ShipFromAddress2")
            @JsonProperty(value = "ShipFromAddress2")
            protected String shipFromAddress2;
            
            @XmlElement(name = "ShipFromCityName", required = true)
            @JsonProperty(value = "ShipFromCityName", required = true)
            protected String shipFromCityName;
            
            @XmlElement(name = "ShipFromStateCode", required = true)
            @JsonProperty(value = "ShipFromStateCode", required = true)
            protected String shipFromStateCode;
            
            @XmlElement(name = "ShipFromZipCode", required = true)
            @JsonProperty(value = "ShipFromZipCode", required = true)
            protected String shipFromZipCode;
            
            @XmlElement(name = "ShipFromCountryCode", required = true)
            @JsonProperty(value = "ShipFromCountryCode", required = true)
            protected String shipFromCountryCode;
            
            @XmlElement(name = "PackageList", required = true)
            @JsonProperty(value = "PackageList", required = true)
            //@JsonUnwrapped
            protected ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList packageList;

            /**
             * 取得 orderNumber 特性的值.
             * @return orderNumber
             */
            public Integer getOrderNumber() {
                return orderNumber;
            }

            /**
             * 設定 orderNumber 特性的值.
             * @param  value allowed object is {@link Integer }
             */
            public void setOrderNumber(int value) {
                this.orderNumber = value;
            }

            /**
             * 取得 shippingCarrierCode 特性的值.
             * @return shippingCarrierCode
             */
            public Integer getShippingCarrierCode() {
                return shippingCarrierCode;
            }

            /**
             * 設定 shippingCarrierCode 特性的值.
             * @param value allowed object is {@link Integer }
             */
            public void setShippingCarrierCode(int value) {
                this.shippingCarrierCode = value;
            }

            /**
             * 取得 shippingServiceCode 特性的值.
             * 
             * @return possible object is {@link Integer }
             * 
             */
            public Integer getShippingServiceCode() {
                return shippingServiceCode;
            }

            /**
             * 設定 shippingServiceCode 特性的值.
             * 
             * @param value allowed object is {@link Integer }
             * 
             */
            public void setShippingServiceCode(Integer value) {
                this.shippingServiceCode = value;
            }

            /**
             * 取得 shipFromFirstName 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromFirstName() {
                return shipFromFirstName;
            }

            /**
             * 設定 shipFromFirstName 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromFirstName(String value) {
                this.shipFromFirstName = value;
            }

            /**
             * 取得 shipFromLastName 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromLastName() {
                return shipFromLastName;
            }

            /**
             * 設定 shipFromLastName 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromLastName(String value) {
                this.shipFromLastName = value;
            }

            /**
             * 取得 shipFromPhoneNumber 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromPhoneNumber() {
                return shipFromPhoneNumber;
            }

            /**
             * 設定 shipFromPhoneNumber 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromPhoneNumber(String value) {
                this.shipFromPhoneNumber = value;
            }

            /**
             * 取得 shipFromAddress1 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromAddress1() {
                return shipFromAddress1;
            }

            /**
             * 設定 shipFromAddress1 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromAddress1(String value) {
                this.shipFromAddress1 = value;
            }

            /**
             * 取得 shipFromAddress2 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromAddress2() {
                return shipFromAddress2;
            }

            /**
             * 設定 shipFromAddress2 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromAddress2(String value) {
                this.shipFromAddress2 = value;
            }

            /**
             * 取得 shipFromCityName 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromCityName() {
                return shipFromCityName;
            }

            /**
             * 設定 shipFromCityName 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromCityName(String value) {
                this.shipFromCityName = value;
            }

            /**
             * 取得 shipFromStateCode 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromStateCode() {
                return shipFromStateCode;
            }

            /**
             * 設定 shipFromStateCode 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromStateCode(String value) {
                this.shipFromStateCode = value;
            }

            /**
             * 取得 shipFromZipCode 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromZipCode() {
                return shipFromZipCode;
            }

            /**
             * 設定 shipFromZipCode 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromZipCode(String value) {
                this.shipFromZipCode = value;
            }

            /**
             * 取得 shipFromCountryCode 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromCountryCode() {
                return shipFromCountryCode;
            }

            /**
             * 設定 shipFromCountryCode 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromCountryCode(String value) {
                this.shipFromCountryCode = value;
            }

            /**
             * 取得 packageList 特性的值.
             * 
             * @return possible object is
             *         
             * 
             */
            public ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList getPackageList() {
                return packageList;
            }

            /**
             * 設定 packageList 特性的值.
             * 
             * @param value allowed object is
             *              
             * 
             */
            public void setPackageList(ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList value) {
                this.packageList = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = { "_package" })
            public static class PackageList {

                @XmlElement(name = "Package", required = true)
                @JsonProperty(value = "Package", required = true)
                protected List<ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package> _package;

                @JsonIgnore
                public List<ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package> getPackage() {
                    if (_package == null) {
                        _package = new ArrayList<ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package>();
                    }
                    return this._package;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class Package {

                    @XmlElement(name = "PackageWeight", required = true)
                    @JsonProperty(value = "PackageWeight", required = true)
                    protected BigDecimal packageWeight;
                    
                    @XmlElement(name = "PackageLength", required = true)
                    @JsonProperty(value = "PackageLength", required = true)
                    protected BigDecimal packageLength;
                    
                    @XmlElement(name = "PackageHeight", required = true)
                    @JsonProperty(value = "PackageHeight", required = true)
                    protected BigDecimal packageHeight;
                    
                    @XmlElement(name = "PackageWidth", required = true)
                    @JsonProperty(value = "PackageWidth", required = true)
                    protected BigDecimal packageWidth;
                    
                    @XmlElement(name = "SignatureOptions")
                    @JsonProperty(value = "SignatureOptions")
                    protected String signatureOptions;
                    
                    @XmlElement(name = "ItemList")
                    @JsonProperty(value = "ItemList", required = true)
                    protected ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList itemList;

                    /**
                     * 取得 packageWeight 特性的值.
                     * 
                     * @return possible object is {@link BigDecimal }
                     * 
                     */
                    public BigDecimal getPackageWeight() {
                        return packageWeight;
                    }

                    /**
                     * 設定 packageWeight 特性的值.
                     * 
                     * @param value allowed object is {@link BigDecimal }
                     * 
                     */
                    public void setPackageWeight(BigDecimal value) {
                        this.packageWeight = value;
                    }

                    /**
                     * 取得 packageLength 特性的值.
                     * 
                     * @return possible object is {@link BigDecimal }
                     * 
                     */
                    public BigDecimal getPackageLength() {
                        return packageLength;
                    }

                    /**
                     * 設定 packageLength 特性的值.
                     * 
                     * @param value allowed object is {@link BigDecimal }
                     * 
                     */
                    public void setPackageLength(BigDecimal value) {
                        this.packageLength = value;
                    }

                    /**
                     * 取得 packageHeight 特性的值.
                     * 
                     * @return possible object is {@link BigDecimal }
                     * 
                     */
                    public BigDecimal getPackageHeight() {
                        return packageHeight;
                    }

                    /**
                     * 設定 packageHeight 特性的值.
                     * 
                     * @param value allowed object is {@link BigDecimal }
                     * 
                     */
                    public void setPackageHeight(BigDecimal value) {
                        this.packageHeight = value;
                    }

                    /**
                     * 取得 packageWidth 特性的值.
                     * 
                     * @return possible object is {@link BigDecimal }
                     * 
                     */
                    public BigDecimal getPackageWidth() {
                        return packageWidth;
                    }

                    /**
                     * 設定 packageWidth 特性的值.
                     * 
                     * @param value allowed object is {@link BigDecimal }
                     * 
                     */
                    public void setPackageWidth(BigDecimal value) {
                        this.packageWidth = value;
                    }

                    /**
                     * 取得 signatureOptions 特性的值.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getSignatureOptions() {
                        return signatureOptions;
                    }

                    /**
                     * 設定 signatureOptions 特性的值.
                     * 
                     * @param value allowed object is {@link String }
                     * 
                     */
                    public void setSignatureOptions(String value) {
                        this.signatureOptions = value;
                    }

                    /**
                     * 取得 itemList 特性的值.
                     * 
                     * @return possible object is
                     *         
                     * 
                     */
                    public ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList getItemList() {
                        return itemList;
                    }

                    /**
                     * 設定 itemList 特性的值.
                     * 
                     * @param value allowed object is
                     *              
                     * 
                     */
                    public void setItemList(
                            ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList value) {
                        this.itemList = value;
                    }

                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = { "item" })
                    public static class ItemList {

                        @XmlElement(name = "Item", required = true)
                        @JsonProperty(value = "Item", required = true)
                        protected List<ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item> item;

                        public List<ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item> getItem() {
                            if (item == null) {
                                item = new ArrayList<ShippingLabelEstimateRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item>();
                            }
                            return this.item;
                        }

                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {

                        })
                        public static class Item {

                            @XmlElement(name = "SellerPartNumber", required = true)
                            @JsonProperty(value = "SellerPartNumber", required = true)
                            protected String sellerPartNumber;
                            
                            @XmlElement(name = "Quantity", required = true)
                            @JsonProperty(value = "Quantity", required = true)
                            protected Integer quantity;

                            /**
                             * 取得 sellerPartNumber 特性的值.
                             * 
                             * @return possible object is {@link String }
                             * 
                             */
                            public String getSellerPartNumber() {
                                return sellerPartNumber;
                            }

                            /**
                             * 設定 sellerPartNumber 特性的值.
                             * 
                             * @param value allowed object is {@link String }
                             * 
                             */
                            public void setSellerPartNumber(String value) {
                                this.sellerPartNumber = value;
                            }

                            /**
                             * 取得 quantity 特性的值.
                             * @return possible object is {@link Integer }
                             */
                            public Integer getQuantity() {
                                return quantity;
                            }

                            /**
                             * 設定 quantity 特性的值.
                             *  @param value allowed object is {@link Integer }
                             */
                            public void setQuantity(int value) {
                                this.quantity = value;
                            }

                        }

                    }

                }

            }

        }

    }
}
