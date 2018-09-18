/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "Event")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e")
    , @NamedQuery(name = "Event.findByEventID", query = "SELECT e FROM Event e WHERE e.eventID = :eventID")
    , @NamedQuery(name = "Event.findByEventName", query = "SELECT e FROM Event e WHERE e.eventName = :eventName")
    , @NamedQuery(name = "Event.findByEventType", query = "SELECT e FROM Event e WHERE e.eventType = :eventType")
    , @NamedQuery(name = "Event.findByBeginDate", query = "SELECT e FROM Event e WHERE e.beginDate = :beginDate")
    , @NamedQuery(name = "Event.findByRunTime", query = "SELECT e FROM Event e WHERE e.runTime = :runTime")
    , @NamedQuery(name = "Event.findByTicketPrice", query = "SELECT e FROM Event e WHERE e.ticketPrice = :ticketPrice")
    , @NamedQuery(name = "Event.findByPoint", query = "SELECT e FROM Event e WHERE e.point = :point")
    , @NamedQuery(name = "Event.findByDescription", query = "SELECT e FROM Event e WHERE e.description = :description")
    , @NamedQuery(name = "Event.findByImage", query = "SELECT e FROM Event e WHERE e.image = :image")})
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Event_ID")
    private Integer eventID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Event_Name")
    private String eventName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Event_Type")
    private String eventType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Begin_Date")
    @Temporal(TemporalType.DATE)
    private Date beginDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Run_Time")
    private int runTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ticket_Price")
    private int ticketPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Point")
    private int point;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Image")
    private String image;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
    private Collection<ShowtimeOfEvent> showtimeOfEventCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventID")
    private Collection<EventBooking> eventBookingCollection;

    public Event() {
    }

    public Event(Integer eventID) {
        this.eventID = eventID;
    }

    public Event(Integer eventID, String eventName, String eventType, Date beginDate, int runTime, int ticketPrice, int point, String description, String image) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventType = eventType;
        this.beginDate = beginDate;
        this.runTime = runTime;
        this.ticketPrice = ticketPrice;
        this.point = point;
        this.description = description;
        this.image = image;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @XmlTransient
    public Collection<ShowtimeOfEvent> getShowtimeOfEventCollection() {
        return showtimeOfEventCollection;
    }

    public void setShowtimeOfEventCollection(Collection<ShowtimeOfEvent> showtimeOfEventCollection) {
        this.showtimeOfEventCollection = showtimeOfEventCollection;
    }

    @XmlTransient
    public Collection<EventBooking> getEventBookingCollection() {
        return eventBookingCollection;
    }

    public void setEventBookingCollection(Collection<EventBooking> eventBookingCollection) {
        this.eventBookingCollection = eventBookingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventID != null ? eventID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.eventID == null && other.eventID != null) || (this.eventID != null && !this.eventID.equals(other.eventID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Event[ eventID=" + eventID + " ]";
    }
    
}
