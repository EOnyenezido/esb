//package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;
//
//import java.net.ConnectException;
//
//import org.apache.camel.Exchange;
//import org.apache.camel.Processor;
//import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.component.mock.MockEndpoint;
//import org.apache.camel.model.RouteDefinition;
//import org.apache.camel.test.spring.CamelSpringTestSupport;
//import org.junit.Test;
//import org.springframework.context.support.AbstractXmlApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.huawei.bme.cbsinterface.cbs.accountmgr.ExchangeAccountRequest;
//import com.huawei.bme.cbsinterface.cbs.accountmgr.QueryBalanceRequest;
//import com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountRequestMsg;
//import com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountResultMsg;
//import com.huawei.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceRequestMsg;
//import com.huawei.bme.cbsinterface.common.RequestHeader;
//
//import order.InputOrder;
//import order.OutputOrder;
//
//
//public class SpfUnitTests extends CamelSpringTestSupport {
//
//	@Override
//    protected AbstractXmlApplicationContext createApplicationContext() {
//        // load the camel context spring file from this classpath
//        return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
//    }
//	
//	@Test
//    public void testSimulateErrorUsingInterceptors() throws Exception {
//        // get our spf_us route for testing
//        RouteDefinition upstreamRoute = context.getRouteDefinition("spf_us");
//
//        // advice the route by enriching it with the route builder where
//        // we add a couple of interceptors to help simulate the error
//        upstreamRoute.adviceWith(context, new RouteBuilder() {
//            @Override
//            public void configure() throws Exception {
//                // intercept sending to http and detour to our processor instead
////                interceptSendToEndpoint("http://*")
////                    // skip sending to the real http when the detour ends
////                    .skipSendToOriginalEndpoint()
////                    .process(new SimulateHttpErrorProcessor());
//
//                // intercept from jms endpoint and validate that the message is being sent
//                interceptSendToEndpoint("jms:spf_ds")
//                    // skip sending to the real jms endpoint
//                    .skipSendToOriginalEndpoint()
//                    .to("mock:jms");
//            }
//        });
//
//        // our mock should receive the message
//        MockEndpoint mock = getMockEndpoint("mock:jms");
//        mock.expectedMessageCount(1);
//        
////        RequestHeader sampleHeader = new RequestHeader();
////        QueryBalanceRequest sampleMessage = new QueryBalanceRequest();
////        QueryBalanceRequestMsg sampleMessage1 = new QueryBalanceRequestMsg();
////        sampleMessage1.setQueryBalanceRequest(sampleMessage);
////        sampleMessage1.setRequestHeader(sampleHeader);
////        ExchangeAccountResultMsg sampleMessage2 = new ExchangeAccountResultMsg();
//        
////        Thread.sleep(5000);
//        
////        Object result = template.requestBody("cxf:bean:spfEndpoint", sampleMessage1);
//
//        // start the test by creating a file that gets picked up by the route
////        template.sendBody("cxf:bean:spfEndpoint", sampleMessage1);
//        InputOrder input = new InputOrder();
//        input.setCustomerId("4444");
//        input.setRefNo("57123");
//        input.setPartId("333");
//        input.setAmount("50");
//
//        // give CXF time to wake up
//        Thread.sleep(2000);
//
//        OutputOrder reply = template.requestBody("cxf:bean:spfEndpoint", input, OutputOrder.class);
//
//        // assert our test passes
//        assertMockEndpointsSatisfied();
//    }
//	
//	private class SimulateHttpErrorProcessor implements Processor {
//
//        public void process(Exchange exchange) throws Exception {
//            // simulate the error by thrown the exception
//            throw new ConnectException("Simulated connection error");
//        }
//
//    }
//	
//}
