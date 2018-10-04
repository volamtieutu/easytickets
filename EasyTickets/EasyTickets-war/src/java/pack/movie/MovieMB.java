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
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import models.MovieFacadeLocal;

/**
 *
 * @author Administrator
 */
@Named(value = "movieMB")
@SessionScoped
public class MovieMB implements Serializable {

    private List<Movie> movieList;
    private Date date = new Date();
    private Movie selectedMovie;
    @EJB
    private MovieFacadeLocal movieFacade;

    public MovieMB() {
    }
    
    public String showDetail() {
        return "movieDetails.xhtml?facets-";
    }

    public List<Movie> showAll() {
        return this.movieFacade.findAll();
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

    public Movie getSelectedMovie() {
        return selectedMovie;
    }

    public void setSelectedMovie(Movie selectedMovie) {
        this.selectedMovie = selectedMovie;
    }
    
}
