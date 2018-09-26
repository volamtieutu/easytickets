/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Movie;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import models.MovieFacadeLocal;

/**
 *
 * @author Win-PC
 */
@Named(value = "movieMB")
@RequestScoped
public class movieMB {

    @EJB
    private MovieFacadeLocal movieFacade;   

    /**
     * Creates a new instance of movieMB
     */
    private String movieName;
    private String genre;
    private String language;
    private int rated;
    private String cast;
    private String director;
    private int runTime;
    private int ticketPrice;
    private Date beginDate;
    private Date endDate;
    private int point;
    private String description;
    private String image;
    private String media;

    public movieMB(String movieName, String genre, String language, int rated, String director, int runTime, int ticketPrice, Date beginDate, Date endDate, int point, String description, String image, String media) {
        this.movieName = movieName;
        this.genre = genre;
        this.language = language;
        this.rated = rated;
        this.director = director;
        this.runTime = runTime;
        this.ticketPrice = ticketPrice;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.point = point;
        this.description = description;
        this.image = image;
        this.media = media;
    }

    public movieMB() {
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getRated() {
        return rated;
    }

    public void setRated(int rated) {
        this.rated = rated;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }    

    public String insertMovieInfo(){
        Movie m = new Movie();
        m.setMovieName(movieName);
        m.setGenre(genre);
        m.setLanguage(language);
        m.setRated(runTime);
        m.setCast(cast);
        m.setDirector(director);
        m.setRunTime(runTime);
        m.setTicketPrice(ticketPrice);
        m.setBeginDate(movieFacade.convertBDate(beginDate));
        m.setEndDate(movieFacade.convertEDate(endDate));
        m.setPoint(point);
        m.setDescription(description);
        m.setImage(image);
        m.setMedia(media);
        movieFacade.create(m);
//        System.out.println(movieName);
//        System.out.println(movieFacade.convertBDate(beginDate));
//        System.out.println(movieFacade.convertBDate(endDate));
        return "frInsertMovie";
    }
}
