/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.Cinema;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Win-PC
 */
@Local
public interface CinemaFacadeLocal {

    void create(Cinema cinema);

    void edit(Cinema cinema);

    void remove(Cinema cinema);

    Cinema find(Object id);

    List<Cinema> findAll();

    List<Cinema> findRange(int[] range);

    int count();
    
}
