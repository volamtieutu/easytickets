/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Win-PC
 */
@Entity
@Table(name = "Event_Slot_Details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EventSlotDetails.findAll", query = "SELECT e FROM EventSlotDetails e")
    , @NamedQuery(name = "EventSlotDetails.findByEventID", query = "SELECT e FROM EventSlotDetails e WHERE e.eventSlotDetailsPK.eventID = :eventID")
    , @NamedQuery(name = "EventSlotDetails.findByCustomerID", query = "SELECT e FROM EventSlotDetails e WHERE e.eventSlotDetailsPK.customerID = :customerID")
    , @NamedQuery(name = "EventSlotDetails.findByPlaceSeatID", query = "SELECT e FROM EventSlotDetails e WHERE e.eventSlotDetailsPK.placeSeatID = :placeSeatID")
    , @NamedQuery(name = "EventSlotDetails.findByTimeSlotID", query = "SELECT e FROM EventSlotDetails e WHERE e.eventSlotDetailsPK.timeSlotID = :timeSlotID")})
public class EventSlotDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EventSlotDetailsPK eventSlotDetailsPK;
    @JoinColumn(name = "Customer_ID", referencedColumnName = "Customer_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Customer customer;
    @JoinColumn(name = "Event_ID", referencedColumnName = "Event_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Event event;
    @JoinColumn(name = "Place_Seat_ID", referencedColumnName = "Seat_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PlaceSeat placeSeat;
    @JoinColumn(name = "Time_Slot_ID", referencedColumnName = "Time_Slot_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TimeSlot timeSlot;

    public EventSlotDetails() {
    }

    public EventSlotDetails(EventSlotDetailsPK eventSlotDetailsPK) {
        this.eventSlotDetailsPK = eventSlotDetailsPK;
    }

    public EventSlotDetails(int eventID, int customerID, int placeSeatID, int timeSlotID) {
        this.eventSlotDetailsPK = new EventSlotDetailsPK(eventID, customerID, placeSeatID, timeSlotID);
    }

    public EventSlotDetailsPK getEventSlotDetailsPK() {
        return eventSlotDetailsPK;
    }

    public void setEventSlotDetailsPK(EventSlotDetailsPK eventSlotDetailsPK) {
        this.eventSlotDetailsPK = eventSlotDetailsPK;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public PlaceSeat getPlaceSeat() {
        return placeSeat;
    }

    public void setPlaceSeat(PlaceSeat placeSeat) {
        this.placeSeat = placeSeat;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventSlotDetailsPK != null ? eventSlotDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventSlotDetails)) {
            return false;
        }
        EventSlotDetails other = (EventSlotDetails) object;
        if ((this.eventSlotDetailsPK == null && other.eventSlotDetailsPK != null) || (this.eventSlotDetailsPK != null && !this.eventSlotDetailsPK.equals(other.eventSlotDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.EventSlotDetails[ eventSlotDetailsPK=" + eventSlotDetailsPK + " ]";
    }
    
}
