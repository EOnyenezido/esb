package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import java.util.ArrayList;
import java.util.List;
import org.apache.camel.Exchange;
import com.huawei.bme.cbsinterface.bcservices.ChangeSubIdentityRequestMsg;
import topeng.esb.DeleteSubscriberRequestMsg;
import topeng.esb.ProvisionSubscriberRequestMsg;

public class SplitMPFS {
	
	public List<Object> splitChangeSubIdentity(Exchange exchange)	{
		
		List <Object> messages = new ArrayList<Object>();
		
		// get an instance of the request message
		ChangeSubIdentityRequestMsg req = exchange.getIn().getBody(ChangeSubIdentityRequestMsg.class);
		System.out.println("Received XML order: " + req);
		
		// Create the topeng Delete Subscriber request message
		
		// First get the msisdn from the request message
		String msisdn = req.getRequestBody().getChangeSubIdentityRequest().getSubAccessCode().getPrimaryIdentity();
		
		// Instantiate a new Delete Subscriber request
		DeleteSubscriberRequestMsg topengDeleteSubscriber = new DeleteSubscriberRequestMsg();
		
		// Set the MSISDN
		topengDeleteSubscriber.setMsisdn(msisdn);
		
		// Get the new IMSI for the subscriber from the request message
		String imsi = req.getRequestBody().getChangeSubIdentityRequest().getModifySubIdentity().get(0).getNewSubIdentity();
		
		// Instantiate a new Provision Subscriber request
		ProvisionSubscriberRequestMsg topengProvisionSubscriber = new ProvisionSubscriberRequestMsg();
		
		// Set the IMSI and MSISDN
		topengProvisionSubscriber.setImsi(imsi);
		topengProvisionSubscriber.setMsisdn(msisdn);
		
		// Add our messages to the list in the order they should be sent
		messages.add(topengDeleteSubscriber);
		messages.add(topengProvisionSubscriber);
		
		// Return the list to our splitter
		System.out.println("No of split messages: " + messages.size());
		return messages;
		
	}

}
