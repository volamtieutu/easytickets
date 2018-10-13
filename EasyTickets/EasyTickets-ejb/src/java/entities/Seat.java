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
@Table(name = "Seat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seat.findAll", query = "SELECT s FROM Seat s")
    , @NamedQuery(name = "Seat.findBySeatID", query = "SELECT s FROM Seat s WHERE s.seatID = :seatID")
    , @NamedQuery(name = "Seat.findByRow", query = "SELECT s FROM Seat s WHERE s.row = :row")
    , @NamedQuery(name = "Seat.findByNumber", query = "SELECT s FROM Seat s WHERE s.number = :number")})
public class Seat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
//    @Basic(optional = false)
//    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Seat_ID")
    private Integer seatID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Row")
    private String row;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Number")
    private int number;
    @JoinColumn(name = "Room_ID", referencedColumnName = "Room_ID")
    @ManyToOne(optional = false)
    private Room roomID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seat")
    private Collection<TimeSlotDetails> timeSlotDetailsCollection;

    public Seat() {
    }

    public Seat(Integer seatID) {
        this.seatID = seatID;
    }

    public Seat(Integer seatID, String row, int number) {
        this.seatID = seatID;
        this.row = row;
        this.number = number;
    }

    public Integer getSeatID() {
        return seatID;
    }

    public void setSeatID(Integer seatID) {
        this.seatID = seatID;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Room getRoomID() {
        return roomID;
    }

    public void setRoomID(Room roomID) {
        this.roomID = roomID;
    }

    @XmlTransient
    public Collection<TimeSlotDetails> getTimeSlotDetailsCollection() {
        return timeSlotDetailsCollection;
    }

    public void setTimeSlotDetailsCollection(Collection<TimeSlotDetails> timeSlotDetailsCollection) {
        this.timeSlotDetailsCollection = timeSlotDetailsCollection;
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
