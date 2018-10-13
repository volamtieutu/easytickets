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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "Room")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Room.findAll", query = "SELECT r FROM Room r")
    , @NamedQuery(name = "Room.findByRoomID", query = "SELECT r FROM Room r WHERE r.roomID = :roomID")
    , @NamedQuery(name = "Room.findByRoomName", query = "SELECT r FROM Room r WHERE r.roomName = :roomName")
    , @NamedQuery(name = "Room.findBySeatNo", query = "SELECT r FROM Room r WHERE r.seatNo = :seatNo")})
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
//    @Basic(optional = false)
//    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Room_ID")
    private Integer roomID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Room_Name")
    private String roomName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Seat_No")
    private int seatNo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomID")
    private Collection<Seat> seatCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomID")
    private Collection<TimeSlot> timeSlotCollection;
    @JoinColumn(name = "Cinema_ID", referencedColumnName = "Cinema_ID")
    @ManyToOne(optional = false)
    private Cinema cinemaID;

    public Room() {
    }

    public Room(Integer roomID) {
        this.roomID = roomID;
    }

    public Room(Integer roomID, String roomName, int seatNo) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.seatNo = seatNo;
    }

    public Integer getRoomID() {
        return roomID;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    @XmlTransient
    public Collection<Seat> getSeatCollection() {
        return seatCollection;
    }

    public void setSeatCollection(Collection<Seat> seatCollection) {
        this.seatCollection = seatCollection;
    }

    @XmlTransient
    public Collection<TimeSlot> getTimeSlotCollection() {
        return timeSlotCollection;
    }

    public void setTimeSlotCollection(Collection<TimeSlot> timeSlotCollection) {
        this.timeSlotCollection = timeSlotCollection;
    }

    public Cinema getCinemaID() {
        return cinemaID;
    }

    public void setCinemaID(Cinema cinemaID) {
        this.cinemaID = cinemaID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomID != null ? roomID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Room)) {
            return false;
        }
        Room other = (Room) object;
        if ((this.roomID == null && other.roomID != null) || (this.roomID != null && !this.roomID.equals(other.roomID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Room[ roomID=" + roomID + " ]";
    }
    
}
