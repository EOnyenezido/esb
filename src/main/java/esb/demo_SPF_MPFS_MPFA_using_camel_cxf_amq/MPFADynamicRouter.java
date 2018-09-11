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
	
	public String route(Exchange exchange, String previous) {
		System.out.println("PREVIOUS: " + previous);
		if (previous.contains("FeeQuotationRequestMsg")) { // fee quotation is first sent from the router
			System.out.println("EXCHANGE: " + exchange);
			System.out.println("IN: " + exchange.getIn());
			System.out.println("BODY: " + exchange.getIn().getBody());			
			
			return "jms:cbs_mpfa_ds"; // return the queue for the CBS_MPFA_DS route that will invoke CBS downstream for FeeQuotation
			
		} 
//		else if ("mock://a".equals(previous)) {
//			return "language://simple:Bye ${body}";
//		}
		else {
			return null;
		}
	}

}
