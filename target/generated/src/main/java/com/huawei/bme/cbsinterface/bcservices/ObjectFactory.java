
package com.huawei.bme.cbsinterface.bcservices;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.bme.cbsinterface.bcservices package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.bme.cbsinterface.bcservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeSubStatusRequestMsg }
     * 
     */
    public ChangeSubStatusRequestMsg createChangeSubStatusRequestMsg() {
        return new ChangeSubStatusRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityRequestMsg }
     * 
     */
    public ChangeSubIdentityRequestMsg createChangeSubIdentityRequestMsg() {
        return new ChangeSubIdentityRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeSubStatusRequestMsg.RequestBody }
     * 
     */
    public ChangeSubStatusRequestMsg.RequestBody createChangeSubStatusRequestMsgRequestBody() {
        return new ChangeSubStatusRequestMsg.RequestBody();
    }

    /**
     * Create an instance of {@link ChangeSubStatusResultMsg }
     * 
     */
    public ChangeSubStatusResultMsg createChangeSubStatusResultMsg() {
        return new ChangeSubStatusResultMsg();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityRequestMsg.RequestBody }
     * 
     */
    public ChangeSubIdentityRequestMsg.RequestBody createChangeSubIdentityRequestMsgRequestBody() {
        return new ChangeSubIdentityRequestMsg.RequestBody();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityResultMsg }
     * 
     */
    public ChangeSubIdentityResultMsg createChangeSubIdentityResultMsg() {
        return new ChangeSubIdentityResultMsg();
    }

}
