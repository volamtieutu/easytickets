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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Win-PC
 */
@Entity
@Table(name = "Time_Slot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TimeSlot.findAll", query = "SELECT t FROM TimeSlot t")
    , @NamedQuery(name = "TimeSlot.findByTimeSlotID", query = "SELECT t FROM TimeSlot t WHERE t.timeSlotID = :timeSlotID")
    , @NamedQuery(name = "TimeSlot.findByDate", query = "SELECT t FROM TimeSlot t WHERE t.date = :date")
    , @NamedQuery(name = "TimeSlot.findBySlot", query = "SELECT t FROM TimeSlot t WHERE t.slot = :slot")})
public class TimeSlot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TimeSlot_ID")
    private Integer timeSlotID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Date")
    private String date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Slot")
    private String slot;
    @JoinColumn(name = "Movie_ID", referencedColumnName = "Movie_ID")
    @ManyToOne(optional = false)
    private Movie movieID;
    @JoinColumn(name = "Room_ID", referencedColumnName = "Room_ID")
    @ManyToOne(optional = false)
    private Room roomID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "timeSlotID")
    private Collection<MovieBooking> movieBookingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "timeSlot")
    private Collection<TimeSlotDetails> timeSlotDetailsCollection;

    public TimeSlot() {
    }

    public TimeSlot(Integer timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public TimeSlot(Integer timeSlotID, String date, String slot) {
        this.timeSlotID = timeSlotID;
        this.date = date;
        this.slot = slot;
    }

    public Integer getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(Integer timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Movie getMovieID() {
        return movieID;
    }

    public void setMovieID(Movie movieID) {
        this.movieID = movieID;
    }

    public Room getRoomID() {
        return roomID;
    }

    public void setRoomID(Room roomID) {
        this.roomID = roomID;
    }

    @XmlTransient
    public Collection<MovieBooking> getMovieBookingCollection() {
        return movieBookingCollection;
    }

    public void setMovieBookingCollection(Collection<MovieBooking> movieBookingCollection) {
        this.movieBookingCollection = movieBookingCollection;
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
        hash += (timeSlotID != null ? timeSlotID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimeSlot)) {
            return false;
        }
        TimeSlot other = (TimeSlot) object;
        if ((this.timeSlotID == null && other.timeSlotID != null) || (this.timeSlotID != null && !this.timeSlotID.equals(other.timeSlotID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TimeSlot[ timeSlotID=" + timeSlotID + " ]";
    }
    
}
