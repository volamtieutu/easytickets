/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package global.variable;

import entities.Movie;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
@Named(value = "globalVariable")
@SessionScoped
public class GlobalVariable implements Serializable {

    private Movie selectedMovie;

    public GlobalVariable() {
    }

    public Movie getSelectedMovie() {
        return selectedMovie;
    }

    public void setSelectedMovie(Movie selectedMovie) {
        this.selectedMovie = selectedMovie;
    }

}
