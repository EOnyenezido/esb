
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.Statement;
import com.huawei.bme.cbsinterface.bccommon.StatementScenario;


/**
 * <p>Java class for AddStatementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddStatementRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegisterCust" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *         &lt;element name="Statement" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Statement"/&gt;
 *         &lt;element name="StatementScenario" type="{http://www.huawei.com/bme/cbsinterface/bccommon}StatementScenario" minOccurs="0"/&gt;
 *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddStatementRequest", propOrder = {
    "registerCust",
    "statement",
    "statementScenario",
    "addressInfo",
    "effectiveTime"
})
public class AddStatementRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "RegisterCust", required = true)
    protected CustAccessCode registerCust;
    @XmlElement(name = "Statement", required = true)
    protected Statement statement;
    @XmlElement(name = "StatementScenario")
    protected StatementScenario statementScenario;
    @XmlElement(name = "AddressInfo")
    protected Address addressInfo;
    @XmlElement(name = "EffectiveTime", required = true)
    protected EffectMode effectiveTime;

    /**
     * Gets the value of the registerCust property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccessCode }
     *     
     */
    public CustAccessCode getRegisterCust() {
        return registerCust;
    }

    /**
     * Sets the value of the registerCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccessCode }
     *     
     */
    public void setRegisterCust(CustAccessCode value) {
        this.registerCust = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setStatement(Statement value) {
        this.statement = value;
    }

    /**
     * Gets the value of the statementScenario property.
     * 
     * @return
     *     possible object is
     *     {@link StatementScenario }
     *     
     */
    public StatementScenario getStatementScenario() {
        return statementScenario;
    }

    /**
     * Sets the value of the statementScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementScenario }
     *     
     */
    public void setStatementScenario(StatementScenario value) {
        this.statementScenario = value;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddressInfo(Address value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link EffectMode }
     *     
     */
    public EffectMode getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectMode }
     *     
     */
    public void setEffectiveTime(EffectMode value) {
        this.effectiveTime = value;
    }

}
