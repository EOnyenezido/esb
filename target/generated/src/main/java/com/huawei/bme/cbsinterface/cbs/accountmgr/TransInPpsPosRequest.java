
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransInPpsPosRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransInPpsPosRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="LogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransfereeNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransferorNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransferFlag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransferAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransInPpsPosRequest", propOrder = {

})
public class TransInPpsPosRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "LogID")
    protected String logID;
    @XmlElement(name = "TransfereeNo", required = true)
    protected String transfereeNo;
    @XmlElement(name = "TransferorNo", required = true)
    protected String transferorNo;
    @XmlElement(name = "TransferFlag")
    protected int transferFlag;
    @XmlElement(name = "TransferAmt")
    protected long transferAmt;
    @XmlElement(name = "CustID")
    protected String custID;

    /**
     * Gets the value of the logID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogID() {
        return logID;
    }

    /**
     * Sets the value of the logID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogID(String value) {
        this.logID = value;
    }

    /**
     * Gets the value of the transfereeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransfereeNo() {
        return transfereeNo;
    }

    /**
     * Sets the value of the transfereeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransfereeNo(String value) {
        this.transfereeNo = value;
    }

    /**
     * Gets the value of the transferorNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferorNo() {
        return transferorNo;
    }

    /**
     * Sets the value of the transferorNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferorNo(String value) {
        this.transferorNo = value;
    }

    /**
     * Gets the value of the transferFlag property.
     * 
     */
    public int getTransferFlag() {
        return transferFlag;
    }

    /**
     * Sets the value of the transferFlag property.
     * 
     */
    public void setTransferFlag(int value) {
        this.transferFlag = value;
    }

    /**
     * Gets the value of the transferAmt property.
     * 
     */
    public long getTransferAmt() {
        return transferAmt;
    }

    /**
     * Sets the value of the transferAmt property.
     * 
     */
    public void setTransferAmt(long value) {
        this.transferAmt = value;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
    }

}
