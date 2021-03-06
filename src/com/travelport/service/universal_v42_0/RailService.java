package com.travelport.service.universal_v42_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:56:05.284-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "RailService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/universal_v42_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v42_0") 
public class RailService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v42_0", "RailService");
    public final static QName RailCreateReservationPort = new QName("http://www.travelport.com/service/universal_v42_0", "RailCreateReservationPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/universal_v42_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RailService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/universal_v42_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RailService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RailService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RailService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public RailService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RailService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RailService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns RailCreateReservationPortType
     */
    @WebEndpoint(name = "RailCreateReservationPort")
    public RailCreateReservationPortType getRailCreateReservationPort() {
        return super.getPort(RailCreateReservationPort, RailCreateReservationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RailCreateReservationPortType
     */
    @WebEndpoint(name = "RailCreateReservationPort")
    public RailCreateReservationPortType getRailCreateReservationPort(WebServiceFeature... features) {
        return super.getPort(RailCreateReservationPort, RailCreateReservationPortType.class, features);
    }

}
