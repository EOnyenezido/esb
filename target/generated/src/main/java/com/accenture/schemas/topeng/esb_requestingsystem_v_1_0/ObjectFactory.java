
package com.accenture.schemas.topeng.esb_requestingsystem_v_1_0;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.accenture.schemas.topeng.esb_requestingsystem_v_1_0 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.accenture.schemas.topeng.esb_requestingsystem_v_1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseHeader }
     * 
     */
    public ResponseHeader createResponseHeader() {
        return new ResponseHeader();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link RequestingSystem }
     * 
     */
    public RequestingSystem createRequestingSystem() {
        return new RequestingSystem();
    }

    /**
     * Create an instance of {@link ServiceContext }
     * 
     */
    public ServiceContext createServiceContext() {
        return new ServiceContext();
    }

    /**
     * Create an instance of {@link Param }
     * 
     */
    public Param createParam() {
        return new Param();
    }

    /**
     * Create an instance of {@link ResponseHeader.ExtParamList }
     * 
     */
    public ResponseHeader.ExtParamList createResponseHeaderExtParamList() {
        return new ResponseHeader.ExtParamList();
    }

    /**
     * Create an instance of {@link RequestHeader.ExtParamList }
     * 
     */
    public RequestHeader.ExtParamList createRequestHeaderExtParamList() {
        return new RequestHeader.ExtParamList();
    }

}
