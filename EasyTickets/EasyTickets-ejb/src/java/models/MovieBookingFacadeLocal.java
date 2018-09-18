/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.MovieBooking;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Administrator
 */
@Local
public interface MovieBookingFacadeLocal {

    void create(MovieBooking movieBooking);

    void edit(MovieBooking movieBooking);

    void remove(MovieBooking movieBooking);

    MovieBooking find(Object id);

    List<MovieBooking> findAll();

    List<MovieBooking> findRange(int[] range);

    int count();
    
}
