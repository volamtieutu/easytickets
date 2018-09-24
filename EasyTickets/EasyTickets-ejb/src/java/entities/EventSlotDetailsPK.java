/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Win-PC
 */
@Embeddable
public class EventSlotDetailsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Event_ID")
    private int eventID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Customer_ID")
    private int customerID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Place_Seat_ID")
    private int placeSeatID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Time_Slot_ID")
    private int timeSlotID;

    public EventSlotDetailsPK() {
    }

    public EventSlotDetailsPK(int eventID, int customerID, int placeSeatID, int timeSlotID) {
        this.eventID = eventID;
        this.customerID = customerID;
        this.placeSeatID = placeSeatID;
        this.timeSlotID = timeSlotID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getPlaceSeatID() {
        return placeSeatID;
    }

    public void setPlaceSeatID(int placeSeatID) {
        this.placeSeatID = placeSeatID;
    }

    public int getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(int timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) eventID;
        hash += (int) customerID;
        hash += (int) placeSeatID;
        hash += (int) timeSlotID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventSlotDetailsPK)) {
            return false;
        }
        EventSlotDetailsPK other = (EventSlotDetailsPK) object;
        if (this.eventID != other.eventID) {
            return false;
        }
        if (this.customerID != other.customerID) {
            return false;
        }
        if (this.placeSeatID != other.placeSeatID) {
            return false;
        }
        if (this.timeSlotID != other.timeSlotID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.EventSlotDetailsPK[ eventID=" + eventID + ", customerID=" + customerID + ", placeSeatID=" + placeSeatID + ", timeSlotID=" + timeSlotID + " ]";
    }
    
}
