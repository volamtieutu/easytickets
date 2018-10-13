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
@Table(name = "Time_Slot_Details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TimeSlotDetails.findAll", query = "SELECT t FROM TimeSlotDetails t")
    , @NamedQuery(name = "TimeSlotDetails.findByTimeSlotID", query = "SELECT t FROM TimeSlotDetails t WHERE t.timeSlotDetailsPK.timeSlotID = :timeSlotID")
    , @NamedQuery(name = "TimeSlotDetails.findBySeatID", query = "SELECT t FROM TimeSlotDetails t WHERE t.timeSlotDetailsPK.seatID = :seatID")
    , @NamedQuery(name = "TimeSlotDetails.findByBookingID", query = "SELECT t FROM TimeSlotDetails t WHERE t.timeSlotDetailsPK.bookingID = :bookingID")})
public class TimeSlotDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TimeSlotDetailsPK timeSlotDetailsPK;
    @JoinColumn(name = "Booking_ID", referencedColumnName = "Booking_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MovieBooking movieBooking;
    @JoinColumn(name = "Seat_ID", referencedColumnName = "Seat_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Seat seat;
    @JoinColumn(name = "Time_Slot_ID", referencedColumnName = "TimeSlot_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TimeSlot timeSlot;

    public TimeSlotDetails() {
    }

    public TimeSlotDetails(TimeSlotDetailsPK timeSlotDetailsPK) {
        this.timeSlotDetailsPK = timeSlotDetailsPK;
    }

    public TimeSlotDetails(int timeSlotID, int seatID, int bookingID) {
        this.timeSlotDetailsPK = new TimeSlotDetailsPK(timeSlotID, seatID, bookingID);
    }

    public TimeSlotDetailsPK getTimeSlotDetailsPK() {
        return timeSlotDetailsPK;
    }

    public void setTimeSlotDetailsPK(TimeSlotDetailsPK timeSlotDetailsPK) {
        this.timeSlotDetailsPK = timeSlotDetailsPK;
    }

    public MovieBooking getMovieBooking() {
        return movieBooking;
    }

    public void setMovieBooking(MovieBooking movieBooking) {
        this.movieBooking = movieBooking;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
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
        hash += (timeSlotDetailsPK != null ? timeSlotDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimeSlotDetails)) {
            return false;
        }
        TimeSlotDetails other = (TimeSlotDetails) object;
        if ((this.timeSlotDetailsPK == null && other.timeSlotDetailsPK != null) || (this.timeSlotDetailsPK != null && !this.timeSlotDetailsPK.equals(other.timeSlotDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TimeSlotDetails[ timeSlotDetailsPK=" + timeSlotDetailsPK + " ]";
    }
    
}
