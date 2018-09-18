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
 * @author Administrator
 */
@Embeddable
public class ShowtimeOfEventPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Event_ID")
    private int eventID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Place_ID")
    private int placeID;

    public ShowtimeOfEventPK() {
    }

    public ShowtimeOfEventPK(int eventID, int placeID) {
        this.eventID = eventID;
        this.placeID = placeID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getPlaceID() {
        return placeID;
    }

    public void setPlaceID(int placeID) {
        this.placeID = placeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) eventID;
        hash += (int) placeID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShowtimeOfEventPK)) {
            return false;
        }
        ShowtimeOfEventPK other = (ShowtimeOfEventPK) object;
        if (this.eventID != other.eventID) {
            return false;
        }
        if (this.placeID != other.placeID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ShowtimeOfEventPK[ eventID=" + eventID + ", placeID=" + placeID + " ]";
    }
    
}
