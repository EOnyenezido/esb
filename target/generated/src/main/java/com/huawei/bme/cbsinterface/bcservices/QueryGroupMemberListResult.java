
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;


/**
 * <p>Java class for QueryGroupMemberListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryGroupMemberListResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupMemberList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PrimaryIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="MemberTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MemberShortNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MemberProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BeginRowNum" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FetchRowNum" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryGroupMemberListResult", propOrder = {
    "groupMemberList",
    "totalNumber",
    "beginRowNum",
    "fetchRowNum"
})
public class QueryGroupMemberListResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "GroupMemberList")
    protected List<QueryGroupMemberListResult.GroupMemberList> groupMemberList;
    @XmlElement(name = "TotalNumber", required = true)
    protected BigInteger totalNumber;
    @XmlElement(name = "BeginRowNum", required = true)
    protected BigInteger beginRowNum;
    @XmlElement(name = "FetchRowNum", required = true)
    protected BigInteger fetchRowNum;

    /**
     * Gets the value of the groupMemberList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupMemberList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupMemberList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryGroupMemberListResult.GroupMemberList }
     * 
     * 
     */
    public List<QueryGroupMemberListResult.GroupMemberList> getGroupMemberList() {
        if (groupMemberList == null) {
            groupMemberList = new ArrayList<QueryGroupMemberListResult.GroupMemberList>();
        }
        return this.groupMemberList;
    }

    /**
     * Gets the value of the totalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumber() {
        return totalNumber;
    }

    /**
     * Sets the value of the totalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumber(BigInteger value) {
        this.totalNumber = value;
    }

    /**
     * Gets the value of the beginRowNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBeginRowNum() {
        return beginRowNum;
    }

    /**
     * Sets the value of the beginRowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBeginRowNum(BigInteger value) {
        this.beginRowNum = value;
    }

    /**
     * Gets the value of the fetchRowNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFetchRowNum() {
        return fetchRowNum;
    }

    /**
     * Sets the value of the fetchRowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFetchRowNum(BigInteger value) {
        this.fetchRowNum = value;
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
     *         &lt;element name="PrimaryIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="MemberTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MemberShortNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MemberProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "primaryIdentity",
        "memberTypeCode",
        "memberShortNo",
        "memberProperty"
    })
    public static class GroupMemberList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "PrimaryIdentity", required = true)
        protected String primaryIdentity;
        @XmlElement(name = "MemberTypeCode")
        protected String memberTypeCode;
        @XmlElement(name = "MemberShortNo")
        protected String memberShortNo;
        @XmlElement(name = "MemberProperty")
        protected List<SimpleProperty> memberProperty;

        /**
         * Gets the value of the primaryIdentity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryIdentity() {
            return primaryIdentity;
        }

        /**
         * Sets the value of the primaryIdentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryIdentity(String value) {
            this.primaryIdentity = value;
        }

        /**
         * Gets the value of the memberTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberTypeCode() {
            return memberTypeCode;
        }

        /**
         * Sets the value of the memberTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberTypeCode(String value) {
            this.memberTypeCode = value;
        }

        /**
         * Gets the value of the memberShortNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberShortNo() {
            return memberShortNo;
        }

        /**
         * Sets the value of the memberShortNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberShortNo(String value) {
            this.memberShortNo = value;
        }

        /**
         * Gets the value of the memberProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleProperty }
         * 
         * 
         */
        public List<SimpleProperty> getMemberProperty() {
            if (memberProperty == null) {
                memberProperty = new ArrayList<SimpleProperty>();
            }
            return this.memberProperty;
        }

    }

}
