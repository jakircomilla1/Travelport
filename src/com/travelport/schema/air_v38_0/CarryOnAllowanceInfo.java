
package com.travelport.schema.air_v38_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{http://www.travelport.com/schema/air_v38_0}BaseBaggageAllowanceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarryOnDetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v38_0}BaggageRestriction" maxOccurs="99" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ApplicableCarryOnBags" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="BasePrice" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
 *                 &lt;attribute name="ApproximateBasePrice" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
 *                 &lt;attribute name="Taxes" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
 *                 &lt;attribute name="TotalPrice" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
 *                 &lt;attribute name="ApproximateTotalPrice" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "carryOnDetails"
})
@XmlRootElement(name = "CarryOnAllowanceInfo")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public class CarryOnAllowanceInfo
    extends BaseBaggageAllowanceInfo
{

    @XmlElement(name = "CarryOnDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected List<CarryOnAllowanceInfo.CarryOnDetails> carryOnDetails;

    /**
     * Gets the value of the carryOnDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOnDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryOnDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarryOnAllowanceInfo.CarryOnDetails }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public List<CarryOnAllowanceInfo.CarryOnDetails> getCarryOnDetails() {
        if (carryOnDetails == null) {
            carryOnDetails = new ArrayList<CarryOnAllowanceInfo.CarryOnDetails>();
        }
        return this.carryOnDetails;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }


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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v38_0}BaggageRestriction" maxOccurs="99" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ApplicableCarryOnBags" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BasePrice" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
     *       &lt;attribute name="ApproximateBasePrice" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
     *       &lt;attribute name="Taxes" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
     *       &lt;attribute name="TotalPrice" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
     *       &lt;attribute name="ApproximateTotalPrice" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "baggageRestriction"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public static class CarryOnDetails
        implements Locatable
    {

        @XmlElement(name = "BaggageRestriction")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        protected List<BaggageRestriction> baggageRestriction;
        @XmlAttribute(name = "ApplicableCarryOnBags")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        protected String applicableCarryOnBags;
        @XmlAttribute(name = "BasePrice")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        protected String basePrice;
        @XmlAttribute(name = "ApproximateBasePrice")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        protected String approximateBasePrice;
        @XmlAttribute(name = "Taxes")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        protected String taxes;
        @XmlAttribute(name = "TotalPrice")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        protected String totalPrice;
        @XmlAttribute(name = "ApproximateTotalPrice")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        protected String approximateTotalPrice;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the baggageRestriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baggageRestriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaggageRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggageRestriction }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public List<BaggageRestriction> getBaggageRestriction() {
            if (baggageRestriction == null) {
                baggageRestriction = new ArrayList<BaggageRestriction>();
            }
            return this.baggageRestriction;
        }

        /**
         * Gets the value of the applicableCarryOnBags property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public String getApplicableCarryOnBags() {
            return applicableCarryOnBags;
        }

        /**
         * Sets the value of the applicableCarryOnBags property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public void setApplicableCarryOnBags(String value) {
            this.applicableCarryOnBags = value;
        }

        /**
         * Gets the value of the basePrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public String getBasePrice() {
            return basePrice;
        }

        /**
         * Sets the value of the basePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public void setBasePrice(String value) {
            this.basePrice = value;
        }

        /**
         * Gets the value of the approximateBasePrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public String getApproximateBasePrice() {
            return approximateBasePrice;
        }

        /**
         * Sets the value of the approximateBasePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public void setApproximateBasePrice(String value) {
            this.approximateBasePrice = value;
        }

        /**
         * Gets the value of the taxes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public String getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public void setTaxes(String value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the totalPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public String getTotalPrice() {
            return totalPrice;
        }

        /**
         * Sets the value of the totalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public void setTotalPrice(String value) {
            this.totalPrice = value;
        }

        /**
         * Gets the value of the approximateTotalPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public String getApproximateTotalPrice() {
            return approximateTotalPrice;
        }

        /**
         * Sets the value of the approximateTotalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public void setApproximateTotalPrice(String value) {
            this.approximateTotalPrice = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
