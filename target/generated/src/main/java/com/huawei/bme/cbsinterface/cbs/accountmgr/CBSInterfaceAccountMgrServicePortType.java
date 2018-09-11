package com.huawei.bme.cbsinterface.cbs.accountmgr;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-11T03:35:28.392+01:00
 * Generated source version: 3.2.6
 *
 */
@WebService(targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "CBSInterfaceAccountMgrServicePortType")
@XmlSeeAlso({com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ObjectFactory.class, com.huawei.bme.cbsinterface.common.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CBSInterfaceAccountMgrServicePortType {

    @WebMethod(operationName = "ExchangeAccount", action = "ExchangeAccount")
    @WebResult(name = "ExchangeAccountResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountResultMsg exchangeAccount(
        @WebParam(partName = "part1", name = "ExchangeAccountRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountRequestMsg part1
    );

    @WebMethod(operationName = "ServiceHandleFee", action = "ServiceHandleFee")
    @WebResult(name = "ServiceHandleFeeResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeResultMsg serviceHandleFee(
        @WebParam(partName = "part1", name = "ServiceHandleFeeRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeRequestMsg part1
    );

    @WebMethod(operationName = "PaymentEnquiry", action = "PaymentEnquiry")
    @WebResult(name = "PaymentEnquiryResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryResultMsg paymentEnquiry(
        @WebParam(partName = "part1", name = "PaymentEnquiryRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryRequestMsg part1
    );

    @WebMethod(operationName = "TransInPpsPos", action = "TransInPpsPos")
    @WebResult(name = "TransInPpsPosResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosResultMsg transInPpsPos(
        @WebParam(partName = "part1", name = "TransInPpsPosRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosRequestMsg part1
    );

    @WebMethod(operationName = "QueryTransferLog", action = "QueryTransferLog")
    @WebResult(name = "QueryTransferLogResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogResultMsg queryTransferLog(
        @WebParam(partName = "part1", name = "QueryTransferLogRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogRequestMsg part1
    );

    @WebMethod(operationName = "VoucherEnquiryByPIN", action = "VoucherEnquiryByPIN")
    @WebResult(name = "VoucherEnquiryByPINResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINResultMsg voucherEnquiryByPIN(
        @WebParam(partName = "part1", name = "VoucherEnquiryByPINRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINRequestMsg part1
    );

    @WebMethod(operationName = "CumulateEnquiry", action = "CumulateEnquiry")
    @WebResult(name = "CumulateEnquiryResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryResultMsg cumulateEnquiry(
        @WebParam(partName = "part1", name = "CumulateEnquiryRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryRequestMsg part1
    );

    @WebMethod(operationName = "ActiveFirst", action = "ActiveFirst")
    @WebResult(name = "ActiveFirstResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstResultMsg activeFirst(
        @WebParam(partName = "part1", name = "ActiveFirstRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstRequestMsg part1
    );

    @WebMethod(operationName = "OneOffDeduction", action = "OneOffDeduction")
    @WebResult(name = "OneOffDeductionResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionResultMsg oneOffDeduction(
        @WebParam(partName = "part1", name = "OneOffDeductionRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionRequestMsg part1
    );

    @WebMethod(operationName = "ModifyVoucherState", action = "ModifyVoucherState")
    @WebResult(name = "ModifyVoucherStateResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateResultMsg modifyVoucherState(
        @WebParam(partName = "part1", name = "ModifyVoucherStateRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateRequestMsg part1
    );

    @WebMethod(operationName = "ReversePayment", action = "ReversePayment")
    @WebResult(name = "ReversePaymentResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentResultMsg reversePayment(
        @WebParam(partName = "part1", name = "ReversePaymentRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentRequestMsg part1
    );

    @WebMethod(operationName = "Payment", action = "Payment")
    @WebResult(name = "PaymentResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.PaymentResultMsg payment(
        @WebParam(partName = "part1", name = "PaymentRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.PaymentRequestMsg part1
    );

    @WebMethod(operationName = "QueryAdjustmentLog", action = "QueryAdjustmentLog")
    @WebResult(name = "QueryAdjustmentLogResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogResultMsg queryAdjustmentLog(
        @WebParam(partName = "part1", name = "QueryAdjustmentLogRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogRequestMsg part1
    );

    @WebMethod(operationName = "VoucherRecharge", action = "VoucherRecharge")
    @WebResult(name = "VoucherRechargeResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeResultMsg voucherRecharge(
        @WebParam(partName = "part1", name = "VoucherRechargeRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeRequestMsg part1
    );

    @WebMethod(operationName = "ModSubBillCycleType", action = "ModSubBillCycleType")
    @WebResult(name = "ModSubBillCycleTypeResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeResultMsg modSubBillCycleType(
        @WebParam(partName = "part1", name = "ModSubBillCycleTypeRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeRequestMsg part1
    );

    @WebMethod(operationName = "QueryBalance", action = "QueryBalance")
    @WebResult(name = "QueryBalanceResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceResultMsg queryBalance(
        @WebParam(partName = "part1", name = "QueryBalanceRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceRequestMsg part1
    );

    @WebMethod(operationName = "VoucherRechargeEnquiry", action = "VoucherRechargeEnquiry")
    @WebResult(name = "VoucherRechargeEnquiryResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryResultMsg voucherRechargeEnquiry(
        @WebParam(partName = "part1", name = "VoucherRechargeEnquiryRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryRequestMsg part1
    );

    @WebMethod(operationName = "TransferAccount", action = "TransferAccount")
    @WebResult(name = "TransferAccountResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountResultMsg transferAccount(
        @WebParam(partName = "part1", name = "TransferAccountRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountRequestMsg part1
    );

    @WebMethod(operationName = "AdjustAccount", action = "AdjustAccount")
    @WebResult(name = "AdjustAccountResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountResultMsg adjustAccount(
        @WebParam(partName = "part1", name = "AdjustAccountRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountRequestMsg part1
    );

    @WebMethod(operationName = "BalanceToValidity", action = "BalanceToValidity")
    @WebResult(name = "BalanceToValidityResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityResultMsg balanceToValidity(
        @WebParam(partName = "part1", name = "BalanceToValidityRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityRequestMsg part1
    );

    @WebMethod(operationName = "VoucherEnquiryBySeq", action = "VoucherEnquiryBySeq")
    @WebResult(name = "VoucherEnquiryBySeqResultMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", partName = "part1")
    public com.huawei.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqResultMsg voucherEnquiryBySeq(
        @WebParam(partName = "part1", name = "VoucherEnquiryBySeqRequestMsg", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
        com.huawei.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqRequestMsg part1
    );
}