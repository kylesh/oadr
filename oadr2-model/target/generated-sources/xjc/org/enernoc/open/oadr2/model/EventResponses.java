//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.23 at 03:56:43 PM PDT 
//


package org.enernoc.open.oadr2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
 *         &lt;element name="eventResponse" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}responseCode"/>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}responseDescription" minOccurs="0"/>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}requestID"/>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}qualifiedEventID"/>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}optType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "eventResponses"
})
@XmlRootElement(name = "eventResponses")
@Entity(name = "EventResponses")
@Table(name = "EVENTRESPONSES")
@Inheritance(strategy = InheritanceType.JOINED)
public class EventResponses implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "eventResponse")
    protected List<EventResponses.EventResponse> eventResponses;
    @XmlTransient
    protected Long hjid;

    /**
     * Default no-arg constructor
     * 
     */
    public EventResponses() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EventResponses(final List<EventResponses.EventResponse> eventResponses) {
        this.eventResponses = eventResponses;
    }

    /**
     * Gets the value of the eventResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventResponses.EventResponse }
     * 
     * 
     */
    @OneToMany(targetEntity = EventResponses.EventResponse.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EVENTRESPONSES_EVENTRESPONSE_0")
    public List<EventResponses.EventResponse> getEventResponses() {
        if (eventResponses == null) {
            eventResponses = new ArrayList<EventResponses.EventResponse>();
        }
        return this.eventResponses;
    }

    /**
     * 
     * 
     */
    public void setEventResponses(List<EventResponses.EventResponse> eventResponses) {
        this.eventResponses = eventResponses;
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
            List<EventResponses.EventResponse> theEventResponses;
            theEventResponses = (((this.eventResponses!= null)&&(!this.eventResponses.isEmpty()))?this.getEventResponses():null);
            strategy.appendField(locator, this, "eventResponses", buffer, theEventResponses);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EventResponses)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EventResponses that = ((EventResponses) object);
        {
            List<EventResponses.EventResponse> lhsEventResponses;
            lhsEventResponses = (((this.eventResponses!= null)&&(!this.eventResponses.isEmpty()))?this.getEventResponses():null);
            List<EventResponses.EventResponse> rhsEventResponses;
            rhsEventResponses = (((that.eventResponses!= null)&&(!that.eventResponses.isEmpty()))?that.getEventResponses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventResponses", lhsEventResponses), LocatorUtils.property(thatLocator, "eventResponses", rhsEventResponses), lhsEventResponses, rhsEventResponses)) {
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
            List<EventResponses.EventResponse> theEventResponses;
            theEventResponses = (((this.eventResponses!= null)&&(!this.eventResponses.isEmpty()))?this.getEventResponses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventResponses", theEventResponses), currentHashCode, theEventResponses);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public EventResponses withEventResponses(EventResponses.EventResponse... values) {
        if (values!= null) {
            for (EventResponses.EventResponse value: values) {
                getEventResponses().add(value);
            }
        }
        return this;
    }

    public EventResponses withEventResponses(Collection<EventResponses.EventResponse> values) {
        if (values!= null) {
            getEventResponses().addAll(values);
        }
        return this;
    }

    public EventResponses withEventResponses(List<EventResponses.EventResponse> eventResponses) {
        setEventResponses(eventResponses);
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
     *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}responseCode"/>
     *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}responseDescription" minOccurs="0"/>
     *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}requestID"/>
     *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}qualifiedEventID"/>
     *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}optType"/>
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
        "responseCode",
        "responseDescription",
        "requestID",
        "qualifiedEventID",
        "optType"
    })
    @Entity(name = "EventResponses$EventResponse")
    @Table(name = "EVENTRESPONSE")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class EventResponse implements Serializable, Equals, HashCode, ToString
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected ResponseCode responseCode;
        protected String responseDescription;
        @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", required = true)
        protected String requestID;
        @XmlElement(required = true)
        protected QualifiedEventID qualifiedEventID;
        @XmlElement(required = true)
        protected OptTypeType optType;
        @XmlTransient
        protected Long hjid;

        /**
         * Default no-arg constructor
         * 
         */
        public EventResponse() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public EventResponse(final ResponseCode responseCode, final String responseDescription, final String requestID, final QualifiedEventID qualifiedEventID, final OptTypeType optType) {
            this.responseCode = responseCode;
            this.responseDescription = responseDescription;
            this.requestID = requestID;
            this.qualifiedEventID = qualifiedEventID;
            this.optType = optType;
        }

        /**
         * Gets the value of the responseCode property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseCode }
         *     
         */
        @ManyToOne(targetEntity = ResponseCode.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "RESPONSECODE_EVENTRESPONSE_H_0")
        public ResponseCode getResponseCode() {
            return responseCode;
        }

        /**
         * Sets the value of the responseCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseCode }
         *     
         */
        public void setResponseCode(ResponseCode value) {
            this.responseCode = value;
        }

        /**
         * Gets the value of the responseDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "RESPONSEDESCRIPTION", length = 255)
        public String getResponseDescription() {
            return responseDescription;
        }

        /**
         * Sets the value of the responseDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseDescription(String value) {
            this.responseDescription = value;
        }

        /**
         * Gets the value of the requestID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "REQUESTID", length = 255)
        public String getRequestID() {
            return requestID;
        }

        /**
         * Sets the value of the requestID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestID(String value) {
            this.requestID = value;
        }

        /**
         * Gets the value of the qualifiedEventID property.
         * 
         * @return
         *     possible object is
         *     {@link QualifiedEventID }
         *     
         */
        @ManyToOne(targetEntity = QualifiedEventID.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "QUALIFIEDEVENTID_EVENTRESPON_0")
        public QualifiedEventID getQualifiedEventID() {
            return qualifiedEventID;
        }

        /**
         * Sets the value of the qualifiedEventID property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifiedEventID }
         *     
         */
        public void setQualifiedEventID(QualifiedEventID value) {
            this.qualifiedEventID = value;
        }

        /**
         * Gets the value of the optType property.
         * 
         * @return
         *     possible object is
         *     {@link OptTypeType }
         *     
         */
        @Basic
        @Column(name = "OPTTYPE", length = 255)
        @Enumerated(EnumType.STRING)
        public OptTypeType getOptType() {
            return optType;
        }

        /**
         * Sets the value of the optType property.
         * 
         * @param value
         *     allowed object is
         *     {@link OptTypeType }
         *     
         */
        public void setOptType(OptTypeType value) {
            this.optType = value;
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
                ResponseCode theResponseCode;
                theResponseCode = this.getResponseCode();
                strategy.appendField(locator, this, "responseCode", buffer, theResponseCode);
            }
            {
                String theResponseDescription;
                theResponseDescription = this.getResponseDescription();
                strategy.appendField(locator, this, "responseDescription", buffer, theResponseDescription);
            }
            {
                String theRequestID;
                theRequestID = this.getRequestID();
                strategy.appendField(locator, this, "requestID", buffer, theRequestID);
            }
            {
                QualifiedEventID theQualifiedEventID;
                theQualifiedEventID = this.getQualifiedEventID();
                strategy.appendField(locator, this, "qualifiedEventID", buffer, theQualifiedEventID);
            }
            {
                OptTypeType theOptType;
                theOptType = this.getOptType();
                strategy.appendField(locator, this, "optType", buffer, theOptType);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof EventResponses.EventResponse)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final EventResponses.EventResponse that = ((EventResponses.EventResponse) object);
            {
                ResponseCode lhsResponseCode;
                lhsResponseCode = this.getResponseCode();
                ResponseCode rhsResponseCode;
                rhsResponseCode = that.getResponseCode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "responseCode", lhsResponseCode), LocatorUtils.property(thatLocator, "responseCode", rhsResponseCode), lhsResponseCode, rhsResponseCode)) {
                    return false;
                }
            }
            {
                String lhsResponseDescription;
                lhsResponseDescription = this.getResponseDescription();
                String rhsResponseDescription;
                rhsResponseDescription = that.getResponseDescription();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "responseDescription", lhsResponseDescription), LocatorUtils.property(thatLocator, "responseDescription", rhsResponseDescription), lhsResponseDescription, rhsResponseDescription)) {
                    return false;
                }
            }
            {
                String lhsRequestID;
                lhsRequestID = this.getRequestID();
                String rhsRequestID;
                rhsRequestID = that.getRequestID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "requestID", lhsRequestID), LocatorUtils.property(thatLocator, "requestID", rhsRequestID), lhsRequestID, rhsRequestID)) {
                    return false;
                }
            }
            {
                QualifiedEventID lhsQualifiedEventID;
                lhsQualifiedEventID = this.getQualifiedEventID();
                QualifiedEventID rhsQualifiedEventID;
                rhsQualifiedEventID = that.getQualifiedEventID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "qualifiedEventID", lhsQualifiedEventID), LocatorUtils.property(thatLocator, "qualifiedEventID", rhsQualifiedEventID), lhsQualifiedEventID, rhsQualifiedEventID)) {
                    return false;
                }
            }
            {
                OptTypeType lhsOptType;
                lhsOptType = this.getOptType();
                OptTypeType rhsOptType;
                rhsOptType = that.getOptType();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "optType", lhsOptType), LocatorUtils.property(thatLocator, "optType", rhsOptType), lhsOptType, rhsOptType)) {
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
                ResponseCode theResponseCode;
                theResponseCode = this.getResponseCode();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseCode", theResponseCode), currentHashCode, theResponseCode);
            }
            {
                String theResponseDescription;
                theResponseDescription = this.getResponseDescription();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseDescription", theResponseDescription), currentHashCode, theResponseDescription);
            }
            {
                String theRequestID;
                theRequestID = this.getRequestID();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestID", theRequestID), currentHashCode, theRequestID);
            }
            {
                QualifiedEventID theQualifiedEventID;
                theQualifiedEventID = this.getQualifiedEventID();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualifiedEventID", theQualifiedEventID), currentHashCode, theQualifiedEventID);
            }
            {
                OptTypeType theOptType;
                theOptType = this.getOptType();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optType", theOptType), currentHashCode, theOptType);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public EventResponses.EventResponse withResponseCode(ResponseCode value) {
            setResponseCode(value);
            return this;
        }

        public EventResponses.EventResponse withResponseDescription(String value) {
            setResponseDescription(value);
            return this;
        }

        public EventResponses.EventResponse withRequestID(String value) {
            setRequestID(value);
            return this;
        }

        public EventResponses.EventResponse withQualifiedEventID(QualifiedEventID value) {
            setQualifiedEventID(value);
            return this;
        }

        public EventResponses.EventResponse withOptType(OptTypeType value) {
            setOptType(value);
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

}
