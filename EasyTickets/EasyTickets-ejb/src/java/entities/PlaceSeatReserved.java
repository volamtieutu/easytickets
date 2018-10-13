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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Win-PC
 */
@Entity
@Table(name = "PlaceSeat_Reserved")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaceSeatReserved.findAll", query = "SELECT p FROM PlaceSeatReserved p")
    , @NamedQuery(name = "PlaceSeatReserved.findByPlaceSeatID", query = "SELECT p FROM PlaceSeatReserved p WHERE p.placeSeatID = :placeSeatID")
    , @NamedQuery(name = "PlaceSeatReserved.findBySeatingAreaNo", query = "SELECT p FROM PlaceSeatReserved p WHERE p.seatingAreaNo = :seatingAreaNo")})
public class PlaceSeatReserved implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PlaceSeat_ID")
    private Integer placeSeatID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SeatingArea_No")
    private int seatingAreaNo;
    @JoinColumn(name = "SeatingArea_ID", referencedColumnName = "SeatingArea_ID")
    @ManyToOne(optional = false)
    private SeatingArea seatingAreaID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "placeSeatID")
    private Collection<Sport> sportCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "placeSeatID")
    private Collection<EventBooking> eventBookingCollection;

    public PlaceSeatReserved() {
    }

    public PlaceSeatReserved(Integer placeSeatID) {
        this.placeSeatID = placeSeatID;
    }

    public PlaceSeatReserved(Integer placeSeatID, int seatingAreaNo) {
        this.placeSeatID = placeSeatID;
        this.seatingAreaNo = seatingAreaNo;
    }

    public Integer getPlaceSeatID() {
        return placeSeatID;
    }

    public void setPlaceSeatID(Integer placeSeatID) {
        this.placeSeatID = placeSeatID;
    }

    public int getSeatingAreaNo() {
        return seatingAreaNo;
    }

    public void setSeatingAreaNo(int seatingAreaNo) {
        this.seatingAreaNo = seatingAreaNo;
    }

    public SeatingArea getSeatingAreaID() {
        return seatingAreaID;
    }

    public void setSeatingAreaID(SeatingArea seatingAreaID) {
        this.seatingAreaID = seatingAreaID;
    }

    @XmlTransient
    public Collection<Sport> getSportCollection() {
        return sportCollection;
    }

    public void setSportCollection(Collection<Sport> sportCollection) {
        this.sportCollection = sportCollection;
    }

    @XmlTransient
    public Collection<EventBooking> getEventBookingCollection() {
        return eventBookingCollection;
    }

    public void setEventBookingCollection(Collection<EventBooking> eventBookingCollection) {
        this.eventBookingCollection = eventBookingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placeSeatID != null ? placeSeatID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaceSeatReserved)) {
            return false;
        }
        PlaceSeatReserved other = (PlaceSeatReserved) object;
        if ((this.placeSeatID == null && other.placeSeatID != null) || (this.placeSeatID != null && !this.placeSeatID.equals(other.placeSeatID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PlaceSeatReserved[ placeSeatID=" + placeSeatID + " ]";
    }
    
}
