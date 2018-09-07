package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import org.apache.camel.builder.RouteBuilder;

public class SPF_DS extends RouteBuilder {
	
	/**
     * The camel route exposes a SOAF webservice via CXF and sends the request to a JMS queue
     * The route is transacted to ensure reliable redelivery
     */
    public void configure() {
        
        from("jms:spf_ds")
        	.routeId("spf_ds").startupOrder(1) // ensures spf_ds is started first
        	.to("cxf:bean:downstreamCBS");
        
    }

}
