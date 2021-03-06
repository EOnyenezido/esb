
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cbscommon.ChangeSubStatusResult;
import com.huawei.bme.cbsinterface.cbscommon.ResultHeader;


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
 *         &lt;element name="ResultHeader" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}ResultHeader" form="unqualified"/&gt;
 *         &lt;element name="ChangeSubStatusResult" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}ChangeSubStatusResult" minOccurs="0" form="unqualified"/&gt;
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
    "resultHeader",
    "changeSubStatusResult"
})
@XmlRootElement(name = "ChangeSubStatusResultMsg")
public class ChangeSubStatusResultMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "ResultHeader", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "ChangeSubStatusResult")
    protected ChangeSubStatusResult changeSubStatusResult;

    /**
     * Gets the value of the resultHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResultHeader }
     *     
     */
    public ResultHeader getResultHeader() {
        return resultHeader;
    }

    /**
     * Sets the value of the resultHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultHeader }
     *     
     */
    public void setResultHeader(ResultHeader value) {
        this.resultHeader = value;
    }

    /**
     * Gets the value of the changeSubStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubStatusResult }
     *     
     */
    public ChangeSubStatusResult getChangeSubStatusResult() {
        return changeSubStatusResult;
    }

    /**
     * Sets the value of the changeSubStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubStatusResult }
     *     
     */
    public void setChangeSubStatusResult(ChangeSubStatusResult value) {
        this.changeSubStatusResult = value;
    }

}
