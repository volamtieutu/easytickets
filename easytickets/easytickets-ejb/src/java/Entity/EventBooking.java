/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Win-PC
 */
@Entity
@Table(name = "Event_Booking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EventBooking.findAll", query = "SELECT e FROM EventBooking e")
    , @NamedQuery(name = "EventBooking.findByBookingID", query = "SELECT e FROM EventBooking e WHERE e.bookingID = :bookingID")
    , @NamedQuery(name = "EventBooking.findByAmountOfPayment", query = "SELECT e FROM EventBooking e WHERE e.amountOfPayment = :amountOfPayment")
    , @NamedQuery(name = "EventBooking.findByAmoutOfSeat", query = "SELECT e FROM EventBooking e WHERE e.amoutOfSeat = :amoutOfSeat")})
public class EventBooking implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Booking_ID")
    private Integer bookingID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amount_Of_Payment")
    private int amountOfPayment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amout_Of_Seat")
    private int amoutOfSeat;
    @JoinColumn(name = "Username", referencedColumnName = "Username")
    @ManyToOne(optional = false)
    private Customer username;
    @JoinColumn(name = "Event_ID", referencedColumnName = "Event_ID")
    @ManyToOne(optional = false)
    private Event eventID;
    @JoinColumn(name = "Place_ID", referencedColumnName = "Place_ID")
    @ManyToOne(optional = false)
    private Place placeID;

    public EventBooking() {
    }

    public EventBooking(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public EventBooking(Integer bookingID, int amountOfPayment, int amoutOfSeat) {
        this.bookingID = bookingID;
        this.amountOfPayment = amountOfPayment;
        this.amoutOfSeat = amoutOfSeat;
    }

    public Integer getBookingID() {
        return bookingID;
    }

    public void setBookingID(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public int getAmountOfPayment() {
        return amountOfPayment;
    }

    public void setAmountOfPayment(int amountOfPayment) {
        this.amountOfPayment = amountOfPayment;
    }

    public int getAmoutOfSeat() {
        return amoutOfSeat;
    }

    public void setAmoutOfSeat(int amoutOfSeat) {
        this.amoutOfSeat = amoutOfSeat;
    }

    public Customer getUsername() {
        return username;
    }

    public void setUsername(Customer username) {
        this.username = username;
    }

    public Event getEventID() {
        return eventID;
    }

    public void setEventID(Event eventID) {
        this.eventID = eventID;
    }

    public Place getPlaceID() {
        return placeID;
    }

    public void setPlaceID(Place placeID) {
        this.placeID = placeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingID != null ? bookingID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventBooking)) {
            return false;
        }
        EventBooking other = (EventBooking) object;
        if ((this.bookingID == null && other.bookingID != null) || (this.bookingID != null && !this.bookingID.equals(other.bookingID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.EventBooking[ bookingID=" + bookingID + " ]";
    }
    
}
