/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
@Table(name = "Sport_Booking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SportBooking.findAll", query = "SELECT s FROM SportBooking s")
    , @NamedQuery(name = "SportBooking.findByBookingID", query = "SELECT s FROM SportBooking s WHERE s.bookingID = :bookingID")
    , @NamedQuery(name = "SportBooking.findByAmountOfPayment", query = "SELECT s FROM SportBooking s WHERE s.amountOfPayment = :amountOfPayment")
    , @NamedQuery(name = "SportBooking.findByAmountOfSeat", query = "SELECT s FROM SportBooking s WHERE s.amountOfSeat = :amountOfSeat")})
public class SportBooking implements Serializable {

    @JoinColumn(name = "Customer_ID", referencedColumnName = "Customer_ID")
    @ManyToOne(optional = false)
    private Customer customerID;

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
    @Column(name = "Amount_Of_Seat")
    private int amountOfSeat;
    @JoinColumn(name = "Username", referencedColumnName = "Username")
    @ManyToOne(optional = false)
    private Customer username;
    @JoinColumn(name = "Place_ID", referencedColumnName = "Place_ID")
    @ManyToOne(optional = false)
    private Place placeID;
    @JoinColumn(name = "Sport_ID", referencedColumnName = "Sport_ID")
    @ManyToOne(optional = false)
    private Sport sportID;

    public SportBooking() {
    }

    public SportBooking(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public SportBooking(Integer bookingID, int amountOfPayment, int amountOfSeat) {
        this.bookingID = bookingID;
        this.amountOfPayment = amountOfPayment;
        this.amountOfSeat = amountOfSeat;
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

    public int getAmountOfSeat() {
        return amountOfSeat;
    }

    public void setAmountOfSeat(int amountOfSeat) {
        this.amountOfSeat = amountOfSeat;
    }

    public Customer getUsername() {
        return username;
    }

    public void setUsername(Customer username) {
        this.username = username;
    }

    public Place getPlaceID() {
        return placeID;
    }

    public void setPlaceID(Place placeID) {
        this.placeID = placeID;
    }

    public Sport getSportID() {
        return sportID;
    }

    public void setSportID(Sport sportID) {
        this.sportID = sportID;
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
        if (!(object instanceof SportBooking)) {
            return false;
        }
        SportBooking other = (SportBooking) object;
        if ((this.bookingID == null && other.bookingID != null) || (this.bookingID != null && !this.bookingID.equals(other.bookingID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.SportBooking[ bookingID=" + bookingID + " ]";
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }
    
}
