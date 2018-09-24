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
@Table(name = "Movie_Slot_Details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MovieSlotDetails.findAll", query = "SELECT m FROM MovieSlotDetails m")
    , @NamedQuery(name = "MovieSlotDetails.findByCustomerID", query = "SELECT m FROM MovieSlotDetails m WHERE m.movieSlotDetailsPK.customerID = :customerID")
    , @NamedQuery(name = "MovieSlotDetails.findByTimeSlotID", query = "SELECT m FROM MovieSlotDetails m WHERE m.movieSlotDetailsPK.timeSlotID = :timeSlotID")
    , @NamedQuery(name = "MovieSlotDetails.findBySeatID", query = "SELECT m FROM MovieSlotDetails m WHERE m.movieSlotDetailsPK.seatID = :seatID")
    , @NamedQuery(name = "MovieSlotDetails.findByMovieID", query = "SELECT m FROM MovieSlotDetails m WHERE m.movieSlotDetailsPK.movieID = :movieID")})
public class MovieSlotDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MovieSlotDetailsPK movieSlotDetailsPK;
    @JoinColumn(name = "Customer_ID", referencedColumnName = "Customer_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Customer customer;
    @JoinColumn(name = "Movie_ID", referencedColumnName = "Movie_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Movie movie;
    @JoinColumn(name = "Seat_ID", referencedColumnName = "Seat_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Seat seat;
    @JoinColumn(name = "Time_Slot_ID", referencedColumnName = "Time_Slot_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TimeSlotMovie timeSlotMovie;

    public MovieSlotDetails() {
    }

    public MovieSlotDetails(MovieSlotDetailsPK movieSlotDetailsPK) {
        this.movieSlotDetailsPK = movieSlotDetailsPK;
    }

    public MovieSlotDetails(int customerID, int timeSlotID, int seatID, int movieID) {
        this.movieSlotDetailsPK = new MovieSlotDetailsPK(customerID, timeSlotID, seatID, movieID);
    }

    public MovieSlotDetailsPK getMovieSlotDetailsPK() {
        return movieSlotDetailsPK;
    }

    public void setMovieSlotDetailsPK(MovieSlotDetailsPK movieSlotDetailsPK) {
        this.movieSlotDetailsPK = movieSlotDetailsPK;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public TimeSlotMovie getTimeSlotMovie() {
        return timeSlotMovie;
    }

    public void setTimeSlotMovie(TimeSlotMovie timeSlotMovie) {
        this.timeSlotMovie = timeSlotMovie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movieSlotDetailsPK != null ? movieSlotDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovieSlotDetails)) {
            return false;
        }
        MovieSlotDetails other = (MovieSlotDetails) object;
        if ((this.movieSlotDetailsPK == null && other.movieSlotDetailsPK != null) || (this.movieSlotDetailsPK != null && !this.movieSlotDetailsPK.equals(other.movieSlotDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.MovieSlotDetails[ movieSlotDetailsPK=" + movieSlotDetailsPK + " ]";
    }
    
}
