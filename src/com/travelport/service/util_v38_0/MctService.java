package com.travelport.service.util_v38_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:39:24.448-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "MctService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/Wsdl/util_v38_0/Util.wsdl",
                  targetNamespace = "http://www.travelport.com/service/util_v38_0") 
public class MctService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/util_v38_0", "MctService");
    public final static QName MctLookupPort = new QName("http://www.travelport.com/service/util_v38_0", "MctLookupPort");
    public final static QName MctCountPort = new QName("http://www.travelport.com/service/util_v38_0", "MctCountPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/Wsdl/util_v38_0/Util.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MctService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/Wsdl/util_v38_0/Util.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MctService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MctService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MctService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MctService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MctService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MctService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns MctLookupPortType
     */
    @WebEndpoint(name = "MctLookupPort")
    public MctLookupPortType getMctLookupPort() {
        return super.getPort(MctLookupPort, MctLookupPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MctLookupPortType
     */
    @WebEndpoint(name = "MctLookupPort")
    public MctLookupPortType getMctLookupPort(WebServiceFeature... features) {
        return super.getPort(MctLookupPort, MctLookupPortType.class, features);
    }


    /**
     *
     * @return
     *     returns MctCountPortType
     */
    @WebEndpoint(name = "MctCountPort")
    public MctCountPortType getMctCountPort() {
        return super.getPort(MctCountPort, MctCountPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MctCountPortType
     */
    @WebEndpoint(name = "MctCountPort")
    public MctCountPortType getMctCountPort(WebServiceFeature... features) {
        return super.getPort(MctCountPort, MctCountPortType.class, features);
    }

}
