/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Win-PC
 */
@Entity
@Table(name = "Time_Slot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TimeSlot.findAll", query = "SELECT t FROM TimeSlot t")
    , @NamedQuery(name = "TimeSlot.findByTimeSlotID", query = "SELECT t FROM TimeSlot t WHERE t.timeSlotID = :timeSlotID")
    , @NamedQuery(name = "TimeSlot.findBySlot", query = "SELECT t FROM TimeSlot t WHERE t.slot = :slot")})
public class TimeSlot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Time_Slot_ID")
    private Integer timeSlotID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Slot")
    @Temporal(TemporalType.TIMESTAMP)
    private Date slot;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "timeSlot")
    private Collection<EventSlotDetails> eventSlotDetailsCollection;

    public TimeSlot() {
    }

    public TimeSlot(Integer timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public TimeSlot(Integer timeSlotID, Date slot) {
        this.timeSlotID = timeSlotID;
        this.slot = slot;
    }

    public Integer getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(Integer timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public Date getSlot() {
        return slot;
    }

    public void setSlot(Date slot) {
        this.slot = slot;
    }

    @XmlTransient
    public Collection<EventSlotDetails> getEventSlotDetailsCollection() {
        return eventSlotDetailsCollection;
    }

    public void setEventSlotDetailsCollection(Collection<EventSlotDetails> eventSlotDetailsCollection) {
        this.eventSlotDetailsCollection = eventSlotDetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timeSlotID != null ? timeSlotID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimeSlot)) {
            return false;
        }
        TimeSlot other = (TimeSlot) object;
        if ((this.timeSlotID == null && other.timeSlotID != null) || (this.timeSlotID != null && !this.timeSlotID.equals(other.timeSlotID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TimeSlot[ timeSlotID=" + timeSlotID + " ]";
    }
    
}
