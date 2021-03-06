
package com.travelport.service.util_v42_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T16:06:30.171-06:00
 * Generated source version: 3.1.5
 * 
 */
public final class BrandedFareSearchPortType_BrandedFareSearchPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/util_v42_0", "BrandedFareService");

    private BrandedFareSearchPortType_BrandedFareSearchPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BrandedFareService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BrandedFareService ss = new BrandedFareService(wsdlURL, SERVICE_NAME);
        BrandedFareSearchPortType port = ss.getBrandedFareSearchPort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.util_v42_0.BrandedFareSearchReq _service_parameters = null;
        try {
            com.travelport.schema.util_v42_0.BrandedFareSearchRsp _service__return = port.service(_service_parameters);
            System.out.println("service.result=" + _service__return);

        } catch (UtilFaultMessage e) { 
            System.out.println("Expected exception: UtilFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
