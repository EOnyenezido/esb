package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import java.math.BigInteger;
import java.util.List;

import org.apache.camel.Exchange;

import com.esb.crm.crmservice.bizmsg.ChangeAppendantProductRequestMsg;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bcservices.FeeQuotationRequest;
import com.huawei.bme.cbsinterface.bcservices.FeeQuotationRequest.ChargeElement;
import com.huawei.bme.cbsinterface.bcservices.FeeQuotationRequest.ChargeElement.FeeAmount;
import com.huawei.bme.cbsinterface.bcservices.FeeQuotationRequest.ChargeObj;
import com.huawei.bme.cbsinterface.bcservices.FeeQuotationRequestMsg;
import com.huawei.bme.cbsinterface.cbscommon.RequestHeader;
import com.huawei.bme.cbsinterface.cbscommon.SecurityInfo;

public class MPFADynamicRouter {
	
	protected ChangeAppendantProductRequestMsg reqMsg = new ChangeAppendantProductRequestMsg();
	
	public String route(Exchange exchange, String previous) {
		if (previous == null) { // first time route is run there is no previous route
			System.out.println("EXCHANGE: " + exchange);
			System.out.println("IN: " + exchange.getIn());
			System.out.println("BODY: " + exchange.getIn().getBody());
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
			
			// Add the FeeQuotation message to the exchange
			exchange.getIn().setBody(feeQuotation, FeeQuotationRequestMsg.class);
			
			return "jms:cbs_mpfa_ds"; // return the queue for the CBS_MPFA_DS route that will invoke CBS downstream for FeeQuotation
			
		} else if ("mock://a".equals(previous)) {
			return "language://simple:Bye ${body}";
		} else {
			return null;
		}
	}

}
