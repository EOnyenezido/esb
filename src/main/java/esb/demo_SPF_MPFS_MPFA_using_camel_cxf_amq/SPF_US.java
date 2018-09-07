package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import org.apache.camel.builder.RouteBuilder;

/**
 * SPF_US application receives the requests from the upstream systems, validates and transforms to JMS and sends to AMQ for SPF_DS to pick up
 * A queue is used between them to maintain high scalability
 */
public class SPF_US extends RouteBuilder {

    /**
     * The camel route exposes a SOAF webservice via CXF and sends the request to a JMS queue
     * The route is transacted to ensure reliable redelivery
     */
    public void configure() {
        
        from("cxf:bean:spfEndpoint")
        	.routeId("spf_us").startupOrder(2) // ensures spf_ds is started first
        	.to("jms:spf_ds");
        
    }
}