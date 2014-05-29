package com.travelport.service.vehicle_v17_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2012-05-05T19:47:19.710+02:00
 * Generated source version: 2.6.0
 * 
 */
@WebServiceClient(name = "VehicleService", 
                  wsdlLocation = "http://localhost:8080/kestrel/VehicleService?wsdl",
                  targetNamespace = "http://www.travelport.com/service/vehicle_v17_0") 
public class VehicleService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/vehicle_v17_0", "VehicleService");
    public final static QName VehicleCancelServicePort = new QName("http://www.travelport.com/service/vehicle_v17_0", "VehicleCancelServicePort");
    public final static QName VehicleLocationDetailServicePort = new QName("http://www.travelport.com/service/vehicle_v17_0", "VehicleLocationDetailServicePort");
    public final static QName VehicleReservationServicePort = new QName("http://www.travelport.com/service/vehicle_v17_0", "VehicleReservationServicePort");
    public final static QName VehicleUpsellSearchServicePort = new QName("http://www.travelport.com/service/vehicle_v17_0", "VehicleUpsellSearchServicePort");
    public final static QName VehicleLocationServicePort = new QName("http://www.travelport.com/service/vehicle_v17_0", "VehicleLocationServicePort");
    public final static QName VehicleRetrieveServicePort = new QName("http://www.travelport.com/service/vehicle_v17_0", "VehicleRetrieveServicePort");
    public final static QName VehicleKeywordsServicePort = new QName("http://www.travelport.com/service/vehicle_v17_0", "VehicleKeywordsServicePort");
    public final static QName VehicleRulesServicePort = new QName("http://www.travelport.com/service/vehicle_v17_0", "VehicleRulesServicePort");
    public final static QName VehicleSearchServicePort = new QName("http://www.travelport.com/service/vehicle_v17_0", "VehicleSearchServicePort");
    public final static QName VehicleMediaLinksServicePort = new QName("http://www.travelport.com/service/vehicle_v17_0", "VehicleMediaLinksServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/kestrel/VehicleService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(VehicleService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/kestrel/VehicleService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public VehicleService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public VehicleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VehicleService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns VehicleCancelServicePortType
     */
    @WebEndpoint(name = "VehicleCancelServicePort")
    public VehicleCancelServicePortType getVehicleCancelServicePort() {
        return super.getPort(VehicleCancelServicePort, VehicleCancelServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleCancelServicePortType
     */
    @WebEndpoint(name = "VehicleCancelServicePort")
    public VehicleCancelServicePortType getVehicleCancelServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleCancelServicePort, VehicleCancelServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns VehicleLocationDetailServicePortType
     */
    @WebEndpoint(name = "VehicleLocationDetailServicePort")
    public VehicleLocationDetailServicePortType getVehicleLocationDetailServicePort() {
        return super.getPort(VehicleLocationDetailServicePort, VehicleLocationDetailServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleLocationDetailServicePortType
     */
    @WebEndpoint(name = "VehicleLocationDetailServicePort")
    public VehicleLocationDetailServicePortType getVehicleLocationDetailServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleLocationDetailServicePort, VehicleLocationDetailServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns VehicleReservationServicePortType
     */
    @WebEndpoint(name = "VehicleReservationServicePort")
    public VehicleReservationServicePortType getVehicleReservationServicePort() {
        return super.getPort(VehicleReservationServicePort, VehicleReservationServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleReservationServicePortType
     */
    @WebEndpoint(name = "VehicleReservationServicePort")
    public VehicleReservationServicePortType getVehicleReservationServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleReservationServicePort, VehicleReservationServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns VehicleUpsellSearchServicePortType
     */
    @WebEndpoint(name = "VehicleUpsellSearchServicePort")
    public VehicleUpsellSearchServicePortType getVehicleUpsellSearchServicePort() {
        return super.getPort(VehicleUpsellSearchServicePort, VehicleUpsellSearchServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleUpsellSearchServicePortType
     */
    @WebEndpoint(name = "VehicleUpsellSearchServicePort")
    public VehicleUpsellSearchServicePortType getVehicleUpsellSearchServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleUpsellSearchServicePort, VehicleUpsellSearchServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns VehicleLocationServicePortType
     */
    @WebEndpoint(name = "VehicleLocationServicePort")
    public VehicleLocationServicePortType getVehicleLocationServicePort() {
        return super.getPort(VehicleLocationServicePort, VehicleLocationServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleLocationServicePortType
     */
    @WebEndpoint(name = "VehicleLocationServicePort")
    public VehicleLocationServicePortType getVehicleLocationServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleLocationServicePort, VehicleLocationServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns VehicleRetrieveServicePortType
     */
    @WebEndpoint(name = "VehicleRetrieveServicePort")
    public VehicleRetrieveServicePortType getVehicleRetrieveServicePort() {
        return super.getPort(VehicleRetrieveServicePort, VehicleRetrieveServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleRetrieveServicePortType
     */
    @WebEndpoint(name = "VehicleRetrieveServicePort")
    public VehicleRetrieveServicePortType getVehicleRetrieveServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleRetrieveServicePort, VehicleRetrieveServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns VehicleKeywordsServicePortType
     */
    @WebEndpoint(name = "VehicleKeywordsServicePort")
    public VehicleKeywordsServicePortType getVehicleKeywordsServicePort() {
        return super.getPort(VehicleKeywordsServicePort, VehicleKeywordsServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleKeywordsServicePortType
     */
    @WebEndpoint(name = "VehicleKeywordsServicePort")
    public VehicleKeywordsServicePortType getVehicleKeywordsServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleKeywordsServicePort, VehicleKeywordsServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns VehicleRulesServicePortType
     */
    @WebEndpoint(name = "VehicleRulesServicePort")
    public VehicleRulesServicePortType getVehicleRulesServicePort() {
        return super.getPort(VehicleRulesServicePort, VehicleRulesServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleRulesServicePortType
     */
    @WebEndpoint(name = "VehicleRulesServicePort")
    public VehicleRulesServicePortType getVehicleRulesServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleRulesServicePort, VehicleRulesServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns VehicleSearchServicePortType
     */
    @WebEndpoint(name = "VehicleSearchServicePort")
    public VehicleSearchServicePortType getVehicleSearchServicePort() {
        return super.getPort(VehicleSearchServicePort, VehicleSearchServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleSearchServicePortType
     */
    @WebEndpoint(name = "VehicleSearchServicePort")
    public VehicleSearchServicePortType getVehicleSearchServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleSearchServicePort, VehicleSearchServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns VehicleMediaLinksServicePortType
     */
    @WebEndpoint(name = "VehicleMediaLinksServicePort")
    public VehicleMediaLinksServicePortType getVehicleMediaLinksServicePort() {
        return super.getPort(VehicleMediaLinksServicePort, VehicleMediaLinksServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleMediaLinksServicePortType
     */
    @WebEndpoint(name = "VehicleMediaLinksServicePort")
    public VehicleMediaLinksServicePortType getVehicleMediaLinksServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleMediaLinksServicePort, VehicleMediaLinksServicePortType.class, features);
    }

}