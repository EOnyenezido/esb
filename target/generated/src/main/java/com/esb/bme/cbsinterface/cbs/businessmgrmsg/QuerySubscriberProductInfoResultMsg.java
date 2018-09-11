
package com.esb.bme.cbsinterface.cbs.businessmgrmsg;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.esb.bme.cbsinterface.cbs.businessmgr.QuerySubscriberProductInfoResult;
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
 *         &lt;element name="QuerySubscriberProductInfoResult" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}QuerySubscriberProductInfoResult" minOccurs="0" form="unqualified"/&gt;
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
    "querySubscriberProductInfoResult"
})
@XmlRootElement(name = "QuerySubscriberProductInfoResultMsg")
public class QuerySubscriberProductInfoResultMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "ResultHeader", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QuerySubscriberProductInfoResult")
    protected QuerySubscriberProductInfoResult querySubscriberProductInfoResult;

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
     * Gets the value of the querySubscriberProductInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubscriberProductInfoResult }
     *     
     */
    public QuerySubscriberProductInfoResult getQuerySubscriberProductInfoResult() {
        return querySubscriberProductInfoResult;
    }

    /**
     * Sets the value of the querySubscriberProductInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubscriberProductInfoResult }
     *     
     */
    public void setQuerySubscriberProductInfoResult(QuerySubscriberProductInfoResult value) {
        this.querySubscriberProductInfoResult = value;
    }

}
