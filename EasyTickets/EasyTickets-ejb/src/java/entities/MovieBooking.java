/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Win-PC
 */
@Entity
@Table(name = "Movie_Booking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MovieBooking.findAll", query = "SELECT m FROM MovieBooking m")
    , @NamedQuery(name = "MovieBooking.findByBookingID", query = "SELECT m FROM MovieBooking m WHERE m.bookingID = :bookingID")
    , @NamedQuery(name = "MovieBooking.findByAmoutOfSeat", query = "SELECT m FROM MovieBooking m WHERE m.amoutOfSeat = :amoutOfSeat")
    , @NamedQuery(name = "MovieBooking.findByAmoutOfPayment", query = "SELECT m FROM MovieBooking m WHERE m.amoutOfPayment = :amoutOfPayment")})
public class MovieBooking implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Booking_ID")
    private Integer bookingID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amout_Of_Seat")
    private int amoutOfSeat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amout_Of_Payment")
    private int amoutOfPayment;
    @JoinColumn(name = "Customer_ID", referencedColumnName = "Customer_ID")
    @ManyToOne(optional = false)
    private Customer customerID;
    @JoinColumn(name = "TimeSlot_ID", referencedColumnName = "TimeSlot_ID")
    @ManyToOne(optional = false)
    private TimeSlot timeSlotID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movieBooking")
    private Collection<TimeSlotDetails> timeSlotDetailsCollection;

    public MovieBooking() {
    }

    public MovieBooking(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public MovieBooking(Integer bookingID, int amoutOfSeat, int amoutOfPayment) {
        this.bookingID = bookingID;
        this.amoutOfSeat = amoutOfSeat;
        this.amoutOfPayment = amoutOfPayment;
    }

    public Integer getBookingID() {
        return bookingID;
    }

    public void setBookingID(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public int getAmoutOfSeat() {
        return amoutOfSeat;
    }

    public void setAmoutOfSeat(int amoutOfSeat) {
        this.amoutOfSeat = amoutOfSeat;
    }

    public int getAmoutOfPayment() {
        return amoutOfPayment;
    }

    public void setAmoutOfPayment(int amoutOfPayment) {
        this.amoutOfPayment = amoutOfPayment;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public TimeSlot getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(TimeSlot timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    @XmlTransient
    public Collection<TimeSlotDetails> getTimeSlotDetailsCollection() {
        return timeSlotDetailsCollection;
    }

    public void setTimeSlotDetailsCollection(Collection<TimeSlotDetails> timeSlotDetailsCollection) {
        this.timeSlotDetailsCollection = timeSlotDetailsCollection;
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
        if (!(object instanceof MovieBooking)) {
            return false;
        }
        MovieBooking other = (MovieBooking) object;
        if ((this.bookingID == null && other.bookingID != null) || (this.bookingID != null && !this.bookingID.equals(other.bookingID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.MovieBooking[ bookingID=" + bookingID + " ]";
    }
    
}
