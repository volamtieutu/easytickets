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
@Table(name = "Seating_Area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeatingArea.findAll", query = "SELECT s FROM SeatingArea s")
    , @NamedQuery(name = "SeatingArea.findBySeatingAreaID", query = "SELECT s FROM SeatingArea s WHERE s.seatingAreaID = :seatingAreaID")
    , @NamedQuery(name = "SeatingArea.findBySeatingAreaName", query = "SELECT s FROM SeatingArea s WHERE s.seatingAreaName = :seatingAreaName")})
public class SeatingArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SeatingArea_ID")
    private Integer seatingAreaID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "SeatingArea_Name")
    private String seatingAreaName;
    @JoinColumn(name = "Place_ID", referencedColumnName = "Place_ID")
    @ManyToOne(optional = false)
    private Place placeID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seatingAreaID")
    private Collection<PlaceSeatReserved> placeSeatReservedCollection;

    public SeatingArea() {
    }

    public SeatingArea(Integer seatingAreaID) {
        this.seatingAreaID = seatingAreaID;
    }

    public SeatingArea(Integer seatingAreaID, String seatingAreaName) {
        this.seatingAreaID = seatingAreaID;
        this.seatingAreaName = seatingAreaName;
    }

    public Integer getSeatingAreaID() {
        return seatingAreaID;
    }

    public void setSeatingAreaID(Integer seatingAreaID) {
        this.seatingAreaID = seatingAreaID;
    }

    public String getSeatingAreaName() {
        return seatingAreaName;
    }

    public void setSeatingAreaName(String seatingAreaName) {
        this.seatingAreaName = seatingAreaName;
    }

    public Place getPlaceID() {
        return placeID;
    }

    public void setPlaceID(Place placeID) {
        this.placeID = placeID;
    }

    @XmlTransient
    public Collection<PlaceSeatReserved> getPlaceSeatReservedCollection() {
        return placeSeatReservedCollection;
    }

    public void setPlaceSeatReservedCollection(Collection<PlaceSeatReserved> placeSeatReservedCollection) {
        this.placeSeatReservedCollection = placeSeatReservedCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seatingAreaID != null ? seatingAreaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeatingArea)) {
            return false;
        }
        SeatingArea other = (SeatingArea) object;
        if ((this.seatingAreaID == null && other.seatingAreaID != null) || (this.seatingAreaID != null && !this.seatingAreaID.equals(other.seatingAreaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.SeatingArea[ seatingAreaID=" + seatingAreaID + " ]";
    }
    
}
