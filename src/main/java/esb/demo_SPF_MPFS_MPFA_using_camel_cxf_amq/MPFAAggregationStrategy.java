/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

import java.math.BigInteger;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import com.huawei.bme.cbsinterface.bcservices.ChangeSubIdentityResultMsg;
import com.huawei.bme.cbsinterface.bcservices.ChangeSubStatusRequestMsg;
import com.huawei.bme.cbsinterface.bcservices.ChangeSubStatusResultMsg;
import com.huawei.bme.cbsinterface.cbscommon.ResultHeader;
import com.huawei.bme.cbsinterface.cbscommon.ResultHeader.AdditionalProperty;

import topeng.esb.DeleteSubscriberResultMsg;
import topeng.esb.ProvisionSubscriberResultMsg;

/**
 * @version $Revision$
 */
public class MPFAAggregationStrategy implements AggregationStrategy {
	
	protected ChangeSubIdentityResultMsg response = new ChangeSubIdentityResultMsg();
	protected ResultHeader responseHeader = new ResultHeader();
	protected BigInteger resultCode = BigInteger.ONE;

    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
    	
        if (oldExchange == null) {    	
        	responseHeader = new ResultHeader(); // clear out the old response header
        	if(newExchange.getIn().getBody(DeleteSubscriberResultMsg.class) instanceof DeleteSubscriberResultMsg)	{
        		resultCode = newExchange.getIn().getBody(DeleteSubscriberResultMsg.class).getCode();
        		if(resultCode.equals(BigInteger.ZERO))	{
        			responseHeader.setResultCode("0");
        			responseHeader.setResultDesc("Operation Successful.");
        			
        		} else	{
        			responseHeader.setResultCode("1");
        			responseHeader.setResultDesc("Operation Failed, please see breakdown below for details.");
        		}
        		AdditionalProperty responseBreakdown = new AdditionalProperty();
        		responseBreakdown.setCode("TOPENG - DeleteSubscriber");
        		responseBreakdown.setValue("Result Code: " + resultCode.toString() + " | " + "Result Description: " + newExchange.getIn().getBody(DeleteSubscriberResultMsg.class).getMessage());
        		List<AdditionalProperty> breakdown = responseHeader.getAdditionalProperty();
        		breakdown.add(responseBreakdown);
        	}
        	
        	response.setResultHeader(responseHeader);
        	newExchange.getIn().setBody(response, ChangeSubIdentityResultMsg.class);
        	
            return newExchange;
        }
        
        if(newExchange.getIn().getBody(ProvisionSubscriberResultMsg.class) instanceof ProvisionSubscriberResultMsg)	{
    		resultCode = newExchange.getIn().getBody(ProvisionSubscriberResultMsg.class).getCode();
    		if(resultCode.equals(BigInteger.ZERO) && oldExchange.getIn().getBody(ChangeSubIdentityResultMsg.class).getResultHeader().getResultCode().equals("0"))	{
    			responseHeader.setResultCode("0");
    			responseHeader.setResultDesc("Operation Successful.");
    		} else	{
    			responseHeader.setResultCode("1");
    			responseHeader.setResultDesc("Operation Failed, please see breakdown below for details.");
    		}
    		AdditionalProperty responseBreakdown = new AdditionalProperty();
    		responseBreakdown.setCode("TOPENG - ProvisionSubscriber");
    		responseBreakdown.setValue("Result Code: " + resultCode.toString() + " | " + "Result Description: " + newExchange.getIn().getBody(ProvisionSubscriberResultMsg.class).getMessage());
    		List<AdditionalProperty> breakdown = responseHeader.getAdditionalProperty();
    		breakdown.add(responseBreakdown);
    		response.setResultHeader(responseHeader);
            oldExchange.getIn().setBody(response, ChangeSubIdentityResultMsg.class);
    	}
        
        if(newExchange.getIn().getBody(ChangeSubStatusResultMsg.class) instanceof ChangeSubStatusResultMsg)	{
    		String cbsResultCode = newExchange.getIn().getBody(ChangeSubStatusResultMsg.class).getResultHeader().getResultCode();
    		if(cbsResultCode.equals("0") && oldExchange.getIn().getBody(ChangeSubIdentityResultMsg.class).getResultHeader().getResultCode().equals("0"))	{
    			responseHeader.setResultCode("0");
    			responseHeader.setResultDesc("Operation Successful.");
    		} else	{
    			responseHeader.setResultCode("1");
    			responseHeader.setResultDesc("Operation Failed, please see breakdown below for details.");
    		}
    		AdditionalProperty responseBreakdown = new AdditionalProperty();
    		responseBreakdown.setCode("CBS - ChangeSubStatus");
    		responseBreakdown.setValue("Result Code: " + cbsResultCode + " | " + "Result Description: " + newExchange.getIn().getBody(ChangeSubStatusResultMsg.class).getResultHeader().getResultDesc());
    		List<AdditionalProperty> breakdown = responseHeader.getAdditionalProperty();
    		breakdown.add(responseBreakdown);
    		response.setResultHeader(responseHeader);
    		oldExchange.getIn().setBody(response, ChangeSubIdentityResultMsg.class);
    	}
        
        return oldExchange;
    }
}
