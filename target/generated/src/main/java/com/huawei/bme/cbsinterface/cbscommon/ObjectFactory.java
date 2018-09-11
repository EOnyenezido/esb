
package com.huawei.bme.cbsinterface.cbscommon;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.bme.cbsinterface.cbscommon package. 
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

    private final static QName _ThirdPartyID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ThirdPartyID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.bme.cbsinterface.cbscommon
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeSubIdentityRequest }
     * 
     */
    public ChangeSubIdentityRequest createChangeSubIdentityRequest() {
        return new ChangeSubIdentityRequest();
    }

    /**
     * Create an instance of {@link ChangeSubStatusRequest }
     * 
     */
    public ChangeSubStatusRequest createChangeSubStatusRequest() {
        return new ChangeSubStatusRequest();
    }

    /**
     * Create an instance of {@link ResultHeader }
     * 
     */
    public ResultHeader createResultHeader() {
        return new ResultHeader();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link SecurityInfo }
     * 
     */
    public SecurityInfo createSecurityInfo() {
        return new SecurityInfo();
    }

    /**
     * Create an instance of {@link OperatorInfo }
     * 
     */
    public OperatorInfo createOperatorInfo() {
        return new OperatorInfo();
    }

    /**
     * Create an instance of {@link OwnershipInfo }
     * 
     */
    public OwnershipInfo createOwnershipInfo() {
        return new OwnershipInfo();
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
     * Create an instance of {@link ChangeSubStatusResult }
     * 
     */
    public ChangeSubStatusResult createChangeSubStatusResult() {
        return new ChangeSubStatusResult();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityRequest.AddSubIdentity }
     * 
     */
    public ChangeSubIdentityRequest.AddSubIdentity createChangeSubIdentityRequestAddSubIdentity() {
        return new ChangeSubIdentityRequest.AddSubIdentity();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityRequest.DelSubIdentity }
     * 
     */
    public ChangeSubIdentityRequest.DelSubIdentity createChangeSubIdentityRequestDelSubIdentity() {
        return new ChangeSubIdentityRequest.DelSubIdentity();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityRequest.ModifySubIdentity }
     * 
     */
    public ChangeSubIdentityRequest.ModifySubIdentity createChangeSubIdentityRequestModifySubIdentity() {
        return new ChangeSubIdentityRequest.ModifySubIdentity();
    }

    /**
     * Create an instance of {@link ChangeSubStatusRequest.AdditionalProperty }
     * 
     */
    public ChangeSubStatusRequest.AdditionalProperty createChangeSubStatusRequestAdditionalProperty() {
        return new ChangeSubStatusRequest.AdditionalProperty();
    }

    /**
     * Create an instance of {@link ResultHeader.AdditionalProperty }
     * 
     */
    public ResultHeader.AdditionalProperty createResultHeaderAdditionalProperty() {
        return new ResultHeader.AdditionalProperty();
    }

    /**
     * Create an instance of {@link RequestHeader.TimeFormat }
     * 
     */
    public RequestHeader.TimeFormat createRequestHeaderTimeFormat() {
        return new RequestHeader.TimeFormat();
    }

    /**
     * Create an instance of {@link RequestHeader.AdditionalProperty }
     * 
     */
    public RequestHeader.AdditionalProperty createRequestHeaderAdditionalProperty() {
        return new RequestHeader.AdditionalProperty();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbscommon", name = "ThirdPartyID")
    public JAXBElement<Integer> createThirdPartyID(Integer value) {
        return new JAXBElement<Integer>(_ThirdPartyID_QNAME, Integer.class, null, value);
    }

}
