
package com.accenture.schemas.topeng.esb_requestingsystem_v_1_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BEId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProcessTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperatorPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessUser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccessPwd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeZoneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestingSystem" type="{http://www.accenture.com/schemas/TOPENG/ESB_RequestingSystem_V_1_0}requestingSystem" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExtParamList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ParameterInfo" type="{http://www.accenture.com/schemas/TOPENG/ESB_RequestingSystem_V_1_0}Param" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeader", propOrder = {

})
public class RequestHeader
    implements Serializable
{

    private final static long serialVersionUID = 11082016L;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "BEId", required = true)
    protected String beId;
    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "ChannelId", required = true)
    protected String channelId;
    @XmlElement(name = "ProcessTime", required = true)
    protected String processTime;
    @XmlElement(name = "OperatorId")
    protected String operatorId;
    @XmlElement(name = "OperatorPwd")
    protected String operatorPwd;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "AccessUser", required = true)
    protected String accessUser;
    @XmlElement(name = "AccessPwd", required = true)
    protected String accessPwd;
    @XmlElement(name = "TestFlag")
    protected String testFlag;
    @XmlElement(name = "TimeType", required = true)
    protected String timeType;
    @XmlElement(name = "TimeZoneID")
    protected String timeZoneID;
    protected RequestingSystem requestingSystem;
    @XmlElement(name = "ThirdPartyID")
    protected Integer thirdPartyID;
    @XmlElement(name = "ExtParamList")
    protected RequestHeader.ExtParamList extParamList;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the beId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEId() {
        return beId;
    }

    /**
     * Sets the value of the beId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEId(String value) {
        this.beId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the processTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessTime() {
        return processTime;
    }

    /**
     * Sets the value of the processTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessTime(String value) {
        this.processTime = value;
    }

    /**
     * Gets the value of the operatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Sets the value of the operatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorId(String value) {
        this.operatorId = value;
    }

    /**
     * Gets the value of the operatorPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorPwd() {
        return operatorPwd;
    }

    /**
     * Sets the value of the operatorPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorPwd(String value) {
        this.operatorPwd = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the accessUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessUser() {
        return accessUser;
    }

    /**
     * Sets the value of the accessUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessUser(String value) {
        this.accessUser = value;
    }

    /**
     * Gets the value of the accessPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPwd() {
        return accessPwd;
    }

    /**
     * Sets the value of the accessPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessPwd(String value) {
        this.accessPwd = value;
    }

    /**
     * Gets the value of the testFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestFlag() {
        return testFlag;
    }

    /**
     * Sets the value of the testFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestFlag(String value) {
        this.testFlag = value;
    }

    /**
     * Gets the value of the timeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeType() {
        return timeType;
    }

    /**
     * Sets the value of the timeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeType(String value) {
        this.timeType = value;
    }

    /**
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneID(String value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the requestingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link RequestingSystem }
     *     
     */
    public RequestingSystem getRequestingSystem() {
        return requestingSystem;
    }

    /**
     * Sets the value of the requestingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestingSystem }
     *     
     */
    public void setRequestingSystem(RequestingSystem value) {
        this.requestingSystem = value;
    }

    /**
     * Gets the value of the thirdPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThirdPartyID() {
        return thirdPartyID;
    }

    /**
     * Sets the value of the thirdPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThirdPartyID(Integer value) {
        this.thirdPartyID = value;
    }

    /**
     * Gets the value of the extParamList property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader.ExtParamList }
     *     
     */
    public RequestHeader.ExtParamList getExtParamList() {
        return extParamList;
    }

    /**
     * Sets the value of the extParamList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader.ExtParamList }
     *     
     */
    public void setExtParamList(RequestHeader.ExtParamList value) {
        this.extParamList = value;
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
     *         &lt;element name="ParameterInfo" type="{http://www.accenture.com/schemas/TOPENG/ESB_RequestingSystem_V_1_0}Param" maxOccurs="unbounded"/&gt;
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
        "parameterInfo"
    })
    public static class ExtParamList
        implements Serializable
    {

        private final static long serialVersionUID = 11082016L;
        @XmlElement(name = "ParameterInfo", required = true)
        protected List<Param> parameterInfo;

        /**
         * Gets the value of the parameterInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameterInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameterInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Param }
         * 
         * 
         */
        public List<Param> getParameterInfo() {
            if (parameterInfo == null) {
                parameterInfo = new ArrayList<Param>();
            }
            return this.parameterInfo;
        }

    }

}
