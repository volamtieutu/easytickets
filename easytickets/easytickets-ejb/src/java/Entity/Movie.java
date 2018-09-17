/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "Movie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m")
    , @NamedQuery(name = "Movie.findByMovieID", query = "SELECT m FROM Movie m WHERE m.movieID = :movieID")
    , @NamedQuery(name = "Movie.findByMovieName", query = "SELECT m FROM Movie m WHERE m.movieName = :movieName")
    , @NamedQuery(name = "Movie.findByKind", query = "SELECT m FROM Movie m WHERE m.kind = :kind")
    , @NamedQuery(name = "Movie.findByLanguage", query = "SELECT m FROM Movie m WHERE m.language = :language")
    , @NamedQuery(name = "Movie.findByRated", query = "SELECT m FROM Movie m WHERE m.rated = :rated")
    , @NamedQuery(name = "Movie.findByActors", query = "SELECT m FROM Movie m WHERE m.actors = :actors")
    , @NamedQuery(name = "Movie.findByDirectors", query = "SELECT m FROM Movie m WHERE m.directors = :directors")
    , @NamedQuery(name = "Movie.findByTimeOfMovie", query = "SELECT m FROM Movie m WHERE m.timeOfMovie = :timeOfMovie")
    , @NamedQuery(name = "Movie.findByTicketPrice", query = "SELECT m FROM Movie m WHERE m.ticketPrice = :ticketPrice")
    , @NamedQuery(name = "Movie.findByBeginDate", query = "SELECT m FROM Movie m WHERE m.beginDate = :beginDate")
    , @NamedQuery(name = "Movie.findByEndDate", query = "SELECT m FROM Movie m WHERE m.endDate = :endDate")
    , @NamedQuery(name = "Movie.findByPoint", query = "SELECT m FROM Movie m WHERE m.point = :point")
    , @NamedQuery(name = "Movie.findByDescription", query = "SELECT m FROM Movie m WHERE m.description = :description")
    , @NamedQuery(name = "Movie.findByImage", query = "SELECT m FROM Movie m WHERE m.image = :image")
    , @NamedQuery(name = "Movie.findByMedia", query = "SELECT m FROM Movie m WHERE m.media = :media")})
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Movie_ID")
    private Integer movieID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Movie_Name")
    private String movieName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Kind")
    private String kind;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Language")
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Rated")
    private int rated;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Actors")
    private String actors;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Directors")
    private String directors;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Time_Of_Movie")
    private int timeOfMovie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ticket_Price")
    private int ticketPrice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Begin_Date")
    private String beginDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "End_Date")
    private String endDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Point")
    private int point;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "Description")
    private String description;
    @Size(max = 500)
    @Column(name = "Image")
    private String image;
    @Size(max = 500)
    @Column(name = "Media")
    private String media;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movieID")
    private Collection<MovieBooking> movieBookingCollection;

    public Movie() {
    }

    public Movie(Integer movieID) {
        this.movieID = movieID;
    }

    public Movie(Integer movieID, String movieName, String kind, String language, int rated, String actors, String directors, int timeOfMovie, int ticketPrice, String beginDate, String endDate, int point, String description) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.kind = kind;
        this.language = language;
        this.rated = rated;
        this.actors = actors;
        this.directors = directors;
        this.timeOfMovie = timeOfMovie;
        this.ticketPrice = ticketPrice;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.point = point;
        this.description = description;
    }

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getRated() {
        return rated;
    }

    public void setRated(int rated) {
        this.rated = rated;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public int getTimeOfMovie() {
        return timeOfMovie;
    }

    public void setTimeOfMovie(int timeOfMovie) {
        this.timeOfMovie = timeOfMovie;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
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
        hash += (movieID != null ? movieID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movie)) {
            return false;
        }
        Movie other = (Movie) object;
        if ((this.movieID == null && other.movieID != null) || (this.movieID != null && !this.movieID.equals(other.movieID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Movie[ movieID=" + movieID + " ]";
    }
    
}