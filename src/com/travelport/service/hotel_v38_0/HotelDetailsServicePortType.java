package com.travelport.service.hotel_v38_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:32:12.419-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/hotel_v38_0", name = "HotelDetailsServicePortType")
@XmlSeeAlso({com.travelport.schema.hotel_v38_0.ObjectFactory.class, com.travelport.schema.common_v38_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HotelDetailsServicePortType {

    @WebResult(name = "HotelDetailsRsp", targetNamespace = "http://www.travelport.com/schema/hotel_v38_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/HotelService")
    public com.travelport.schema.hotel_v38_0.HotelDetailsRsp service(
        @WebParam(partName = "parameters", name = "HotelDetailsReq", targetNamespace = "http://www.travelport.com/schema/hotel_v38_0")
        com.travelport.schema.hotel_v38_0.HotelDetailsReq parameters
    ) throws HotelFaultMessage;
}
