
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceHandleFeeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceHandleFeeResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeductionAmt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResidualFreeTimes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHandleFeeResult", propOrder = {
    "deductionAmt",
    "residualFreeTimes",
    "acctChgRec"
})
public class ServiceHandleFeeResult
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "DeductionAmt")
    protected int deductionAmt;
    @XmlElement(name = "ResidualFreeTimes")
    protected int residualFreeTimes;
    @XmlElement(name = "AcctChgRec")
    protected List<AcctChgRecType> acctChgRec;

    /**
     * Gets the value of the deductionAmt property.
     * 
     */
    public int getDeductionAmt() {
        return deductionAmt;
    }

    /**
     * Sets the value of the deductionAmt property.
     * 
     */
    public void setDeductionAmt(int value) {
        this.deductionAmt = value;
    }

    /**
     * Gets the value of the residualFreeTimes property.
     * 
     */
    public int getResidualFreeTimes() {
        return residualFreeTimes;
    }

    /**
     * Sets the value of the residualFreeTimes property.
     * 
     */
    public void setResidualFreeTimes(int value) {
        this.residualFreeTimes = value;
    }

    /**
     * Gets the value of the acctChgRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctChgRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctChgRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctChgRecType }
     * 
     * 
     */
    public List<AcctChgRecType> getAcctChgRec() {
        if (acctChgRec == null) {
            acctChgRec = new ArrayList<AcctChgRecType>();
        }
        return this.acctChgRec;
    }

}
