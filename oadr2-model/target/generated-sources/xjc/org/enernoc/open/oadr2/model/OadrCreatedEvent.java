//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.04 at 07:51:55 AM PST 
//


package org.enernoc.open.oadr2.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}eiCreatedEvent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eiCreatedEvent"
})
@XmlRootElement(name = "oadrCreatedEvent", namespace = "http://openadr.org/oadr-2.0a/2012/07")
@Entity(name = "OadrCreatedEvent")
@Table(name = "OADRCREATEDEVENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class OadrCreatedEvent implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", required = true)
    protected EiCreatedEvent eiCreatedEvent;
    @XmlTransient
    protected Long hjid;

    /**
     * Default no-arg constructor
     * 
     */
    public OadrCreatedEvent() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OadrCreatedEvent(final EiCreatedEvent eiCreatedEvent) {
        this.eiCreatedEvent = eiCreatedEvent;
    }

    /**
     * Gets the value of the eiCreatedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EiCreatedEvent }
     *     
     */
    @ManyToOne(targetEntity = EiCreatedEvent.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EICREATEDEVENT_OADRCREATEDEV_0")
    public EiCreatedEvent getEiCreatedEvent() {
        return eiCreatedEvent;
    }

    /**
     * Sets the value of the eiCreatedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiCreatedEvent }
     *     
     */
    public void setEiCreatedEvent(EiCreatedEvent value) {
        this.eiCreatedEvent = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            EiCreatedEvent theEiCreatedEvent;
            theEiCreatedEvent = this.getEiCreatedEvent();
            strategy.appendField(locator, this, "eiCreatedEvent", buffer, theEiCreatedEvent);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OadrCreatedEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OadrCreatedEvent that = ((OadrCreatedEvent) object);
        {
            EiCreatedEvent lhsEiCreatedEvent;
            lhsEiCreatedEvent = this.getEiCreatedEvent();
            EiCreatedEvent rhsEiCreatedEvent;
            rhsEiCreatedEvent = that.getEiCreatedEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eiCreatedEvent", lhsEiCreatedEvent), LocatorUtils.property(thatLocator, "eiCreatedEvent", rhsEiCreatedEvent), lhsEiCreatedEvent, rhsEiCreatedEvent)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            EiCreatedEvent theEiCreatedEvent;
            theEiCreatedEvent = this.getEiCreatedEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eiCreatedEvent", theEiCreatedEvent), currentHashCode, theEiCreatedEvent);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public OadrCreatedEvent withEiCreatedEvent(EiCreatedEvent value) {
        setEiCreatedEvent(value);
        return this;
    }

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "Hjid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
