
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;


/**
 * <p>Java class for ChangeCustNoticeSuppressRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCustNoticeSuppressRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *         &lt;element name="SuppressSetting"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AddSuppressSet" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NoticeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SubNoticeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DelSuppressSet" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NoticeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SubNoticeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "ChangeCustNoticeSuppressRequest", propOrder = {
    "custAccessCode",
    "suppressSetting"
})
public class ChangeCustNoticeSuppressRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "CustAccessCode", required = true)
    protected CustAccessCode custAccessCode;
    @XmlElement(name = "SuppressSetting", required = true)
    protected ChangeCustNoticeSuppressRequest.SuppressSetting suppressSetting;

    /**
     * Gets the value of the custAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccessCode }
     *     
     */
    public CustAccessCode getCustAccessCode() {
        return custAccessCode;
    }

    /**
     * Sets the value of the custAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccessCode }
     *     
     */
    public void setCustAccessCode(CustAccessCode value) {
        this.custAccessCode = value;
    }

    /**
     * Gets the value of the suppressSetting property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCustNoticeSuppressRequest.SuppressSetting }
     *     
     */
    public ChangeCustNoticeSuppressRequest.SuppressSetting getSuppressSetting() {
        return suppressSetting;
    }

    /**
     * Sets the value of the suppressSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCustNoticeSuppressRequest.SuppressSetting }
     *     
     */
    public void setSuppressSetting(ChangeCustNoticeSuppressRequest.SuppressSetting value) {
        this.suppressSetting = value;
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
     *         &lt;element name="AddSuppressSet" maxOccurs="unbounded" minOccurs="0"&gt;
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
     *         &lt;element name="DelSuppressSet" maxOccurs="unbounded" minOccurs="0"&gt;
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
    @XmlType(name = "", propOrder = {
        "addSuppressSet",
        "delSuppressSet"
    })
    public static class SuppressSetting
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AddSuppressSet")
        protected List<ChangeCustNoticeSuppressRequest.SuppressSetting.AddSuppressSet> addSuppressSet;
        @XmlElement(name = "DelSuppressSet")
        protected List<ChangeCustNoticeSuppressRequest.SuppressSetting.DelSuppressSet> delSuppressSet;

        /**
         * Gets the value of the addSuppressSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addSuppressSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddSuppressSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeCustNoticeSuppressRequest.SuppressSetting.AddSuppressSet }
         * 
         * 
         */
        public List<ChangeCustNoticeSuppressRequest.SuppressSetting.AddSuppressSet> getAddSuppressSet() {
            if (addSuppressSet == null) {
                addSuppressSet = new ArrayList<ChangeCustNoticeSuppressRequest.SuppressSetting.AddSuppressSet>();
            }
            return this.addSuppressSet;
        }

        /**
         * Gets the value of the delSuppressSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delSuppressSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDelSuppressSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeCustNoticeSuppressRequest.SuppressSetting.DelSuppressSet }
         * 
         * 
         */
        public List<ChangeCustNoticeSuppressRequest.SuppressSetting.DelSuppressSet> getDelSuppressSet() {
            if (delSuppressSet == null) {
                delSuppressSet = new ArrayList<ChangeCustNoticeSuppressRequest.SuppressSetting.DelSuppressSet>();
            }
            return this.delSuppressSet;
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
        public static class AddSuppressSet
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
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
        public static class DelSuppressSet
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
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

}
