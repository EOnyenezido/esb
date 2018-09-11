
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.bme.cbsinterface.cbs.accountmgr package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VoucherRechargeEnquiryResultRechargeLogSubCosID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SubCosID");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogCardCosID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CardCosID");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogOldBalance_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OldBalance");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogNewBalance_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewBalance");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogRechargeAmt_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RechargeAmt");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogValidity_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Validity");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogRechargeTax_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RechargeTax");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogRechargePenalty_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RechargePenalty");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogOldPOSBalance_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OldPOSBalance");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogNewPOSBalance_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewPOSBalance");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogRechargeBonusPrmAcctType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PrmAcctType");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogRechargeBonusPrmAmt_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PrmAmt");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogRechargeBonusCurrPrmAcctBalance_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CurrPrmAcctBalance");
    private final static QName _PaymentResultValidityPeriod_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ValidityPeriod");
    private final static QName _PaymentResultExtraValidity_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ExtraValidity");
    private final static QName _VoucherRechargeResultFaceValue_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "FaceValue");
    private final static QName _BalanceRecordTypeMinMeasureId_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "MinMeasureId");
    private final static QName _BalanceRecordTypeUnitType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "UnitType");
    private final static QName _BalanceRecordTypeAccountCredit_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccountCredit");
    private final static QName _BalanceRecordTypeAccountKey_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccountKey");
    private final static QName _BalanceRecordTypeProductID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ProductID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.bme.cbsinterface.cbs.accountmgr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransInPpsPosResult }
     * 
     */
    public TransInPpsPosResult createTransInPpsPosResult() {
        return new TransInPpsPosResult();
    }

    /**
     * Create an instance of {@link QueryAdjustmentLogResult }
     * 
     */
    public QueryAdjustmentLogResult createQueryAdjustmentLogResult() {
        return new QueryAdjustmentLogResult();
    }

    /**
     * Create an instance of {@link QueryAdjustmentLogResult.AdjustmentLog }
     * 
     */
    public QueryAdjustmentLogResult.AdjustmentLog createQueryAdjustmentLogResultAdjustmentLog() {
        return new QueryAdjustmentLogResult.AdjustmentLog();
    }

    /**
     * Create an instance of {@link QueryTransferLogResult }
     * 
     */
    public QueryTransferLogResult createQueryTransferLogResult() {
        return new QueryTransferLogResult();
    }

    /**
     * Create an instance of {@link QueryTransferLogResult.TransferLog }
     * 
     */
    public QueryTransferLogResult.TransferLog createQueryTransferLogResultTransferLog() {
        return new QueryTransferLogResult.TransferLog();
    }

    /**
     * Create an instance of {@link ServiceHandleFeeRequest }
     * 
     */
    public ServiceHandleFeeRequest createServiceHandleFeeRequest() {
        return new ServiceHandleFeeRequest();
    }

    /**
     * Create an instance of {@link ServiceHandleFeeRequest.ParamList }
     * 
     */
    public ServiceHandleFeeRequest.ParamList createServiceHandleFeeRequestParamList() {
        return new ServiceHandleFeeRequest.ParamList();
    }

    /**
     * Create an instance of {@link CumulateEnquiryResult }
     * 
     */
    public CumulateEnquiryResult createCumulateEnquiryResult() {
        return new CumulateEnquiryResult();
    }

    /**
     * Create an instance of {@link PaymentEnquiryResult }
     * 
     */
    public PaymentEnquiryResult createPaymentEnquiryResult() {
        return new PaymentEnquiryResult();
    }

    /**
     * Create an instance of {@link PaymentEnquiryResult.PaymentLog }
     * 
     */
    public PaymentEnquiryResult.PaymentLog createPaymentEnquiryResultPaymentLog() {
        return new PaymentEnquiryResult.PaymentLog();
    }

    /**
     * Create an instance of {@link TransferAccountResult }
     * 
     */
    public TransferAccountResult createTransferAccountResult() {
        return new TransferAccountResult();
    }

    /**
     * Create an instance of {@link TransferAccountRequest }
     * 
     */
    public TransferAccountRequest createTransferAccountRequest() {
        return new TransferAccountRequest();
    }

    /**
     * Create an instance of {@link VoucherRechargeEnquiryResult }
     * 
     */
    public VoucherRechargeEnquiryResult createVoucherRechargeEnquiryResult() {
        return new VoucherRechargeEnquiryResult();
    }

    /**
     * Create an instance of {@link VoucherRechargeEnquiryResult.RechargeLog }
     * 
     */
    public VoucherRechargeEnquiryResult.RechargeLog createVoucherRechargeEnquiryResultRechargeLog() {
        return new VoucherRechargeEnquiryResult.RechargeLog();
    }

    /**
     * Create an instance of {@link AdjustAccountRequest }
     * 
     */
    public AdjustAccountRequest createAdjustAccountRequest() {
        return new AdjustAccountRequest();
    }

    /**
     * Create an instance of {@link ReversePaymentResult }
     * 
     */
    public ReversePaymentResult createReversePaymentResult() {
        return new ReversePaymentResult();
    }

    /**
     * Create an instance of {@link PaymentResult }
     * 
     */
    public PaymentResult createPaymentResult() {
        return new PaymentResult();
    }

    /**
     * Create an instance of {@link VoucherRechargeResult }
     * 
     */
    public VoucherRechargeResult createVoucherRechargeResult() {
        return new VoucherRechargeResult();
    }

    /**
     * Create an instance of {@link AcctChgRecType }
     * 
     */
    public AcctChgRecType createAcctChgRecType() {
        return new AcctChgRecType();
    }

    /**
     * Create an instance of {@link ModifyAcctFeeType }
     * 
     */
    public ModifyAcctFeeType createModifyAcctFeeType() {
        return new ModifyAcctFeeType();
    }

    /**
     * Create an instance of {@link BalanceRecordType }
     * 
     */
    public BalanceRecordType createBalanceRecordType() {
        return new BalanceRecordType();
    }

    /**
     * Create an instance of {@link QueryBalanceRequest }
     * 
     */
    public QueryBalanceRequest createQueryBalanceRequest() {
        return new QueryBalanceRequest();
    }

    /**
     * Create an instance of {@link QueryBalanceResult }
     * 
     */
    public QueryBalanceResult createQueryBalanceResult() {
        return new QueryBalanceResult();
    }

    /**
     * Create an instance of {@link VoucherRechargeRequest }
     * 
     */
    public VoucherRechargeRequest createVoucherRechargeRequest() {
        return new VoucherRechargeRequest();
    }

    /**
     * Create an instance of {@link PaymentRequest }
     * 
     */
    public PaymentRequest createPaymentRequest() {
        return new PaymentRequest();
    }

    /**
     * Create an instance of {@link ActiveFirstRequest }
     * 
     */
    public ActiveFirstRequest createActiveFirstRequest() {
        return new ActiveFirstRequest();
    }

    /**
     * Create an instance of {@link ReversePaymentRequest }
     * 
     */
    public ReversePaymentRequest createReversePaymentRequest() {
        return new ReversePaymentRequest();
    }

    /**
     * Create an instance of {@link AdjustAccountResult }
     * 
     */
    public AdjustAccountResult createAdjustAccountResult() {
        return new AdjustAccountResult();
    }

    /**
     * Create an instance of {@link VoucherRechargeEnquiryRequest }
     * 
     */
    public VoucherRechargeEnquiryRequest createVoucherRechargeEnquiryRequest() {
        return new VoucherRechargeEnquiryRequest();
    }

    /**
     * Create an instance of {@link PaymentEnquiryRequest }
     * 
     */
    public PaymentEnquiryRequest createPaymentEnquiryRequest() {
        return new PaymentEnquiryRequest();
    }

    /**
     * Create an instance of {@link CumulateEnquiryRequest }
     * 
     */
    public CumulateEnquiryRequest createCumulateEnquiryRequest() {
        return new CumulateEnquiryRequest();
    }

    /**
     * Create an instance of {@link VoucherEnquiryBySeqRequest }
     * 
     */
    public VoucherEnquiryBySeqRequest createVoucherEnquiryBySeqRequest() {
        return new VoucherEnquiryBySeqRequest();
    }

    /**
     * Create an instance of {@link VoucherEnquiryBySeqResult }
     * 
     */
    public VoucherEnquiryBySeqResult createVoucherEnquiryBySeqResult() {
        return new VoucherEnquiryBySeqResult();
    }

    /**
     * Create an instance of {@link VoucherEnquiryByPINRequest }
     * 
     */
    public VoucherEnquiryByPINRequest createVoucherEnquiryByPINRequest() {
        return new VoucherEnquiryByPINRequest();
    }

    /**
     * Create an instance of {@link VoucherEnquiryByPINResult }
     * 
     */
    public VoucherEnquiryByPINResult createVoucherEnquiryByPINResult() {
        return new VoucherEnquiryByPINResult();
    }

    /**
     * Create an instance of {@link OneOffDeductionRequest }
     * 
     */
    public OneOffDeductionRequest createOneOffDeductionRequest() {
        return new OneOffDeductionRequest();
    }

    /**
     * Create an instance of {@link OneOffDeductionResult }
     * 
     */
    public OneOffDeductionResult createOneOffDeductionResult() {
        return new OneOffDeductionResult();
    }

    /**
     * Create an instance of {@link ServiceHandleFeeResult }
     * 
     */
    public ServiceHandleFeeResult createServiceHandleFeeResult() {
        return new ServiceHandleFeeResult();
    }

    /**
     * Create an instance of {@link QueryTransferLogRequest }
     * 
     */
    public QueryTransferLogRequest createQueryTransferLogRequest() {
        return new QueryTransferLogRequest();
    }

    /**
     * Create an instance of {@link QueryAdjustmentLogRequest }
     * 
     */
    public QueryAdjustmentLogRequest createQueryAdjustmentLogRequest() {
        return new QueryAdjustmentLogRequest();
    }

    /**
     * Create an instance of {@link ModifyVoucherStateRequest }
     * 
     */
    public ModifyVoucherStateRequest createModifyVoucherStateRequest() {
        return new ModifyVoucherStateRequest();
    }

    /**
     * Create an instance of {@link BalanceToValidityRequest }
     * 
     */
    public BalanceToValidityRequest createBalanceToValidityRequest() {
        return new BalanceToValidityRequest();
    }

    /**
     * Create an instance of {@link BalanceToValidityResult }
     * 
     */
    public BalanceToValidityResult createBalanceToValidityResult() {
        return new BalanceToValidityResult();
    }

    /**
     * Create an instance of {@link TransInPpsPosRequest }
     * 
     */
    public TransInPpsPosRequest createTransInPpsPosRequest() {
        return new TransInPpsPosRequest();
    }

    /**
     * Create an instance of {@link ExchangeAccountRequest }
     * 
     */
    public ExchangeAccountRequest createExchangeAccountRequest() {
        return new ExchangeAccountRequest();
    }

    /**
     * Create an instance of {@link ExchangeAccountResult }
     * 
     */
    public ExchangeAccountResult createExchangeAccountResult() {
        return new ExchangeAccountResult();
    }

    /**
     * Create an instance of {@link ModSubBillCycleTypeRequest }
     * 
     */
    public ModSubBillCycleTypeRequest createModSubBillCycleTypeRequest() {
        return new ModSubBillCycleTypeRequest();
    }

    /**
     * Create an instance of {@link TransInPpsPosResult.TransfereeAcctChgList }
     * 
     */
    public TransInPpsPosResult.TransfereeAcctChgList createTransInPpsPosResultTransfereeAcctChgList() {
        return new TransInPpsPosResult.TransfereeAcctChgList();
    }

    /**
     * Create an instance of {@link TransInPpsPosResult.TransferorAcctChgList }
     * 
     */
    public TransInPpsPosResult.TransferorAcctChgList createTransInPpsPosResultTransferorAcctChgList() {
        return new TransInPpsPosResult.TransferorAcctChgList();
    }

    /**
     * Create an instance of {@link QueryAdjustmentLogResult.AdjustmentLog.AdjustmentItem }
     * 
     */
    public QueryAdjustmentLogResult.AdjustmentLog.AdjustmentItem createQueryAdjustmentLogResultAdjustmentLogAdjustmentItem() {
        return new QueryAdjustmentLogResult.AdjustmentLog.AdjustmentItem();
    }

    /**
     * Create an instance of {@link QueryTransferLogResult.TransferLog.TransferAcctItem }
     * 
     */
    public QueryTransferLogResult.TransferLog.TransferAcctItem createQueryTransferLogResultTransferLogTransferAcctItem() {
        return new QueryTransferLogResult.TransferLog.TransferAcctItem();
    }

    /**
     * Create an instance of {@link ServiceHandleFeeRequest.ParamList.Param }
     * 
     */
    public ServiceHandleFeeRequest.ParamList.Param createServiceHandleFeeRequestParamListParam() {
        return new ServiceHandleFeeRequest.ParamList.Param();
    }

    /**
     * Create an instance of {@link CumulateEnquiryResult.CumulativeItem }
     * 
     */
    public CumulateEnquiryResult.CumulativeItem createCumulateEnquiryResultCumulativeItem() {
        return new CumulateEnquiryResult.CumulativeItem();
    }

    /**
     * Create an instance of {@link PaymentEnquiryResult.PaymentLog.PaymentBonus }
     * 
     */
    public PaymentEnquiryResult.PaymentLog.PaymentBonus createPaymentEnquiryResultPaymentLogPaymentBonus() {
        return new PaymentEnquiryResult.PaymentLog.PaymentBonus();
    }

    /**
     * Create an instance of {@link TransferAccountResult.TransfereeAcctChgList }
     * 
     */
    public TransferAccountResult.TransfereeAcctChgList createTransferAccountResultTransfereeAcctChgList() {
        return new TransferAccountResult.TransfereeAcctChgList();
    }

    /**
     * Create an instance of {@link TransferAccountResult.TransferorAcctChgList }
     * 
     */
    public TransferAccountResult.TransferorAcctChgList createTransferAccountResultTransferorAcctChgList() {
        return new TransferAccountResult.TransferorAcctChgList();
    }

    /**
     * Create an instance of {@link TransferAccountRequest.ModifyAcctFeeList }
     * 
     */
    public TransferAccountRequest.ModifyAcctFeeList createTransferAccountRequestModifyAcctFeeList() {
        return new TransferAccountRequest.ModifyAcctFeeList();
    }

    /**
     * Create an instance of {@link VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus }
     * 
     */
    public VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus createVoucherRechargeEnquiryResultRechargeLogRechargeBonus() {
        return new VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus();
    }

    /**
     * Create an instance of {@link AdjustAccountRequest.ModifyAcctFeeList }
     * 
     */
    public AdjustAccountRequest.ModifyAcctFeeList createAdjustAccountRequestModifyAcctFeeList() {
        return new AdjustAccountRequest.ModifyAcctFeeList();
    }

    /**
     * Create an instance of {@link ReversePaymentResult.AcctChgRecList }
     * 
     */
    public ReversePaymentResult.AcctChgRecList createReversePaymentResultAcctChgRecList() {
        return new ReversePaymentResult.AcctChgRecList();
    }

    /**
     * Create an instance of {@link PaymentResult.AcctChgRecList }
     * 
     */
    public PaymentResult.AcctChgRecList createPaymentResultAcctChgRecList() {
        return new PaymentResult.AcctChgRecList();
    }

    /**
     * Create an instance of {@link VoucherRechargeResult.RechargeBonus }
     * 
     */
    public VoucherRechargeResult.RechargeBonus createVoucherRechargeResultRechargeBonus() {
        return new VoucherRechargeResult.RechargeBonus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "SubCosID", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Integer> createVoucherRechargeEnquiryResultRechargeLogSubCosID(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogSubCosID_QNAME, Integer.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "CardCosID", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Integer> createVoucherRechargeEnquiryResultRechargeLogCardCosID(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogCardCosID_QNAME, Integer.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "OldBalance", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogOldBalance(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogOldBalance_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "NewBalance", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogNewBalance(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogNewBalance_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "RechargeAmt", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogRechargeAmt(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogRechargeAmt_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "Validity", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Integer> createVoucherRechargeEnquiryResultRechargeLogValidity(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogValidity_QNAME, Integer.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "RechargeTax", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Integer> createVoucherRechargeEnquiryResultRechargeLogRechargeTax(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogRechargeTax_QNAME, Integer.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "RechargePenalty", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Integer> createVoucherRechargeEnquiryResultRechargeLogRechargePenalty(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogRechargePenalty_QNAME, Integer.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "OldPOSBalance", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogOldPOSBalance(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogOldPOSBalance_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "NewPOSBalance", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogNewPOSBalance(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogNewPOSBalance_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "PrmAcctType", scope = VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus.class)
    public JAXBElement<Integer> createVoucherRechargeEnquiryResultRechargeLogRechargeBonusPrmAcctType(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogRechargeBonusPrmAcctType_QNAME, Integer.class, VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "PrmAmt", scope = VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus.class)
    public JAXBElement<Integer> createVoucherRechargeEnquiryResultRechargeLogRechargeBonusPrmAmt(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogRechargeBonusPrmAmt_QNAME, Integer.class, VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "CurrPrmAcctBalance", scope = VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus.class)
    public JAXBElement<Integer> createVoucherRechargeEnquiryResultRechargeLogRechargeBonusCurrPrmAcctBalance(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogRechargeBonusCurrPrmAcctBalance_QNAME, Integer.class, VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "NewBalance", scope = PaymentResult.class)
    public JAXBElement<Long> createPaymentResultNewBalance(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogNewBalance_QNAME, Long.class, PaymentResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "ValidityPeriod", scope = PaymentResult.class)
    public JAXBElement<Integer> createPaymentResultValidityPeriod(Integer value) {
        return new JAXBElement<Integer>(_PaymentResultValidityPeriod_QNAME, Integer.class, PaymentResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "ExtraValidity", scope = PaymentResult.class)
    public JAXBElement<Integer> createPaymentResultExtraValidity(Integer value) {
        return new JAXBElement<Integer>(_PaymentResultExtraValidity_QNAME, Integer.class, PaymentResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "FaceValue", scope = VoucherRechargeResult.class)
    public JAXBElement<Long> createVoucherRechargeResultFaceValue(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeResultFaceValue_QNAME, Long.class, VoucherRechargeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "NewBalance", scope = VoucherRechargeResult.class)
    public JAXBElement<Long> createVoucherRechargeResultNewBalance(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogNewBalance_QNAME, Long.class, VoucherRechargeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "ValidityPeriod", scope = VoucherRechargeResult.class)
    public JAXBElement<Integer> createVoucherRechargeResultValidityPeriod(Integer value) {
        return new JAXBElement<Integer>(_PaymentResultValidityPeriod_QNAME, Integer.class, VoucherRechargeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "PrmAcctType", scope = VoucherRechargeResult.RechargeBonus.class)
    public JAXBElement<Integer> createVoucherRechargeResultRechargeBonusPrmAcctType(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogRechargeBonusPrmAcctType_QNAME, Integer.class, VoucherRechargeResult.RechargeBonus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "PrmAmt", scope = VoucherRechargeResult.RechargeBonus.class)
    public JAXBElement<Long> createVoucherRechargeResultRechargeBonusPrmAmt(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogRechargeBonusPrmAmt_QNAME, Long.class, VoucherRechargeResult.RechargeBonus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "MinMeasureId", scope = BalanceRecordType.class)
    public JAXBElement<Integer> createBalanceRecordTypeMinMeasureId(Integer value) {
        return new JAXBElement<Integer>(_BalanceRecordTypeMinMeasureId_QNAME, Integer.class, BalanceRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "UnitType", scope = BalanceRecordType.class)
    public JAXBElement<Integer> createBalanceRecordTypeUnitType(Integer value) {
        return new JAXBElement<Integer>(_BalanceRecordTypeUnitType_QNAME, Integer.class, BalanceRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "AccountCredit", scope = BalanceRecordType.class)
    public JAXBElement<Long> createBalanceRecordTypeAccountCredit(Long value) {
        return new JAXBElement<Long>(_BalanceRecordTypeAccountCredit_QNAME, Long.class, BalanceRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "AccountKey", scope = BalanceRecordType.class)
    public JAXBElement<String> createBalanceRecordTypeAccountKey(String value) {
        return new JAXBElement<String>(_BalanceRecordTypeAccountKey_QNAME, String.class, BalanceRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "ProductID", scope = BalanceRecordType.class)
    public JAXBElement<String> createBalanceRecordTypeProductID(String value) {
        return new JAXBElement<String>(_BalanceRecordTypeProductID_QNAME, String.class, BalanceRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", name = "MinMeasureId", scope = AcctChgRecType.class)
    public JAXBElement<Integer> createAcctChgRecTypeMinMeasureId(Integer value) {
        return new JAXBElement<Integer>(_BalanceRecordTypeMinMeasureId_QNAME, Integer.class, AcctChgRecType.class, value);
    }

}
