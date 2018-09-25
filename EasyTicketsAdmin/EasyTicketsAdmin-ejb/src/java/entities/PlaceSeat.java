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
@Table(name = "Place_Seat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaceSeat.findAll", query = "SELECT p FROM PlaceSeat p")
    , @NamedQuery(name = "PlaceSeat.findBySeatID", query = "SELECT p FROM PlaceSeat p WHERE p.seatID = :seatID")
    , @NamedQuery(name = "PlaceSeat.findBySeatColumn", query = "SELECT p FROM PlaceSeat p WHERE p.seatColumn = :seatColumn")})
public class PlaceSeat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Seat_ID")
    private Integer seatID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Seat_Column")
    private String seatColumn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "placeSeat")
    private Collection<EventSlotDetails> eventSlotDetailsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seatID")
    private Collection<Place> placeCollection;

    public PlaceSeat() {
    }

    public PlaceSeat(Integer seatID) {
        this.seatID = seatID;
    }

    public PlaceSeat(Integer seatID, String seatColumn) {
        this.seatID = seatID;
        this.seatColumn = seatColumn;
    }

    public Integer getSeatID() {
        return seatID;
    }

    public void setSeatID(Integer seatID) {
        this.seatID = seatID;
    }

    public String getSeatColumn() {
        return seatColumn;
    }

    public void setSeatColumn(String seatColumn) {
        this.seatColumn = seatColumn;
    }

    @XmlTransient
    public Collection<EventSlotDetails> getEventSlotDetailsCollection() {
        return eventSlotDetailsCollection;
    }

    public void setEventSlotDetailsCollection(Collection<EventSlotDetails> eventSlotDetailsCollection) {
        this.eventSlotDetailsCollection = eventSlotDetailsCollection;
    }

    @XmlTransient
    public Collection<Place> getPlaceCollection() {
        return placeCollection;
    }

    public void setPlaceCollection(Collection<Place> placeCollection) {
        this.placeCollection = placeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seatID != null ? seatID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaceSeat)) {
            return false;
        }
        PlaceSeat other = (PlaceSeat) object;
        if ((this.seatID == null && other.seatID != null) || (this.seatID != null && !this.seatID.equals(other.seatID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PlaceSeat[ seatID=" + seatID + " ]";
    }
    
}
