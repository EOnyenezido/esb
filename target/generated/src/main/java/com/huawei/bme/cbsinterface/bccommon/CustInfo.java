
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustNodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentCustKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="NoticeSuppress" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NoticeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SubNoticeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustInfo", propOrder = {
    "custType",
    "custNodeType",
    "custClass",
    "custCode",
    "parentCustKey",
    "custBasicInfo",
    "noticeSuppress"
})
public class CustInfo
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "CustType")
    protected String custType;
    @XmlElement(name = "CustNodeType")
    protected String custNodeType;
    @XmlElement(name = "CustClass")
    protected String custClass;
    @XmlElement(name = "CustCode")
    protected String custCode;
    @XmlElement(name = "ParentCustKey")
    protected String parentCustKey;
    @XmlElement(name = "CustBasicInfo")
    protected CustBasicInfo custBasicInfo;
    @XmlElement(name = "NoticeSuppress")
    protected List<CustInfo.NoticeSuppress> noticeSuppress;

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Gets the value of the custNodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNodeType() {
        return custNodeType;
    }

    /**
     * Sets the value of the custNodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNodeType(String value) {
        this.custNodeType = value;
    }

    /**
     * Gets the value of the custClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustClass() {
        return custClass;
    }

    /**
     * Sets the value of the custClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustClass(String value) {
        this.custClass = value;
    }

    /**
     * Gets the value of the custCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCode() {
        return custCode;
    }

    /**
     * Sets the value of the custCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCode(String value) {
        this.custCode = value;
    }

    /**
     * Gets the value of the parentCustKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCustKey() {
        return parentCustKey;
    }

    /**
     * Sets the value of the parentCustKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCustKey(String value) {
        this.parentCustKey = value;
    }

    /**
     * Gets the value of the custBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustBasicInfo }
     *     
     */
    public CustBasicInfo getCustBasicInfo() {
        return custBasicInfo;
    }

    /**
     * Sets the value of the custBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustBasicInfo }
     *     
     */
    public void setCustBasicInfo(CustBasicInfo value) {
        this.custBasicInfo = value;
    }

    /**
     * Gets the value of the noticeSuppress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noticeSuppress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoticeSuppress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustInfo.NoticeSuppress }
     * 
     * 
     */
    public List<CustInfo.NoticeSuppress> getNoticeSuppress() {
        if (noticeSuppress == null) {
            noticeSuppress = new ArrayList<CustInfo.NoticeSuppress>();
        }
        return this.noticeSuppress;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NoticeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SubNoticeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "channelType",
        "noticeType",
        "subNoticeType"
    })
    public static class NoticeSuppress
        implements Serializable
    {

        private final static long serialVersionUID = 11082017L;
        @XmlElement(name = "ChannelType", required = true)
        protected String channelType;
        @XmlElement(name = "NoticeType", required = true)
        protected String noticeType;
        @XmlElement(name = "SubNoticeType")
        protected String subNoticeType;

        /**
         * Gets the value of the channelType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannelType() {
            return channelType;
        }

        /**
         * Sets the value of the channelType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannelType(String value) {
            this.channelType = value;
        }

        /**
         * Gets the value of the noticeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoticeType() {
            return noticeType;
        }

        /**
         * Sets the value of the noticeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoticeType(String value) {
            this.noticeType = value;
        }

        /**
         * Gets the value of the subNoticeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubNoticeType() {
            return subNoticeType;
        }

        /**
         * Sets the value of the subNoticeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubNoticeType(String value) {
            this.subNoticeType = value;
        }

    }

}
