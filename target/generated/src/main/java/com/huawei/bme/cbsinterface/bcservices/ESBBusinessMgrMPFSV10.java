package com.huawei.bme.cbsinterface.bcservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-11T03:28:56.076+01:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "ESB_BusinessMgr_MPFS_V_1_0",
                  wsdlLocation = "file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/ESB_BusinessMgr_MPFS_V_1_0_1.wsdl",
                  targetNamespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
public class ESBBusinessMgrMPFSV10 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ESB_BusinessMgr_MPFS_V_1_0");
    public final static QName CBSInterfaceBusinessMgrEndpoint = new QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CBSInterfaceBusinessMgrEndpoint");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/ESB_BusinessMgr_MPFS_V_1_0_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ESBBusinessMgrMPFSV10.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/ESB_BusinessMgr_MPFS_V_1_0_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ESBBusinessMgrMPFSV10(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ESBBusinessMgrMPFSV10(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ESBBusinessMgrMPFSV10() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ESBBusinessMgrMPFSV10(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ESBBusinessMgrMPFSV10(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ESBBusinessMgrMPFSV10(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CBSInterfaceBusinessMgr
     */
    @WebEndpoint(name = "CBSInterfaceBusinessMgrEndpoint")
    public CBSInterfaceBusinessMgr getCBSInterfaceBusinessMgrEndpoint() {
        return super.getPort(CBSInterfaceBusinessMgrEndpoint, CBSInterfaceBusinessMgr.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CBSInterfaceBusinessMgr
     */
    @WebEndpoint(name = "CBSInterfaceBusinessMgrEndpoint")
    public CBSInterfaceBusinessMgr getCBSInterfaceBusinessMgrEndpoint(WebServiceFeature... features) {
        return super.getPort(CBSInterfaceBusinessMgrEndpoint, CBSInterfaceBusinessMgr.class, features);
    }

}