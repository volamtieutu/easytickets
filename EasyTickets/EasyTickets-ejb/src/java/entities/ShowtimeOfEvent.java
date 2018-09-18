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
 * @author Administrator
 */
@Entity
@Table(name = "Showtime_Of_Event")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShowtimeOfEvent.findAll", query = "SELECT s FROM ShowtimeOfEvent s")
    , @NamedQuery(name = "ShowtimeOfEvent.findByEventID", query = "SELECT s FROM ShowtimeOfEvent s WHERE s.showtimeOfEventPK.eventID = :eventID")
    , @NamedQuery(name = "ShowtimeOfEvent.findByPlaceID", query = "SELECT s FROM ShowtimeOfEvent s WHERE s.showtimeOfEventPK.placeID = :placeID")
    , @NamedQuery(name = "ShowtimeOfEvent.findByRunningDatetime", query = "SELECT s FROM ShowtimeOfEvent s WHERE s.runningDatetime = :runningDatetime")})
public class ShowtimeOfEvent implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShowtimeOfEventPK showtimeOfEventPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Running_Datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date runningDatetime;
    @JoinColumn(name = "Event_ID", referencedColumnName = "Event_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Event event;
    @JoinColumn(name = "Place_ID", referencedColumnName = "Place_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Place place;

    public ShowtimeOfEvent() {
    }

    public ShowtimeOfEvent(ShowtimeOfEventPK showtimeOfEventPK) {
        this.showtimeOfEventPK = showtimeOfEventPK;
    }

    public ShowtimeOfEvent(ShowtimeOfEventPK showtimeOfEventPK, Date runningDatetime) {
        this.showtimeOfEventPK = showtimeOfEventPK;
        this.runningDatetime = runningDatetime;
    }

    public ShowtimeOfEvent(int eventID, int placeID) {
        this.showtimeOfEventPK = new ShowtimeOfEventPK(eventID, placeID);
    }

    public ShowtimeOfEventPK getShowtimeOfEventPK() {
        return showtimeOfEventPK;
    }

    public void setShowtimeOfEventPK(ShowtimeOfEventPK showtimeOfEventPK) {
        this.showtimeOfEventPK = showtimeOfEventPK;
    }

    public Date getRunningDatetime() {
        return runningDatetime;
    }

    public void setRunningDatetime(Date runningDatetime) {
        this.runningDatetime = runningDatetime;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (showtimeOfEventPK != null ? showtimeOfEventPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShowtimeOfEvent)) {
            return false;
        }
        ShowtimeOfEvent other = (ShowtimeOfEvent) object;
        if ((this.showtimeOfEventPK == null && other.showtimeOfEventPK != null) || (this.showtimeOfEventPK != null && !this.showtimeOfEventPK.equals(other.showtimeOfEventPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ShowtimeOfEvent[ showtimeOfEventPK=" + showtimeOfEventPK + " ]";
    }
    
}
