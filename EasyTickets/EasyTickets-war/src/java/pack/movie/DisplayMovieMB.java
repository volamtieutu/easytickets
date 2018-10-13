/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.movie;

import entities.Movie;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import models.MovieFacadeLocal;

/**
 *
 * @author Administrator
 */
@Named(value = "displayMovieMB")
@SessionScoped
public class DisplayMovieMB implements Serializable {

    private Date today = new Date();
    private List<Movie> movieList;
    private Date date;
    private Date maxDate;

    @EJB
    private MovieFacadeLocal movieFacade;

    public DisplayMovieMB() {
    }

    public List<Movie> showAll() {
        return this.movieFacade.findAll();
    }

    public List<Movie> showNowPlaying() {
        return this.movieFacade.showNowPlaying();
    }

    public List<Movie> showIncoming() {
        return this.movieFacade.showIncoming();
    }

    public List getMovieList() {
        return movieList;
    }

    public void setMovieList(List movieList) {
        this.movieList = movieList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    private Date addDate(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

    public Date getMaxDate() {
        maxDate = addDate(today, 13);
        return maxDate;
    }

    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }

}
