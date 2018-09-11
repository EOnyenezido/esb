
package com.huawei.bme.cbsinterface.bccommon;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.bme.cbsinterface.bccommon package. 
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

    private final static QName _CustomerForBatchCustLevel_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustLevel");
    private final static QName _OfferingKeyOfferingID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingID");
    private final static QName _SubscriberConsumptionLimitLimitType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitType");
    private final static QName _SubscriberConsumptionLimitUnitType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "UnitType");
    private final static QName _SubscriberConsumptionLimitMesureType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MesureType");
    private final static QName _SubscriberConsumptionLimitMesureID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MesureID");
    private final static QName _SubscriberConsumptionLimitLimitValue_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitValue");
    private final static QName _SubscriberConsumptionLimitCurrencyID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CurrencyID");
    private final static QName _SubscriberConsumptionLimitLimitParam_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitParam");
    private final static QName _OrgInfoIDType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "IDType");
    private final static QName _IndividualInfoTitle_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Title");
    private final static QName _IndividualInfoGender_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Gender");
    private final static QName _IndividualInfoNationality_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Nationality");
    private final static QName _IndividualInfoRace_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Race");
    private final static QName _IndividualInfoNativePlace_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "NativePlace");
    private final static QName _IndividualInfoMaritalStatus_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MaritalStatus");
    private final static QName _IndividualInfoEducation_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Education");
    private final static QName _IndividualInfoOccupation_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Occupation");
    private final static QName _IndividualInfoSalary_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Salary");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.bme.cbsinterface.bccommon
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubscriberForBatch }
     * 
     */
    public SubscriberForBatch createSubscriberForBatch() {
        return new SubscriberForBatch();
    }

    /**
     * Create an instance of {@link AccountForBatch }
     * 
     */
    public AccountForBatch createAccountForBatch() {
        return new AccountForBatch();
    }

    /**
     * Create an instance of {@link OfferingInst }
     * 
     */
    public OfferingInst createOfferingInst() {
        return new OfferingInst();
    }

    /**
     * Create an instance of {@link InstProperty }
     * 
     */
    public InstProperty createInstProperty() {
        return new InstProperty();
    }

    /**
     * Create an instance of {@link POfferingInst }
     * 
     */
    public POfferingInst createPOfferingInst() {
        return new POfferingInst();
    }

    /**
     * Create an instance of {@link ProductInst }
     * 
     */
    public ProductInst createProductInst() {
        return new ProductInst();
    }

    /**
     * Create an instance of {@link RscRelation }
     * 
     */
    public RscRelation createRscRelation() {
        return new RscRelation();
    }

    /**
     * Create an instance of {@link Subscriber }
     * 
     */
    public Subscriber createSubscriber() {
        return new Subscriber();
    }

    /**
     * Create an instance of {@link Subscriber.ConsumptionLimit }
     * 
     */
    public Subscriber.ConsumptionLimit createSubscriberConsumptionLimit() {
        return new Subscriber.ConsumptionLimit();
    }

    /**
     * Create an instance of {@link PaymentLimit }
     * 
     */
    public PaymentLimit createPaymentLimit() {
        return new PaymentLimit();
    }

    /**
     * Create an instance of {@link com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo }
     * 
     */
    public com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo createAutoPayChannelInfo() {
        return new com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo();
    }

    /**
     * Create an instance of {@link com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan }
     * 
     */
    public com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan createAutoPayChannelInfoPaymentPlan() {
        return new com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link AccountInfo.AutoPayChannel }
     * 
     */
    public AccountInfo.AutoPayChannel createAccountInfoAutoPayChannel() {
        return new AccountInfo.AutoPayChannel();
    }

    /**
     * Create an instance of {@link CustInfo }
     * 
     */
    public CustInfo createCustInfo() {
        return new CustInfo();
    }

    /**
     * Create an instance of {@link SimpleProperty }
     * 
     */
    public SimpleProperty createSimpleProperty() {
        return new SimpleProperty();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link SalesInfo }
     * 
     */
    public SalesInfo createSalesInfo() {
        return new SalesInfo();
    }

    /**
     * Create an instance of {@link EffectMode }
     * 
     */
    public EffectMode createEffectMode() {
        return new EffectMode();
    }

    /**
     * Create an instance of {@link ActiveMode }
     * 
     */
    public ActiveMode createActiveMode() {
        return new ActiveMode();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link BalanceChgInfo }
     * 
     */
    public BalanceChgInfo createBalanceChgInfo() {
        return new BalanceChgInfo();
    }

    /**
     * Create an instance of {@link FreeUnitChgInfo }
     * 
     */
    public FreeUnitChgInfo createFreeUnitChgInfo() {
        return new FreeUnitChgInfo();
    }

    /**
     * Create an instance of {@link CustAccessCode }
     * 
     */
    public CustAccessCode createCustAccessCode() {
        return new CustAccessCode();
    }

    /**
     * Create an instance of {@link CustBasicInfo }
     * 
     */
    public CustBasicInfo createCustBasicInfo() {
        return new CustBasicInfo();
    }

    /**
     * Create an instance of {@link IndividualInfo }
     * 
     */
    public IndividualInfo createIndividualInfo() {
        return new IndividualInfo();
    }

    /**
     * Create an instance of {@link OrgInfo }
     * 
     */
    public OrgInfo createOrgInfo() {
        return new OrgInfo();
    }

    /**
     * Create an instance of {@link AcctAccessCode }
     * 
     */
    public AcctAccessCode createAcctAccessCode() {
        return new AcctAccessCode();
    }

    /**
     * Create an instance of {@link TaxException }
     * 
     */
    public TaxException createTaxException() {
        return new TaxException();
    }

    /**
     * Create an instance of {@link AccountBasicInfo }
     * 
     */
    public AccountBasicInfo createAccountBasicInfo() {
        return new AccountBasicInfo();
    }

    /**
     * Create an instance of {@link AutoPaymentPlan }
     * 
     */
    public AutoPaymentPlan createAutoPaymentPlan() {
        return new AutoPaymentPlan();
    }

    /**
     * Create an instance of {@link PayOwner }
     * 
     */
    public PayOwner createPayOwner() {
        return new PayOwner();
    }

    /**
     * Create an instance of {@link FreeBillMedium }
     * 
     */
    public FreeBillMedium createFreeBillMedium() {
        return new FreeBillMedium();
    }

    /**
     * Create an instance of {@link PayRelExtRule }
     * 
     */
    public PayRelExtRule createPayRelExtRule() {
        return new PayRelExtRule();
    }

    /**
     * Create an instance of {@link SubAccessCode }
     * 
     */
    public SubAccessCode createSubAccessCode() {
        return new SubAccessCode();
    }

    /**
     * Create an instance of {@link SubGroupAccessCode }
     * 
     */
    public SubGroupAccessCode createSubGroupAccessCode() {
        return new SubGroupAccessCode();
    }

    /**
     * Create an instance of {@link SubIdentity }
     * 
     */
    public SubIdentity createSubIdentity() {
        return new SubIdentity();
    }

    /**
     * Create an instance of {@link com.huawei.bme.cbsinterface.bccommon.SubBasicInfo }
     * 
     */
    public com.huawei.bme.cbsinterface.bccommon.SubBasicInfo createSubBasicInfo() {
        return new com.huawei.bme.cbsinterface.bccommon.SubBasicInfo();
    }

    /**
     * Create an instance of {@link SubGroup }
     * 
     */
    public SubGroup createSubGroup() {
        return new SubGroup();
    }

    /**
     * Create an instance of {@link SubGroupBasicInfo }
     * 
     */
    public SubGroupBasicInfo createSubGroupBasicInfo() {
        return new SubGroupBasicInfo();
    }

    /**
     * Create an instance of {@link SubGroupMember }
     * 
     */
    public SubGroupMember createSubGroupMember() {
        return new SubGroupMember();
    }

    /**
     * Create an instance of {@link SubGroupMemberInfo }
     * 
     */
    public SubGroupMemberInfo createSubGroupMemberInfo() {
        return new SubGroupMemberInfo();
    }

    /**
     * Create an instance of {@link SubRelationInfo }
     * 
     */
    public SubRelationInfo createSubRelationInfo() {
        return new SubRelationInfo();
    }

    /**
     * Create an instance of {@link OfferingKey }
     * 
     */
    public OfferingKey createOfferingKey() {
        return new OfferingKey();
    }

    /**
     * Create an instance of {@link OfferingOwner }
     * 
     */
    public OfferingOwner createOfferingOwner() {
        return new OfferingOwner();
    }

    /**
     * Create an instance of {@link OfferingExpireMode }
     * 
     */
    public OfferingExpireMode createOfferingExpireMode() {
        return new OfferingExpireMode();
    }

    /**
     * Create an instance of {@link Statement }
     * 
     */
    public Statement createStatement() {
        return new Statement();
    }

    /**
     * Create an instance of {@link StatementInfo }
     * 
     */
    public StatementInfo createStatementInfo() {
        return new StatementInfo();
    }

    /**
     * Create an instance of {@link StatementScenario }
     * 
     */
    public StatementScenario createStatementScenario() {
        return new StatementScenario();
    }

    /**
     * Create an instance of {@link StatementMedium }
     * 
     */
    public StatementMedium createStatementMedium() {
        return new StatementMedium();
    }

    /**
     * Create an instance of {@link CustomerForBatch }
     * 
     */
    public CustomerForBatch createCustomerForBatch() {
        return new CustomerForBatch();
    }

    /**
     * Create an instance of {@link SubscriberForBatch.SubBasicInfo }
     * 
     */
    public SubscriberForBatch.SubBasicInfo createSubscriberForBatchSubBasicInfo() {
        return new SubscriberForBatch.SubBasicInfo();
    }

    /**
     * Create an instance of {@link AccountForBatch.CreditLimit }
     * 
     */
    public AccountForBatch.CreditLimit createAccountForBatchCreditLimit() {
        return new AccountForBatch.CreditLimit();
    }

    /**
     * Create an instance of {@link OfferingInst.OInstProperty }
     * 
     */
    public OfferingInst.OInstProperty createOfferingInstOInstProperty() {
        return new OfferingInst.OInstProperty();
    }

    /**
     * Create an instance of {@link InstProperty.SubPropInst }
     * 
     */
    public InstProperty.SubPropInst createInstPropertySubPropInst() {
        return new InstProperty.SubPropInst();
    }

    /**
     * Create an instance of {@link POfferingInst.OfferingInstProperty }
     * 
     */
    public POfferingInst.OfferingInstProperty createPOfferingInstOfferingInstProperty() {
        return new POfferingInst.OfferingInstProperty();
    }

    /**
     * Create an instance of {@link ProductInst.PInstProperty }
     * 
     */
    public ProductInst.PInstProperty createProductInstPInstProperty() {
        return new ProductInst.PInstProperty();
    }

    /**
     * Create an instance of {@link RscRelation.RelationDestIdentify }
     * 
     */
    public RscRelation.RelationDestIdentify createRscRelationRelationDestIdentify() {
        return new RscRelation.RelationDestIdentify();
    }

    /**
     * Create an instance of {@link RscRelation.ShareLimit }
     * 
     */
    public RscRelation.ShareLimit createRscRelationShareLimit() {
        return new RscRelation.ShareLimit();
    }

    /**
     * Create an instance of {@link Subscriber.ConsumptionLimit.LimitParam }
     * 
     */
    public Subscriber.ConsumptionLimit.LimitParam createSubscriberConsumptionLimitLimitParam() {
        return new Subscriber.ConsumptionLimit.LimitParam();
    }

    /**
     * Create an instance of {@link PaymentLimit.Limit }
     * 
     */
    public PaymentLimit.Limit createPaymentLimitLimit() {
        return new PaymentLimit.Limit();
    }

    /**
     * Create an instance of {@link com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan.BillCycleSchema }
     * 
     */
    public com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan.BillCycleSchema createAutoPayChannelInfoPaymentPlanBillCycleSchema() {
        return new com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan.BillCycleSchema();
    }

    /**
     * Create an instance of {@link com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan.TimeSchema }
     * 
     */
    public com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan.TimeSchema createAutoPayChannelInfoPaymentPlanTimeSchema() {
        return new com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan.TimeSchema();
    }

    /**
     * Create an instance of {@link com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan.LowBalanceSchema }
     * 
     */
    public com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan.LowBalanceSchema createAutoPayChannelInfoPaymentPlanLowBalanceSchema() {
        return new com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo.PaymentPlan.LowBalanceSchema();
    }

    /**
     * Create an instance of {@link AccountInfo.CreditLimit }
     * 
     */
    public AccountInfo.CreditLimit createAccountInfoCreditLimit() {
        return new AccountInfo.CreditLimit();
    }

    /**
     * Create an instance of {@link AccountInfo.AutoPayChannel.AutoPayChannelInfo }
     * 
     */
    public AccountInfo.AutoPayChannel.AutoPayChannelInfo createAccountInfoAutoPayChannelAutoPayChannelInfo() {
        return new AccountInfo.AutoPayChannel.AutoPayChannelInfo();
    }

    /**
     * Create an instance of {@link CustInfo.NoticeSuppress }
     * 
     */
    public CustInfo.NoticeSuppress createCustInfoNoticeSuppress() {
        return new CustInfo.NoticeSuppress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "CustLevel", scope = CustomerForBatch.class)
    public JAXBElement<String> createCustomerForBatchCustLevel(String value) {
        return new JAXBElement<String>(_CustomerForBatchCustLevel_QNAME, String.class, CustomerForBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "OfferingID", scope = OfferingKey.class)
    public JAXBElement<BigInteger> createOfferingKeyOfferingID(BigInteger value) {
        return new JAXBElement<BigInteger>(_OfferingKeyOfferingID_QNAME, BigInteger.class, OfferingKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "LimitType", scope = Subscriber.ConsumptionLimit.class)
    public JAXBElement<String> createSubscriberConsumptionLimitLimitType(String value) {
        return new JAXBElement<String>(_SubscriberConsumptionLimitLimitType_QNAME, String.class, Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "UnitType", scope = Subscriber.ConsumptionLimit.class)
    public JAXBElement<String> createSubscriberConsumptionLimitUnitType(String value) {
        return new JAXBElement<String>(_SubscriberConsumptionLimitUnitType_QNAME, String.class, Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "MesureType", scope = Subscriber.ConsumptionLimit.class)
    public JAXBElement<BigInteger> createSubscriberConsumptionLimitMesureType(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubscriberConsumptionLimitMesureType_QNAME, BigInteger.class, Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "MesureID", scope = Subscriber.ConsumptionLimit.class)
    public JAXBElement<BigInteger> createSubscriberConsumptionLimitMesureID(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubscriberConsumptionLimitMesureID_QNAME, BigInteger.class, Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "LimitValue", scope = Subscriber.ConsumptionLimit.class)
    public JAXBElement<Long> createSubscriberConsumptionLimitLimitValue(Long value) {
        return new JAXBElement<Long>(_SubscriberConsumptionLimitLimitValue_QNAME, Long.class, Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "CurrencyID", scope = Subscriber.ConsumptionLimit.class)
    public JAXBElement<BigInteger> createSubscriberConsumptionLimitCurrencyID(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubscriberConsumptionLimitCurrencyID_QNAME, BigInteger.class, Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscriber.ConsumptionLimit.LimitParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "LimitParam", scope = Subscriber.ConsumptionLimit.class)
    public JAXBElement<Subscriber.ConsumptionLimit.LimitParam> createSubscriberConsumptionLimitLimitParam(Subscriber.ConsumptionLimit.LimitParam value) {
        return new JAXBElement<Subscriber.ConsumptionLimit.LimitParam>(_SubscriberConsumptionLimitLimitParam_QNAME, Subscriber.ConsumptionLimit.LimitParam.class, Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "IDType", scope = OrgInfo.class)
    public JAXBElement<String> createOrgInfoIDType(String value) {
        return new JAXBElement<String>(_OrgInfoIDType_QNAME, String.class, OrgInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "IDType", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoIDType(String value) {
        return new JAXBElement<String>(_OrgInfoIDType_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Title", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoTitle(String value) {
        return new JAXBElement<String>(_IndividualInfoTitle_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Gender", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoGender(String value) {
        return new JAXBElement<String>(_IndividualInfoGender_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Nationality", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoNationality(String value) {
        return new JAXBElement<String>(_IndividualInfoNationality_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Race", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoRace(String value) {
        return new JAXBElement<String>(_IndividualInfoRace_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "NativePlace", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoNativePlace(String value) {
        return new JAXBElement<String>(_IndividualInfoNativePlace_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "MaritalStatus", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoMaritalStatus(String value) {
        return new JAXBElement<String>(_IndividualInfoMaritalStatus_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Education", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoEducation(String value) {
        return new JAXBElement<String>(_IndividualInfoEducation_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Occupation", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoOccupation(String value) {
        return new JAXBElement<String>(_IndividualInfoOccupation_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Salary", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoSalary(String value) {
        return new JAXBElement<String>(_IndividualInfoSalary_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "CustLevel", scope = CustBasicInfo.class)
    public JAXBElement<String> createCustBasicInfoCustLevel(String value) {
        return new JAXBElement<String>(_CustomerForBatchCustLevel_QNAME, String.class, CustBasicInfo.class, value);
    }

}
