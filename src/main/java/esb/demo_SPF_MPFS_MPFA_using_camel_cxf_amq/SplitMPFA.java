package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.apache.camel.Exchange;

import com.accenture.schemas.topeng.esb_mpfstopeng_v_1_0.MMLCommandDet;
import com.esb.crm.crmservice.bizmsg.ChangeAppendantProductRequestMsg;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bcservices.ChangeSubIdentityRequestMsg;
import com.huawei.bme.cbsinterface.bcservices.ChangeSubStatusRequestMsg;
import com.huawei.bme.cbsinterface.bcservices.FeeQuotationRequest;
import com.huawei.bme.cbsinterface.bcservices.FeeQuotationRequestMsg;
import com.huawei.bme.cbsinterface.bcservices.FeeQuotationRequest.ChargeElement;
import com.huawei.bme.cbsinterface.bcservices.FeeQuotationRequest.ChargeObj;
import com.huawei.bme.cbsinterface.bcservices.FeeQuotationRequest.ChargeElement.FeeAmount;
import com.huawei.bme.cbsinterface.cbscommon.ChangeSubStatusRequest;
import com.huawei.bme.cbsinterface.cbscommon.RequestHeader;
import com.huawei.bme.cbsinterface.cbscommon.SecurityInfo;

import topeng.esb.DeleteSubscriberRequestMsg;
import topeng.esb.ProvisionSubscriberRequestMsg;

public class SplitMPFA {
	
	protected ChangeAppendantProductRequestMsg reqMsg = new ChangeAppendantProductRequestMsg();
	
	public List<Object> splitServiceChange(Exchange exchange)	{
		
		List <Object> messages = new ArrayList<Object>();
		
		// Get the request message from the exchange
	    reqMsg = exchange.getIn().getBody(ChangeAppendantProductRequestMsg.class);
	    
	    // Generate a new FeeQuotation request message
	    FeeQuotationRequestMsg feeQuotation = new FeeQuotationRequestMsg();
	    
	    // Generate a request header for the FeeQuotation request message
	    RequestHeader feeQuotationRequestHeader = new RequestHeader();
	    feeQuotationRequestHeader.setVersion(reqMsg.getRequestHeader().getVersion());
	    feeQuotationRequestHeader.setOrderID(reqMsg.getRequestHeader().getTransactionId());
	    feeQuotationRequestHeader.setMessageSeq(reqMsg.getRequestHeader().getTransactionId());
	    SecurityInfo access = new SecurityInfo();
	    access.setLoginSystemCode("ESB");
	    access.setPassword("supersecurepassword");
	    feeQuotationRequestHeader.setAccessSecurity(access);
	    
	    // Generate a request body for the request message
	    FeeQuotationRequest feeQuotationRequestBody = new FeeQuotationRequest();
	    ChargeObj charge = new ChargeObj();
	    SubAccessCode code = new SubAccessCode();
	    code.setPrimaryIdentity("7035382411");
	    charge.setSubAccessCode(code);
	    feeQuotationRequestBody.setChargeObj(charge);
	    ChargeElement chargeElement = new ChargeElement();
	    FeeAmount amount = new FeeAmount();			
	    amount.setChargeAmt(2000);
	    amount.setChargeCode("NGN");
	    amount.setCurrencyID(BigInteger.ONE);
	    List<FeeAmount> feeAmount = chargeElement.getFeeAmount();
	    feeAmount.add(amount);
	    feeQuotationRequestBody.setChargeElement(chargeElement);
	    
	    // Add the request header and request body to the request message
	    feeQuotation.setFeeQuotationRequest(feeQuotationRequestBody);
	    feeQuotation.setRequestHeader(feeQuotationRequestHeader);
		
		// Add our messages to the list in the order they should be sent
		messages.add(feeQuotation); // Queries the subscriber balance to see if they have enough credit
		
		// Return the list to our splitter
		System.out.println("No of split messages: " + messages.size());
		return messages;
		
	}

}
