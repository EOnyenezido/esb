package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class CBS_MPFS_DS extends RouteBuilder {
	
	/**
     * The ALM DS instance exposes two interfaces via JMS, when a message is received it invokes a downstream webservice
     * and converts the response back to JMS for the requesting system
     * The route is transacted to ensure reliable redelivery
     */
    public void configure() {
        
        from("jms:cbs_mpfs_ds")
        	.routeId("cbs_mpfs_ds").startupOrder(3) // ensures this is started first before the upstream routes
        	.to("cxf:bean:downstreamCBSMPFS");
        
    }

}
