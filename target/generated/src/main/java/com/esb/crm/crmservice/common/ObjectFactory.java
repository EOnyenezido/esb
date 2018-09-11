
package com.esb.crm.crmservice.common;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.esb.crm.crmservice.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.esb.crm.crmservice.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link ResultHeader }
     * 
     */
    public ResultHeader createResultHeader() {
        return new ResultHeader();
    }

    /**
     * Create an instance of {@link SessionEntityType }
     * 
     */
    public SessionEntityType createSessionEntityType() {
        return new SessionEntityType();
    }

}
