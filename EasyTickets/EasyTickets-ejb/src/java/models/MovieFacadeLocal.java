/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.Movie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Administrator
 */
@Local
public interface MovieFacadeLocal {

    void create(Movie movie);

    void edit(Movie movie);

    void remove(Movie movie);

    Movie find(Object id);

    List<Movie> findAll();

    List<Movie> findRange(int[] range);

    int count();
    
}
