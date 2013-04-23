//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.23 at 03:56:43 PM PDT 
//


package org.enernoc.open.oadr2.model;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for eventDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}modificationNumber"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="eiMarketContext">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="createdDateTime" type="{urn:ietf:params:xml:ns:icalendar-2.0}DateTimeType"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventStatus"/>
 *         &lt;element name="testEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vtnComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventDescriptorType", propOrder = {
    "eventID",
    "modificationNumber",
    "priority",
    "eiMarketContext",
    "createdDateTime",
    "eventStatus",
    "testEvent",
    "vtnComment"
})
@Entity(name = "EventDescriptor")
@Table(name = "EVENTDESCRIPTOR")
@Inheritance(strategy = InheritanceType.JOINED)
public class EventDescriptor implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String eventID;
    @XmlSchemaType(name = "unsignedInt")
    protected long modificationNumber;
    @XmlSchemaType(name = "unsignedInt")
    protected Long priority;
    @XmlElement(required = true)
    protected EventDescriptor.EiMarketContext eiMarketContext;
    @XmlElement(required = true)
    protected DateTime createdDateTime;
    @XmlElement(required = true)
    protected EventStatusEnumeratedType eventStatus;
    protected String testEvent;
    protected String vtnComment;
    @XmlTransient
    protected Long hjid;

    /**
     * Default no-arg constructor
     * 
     */
    public EventDescriptor() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EventDescriptor(final String eventID, final long modificationNumber, final Long priority, final EventDescriptor.EiMarketContext eiMarketContext, final DateTime createdDateTime, final EventStatusEnumeratedType eventStatus, final String testEvent, final String vtnComment) {
        this.eventID = eventID;
        this.modificationNumber = modificationNumber;
        this.priority = priority;
        this.eiMarketContext = eiMarketContext;
        this.createdDateTime = createdDateTime;
        this.eventStatus = eventStatus;
        this.testEvent = testEvent;
        this.vtnComment = vtnComment;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EVENTID", length = 255)
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the modificationNumber property.
     * 
     */
    @Basic
    @Column(name = "MODIFICATIONNUMBER", precision = 10, scale = 0)
    public long getModificationNumber() {
        return modificationNumber;
    }

    /**
     * Sets the value of the modificationNumber property.
     * 
     */
    public void setModificationNumber(long value) {
        this.modificationNumber = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Basic
    @Column(name = "PRIORITY", precision = 10, scale = 0)
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the eiMarketContext property.
     * 
     * @return
     *     possible object is
     *     {@link EventDescriptor.EiMarketContext }
     *     
     */
    @ManyToOne(targetEntity = EventDescriptor.EiMarketContext.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EIMARKETCONTEXT_EVENTDESCRIP_0")
    public EventDescriptor.EiMarketContext getEiMarketContext() {
        return eiMarketContext;
    }

    /**
     * Sets the value of the eiMarketContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDescriptor.EiMarketContext }
     *     
     */
    public void setEiMarketContext(EventDescriptor.EiMarketContext value) {
        this.eiMarketContext = value;
    }

    /**
     * Gets the value of the createdDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CREATEDDATETIME_EVENTDESCRIP_0")
    public DateTime getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the value of the createdDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreatedDateTime(DateTime value) {
        this.createdDateTime = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatusEnumeratedType }
     *     
     */
    @Basic
    @Column(name = "EVENTSTATUS", length = 255)
    @Enumerated(EnumType.STRING)
    public EventStatusEnumeratedType getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatusEnumeratedType }
     *     
     */
    public void setEventStatus(EventStatusEnumeratedType value) {
        this.eventStatus = value;
    }

    /**
     * Gets the value of the testEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TESTEVENT", length = 255)
    public String getTestEvent() {
        return testEvent;
    }

    /**
     * Sets the value of the testEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestEvent(String value) {
        this.testEvent = value;
    }

    /**
     * Gets the value of the vtnComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "VTNCOMMENT", length = 255)
    public String getVtnComment() {
        return vtnComment;
    }

    /**
     * Sets the value of the vtnComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtnComment(String value) {
        this.vtnComment = value;
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
            String theEventID;
            theEventID = this.getEventID();
            strategy.appendField(locator, this, "eventID", buffer, theEventID);
        }
        {
            long theModificationNumber;
            theModificationNumber = (true?this.getModificationNumber(): 0L);
            strategy.appendField(locator, this, "modificationNumber", buffer, theModificationNumber);
        }
        {
            Long thePriority;
            thePriority = this.getPriority();
            strategy.appendField(locator, this, "priority", buffer, thePriority);
        }
        {
            EventDescriptor.EiMarketContext theEiMarketContext;
            theEiMarketContext = this.getEiMarketContext();
            strategy.appendField(locator, this, "eiMarketContext", buffer, theEiMarketContext);
        }
        {
            DateTime theCreatedDateTime;
            theCreatedDateTime = this.getCreatedDateTime();
            strategy.appendField(locator, this, "createdDateTime", buffer, theCreatedDateTime);
        }
        {
            EventStatusEnumeratedType theEventStatus;
            theEventStatus = this.getEventStatus();
            strategy.appendField(locator, this, "eventStatus", buffer, theEventStatus);
        }
        {
            String theTestEvent;
            theTestEvent = this.getTestEvent();
            strategy.appendField(locator, this, "testEvent", buffer, theTestEvent);
        }
        {
            String theVtnComment;
            theVtnComment = this.getVtnComment();
            strategy.appendField(locator, this, "vtnComment", buffer, theVtnComment);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EventDescriptor)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EventDescriptor that = ((EventDescriptor) object);
        {
            String lhsEventID;
            lhsEventID = this.getEventID();
            String rhsEventID;
            rhsEventID = that.getEventID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventID", lhsEventID), LocatorUtils.property(thatLocator, "eventID", rhsEventID), lhsEventID, rhsEventID)) {
                return false;
            }
        }
        {
            long lhsModificationNumber;
            lhsModificationNumber = (true?this.getModificationNumber(): 0L);
            long rhsModificationNumber;
            rhsModificationNumber = (true?that.getModificationNumber(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modificationNumber", lhsModificationNumber), LocatorUtils.property(thatLocator, "modificationNumber", rhsModificationNumber), lhsModificationNumber, rhsModificationNumber)) {
                return false;
            }
        }
        {
            Long lhsPriority;
            lhsPriority = this.getPriority();
            Long rhsPriority;
            rhsPriority = that.getPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priority", lhsPriority), LocatorUtils.property(thatLocator, "priority", rhsPriority), lhsPriority, rhsPriority)) {
                return false;
            }
        }
        {
            EventDescriptor.EiMarketContext lhsEiMarketContext;
            lhsEiMarketContext = this.getEiMarketContext();
            EventDescriptor.EiMarketContext rhsEiMarketContext;
            rhsEiMarketContext = that.getEiMarketContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eiMarketContext", lhsEiMarketContext), LocatorUtils.property(thatLocator, "eiMarketContext", rhsEiMarketContext), lhsEiMarketContext, rhsEiMarketContext)) {
                return false;
            }
        }
        {
            DateTime lhsCreatedDateTime;
            lhsCreatedDateTime = this.getCreatedDateTime();
            DateTime rhsCreatedDateTime;
            rhsCreatedDateTime = that.getCreatedDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createdDateTime", lhsCreatedDateTime), LocatorUtils.property(thatLocator, "createdDateTime", rhsCreatedDateTime), lhsCreatedDateTime, rhsCreatedDateTime)) {
                return false;
            }
        }
        {
            EventStatusEnumeratedType lhsEventStatus;
            lhsEventStatus = this.getEventStatus();
            EventStatusEnumeratedType rhsEventStatus;
            rhsEventStatus = that.getEventStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventStatus", lhsEventStatus), LocatorUtils.property(thatLocator, "eventStatus", rhsEventStatus), lhsEventStatus, rhsEventStatus)) {
                return false;
            }
        }
        {
            String lhsTestEvent;
            lhsTestEvent = this.getTestEvent();
            String rhsTestEvent;
            rhsTestEvent = that.getTestEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testEvent", lhsTestEvent), LocatorUtils.property(thatLocator, "testEvent", rhsTestEvent), lhsTestEvent, rhsTestEvent)) {
                return false;
            }
        }
        {
            String lhsVtnComment;
            lhsVtnComment = this.getVtnComment();
            String rhsVtnComment;
            rhsVtnComment = that.getVtnComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vtnComment", lhsVtnComment), LocatorUtils.property(thatLocator, "vtnComment", rhsVtnComment), lhsVtnComment, rhsVtnComment)) {
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
            String theEventID;
            theEventID = this.getEventID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventID", theEventID), currentHashCode, theEventID);
        }
        {
            long theModificationNumber;
            theModificationNumber = (true?this.getModificationNumber(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modificationNumber", theModificationNumber), currentHashCode, theModificationNumber);
        }
        {
            Long thePriority;
            thePriority = this.getPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priority", thePriority), currentHashCode, thePriority);
        }
        {
            EventDescriptor.EiMarketContext theEiMarketContext;
            theEiMarketContext = this.getEiMarketContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eiMarketContext", theEiMarketContext), currentHashCode, theEiMarketContext);
        }
        {
            DateTime theCreatedDateTime;
            theCreatedDateTime = this.getCreatedDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdDateTime", theCreatedDateTime), currentHashCode, theCreatedDateTime);
        }
        {
            EventStatusEnumeratedType theEventStatus;
            theEventStatus = this.getEventStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventStatus", theEventStatus), currentHashCode, theEventStatus);
        }
        {
            String theTestEvent;
            theTestEvent = this.getTestEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testEvent", theTestEvent), currentHashCode, theTestEvent);
        }
        {
            String theVtnComment;
            theVtnComment = this.getVtnComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vtnComment", theVtnComment), currentHashCode, theVtnComment);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public EventDescriptor withEventID(String value) {
        setEventID(value);
        return this;
    }

    public EventDescriptor withModificationNumber(long value) {
        setModificationNumber(value);
        return this;
    }

    public EventDescriptor withPriority(Long value) {
        setPriority(value);
        return this;
    }

    public EventDescriptor withEiMarketContext(EventDescriptor.EiMarketContext value) {
        setEiMarketContext(value);
        return this;
    }

    public EventDescriptor withCreatedDateTime(DateTime value) {
        setCreatedDateTime(value);
        return this;
    }

    public EventDescriptor withEventStatus(EventStatusEnumeratedType value) {
        setEventStatus(value);
        return this;
    }

    public EventDescriptor withTestEvent(String value) {
        setTestEvent(value);
        return this;
    }

    public EventDescriptor withVtnComment(String value) {
        setVtnComment(value);
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
     *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext"/>
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
        "marketContext"
    })
    @Entity(name = "EventDescriptor$EiMarketContext")
    @Table(name = "EIMARKETCONTEXT")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class EiMarketContext implements Serializable, Equals, HashCode, ToString
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06", required = true)
        protected MarketContext marketContext;
        @XmlTransient
        protected Long hjid;

        /**
         * Default no-arg constructor
         * 
         */
        public EiMarketContext() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public EiMarketContext(final MarketContext marketContext) {
            this.marketContext = marketContext;
        }

        /**
         * Gets the value of the marketContext property.
         * 
         * @return
         *     possible object is
         *     {@link MarketContext }
         *     
         */
        @ManyToOne(targetEntity = MarketContext.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "MARKETCONTEXT_EIMARKETCONTEX_0")
        public MarketContext getMarketContext() {
            return marketContext;
        }

        /**
         * Sets the value of the marketContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link MarketContext }
         *     
         */
        public void setMarketContext(MarketContext value) {
            this.marketContext = value;
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
                MarketContext theMarketContext;
                theMarketContext = this.getMarketContext();
                strategy.appendField(locator, this, "marketContext", buffer, theMarketContext);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof EventDescriptor.EiMarketContext)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final EventDescriptor.EiMarketContext that = ((EventDescriptor.EiMarketContext) object);
            {
                MarketContext lhsMarketContext;
                lhsMarketContext = this.getMarketContext();
                MarketContext rhsMarketContext;
                rhsMarketContext = that.getMarketContext();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "marketContext", lhsMarketContext), LocatorUtils.property(thatLocator, "marketContext", rhsMarketContext), lhsMarketContext, rhsMarketContext)) {
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
                MarketContext theMarketContext;
                theMarketContext = this.getMarketContext();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "marketContext", theMarketContext), currentHashCode, theMarketContext);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public EventDescriptor.EiMarketContext withMarketContext(MarketContext value) {
            setMarketContext(value);
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
