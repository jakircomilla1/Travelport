
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.air_v42_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:51:35.484-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "FlightService",
                      portName = "FlightDetailsPort",
                      targetNamespace = "http://www.travelport.com/service/air_v42_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/air_v42_0/Air.wsdl",
                      endpointInterface = "com.travelport.service.air_v42_0.FlightDetailsPortType")
                      
public class FlightDetailsPortImpl implements FlightDetailsPortType {

    private static final Logger LOG = Logger.getLogger(FlightDetailsPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.air_v42_0.FlightDetailsPortType#service(com.travelport.schema.air_v42_0.FlightDetailsReq  parameters )*
     */
    public com.travelport.schema.air_v42_0.FlightDetailsRsp service(com.travelport.schema.air_v42_0.FlightDetailsReq parameters) throws AirFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.air_v42_0.FlightDetailsRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new AirFaultMessage("AirFaultMessage...");
    }

}
