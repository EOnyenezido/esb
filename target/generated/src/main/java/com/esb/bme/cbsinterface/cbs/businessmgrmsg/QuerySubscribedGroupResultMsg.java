
package com.esb.bme.cbsinterface.cbs.businessmgrmsg;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.esb.bme.cbsinterface.cbs.businessmgr.QuerySubscribedGroupResult;
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
 *         &lt;element name="QuerySubscribedGroupResult" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}QuerySubscribedGroupResult" minOccurs="0" form="unqualified"/&gt;
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
    "querySubscribedGroupResult"
})
@XmlRootElement(name = "QuerySubscribedGroupResultMsg")
public class QuerySubscribedGroupResultMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "ResultHeader", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QuerySubscribedGroupResult")
    protected QuerySubscribedGroupResult querySubscribedGroupResult;

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
     * Gets the value of the querySubscribedGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubscribedGroupResult }
     *     
     */
    public QuerySubscribedGroupResult getQuerySubscribedGroupResult() {
        return querySubscribedGroupResult;
    }

    /**
     * Sets the value of the querySubscribedGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubscribedGroupResult }
     *     
     */
    public void setQuerySubscribedGroupResult(QuerySubscribedGroupResult value) {
        this.querySubscribedGroupResult = value;
    }

}
