/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "Promotion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Promotion.findAll", query = "SELECT p FROM Promotion p")
    , @NamedQuery(name = "Promotion.findByPromotionID", query = "SELECT p FROM Promotion p WHERE p.promotionID = :promotionID")
    , @NamedQuery(name = "Promotion.findByPromotionName", query = "SELECT p FROM Promotion p WHERE p.promotionName = :promotionName")
    , @NamedQuery(name = "Promotion.findByDiscount", query = "SELECT p FROM Promotion p WHERE p.discount = :discount")
    , @NamedQuery(name = "Promotion.findByBeginDate", query = "SELECT p FROM Promotion p WHERE p.beginDate = :beginDate")
    , @NamedQuery(name = "Promotion.findByEndDate", query = "SELECT p FROM Promotion p WHERE p.endDate = :endDate")
    , @NamedQuery(name = "Promotion.findByDiscription", query = "SELECT p FROM Promotion p WHERE p.discription = :discription")})
public class Promotion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Promotion_ID")
    private Integer promotionID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Promotion_Name")
    private String promotionName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Discount")
    private int discount;
    @Column(name = "Begin_Date")
    @Temporal(TemporalType.DATE)
    private Date beginDate;
    @Column(name = "End_Date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Size(max = 1000)
    @Column(name = "Discription")
    private String discription;

    public Promotion() {
    }

    public Promotion(Integer promotionID) {
        this.promotionID = promotionID;
    }

    public Promotion(Integer promotionID, String promotionName, int discount) {
        this.promotionID = promotionID;
        this.promotionName = promotionName;
        this.discount = discount;
    }

    public Integer getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(Integer promotionID) {
        this.promotionID = promotionID;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (promotionID != null ? promotionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promotion)) {
            return false;
        }
        Promotion other = (Promotion) object;
        if ((this.promotionID == null && other.promotionID != null) || (this.promotionID != null && !this.promotionID.equals(other.promotionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Promotion[ promotionID=" + promotionID + " ]";
    }
    
}
