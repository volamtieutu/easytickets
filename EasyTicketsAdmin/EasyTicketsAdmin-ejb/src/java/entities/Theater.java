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
@Table(name = "Theater")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Theater.findAll", query = "SELECT t FROM Theater t")
    , @NamedQuery(name = "Theater.findByTheaterID", query = "SELECT t FROM Theater t WHERE t.theaterID = :theaterID")
    , @NamedQuery(name = "Theater.findByTheaterName", query = "SELECT t FROM Theater t WHERE t.theaterName = :theaterName")
    , @NamedQuery(name = "Theater.findBySeat", query = "SELECT t FROM Theater t WHERE t.seat = :seat")})
public class Theater implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Theater_ID")
    private Integer theaterID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Theater_Name")
    private String theaterName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Seat")
    private int seat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "theater")
    private Collection<ShowtimeOfMovie> showtimeOfMovieCollection;
    @JoinColumn(name = "Cinema_ID", referencedColumnName = "Cinema_ID")
    @ManyToOne(optional = false)
    private Cinema cinemaID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "theaterID")
    private Collection<MovieBooking> movieBookingCollection;

    public Theater() {
    }

    public Theater(Integer theaterID) {
        this.theaterID = theaterID;
    }

    public Theater(Integer theaterID, String theaterName, int seat) {
        this.theaterID = theaterID;
        this.theaterName = theaterName;
        this.seat = seat;
    }

    public Integer getTheaterID() {
        return theaterID;
    }

    public void setTheaterID(Integer theaterID) {
        this.theaterID = theaterID;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @XmlTransient
    public Collection<ShowtimeOfMovie> getShowtimeOfMovieCollection() {
        return showtimeOfMovieCollection;
    }

    public void setShowtimeOfMovieCollection(Collection<ShowtimeOfMovie> showtimeOfMovieCollection) {
        this.showtimeOfMovieCollection = showtimeOfMovieCollection;
    }

    public Cinema getCinemaID() {
        return cinemaID;
    }

    public void setCinemaID(Cinema cinemaID) {
        this.cinemaID = cinemaID;
    }

    @XmlTransient
    public Collection<MovieBooking> getMovieBookingCollection() {
        return movieBookingCollection;
    }

    public void setMovieBookingCollection(Collection<MovieBooking> movieBookingCollection) {
        this.movieBookingCollection = movieBookingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterID != null ? theaterID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theater)) {
            return false;
        }
        Theater other = (Theater) object;
        if ((this.theaterID == null && other.theaterID != null) || (this.theaterID != null && !this.theaterID.equals(other.theaterID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Theater[ theaterID=" + theaterID + " ]";
    }
    
}
