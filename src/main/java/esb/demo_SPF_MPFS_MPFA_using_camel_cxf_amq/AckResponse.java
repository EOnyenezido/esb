package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import org.apache.camel.Exchange;

import com.esb.crm.crmservice.bizmsg.ChangeAppendantProductRequestMsg;
import com.esb.crm.crmservice.bizmsg.ChangeAppendantProductResultMsg;
import com.esb.crm.crmservice.common.ResultHeader;

public class AckResponse {
	
	public ChangeAppendantProductResultMsg replyOk(Exchange exchange)	{
		
		ChangeAppendantProductRequestMsg request = exchange.getIn().getBody(ChangeAppendantProductRequestMsg.class);
		
		// Generate a new ACK response
		ChangeAppendantProductResultMsg reply = new ChangeAppendantProductResultMsg();
		ResultHeader resultHeader = new ResultHeader();
		
		// Set reply message
		resultHeader.setResultCode("0");
		resultHeader.setResultDesc("Order Received Successfully. Callback will be sent on order completion.");
		resultHeader.setCommandId(request.getRequestHeader().getCommandId());
		resultHeader.setVersion(request.getRequestHeader().getVersion());
		resultHeader.setTransactionId(request.getRequestHeader().getTransactionId());
		resultHeader.setSequenceId(request.getRequestHeader().getSequenceId());
		reply.setResultHeader(resultHeader);
		
		return reply;
		
	}

}
