package ws.its.tabs.webservices.tabs_tibco_callback.tabs_tibco_callback_wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-11T03:37:31.788+01:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "TABS_TIBCO_CALLBACK",
                  wsdlLocation = "file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/TABS_TIBCO_CALLBACK.wsdl",
                  targetNamespace = "http://ws/its/tabs/webservices/tabs_tibco_callback/TABS_TIBCO_CALLBACK.wsdl")
public class TABSTIBCOCALLBACK_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws/its/tabs/webservices/tabs_tibco_callback/TABS_TIBCO_CALLBACK.wsdl", "TABS_TIBCO_CALLBACK");
    public final static QName TABSTIBCOCALLBACKSoapHttpPort = new QName("http://ws/its/tabs/webservices/tabs_tibco_callback/TABS_TIBCO_CALLBACK.wsdl", "TABS_TIBCO_CALLBACKSoapHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/TABS_TIBCO_CALLBACK.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TABSTIBCOCALLBACK_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/wsdl/TABS_TIBCO_CALLBACK.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TABSTIBCOCALLBACK_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TABSTIBCOCALLBACK_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TABSTIBCOCALLBACK_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TABSTIBCOCALLBACK_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TABSTIBCOCALLBACK_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TABSTIBCOCALLBACK_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TABSTIBCOCALLBACK
     */
    @WebEndpoint(name = "TABS_TIBCO_CALLBACKSoapHttpPort")
    public TABSTIBCOCALLBACK getTABSTIBCOCALLBACKSoapHttpPort() {
        return super.getPort(TABSTIBCOCALLBACKSoapHttpPort, TABSTIBCOCALLBACK.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TABSTIBCOCALLBACK
     */
    @WebEndpoint(name = "TABS_TIBCO_CALLBACKSoapHttpPort")
    public TABSTIBCOCALLBACK getTABSTIBCOCALLBACKSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(TABSTIBCOCALLBACKSoapHttpPort, TABSTIBCOCALLBACK.class, features);
    }

}
