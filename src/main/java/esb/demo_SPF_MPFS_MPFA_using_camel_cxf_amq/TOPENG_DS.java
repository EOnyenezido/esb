package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class TOPENG_DS extends RouteBuilder {
	
	/**
     * The ALM DS instance exposes two interfaces via JMS, when a message is received it invokes a downstream webservice
     * and converts the response back to JMS for the requesting system
     * The route is transacted to ensure reliable redelivery
     */
    public void configure() {
        
        from("jms:topeng_ds")
        	.routeId("topeng_ds").startupOrder(2) // ensures this is started first before the upstream routes
//        	.process(new Processor() {
//        		public void process(Exchange exchange) throws Exception {
//        			System.out.println("TOPENGGETMESSAGE: " + exchange.getIn().getHeaders().toString());
////        			System.out.println("TOPENGGETBODY: " + exchange.getIn().getBody().toString());
//        	}})
        	.to("cxf:bean:downstreamTOPENG");
        
    }

}
