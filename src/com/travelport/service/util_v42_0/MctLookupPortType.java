package com.travelport.service.util_v42_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T16:06:30.842-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/util_v42_0", name = "MctLookupPortType")
@XmlSeeAlso({com.travelport.schema.util_v42_0.ObjectFactory.class, com.travelport.schema.common_v42_0.ObjectFactory.class, com.travelport.schema.air_v42_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MctLookupPortType {

    @WebResult(name = "MctLookupRsp", targetNamespace = "http://www.travelport.com/schema/util_v42_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/UtilService")
    public com.travelport.schema.util_v42_0.MctLookupRsp service(
        @WebParam(partName = "parameters", name = "MctLookupReq", targetNamespace = "http://www.travelport.com/schema/util_v42_0")
        com.travelport.schema.util_v42_0.MctLookupReq parameters
    ) throws UtilFaultMessage;
}
