/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.place;

import entities.Area;
import entities.Cinema;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import models.AreaFacadeLocal;
import models.CinemaFacadeLocal;
import org.primefaces.component.datatable.DataTable;

/**
 *
 * @author Win-PC
 */
@Named(value = "cinemaMB")
@SessionScoped
public class CinemaMB implements Serializable {

    @EJB
    private AreaFacadeLocal areaFacade;

    @EJB
    private CinemaFacadeLocal cinemaFacade;

    /**
     * Creates a new instance of CinemaMB
     */
    private int cinemaID;
    private String cinemaName;
    private String cinemaAdd;
    private String phone;
    private int areaID;
    private String areaName;
    private ArrayList<Cinema> value;
    private boolean flag;
    private Cinema val;

    public CinemaMB() {
    }

    public int getCinemaID() {
        return this.cinemaID;
    }

    public void setCinemaID(int cinemaID) {
        this.cinemaID = cinemaID;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaAdd() {
        return cinemaAdd;
    }

    public void setCinemaAdd(String cinemaAdd) {
        this.cinemaAdd = cinemaAdd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAreaID() {
        return areaID;
    }

    public void setAreaID(int areaID) {
        this.areaID = areaID;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public ArrayList<Cinema> getValue() {
        return value;
    }

    public void setValue(ArrayList<Cinema> value) {
        this.value = value;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Cinema getVal() {
        return val;
    }

    public void setVal(Cinema val) {
        this.val = val;
    }

    public List<Area> displayAllArea() {
        return areaFacade.findAll();
    }

    public List<Cinema> displayAllCinema() {
        return cinemaFacade.findAll();
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void createCinema() {
        setFlag(cinemaFacade.checkExistCinemaName(this.cinemaName));
        if (this.flag == true) {
            addMessage("Cinema already exists!", null);
        } else {
            Area a = areaFacade.find(this.areaID);
            Cinema c = new Cinema();
            c.setCinemaName(cinemaName);
            c.setCinemaAddress(cinemaAdd);
            c.setPhone(phone);
            c.setAreaID(a);
            cinemaFacade.create(c);
            this.cinemaID = c.getCinemaID();
            addMessage("Insert successful!", null);
        }
    }

    public void resetValue() {
        this.cinemaName = null;
        this.cinemaAdd = null;
        this.phone = null;
    }

    public void cencel() {
        addMessage("Alert!", "action cancel");
    }

    public void updateCinema() {        
            Cinema c = new Cinema(val.getCinemaID());
            Area area = areaFacade.find(areaID);
            c.setCinemaName(val.getCinemaName());
            c.setCinemaAddress(val.getCinemaAddress());
            c.setPhone(val.getPhone());
            c.setAreaID(area);
            cinemaFacade.edit(c);
            addMessage("Successful!", "Record is updated");        
    }

    public void remove() {
        DataTable dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot().findComponent("form:table");
        dataTable.setSelection(getNextObj());
        for (int i = 0; i <= getNextObj().size() - 1; i++) {
            cinemaID = getNextObj().get(i).getCinemaID();
            Cinema m = cinemaFacade.find(cinemaID);
            cinemaFacade.remove(m);
        }
        addMessage("Successful", "Record deleted!");
    }

    private ArrayList<Cinema> getNextObj() {
        if (value == null) {
            return null;
        }
        return value;
    }
}
