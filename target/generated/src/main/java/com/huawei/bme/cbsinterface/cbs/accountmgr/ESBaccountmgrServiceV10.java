package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-11T03:35:28.413+01:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "ESBaccountmgrService_v_1_0",
                  wsdlLocation = "file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/ESBaccountmgrService_v_1_0.wsdl",
                  targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr")
public class ESBaccountmgrServiceV10 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ESBaccountmgrService_v_1_0");
    public final static QName CBSInterfaceAccountMgrServicePortTypeEndpoint = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CBSInterfaceAccountMgrServicePortTypeEndpoint");
    public final static QName CBSInterfaceAccountMgrServicePortTypeEndpointJMS = new QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CBSInterfaceAccountMgrServicePortTypeEndpoint_JMS");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/ESBaccountmgrService_v_1_0.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ESBaccountmgrServiceV10.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/ESBaccountmgrService_v_1_0.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ESBaccountmgrServiceV10(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ESBaccountmgrServiceV10(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ESBaccountmgrServiceV10() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ESBaccountmgrServiceV10(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ESBaccountmgrServiceV10(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ESBaccountmgrServiceV10(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CBSInterfaceAccountMgrServicePortType
     */
    @WebEndpoint(name = "CBSInterfaceAccountMgrServicePortTypeEndpoint")
    public CBSInterfaceAccountMgrServicePortType getCBSInterfaceAccountMgrServicePortTypeEndpoint() {
        return super.getPort(CBSInterfaceAccountMgrServicePortTypeEndpoint, CBSInterfaceAccountMgrServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CBSInterfaceAccountMgrServicePortType
     */
    @WebEndpoint(name = "CBSInterfaceAccountMgrServicePortTypeEndpoint")
    public CBSInterfaceAccountMgrServicePortType getCBSInterfaceAccountMgrServicePortTypeEndpoint(WebServiceFeature... features) {
        return super.getPort(CBSInterfaceAccountMgrServicePortTypeEndpoint, CBSInterfaceAccountMgrServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns CBSInterfaceAccountMgrServicePortType
     */
    @WebEndpoint(name = "CBSInterfaceAccountMgrServicePortTypeEndpoint_JMS")
    public CBSInterfaceAccountMgrServicePortType getCBSInterfaceAccountMgrServicePortTypeEndpointJMS() {
        return super.getPort(CBSInterfaceAccountMgrServicePortTypeEndpointJMS, CBSInterfaceAccountMgrServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CBSInterfaceAccountMgrServicePortType
     */
    @WebEndpoint(name = "CBSInterfaceAccountMgrServicePortTypeEndpoint_JMS")
    public CBSInterfaceAccountMgrServicePortType getCBSInterfaceAccountMgrServicePortTypeEndpointJMS(WebServiceFeature... features) {
        return super.getPort(CBSInterfaceAccountMgrServicePortTypeEndpointJMS, CBSInterfaceAccountMgrServicePortType.class, features);
    }

}