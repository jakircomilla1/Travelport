
package com.travelport.schema.air_v38_0;

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v38_0}PrePayId"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v38_0}PrePayCustomer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v38_0}PrePayAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v38_0}Affiliations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v38_0}AccountRelatedRules" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CreatorID" type="{http://www.travelport.com/schema/common_v38_0}typeCardNumber" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prePayId",
    "prePayCustomer",
    "prePayAccount",
    "affiliations",
    "accountRelatedRules"
})
@XmlRootElement(name = "PrePayProfileInfo")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public class PrePayProfileInfo
    implements Locatable
{

    @XmlElement(name = "PrePayId", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected PrePayId prePayId;
    @XmlElement(name = "PrePayCustomer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected PrePayCustomer prePayCustomer;
    @XmlElement(name = "PrePayAccount")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected PrePayAccount prePayAccount;
    @XmlElement(name = "Affiliations")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected Affiliations affiliations;
    @XmlElement(name = "AccountRelatedRules")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected AccountRelatedRules accountRelatedRules;
    @XmlAttribute(name = "StatusCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String statusCode;
    @XmlAttribute(name = "CreatorID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String creatorID;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Pre pay unique identifier detail.This information block is returned both in list and  detail retrieve transactions.Example flight pass number
     * 
     * @return
     *     possible object is
     *     {@link PrePayId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public PrePayId getPrePayId() {
        return prePayId;
    }

    /**
     * Sets the value of the prePayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setPrePayId(PrePayId value) {
        this.prePayId = value;
    }

    /**
     * Pre pay customer detail.This information block is returned both in list and  detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link PrePayCustomer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public PrePayCustomer getPrePayCustomer() {
        return prePayCustomer;
    }

    /**
     * Sets the value of the prePayCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayCustomer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setPrePayCustomer(PrePayCustomer value) {
        this.prePayCustomer = value;
    }

    /**
     * Pre pay account detail.This information block is returned both in list and  detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link PrePayAccount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public PrePayAccount getPrePayAccount() {
        return prePayAccount;
    }

    /**
     * Sets the value of the prePayAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayAccount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setPrePayAccount(PrePayAccount value) {
        this.prePayAccount = value;
    }

    /**
     * Pre pay affiliations detail.This information block is returned only in detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link Affiliations }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public Affiliations getAffiliations() {
        return affiliations;
    }

    /**
     * Sets the value of the affiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Affiliations }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setAffiliations(Affiliations value) {
        this.affiliations = value;
    }

    /**
     * Pre pay account related rules.This information block is returned only in detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link AccountRelatedRules }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public AccountRelatedRules getAccountRelatedRules() {
        return accountRelatedRules;
    }

    /**
     * Sets the value of the accountRelatedRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRelatedRules }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setAccountRelatedRules(AccountRelatedRules value) {
        this.accountRelatedRules = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the creatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Sets the value of the creatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setCreatorID(String value) {
        this.creatorID = value;
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
