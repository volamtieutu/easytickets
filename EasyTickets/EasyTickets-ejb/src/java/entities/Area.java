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
 * @author Administrator
 */
@Entity
@Table(name = "Area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Area.findAll", query = "SELECT a FROM Area a")
    , @NamedQuery(name = "Area.findByAreaID", query = "SELECT a FROM Area a WHERE a.areaID = :areaID")
    , @NamedQuery(name = "Area.findByAreaName", query = "SELECT a FROM Area a WHERE a.areaName = :areaName")})
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Area_ID")
    private Integer areaID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Area_Name")
    private String areaName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "areaID")
    private Collection<Cinema> cinemaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "areaID")
    private Collection<Place> placeCollection;

    public Area() {
    }

    public Area(Integer areaID) {
        this.areaID = areaID;
    }

    public Area(Integer areaID, String areaName) {
        this.areaID = areaID;
        this.areaName = areaName;
    }

    public Integer getAreaID() {
        return areaID;
    }

    public void setAreaID(Integer areaID) {
        this.areaID = areaID;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @XmlTransient
    public Collection<Cinema> getCinemaCollection() {
        return cinemaCollection;
    }

    public void setCinemaCollection(Collection<Cinema> cinemaCollection) {
        this.cinemaCollection = cinemaCollection;
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
        hash += (areaID != null ? areaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Area)) {
            return false;
        }
        Area other = (Area) object;
        if ((this.areaID == null && other.areaID != null) || (this.areaID != null && !this.areaID.equals(other.areaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Area[ areaID=" + areaID + " ]";
    }
    
}
