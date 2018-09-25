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
public class ShowtimeOfMoviePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Theater_ID")
    private int theaterID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Movie_ID")
    private int movieID;

    public ShowtimeOfMoviePK() {
    }

    public ShowtimeOfMoviePK(int theaterID, int movieID) {
        this.theaterID = theaterID;
        this.movieID = movieID;
    }

    public int getTheaterID() {
        return theaterID;
    }

    public void setTheaterID(int theaterID) {
        this.theaterID = theaterID;
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
        hash += (int) theaterID;
        hash += (int) movieID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShowtimeOfMoviePK)) {
            return false;
        }
        ShowtimeOfMoviePK other = (ShowtimeOfMoviePK) object;
        if (this.theaterID != other.theaterID) {
            return false;
        }
        if (this.movieID != other.movieID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ShowtimeOfMoviePK[ theaterID=" + theaterID + ", movieID=" + movieID + " ]";
    }
    
}
