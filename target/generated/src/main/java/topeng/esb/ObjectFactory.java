
package topeng.esb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the topeng.esb package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: topeng.esb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteSubscriberRequestMsg }
     * 
     */
    public DeleteSubscriberRequestMsg createDeleteSubscriberRequestMsg() {
        return new DeleteSubscriberRequestMsg();
    }

    /**
     * Create an instance of {@link ProvisionSubscriberRequestMsg }
     * 
     */
    public ProvisionSubscriberRequestMsg createProvisionSubscriberRequestMsg() {
        return new ProvisionSubscriberRequestMsg();
    }

    /**
     * Create an instance of {@link DeleteSubscriberResultMsg }
     * 
     */
    public DeleteSubscriberResultMsg createDeleteSubscriberResultMsg() {
        return new DeleteSubscriberResultMsg();
    }

    /**
     * Create an instance of {@link ProvisionSubscriberResultMsg }
     * 
     */
    public ProvisionSubscriberResultMsg createProvisionSubscriberResultMsg() {
        return new ProvisionSubscriberResultMsg();
    }

}
