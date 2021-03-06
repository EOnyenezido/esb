package com.esb.crm.crmservice.biz;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-11T03:26:31.155+01:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "CRMInterfaceService",
                  wsdlLocation = "file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/CRMInterfaceService.wsdl",
                  targetNamespace = "http://www.esb.com/crm/crmservice/biz")
public class CRMInterfaceService extends javax.xml.ws.Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.esb.com/crm/crmservice/biz", "CRMInterfaceService");
    public final static QName CRMInterfaceServiceSOAPportHttp = new QName("http://www.esb.com/crm/crmservice/biz", "CRMInterfaceServiceSOAPport_http");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/CRMInterfaceService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CRMInterfaceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/CRMInterfaceService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CRMInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CRMInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CRMInterfaceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CRMInterfaceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CRMInterfaceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CRMInterfaceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CRMInterfaceServicePortType
     */
    @WebEndpoint(name = "CRMInterfaceServiceSOAPport_http")
    public CRMInterfaceServicePortType getCRMInterfaceServiceSOAPportHttp() {
        return super.getPort(CRMInterfaceServiceSOAPportHttp, CRMInterfaceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CRMInterfaceServicePortType
     */
    @WebEndpoint(name = "CRMInterfaceServiceSOAPport_http")
    public CRMInterfaceServicePortType getCRMInterfaceServiceSOAPportHttp(WebServiceFeature... features) {
        return super.getPort(CRMInterfaceServiceSOAPportHttp, CRMInterfaceServicePortType.class, features);
    }

}
