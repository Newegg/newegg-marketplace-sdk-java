//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.04 於 02:50:13 PM CST 
//

package com.newegg.marketplace.sdk.report.model.get;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <p>anonymous complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalPageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "PageInfo")
public class PageInfo {

    @XmlElement(name = "TotalCount")
    @JsonProperty("TotalCount")
    protected int totalCount;
    @XmlElement(name = "TotalPageCount")
    @JsonProperty("TotalPageCount")
    protected int totalPageCount;
    @XmlElement(name = "PageSize")
    @JsonProperty("PageSize")
    protected int pageSize;
    @XmlElement(name = "PageIndex")
    @JsonProperty("PageIndex")
    protected int pageIndex;

    /**
     * 取得 totalCount 特性的值.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * 設定 totalCount 特性的值.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * 取得 totalPageCount 特性的值.
     * 
     */
    public int getTotalPageCount() {
        return totalPageCount;
    }

    /**
     * 設定 totalPageCount 特性的值.
     * 
     */
    public void setTotalPageCount(int value) {
        this.totalPageCount = value;
    }

    /**
     * 取得 pageSize 特性的值.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 設定 pageSize 特性的值.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * 取得 pageIndex 特性的值.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * 設定 pageIndex 特性的值.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }
}
