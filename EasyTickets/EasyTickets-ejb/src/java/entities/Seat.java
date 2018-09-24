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
@Table(name = "Seat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seat.findAll", query = "SELECT s FROM Seat s")
    , @NamedQuery(name = "Seat.findBySeatID", query = "SELECT s FROM Seat s WHERE s.seatID = :seatID")
    , @NamedQuery(name = "Seat.findBySeatColumn", query = "SELECT s FROM Seat s WHERE s.seatColumn = :seatColumn")})
public class Seat implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seat")
    private Collection<MovieSlotDetails> movieSlotDetailsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seatID")
    private Collection<Room> roomCollection;

    public Seat() {
    }

    public Seat(Integer seatID) {
        this.seatID = seatID;
    }

    public Seat(Integer seatID, String seatColumn) {
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
    public Collection<MovieSlotDetails> getMovieSlotDetailsCollection() {
        return movieSlotDetailsCollection;
    }

    public void setMovieSlotDetailsCollection(Collection<MovieSlotDetails> movieSlotDetailsCollection) {
        this.movieSlotDetailsCollection = movieSlotDetailsCollection;
    }

    @XmlTransient
    public Collection<Room> getRoomCollection() {
        return roomCollection;
    }

    public void setRoomCollection(Collection<Room> roomCollection) {
        this.roomCollection = roomCollection;
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
        if (!(object instanceof Seat)) {
            return false;
        }
        Seat other = (Seat) object;
        if ((this.seatID == null && other.seatID != null) || (this.seatID != null && !this.seatID.equals(other.seatID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Seat[ seatID=" + seatID + " ]";
    }
    
}
