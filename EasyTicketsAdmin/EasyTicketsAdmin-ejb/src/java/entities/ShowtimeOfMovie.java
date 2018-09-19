/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Win-PC
 */
@Entity
@Table(name = "Showtime_Of_Movie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShowtimeOfMovie.findAll", query = "SELECT s FROM ShowtimeOfMovie s")
    , @NamedQuery(name = "ShowtimeOfMovie.findByTheaterID", query = "SELECT s FROM ShowtimeOfMovie s WHERE s.showtimeOfMoviePK.theaterID = :theaterID")
    , @NamedQuery(name = "ShowtimeOfMovie.findByMovieID", query = "SELECT s FROM ShowtimeOfMovie s WHERE s.showtimeOfMoviePK.movieID = :movieID")
    , @NamedQuery(name = "ShowtimeOfMovie.findByRunningDatetime", query = "SELECT s FROM ShowtimeOfMovie s WHERE s.runningDatetime = :runningDatetime")})
public class ShowtimeOfMovie implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShowtimeOfMoviePK showtimeOfMoviePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Running_Datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date runningDatetime;
    @JoinColumn(name = "Theater_ID", referencedColumnName = "Theater_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Theater theater;

    public ShowtimeOfMovie() {
    }

    public ShowtimeOfMovie(ShowtimeOfMoviePK showtimeOfMoviePK) {
        this.showtimeOfMoviePK = showtimeOfMoviePK;
    }

    public ShowtimeOfMovie(ShowtimeOfMoviePK showtimeOfMoviePK, Date runningDatetime) {
        this.showtimeOfMoviePK = showtimeOfMoviePK;
        this.runningDatetime = runningDatetime;
    }

    public ShowtimeOfMovie(int theaterID, int movieID) {
        this.showtimeOfMoviePK = new ShowtimeOfMoviePK(theaterID, movieID);
    }

    public ShowtimeOfMoviePK getShowtimeOfMoviePK() {
        return showtimeOfMoviePK;
    }

    public void setShowtimeOfMoviePK(ShowtimeOfMoviePK showtimeOfMoviePK) {
        this.showtimeOfMoviePK = showtimeOfMoviePK;
    }

    public Date getRunningDatetime() {
        return runningDatetime;
    }

    public void setRunningDatetime(Date runningDatetime) {
        this.runningDatetime = runningDatetime;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (showtimeOfMoviePK != null ? showtimeOfMoviePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShowtimeOfMovie)) {
            return false;
        }
        ShowtimeOfMovie other = (ShowtimeOfMovie) object;
        if ((this.showtimeOfMoviePK == null && other.showtimeOfMoviePK != null) || (this.showtimeOfMoviePK != null && !this.showtimeOfMoviePK.equals(other.showtimeOfMoviePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ShowtimeOfMovie[ showtimeOfMoviePK=" + showtimeOfMoviePK + " ]";
    }
    
}
