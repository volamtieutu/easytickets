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
 * @author Administrator
 */
@Entity
@Table(name = "Place")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Place.findAll", query = "SELECT p FROM Place p")
    , @NamedQuery(name = "Place.findByPlaceID", query = "SELECT p FROM Place p WHERE p.placeID = :placeID")
    , @NamedQuery(name = "Place.findByPlaceName", query = "SELECT p FROM Place p WHERE p.placeName = :placeName")
    , @NamedQuery(name = "Place.findByPlaceAddress", query = "SELECT p FROM Place p WHERE p.placeAddress = :placeAddress")
    , @NamedQuery(name = "Place.findByPhone", query = "SELECT p FROM Place p WHERE p.phone = :phone")
    , @NamedQuery(name = "Place.findBySeat", query = "SELECT p FROM Place p WHERE p.seat = :seat")})
public class Place implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Place_ID")
    private Integer placeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Place_Name")
    private String placeName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Place_Address")
    private String placeAddress;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Seat")
    private int seat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "place")
    private Collection<ShowtimeOfEvent> showtimeOfEventCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "placeID")
    private Collection<EventBooking> eventBookingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "placeID")
    private Collection<SportBooking> sportBookingCollection;
    @JoinColumn(name = "Area_ID", referencedColumnName = "Area_ID")
    @ManyToOne(optional = false)
    private Area areaID;

    public Place() {
    }

    public Place(Integer placeID) {
        this.placeID = placeID;
    }

    public Place(Integer placeID, String placeName, String placeAddress, String phone, int seat) {
        this.placeID = placeID;
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.phone = phone;
        this.seat = seat;
    }

    public Integer getPlaceID() {
        return placeID;
    }

    public void setPlaceID(Integer placeID) {
        this.placeID = placeID;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(String placeAddress) {
        this.placeAddress = placeAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @XmlTransient
    public Collection<ShowtimeOfEvent> getShowtimeOfEventCollection() {
        return showtimeOfEventCollection;
    }

    public void setShowtimeOfEventCollection(Collection<ShowtimeOfEvent> showtimeOfEventCollection) {
        this.showtimeOfEventCollection = showtimeOfEventCollection;
    }

    @XmlTransient
    public Collection<EventBooking> getEventBookingCollection() {
        return eventBookingCollection;
    }

    public void setEventBookingCollection(Collection<EventBooking> eventBookingCollection) {
        this.eventBookingCollection = eventBookingCollection;
    }

    @XmlTransient
    public Collection<SportBooking> getSportBookingCollection() {
        return sportBookingCollection;
    }

    public void setSportBookingCollection(Collection<SportBooking> sportBookingCollection) {
        this.sportBookingCollection = sportBookingCollection;
    }

    public Area getAreaID() {
        return areaID;
    }

    public void setAreaID(Area areaID) {
        this.areaID = areaID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placeID != null ? placeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Place)) {
            return false;
        }
        Place other = (Place) object;
        if ((this.placeID == null && other.placeID != null) || (this.placeID != null && !this.placeID.equals(other.placeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Place[ placeID=" + placeID + " ]";
    }
    
}
