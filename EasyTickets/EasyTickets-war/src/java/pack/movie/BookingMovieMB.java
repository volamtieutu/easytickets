/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.movie;

import entities.Area;
import entities.Cinema;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import models.AreaFacadeLocal;
import models.CinemaFacadeLocal;

/**
 *
 * @author Administrator
 */
@Named(value = "bookingMovieMB")
@SessionScoped
public class BookingMovieMB implements Serializable {

    @EJB
    private CinemaFacadeLocal cinemaFacade;

    private int selectedAreaID;
    private Date bookingDate;
    private Date today = new Date();
    private Date maxDate;
    private int cinemaID;
    private List<Cinema> cinemaList;

    @EJB
    private AreaFacadeLocal areaFacade;

    public BookingMovieMB() {
    }

    // show all 'Area table'
    public List<Area> showAll() {
        return areaFacade.findAll();
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    // Adding date method
    private Date addDate(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

    // Retrieve Cinema from AreaID
    private List<Cinema> showCinemaByAreaID() {
        return cinemaFacade.showCinemaByAreaID(selectedAreaID);
    }

    public void findCinema() {
        cinemaList = showCinemaByAreaID();
    }

    public List<Cinema> getCinemaList() {
        return cinemaList;
    }

    public void setCinemaList(List<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    public Date getMaxDate() {
        maxDate = addDate(today, 13);
        return maxDate;
    }

    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }

    public int getSelectedAreaID() {
        return selectedAreaID;
    }

    public void setSelectedAreaID(int selectedAreaID) {
        this.selectedAreaID = selectedAreaID;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getCinemaID() {
        return cinemaID;
    }

    public void setCinemaID(int cinemaID) {
        this.cinemaID = cinemaID;
    }

}
