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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Win-PC
 */
@Entity
@Table(name = "Sport")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sport.findAll", query = "SELECT s FROM Sport s")
    , @NamedQuery(name = "Sport.findBySportID", query = "SELECT s FROM Sport s WHERE s.sportID = :sportID")
    , @NamedQuery(name = "Sport.findByTeams", query = "SELECT s FROM Sport s WHERE s.teams = :teams")
    , @NamedQuery(name = "Sport.findByRunTime", query = "SELECT s FROM Sport s WHERE s.runTime = :runTime")
    , @NamedQuery(name = "Sport.findByRunningDatetime", query = "SELECT s FROM Sport s WHERE s.runningDatetime = :runningDatetime")
    , @NamedQuery(name = "Sport.findByTicketPrice", query = "SELECT s FROM Sport s WHERE s.ticketPrice = :ticketPrice")
    , @NamedQuery(name = "Sport.findByPoint", query = "SELECT s FROM Sport s WHERE s.point = :point")})
public class Sport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sport_ID")
    private Integer sportID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Sport_Name")
    private String sportName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Teams")
    private String teams;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Run_Time")
    private int runTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Running_Datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date runningDatetime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ticket_Price")
    private int ticketPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Point")
    private int point;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Media")
    private String media;
    @JoinColumn(name = "PlaceSeat_ID", referencedColumnName = "PlaceSeat_ID")
    @ManyToOne(optional = false)
    private PlaceSeatReserved placeSeatID;
    @JoinColumn(name = "Promotion_ID", referencedColumnName = "Promotion_ID")
    @ManyToOne
    private Promotion promotionID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sportID")
    private Collection<SportBooking> sportBookingCollection;

    public Sport() {
    }

    public Sport(Integer sportID) {
        this.sportID = sportID;
    }

    public Sport(Integer sportID, String sportName, String teams, int runTime, Date runningDatetime, int ticketPrice, int point, String description, String image, String media) {
        this.sportID = sportID;
        this.sportName = sportName;
        this.teams = teams;
        this.runTime = runTime;
        this.runningDatetime = runningDatetime;
        this.ticketPrice = ticketPrice;
        this.point = point;
        this.description = description;
        this.image = image;
        this.media = media;
    }

    public Integer getSportID() {
        return sportID;
    }

    public void setSportID(Integer sportID) {
        this.sportID = sportID;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public Date getRunningDatetime() {
        return runningDatetime;
    }

    public void setRunningDatetime(Date runningDatetime) {
        this.runningDatetime = runningDatetime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public PlaceSeatReserved getPlaceSeatID() {
        return placeSeatID;
    }

    public void setPlaceSeatID(PlaceSeatReserved placeSeatID) {
        this.placeSeatID = placeSeatID;
    }

    public Promotion getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(Promotion promotionID) {
        this.promotionID = promotionID;
    }

    @XmlTransient
    public Collection<SportBooking> getSportBookingCollection() {
        return sportBookingCollection;
    }

    public void setSportBookingCollection(Collection<SportBooking> sportBookingCollection) {
        this.sportBookingCollection = sportBookingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sportID != null ? sportID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sport)) {
            return false;
        }
        Sport other = (Sport) object;
        if ((this.sportID == null && other.sportID != null) || (this.sportID != null && !this.sportID.equals(other.sportID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sport[ sportID=" + sportID + " ]";
    }
    
}
