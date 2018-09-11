package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class CBS_MPFA_DS extends RouteBuilder {
	
	/**
     * The ALM DS instance exposes two interfaces via JMS, when a message is received it invokes a downstream webservice
     * and converts the response back to JMS for the requesting system
     * The route is transacted to ensure reliable redelivery
     */
    public void configure() {
        
        from("jms:cbs_mpfa_ds")
        	.routeId("cbs_mpfa_ds").startupOrder(4) // ensures this is started first before the upstream routes
        	.setHeader("operationName", constant("FeeQuotation"))
			.setHeader("operationNamespace", constant("http://www.huawei.com/bme/cbsinterface/bcservices"))
			.setHeader("soapAction", constant("FeeQuotation"))
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
				System.out.println("THIS IS NAME: " + exchange.getIn().getBody());
				}
				})
        	.to("cxf:bean:downstreamCBS_2");
        
    }

}
