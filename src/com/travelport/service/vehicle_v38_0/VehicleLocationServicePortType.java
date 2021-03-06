package com.travelport.service.vehicle_v38_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:40:17.891-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/vehicle_v38_0", name = "VehicleLocationServicePortType")
@XmlSeeAlso({com.travelport.schema.common_v38_0.ObjectFactory.class, com.travelport.schema.vehicle_v38_0.ObjectFactory.class, com.travelport.soa.common.security.sessioncontext_v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface VehicleLocationServicePortType {

    @WebResult(name = "VehicleLocationRsp", targetNamespace = "http://www.travelport.com/schema/vehicle_v38_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/VehicleService")
    public com.travelport.schema.vehicle_v38_0.VehicleLocationRsp service(
        @WebParam(partName = "parameters", name = "VehicleLocationReq", targetNamespace = "http://www.travelport.com/schema/vehicle_v38_0")
        com.travelport.schema.vehicle_v38_0.VehicleLocationReq parameters
    ) throws VehicleFaultMessage;
}
