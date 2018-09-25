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
public class MovieSlotDetailsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Customer_ID")
    private int customerID;
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
    @Column(name = "Movie_ID")
    private int movieID;

    public MovieSlotDetailsPK() {
    }

    public MovieSlotDetailsPK(int customerID, int timeSlotID, int seatID, int movieID) {
        this.customerID = customerID;
        this.timeSlotID = timeSlotID;
        this.seatID = seatID;
        this.movieID = movieID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) customerID;
        hash += (int) timeSlotID;
        hash += (int) seatID;
        hash += (int) movieID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovieSlotDetailsPK)) {
            return false;
        }
        MovieSlotDetailsPK other = (MovieSlotDetailsPK) object;
        if (this.customerID != other.customerID) {
            return false;
        }
        if (this.timeSlotID != other.timeSlotID) {
            return false;
        }
        if (this.seatID != other.seatID) {
            return false;
        }
        if (this.movieID != other.movieID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.MovieSlotDetailsPK[ customerID=" + customerID + ", timeSlotID=" + timeSlotID + ", seatID=" + seatID + ", movieID=" + movieID + " ]";
    }
    
}
