
package com.travelport.schema.util_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v42_0}HotelUpsellOfferSearchCriteria" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v42_0}HotelUpsellQualifySearchCriteria"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelUpsellOfferSearchCriteria",
    "hotelUpsellQualifySearchCriteria"
})
@XmlRootElement(name = "HotelUpsellSearchCriteria")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public class HotelUpsellSearchCriteria
    implements Locatable
{

    @XmlElement(name = "HotelUpsellOfferSearchCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected HotelUpsellOfferSearchCriteria hotelUpsellOfferSearchCriteria;
    @XmlElement(name = "HotelUpsellQualifySearchCriteria", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected HotelUpsellQualifySearchCriteria hotelUpsellQualifySearchCriteria;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the hotelUpsellOfferSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link HotelUpsellOfferSearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public HotelUpsellOfferSearchCriteria getHotelUpsellOfferSearchCriteria() {
        return hotelUpsellOfferSearchCriteria;
    }

    /**
     * Sets the value of the hotelUpsellOfferSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelUpsellOfferSearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelUpsellOfferSearchCriteria(HotelUpsellOfferSearchCriteria value) {
        this.hotelUpsellOfferSearchCriteria = value;
    }

    /**
     * Gets the value of the hotelUpsellQualifySearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link HotelUpsellQualifySearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public HotelUpsellQualifySearchCriteria getHotelUpsellQualifySearchCriteria() {
        return hotelUpsellQualifySearchCriteria;
    }

    /**
     * Sets the value of the hotelUpsellQualifySearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelUpsellQualifySearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelUpsellQualifySearchCriteria(HotelUpsellQualifySearchCriteria value) {
        this.hotelUpsellQualifySearchCriteria = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
