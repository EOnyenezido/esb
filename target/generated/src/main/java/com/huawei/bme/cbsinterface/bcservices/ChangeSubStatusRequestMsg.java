
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.accenture.schemas.topeng.esb_mpfstopeng_v_1_0.MMLCommandDet;
import com.huawei.bme.cbsinterface.cbscommon.ChangeSubStatusRequest;
import com.huawei.bme.cbsinterface.cbscommon.RequestHeader;


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
 *         &lt;element name="RequestHeader" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}RequestHeader" form="unqualified"/&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ChangeSubStatusRequest" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}ChangeSubStatusRequest" form="unqualified"/&gt;
 *                   &lt;element name="TopEngCommand" type="{http://www.accenture.com/schemas/TOPENG/ESB_MPFSTOPENG_V_1_0}MMLCommandDet"/&gt;
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
    "requestHeader",
    "requestBody"
})
@XmlRootElement(name = "ChangeSubStatusRequestMsg")
public class ChangeSubStatusRequestMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "RequestBody", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
    protected ChangeSubStatusRequestMsg.RequestBody requestBody;

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
     * Gets the value of the requestBody property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubStatusRequestMsg.RequestBody }
     *     
     */
    public ChangeSubStatusRequestMsg.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * Sets the value of the requestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubStatusRequestMsg.RequestBody }
     *     
     */
    public void setRequestBody(ChangeSubStatusRequestMsg.RequestBody value) {
        this.requestBody = value;
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
     *         &lt;element name="ChangeSubStatusRequest" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}ChangeSubStatusRequest" form="unqualified"/&gt;
     *         &lt;element name="TopEngCommand" type="{http://www.accenture.com/schemas/TOPENG/ESB_MPFSTOPENG_V_1_0}MMLCommandDet"/&gt;
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
        "changeSubStatusRequest",
        "topEngCommand"
    })
    public static class RequestBody
        implements Serializable
    {

        private final static long serialVersionUID = 11082017L;
        @XmlElement(name = "ChangeSubStatusRequest", required = true)
        protected ChangeSubStatusRequest changeSubStatusRequest;
        @XmlElement(name = "TopEngCommand", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected MMLCommandDet topEngCommand;

        /**
         * Gets the value of the changeSubStatusRequest property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubStatusRequest }
         *     
         */
        public ChangeSubStatusRequest getChangeSubStatusRequest() {
            return changeSubStatusRequest;
        }

        /**
         * Sets the value of the changeSubStatusRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubStatusRequest }
         *     
         */
        public void setChangeSubStatusRequest(ChangeSubStatusRequest value) {
            this.changeSubStatusRequest = value;
        }

        /**
         * Gets the value of the topEngCommand property.
         * 
         * @return
         *     possible object is
         *     {@link MMLCommandDet }
         *     
         */
        public MMLCommandDet getTopEngCommand() {
            return topEngCommand;
        }

        /**
         * Sets the value of the topEngCommand property.
         * 
         * @param value
         *     allowed object is
         *     {@link MMLCommandDet }
         *     
         */
        public void setTopEngCommand(MMLCommandDet value) {
            this.topEngCommand = value;
        }

    }

}
