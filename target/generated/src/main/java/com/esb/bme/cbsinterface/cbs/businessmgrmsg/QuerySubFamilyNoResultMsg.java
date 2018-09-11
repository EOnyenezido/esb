
package com.esb.bme.cbsinterface.cbs.businessmgrmsg;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.esb.bme.cbsinterface.cbs.businessmgr.QuerySubFamilyNoResult;
import com.esb.bme.cbsinterface.common.ResultHeader;


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
 *         &lt;element name="ResultHeader" type="{http://www.esb.com/bme/cbsinterface/common}ResultHeader" form="unqualified"/&gt;
 *         &lt;element name="QuerySubFamilyNoResult" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}QuerySubFamilyNoResult" minOccurs="0" form="unqualified"/&gt;
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
    "querySubFamilyNoResult"
})
@XmlRootElement(name = "QuerySubFamilyNoResultMsg")
public class QuerySubFamilyNoResultMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "ResultHeader", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QuerySubFamilyNoResult")
    protected QuerySubFamilyNoResult querySubFamilyNoResult;

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
     * Gets the value of the querySubFamilyNoResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubFamilyNoResult }
     *     
     */
    public QuerySubFamilyNoResult getQuerySubFamilyNoResult() {
        return querySubFamilyNoResult;
    }

    /**
     * Sets the value of the querySubFamilyNoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubFamilyNoResult }
     *     
     */
    public void setQuerySubFamilyNoResult(QuerySubFamilyNoResult value) {
        this.querySubFamilyNoResult = value;
    }

}
