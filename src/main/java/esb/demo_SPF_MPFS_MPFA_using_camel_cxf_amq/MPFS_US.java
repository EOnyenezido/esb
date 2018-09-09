package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import com.huawei.bme.cbsinterface.bcservices.ChangeSubIdentityRequestMsg;

import topeng.esb.DeleteSubscriberRequestMsg;
import topeng.esb.ProvisionSubscriberRequestMsg;

/**
 * MPFS_US application receives the requests from the upstream systems, validates
 * and splits them into different messages for different downstream systems and sends to AMQ
 * for the DS instances to pick up. When the downstream systems responds, it aggregates the responses and sends
 * back to the requesting system
 * A queue is used between them to maintain high scalability
 */
public class MPFS_US extends RouteBuilder {

    /**
     * The camel route exposes a SOAF webservice via CXF and sends the request to a JMS queue
     * The route is transacted to ensure reliable redelivery
     */
    public void configure() {
        
        from("cxf:bean:mpfsEndpoint")
        	.routeId("mpfs_us").startupOrder(11) // ensures all ds engines are started first
        	.to("log:initial")
        	.split().method(SplitMPFS.class, "splitChangeSubIdentity").aggregationStrategy(new MPFSAggregationStrategy()) // splits the incoming message into different messages for different downstream systems
//        	.to("log:split")
        	.choice()
        		.when(body().isInstanceOf(DeleteSubscriberRequestMsg.class))
        			.setHeader("operationName", constant("DeleteSubscriber"))
        			.setHeader("operationNamespace", constant("http://esb.topeng"))
        			.setHeader("soapAction", constant("DeleteSubscriber"))
//        			.to("log:deleteSubscriber")
        			.to("jms:topeng_ds")
        		.when(body().isInstanceOf(ProvisionSubscriberRequestMsg.class))
        			.setHeader("operationName", constant("ProvisionSubscriber"))
    				.setHeader("operationNamespace", constant("http://esb.topeng"))
    				.setHeader("soapAction", constant("ProvisionSubscriber"))
//        			.to("log:provisionSubscriber")
        			.to("jms:topeng_ds");
        
    }
}