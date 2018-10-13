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
public class TimeSlotDetailsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Time_Slot_ID")
    private int timeSlotID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Seat_ID")
    private int seatID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Booking_ID")
    private int bookingID;

    public TimeSlotDetailsPK() {
    }

    public TimeSlotDetailsPK(int timeSlotID, int seatID, int bookingID) {
        this.timeSlotID = timeSlotID;
        this.seatID = seatID;
        this.bookingID = bookingID;
    }

    public int getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(int timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) timeSlotID;
        hash += (int) seatID;
        hash += (int) bookingID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimeSlotDetailsPK)) {
            return false;
        }
        TimeSlotDetailsPK other = (TimeSlotDetailsPK) object;
        if (this.timeSlotID != other.timeSlotID) {
            return false;
        }
        if (this.seatID != other.seatID) {
            return false;
        }
        if (this.bookingID != other.bookingID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TimeSlotDetailsPK[ timeSlotID=" + timeSlotID + ", seatID=" + seatID + ", bookingID=" + bookingID + " ]";
    }
    
}
