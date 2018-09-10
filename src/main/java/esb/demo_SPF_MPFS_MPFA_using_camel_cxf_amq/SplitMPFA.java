package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import java.util.ArrayList;
import java.util.List;
import org.apache.camel.Exchange;

import com.accenture.schemas.topeng.esb_mpfstopeng_v_1_0.MMLCommandDet;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bcservices.ChangeSubIdentityRequestMsg;
import com.huawei.bme.cbsinterface.bcservices.ChangeSubStatusRequestMsg;
import com.huawei.bme.cbsinterface.cbscommon.ChangeSubStatusRequest;
import com.huawei.bme.cbsinterface.cbscommon.RequestHeader;
import com.huawei.bme.cbsinterface.cbscommon.SecurityInfo;

import topeng.esb.DeleteSubscriberRequestMsg;
import topeng.esb.ProvisionSubscriberRequestMsg;

public class SplitMPFA {
	
	public List<Object> splitServiceChange(Exchange exchange)	{
		
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
		
		// Instantiate a Change Sub Status request for CBS the billing system
		ChangeSubStatusRequest cbsChangeSubStatus = new ChangeSubStatusRequest();
		// Set the MSISDN as the new sim MSISDN
		SubAccessCode cbsSubAccessCode = new SubAccessCode();
		cbsSubAccessCode.setPrimaryIdentity(msisdn);
		cbsChangeSubStatus.setSubAccessCode(cbsSubAccessCode);
		// Set the operation type
		cbsChangeSubStatus.setOpType("SIM SWAP");
		// Switch from inactive to active
		cbsChangeSubStatus.setOldStatus("INACTIVE");
		cbsChangeSubStatus.setNewStatus("ACTIVE");
		
		// Instantiate new TopengComamnd part to complete the Change Sub Status Request
		MMLCommandDet cbsTopEngCommand = new MMLCommandDet();
		cbsTopEngCommand.setOperationType("SIM SWAP");
		
		// Add the Change Sub Status request and TopengComamnd part to the request body
		ChangeSubStatusRequestMsg.RequestBody cbsMessageBody = new ChangeSubStatusRequestMsg.RequestBody();
		cbsMessageBody.setChangeSubStatusRequest(cbsChangeSubStatus);
		cbsMessageBody.setTopEngCommand(cbsTopEngCommand);
		
		// Instantiate a new request header for the Change Sub Status Request message
		RequestHeader cbsRequestHeader = new RequestHeader();
		cbsRequestHeader.setVersion("1");
		cbsRequestHeader.setMessageSeq("1234");
		SecurityInfo cbsLoginDetails = new SecurityInfo();
		cbsLoginDetails.setLoginSystemCode("ESB");
		cbsLoginDetails.setPassword("thisisasecurepassword");
		cbsRequestHeader.setAccessSecurity(cbsLoginDetails);
		cbsRequestHeader.setOrderID("1234");
		
		// Instantiate the final Change Sub Status Request message and set the request header and request body
		ChangeSubStatusRequestMsg cbsRequestMsg = new ChangeSubStatusRequestMsg();
		cbsRequestMsg.setRequestBody(cbsMessageBody);
		cbsRequestMsg.setRequestHeader(cbsRequestHeader);
		
		// Add our messages to the list in the order they should be sent
		messages.add(topengDeleteSubscriber); // deletes the old number from the provisioning system topeng
		messages.add(topengProvisionSubscriber); // provisions the new msisdn on the provisioning system topeng
		messages.add(cbsRequestMsg); // provisions the new msisdn on the billing system cbs
		
		// Return the list to our splitter
		System.out.println("No of split messages: " + messages.size());
		return messages;
		
	}

}
