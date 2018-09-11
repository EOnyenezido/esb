
package com.accenture.schemas.topeng.esb_requestingsystem_v_1_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="RequestHeader" type="{http://www.accenture.com/schemas/TOPENG/ESB_RequestingSystem_V_1_0}RequestHeader"/&gt;
 *         &lt;element name="RetCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RetMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ResponseHeader", propOrder = {

})
public class ResponseHeader
    implements Serializable
{

    private final static long serialVersionUID = 11082016L;
    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "RetCode", required = true)
    protected String retCode;
    @XmlElement(name = "RetMsg")
    protected String retMsg;
    @XmlElement(name = "ThirdPartyID")
    protected Integer thirdPartyID;
    @XmlElement(name = "ExtParamList")
    protected ResponseHeader.ExtParamList extParamList;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the retCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetCode() {
        return retCode;
    }

    /**
     * Sets the value of the retCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetCode(String value) {
        this.retCode = value;
    }

    /**
     * Gets the value of the retMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetMsg() {
        return retMsg;
    }

    /**
     * Sets the value of the retMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetMsg(String value) {
        this.retMsg = value;
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
     *     {@link ResponseHeader.ExtParamList }
     *     
     */
    public ResponseHeader.ExtParamList getExtParamList() {
        return extParamList;
    }

    /**
     * Sets the value of the extParamList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader.ExtParamList }
     *     
     */
    public void setExtParamList(ResponseHeader.ExtParamList value) {
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
