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
@Table(name = "Customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCustomerID", query = "SELECT c FROM Customer c WHERE c.customerID = :customerID")
    , @NamedQuery(name = "Customer.findByUsername", query = "SELECT c FROM Customer c WHERE c.username = :username")
    , @NamedQuery(name = "Customer.findByPassword", query = "SELECT c FROM Customer c WHERE c.password = :password")
    , @NamedQuery(name = "Customer.findByName", query = "SELECT c FROM Customer c WHERE c.name = :name")
    , @NamedQuery(name = "Customer.findByBirthday", query = "SELECT c FROM Customer c WHERE c.birthday = :birthday")
    , @NamedQuery(name = "Customer.findByAddress", query = "SELECT c FROM Customer c WHERE c.address = :address")
    , @NamedQuery(name = "Customer.findByPhone", query = "SELECT c FROM Customer c WHERE c.phone = :phone")
    , @NamedQuery(name = "Customer.findByPoit", query = "SELECT c FROM Customer c WHERE c.poit = :poit")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Customer_ID")
    private Integer customerID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Birthday")
    private String birthday;
    @Size(max = 500)
    @Column(name = "Address")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 15)
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Poit")
    private Integer poit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Collection<MovieSlotDetails> movieSlotDetailsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Collection<EventSlotDetails> eventSlotDetailsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerID")
    private Collection<EventBooking> eventBookingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerID")
    private Collection<MovieBooking> movieBookingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerID")
    private Collection<SportBooking> sportBookingCollection;

    public Customer() {
    }

    public Customer(Integer customerID) {
        this.customerID = customerID;
    }

    public Customer(Integer customerID, String username, String password, String name, String birthday) {
        this.customerID = customerID;
        this.username = username;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPoit() {
        return poit;
    }

    public void setPoit(Integer poit) {
        this.poit = poit;
    }

    @XmlTransient
    public Collection<MovieSlotDetails> getMovieSlotDetailsCollection() {
        return movieSlotDetailsCollection;
    }

    public void setMovieSlotDetailsCollection(Collection<MovieSlotDetails> movieSlotDetailsCollection) {
        this.movieSlotDetailsCollection = movieSlotDetailsCollection;
    }

    @XmlTransient
    public Collection<EventSlotDetails> getEventSlotDetailsCollection() {
        return eventSlotDetailsCollection;
    }

    public void setEventSlotDetailsCollection(Collection<EventSlotDetails> eventSlotDetailsCollection) {
        this.eventSlotDetailsCollection = eventSlotDetailsCollection;
    }

    @XmlTransient
    public Collection<EventBooking> getEventBookingCollection() {
        return eventBookingCollection;
    }

    public void setEventBookingCollection(Collection<EventBooking> eventBookingCollection) {
        this.eventBookingCollection = eventBookingCollection;
    }

    @XmlTransient
    public Collection<MovieBooking> getMovieBookingCollection() {
        return movieBookingCollection;
    }

    public void setMovieBookingCollection(Collection<MovieBooking> movieBookingCollection) {
        this.movieBookingCollection = movieBookingCollection;
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
        hash += (customerID != null ? customerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerID == null && other.customerID != null) || (this.customerID != null && !this.customerID.equals(other.customerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Customer[ customerID=" + customerID + " ]";
    }
    
}
