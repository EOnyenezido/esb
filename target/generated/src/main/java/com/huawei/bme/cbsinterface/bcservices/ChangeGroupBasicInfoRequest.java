
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupBasicInfo;


/**
 * <p>Java class for ChangeGroupBasicInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeGroupBasicInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *         &lt;element name="SubGroupBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupBasicInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeGroupBasicInfoRequest", propOrder = {
    "subGroupAccessCode",
    "subGroupBasicInfo"
})
public class ChangeGroupBasicInfoRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubGroupAccessCode", required = true)
    protected SubGroupAccessCode subGroupAccessCode;
    @XmlElement(name = "SubGroupBasicInfo", required = true)
    protected SubGroupBasicInfo subGroupBasicInfo;

    /**
     * Gets the value of the subGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }

    /**
     * Sets the value of the subGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public void setSubGroupAccessCode(SubGroupAccessCode value) {
        this.subGroupAccessCode = value;
    }

    /**
     * Gets the value of the subGroupBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupBasicInfo }
     *     
     */
    public SubGroupBasicInfo getSubGroupBasicInfo() {
        return subGroupBasicInfo;
    }

    /**
     * Sets the value of the subGroupBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupBasicInfo }
     *     
     */
    public void setSubGroupBasicInfo(SubGroupBasicInfo value) {
        this.subGroupBasicInfo = value;
    }

}
