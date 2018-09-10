package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import com.huawei.bme.cbsinterface.bcservices.ChangeSubIdentityRequestMsg;
import com.huawei.bme.cbsinterface.bcservices.ChangeSubStatusRequestMsg;

import topeng.esb.DeleteSubscriberRequestMsg;
import topeng.esb.ProvisionSubscriberRequestMsg;

/**
 * MPFA_US application receives the requests from the upstream systems and sends back an acknowledgement. It then validates
 * and splits them into different messages for different downstream systems and sends to AMQ
 * for the DS instances to pick up. When the downstream systems responds, it aggregates the responses and triggers a callback
 * to the requesting system
 * A queue is used between them to maintain high scalability
 */
public class MPFA_US extends RouteBuilder {

    /**
     * The camel route exposes a SOAF webservice via CXF and sends the request to a JMS queue
     * The route is transacted to ensure reliable redelivery
     */
    public void configure() {
        
        from("cxf:bean:mpfaEndpoint")
        	.routeId("ack_us").startupOrder(13) // ensures the main processing route below is started first
        	.to("log:ack")
        	.wireTap("seda:incoming") // copy the request to the route below that does the processing
        	.bean(AckResponse.class, "replyOk"); // send an ack back to the requesting system
        
        from("seda:incoming")
        	.routeId("mpfa_us").startupOrder(12) // starts this route before the one above
        	.to("log:mpfa")
        	.split().method(SplitMPFA.class, "splitServiceChange").aggregationStrategy(new MPFAAggregationStrategy()) // splits the incoming message into different messages for different downstream systems
        	.to("log:split")
        	.dynamicRouter().method(MPFADynamicRouter.class, "route") // routes the messages dynamically based on the result of the previous requests including rollbacks
        	.end()
        	.to("log:callback")
        	.to("cxf:bean:downstreamCRM"); // sends the callback to the CRM system
        
    }
}