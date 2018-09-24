/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import models.CustomerFacadeLocal;
import org.primefaces.event.SelectEvent;
import javax.faces.application.FacesMessage;



/**
 *
 * @author GIA TUONG
 */
@Named(value = "customersMB")
@RequestScoped

public class CustomersMB {

    @EJB
    private CustomerFacadeLocal customerFacade;
    
    
    private int customerID;
    private String userName;
    private String pasSword;
    private String namE;
    private Date birthDay;
    private String adDress;
    private String phonE;
    private int poiT;
    

    public CustomersMB() {
        
    }

    
    
    public String addCustomers() {
     Customer cust = new Customer();
     cust.setUsername(userName);
     cust.setName(namE);
     cust.setPassword(pasSword);
     cust.setBirthday(birthDay);
     cust.setAddress(adDress);
     cust.setPhone(phonE);
     this.customerFacade.create(cust);
     return "";
    }
     public void showMessage() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "What we do in life", "Echoes in eternity.");
         
      
    }
     public void 
   
    public CustomersMB(int customerID, String userName, String pasSword, String namE, Date birthDay, String phonE, int poiT,String adDress) {
        this.customerID = customerID;
        this.userName = userName;
        this.pasSword = pasSword;
        this.namE = namE;
        this.birthDay = birthDay;
        this.phonE = phonE;
        this.poiT = poiT;
        this.adDress = adDress;
    }
    

    public CustomerFacadeLocal getCustomerFacade() {
        return customerFacade;
    }

    public void setCustomerFacade(CustomerFacadeLocal customerFacade) {
        this.customerFacade = customerFacade;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasSword() {
        return pasSword;
    }

    public void setPasSword(String pasSword) {
        this.pasSword = pasSword;
    }

    public String getNamE() {
        return namE;
    }

    public void setNamE(String namE) {
        this.namE = namE;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhonE() {
        return phonE;
    }

    public void setPhonE(String phonE) {
        this.phonE = phonE;
    }

    public int getPoiT() {
        return poiT;
    }

    public void setPoiT(int poiT) {
        this.poiT = poiT;
    }

    public String getAdDress() {
        return adDress;
    }

    public void setAdDress(String adDress) {
        this.adDress = adDress;
    }

    
}
