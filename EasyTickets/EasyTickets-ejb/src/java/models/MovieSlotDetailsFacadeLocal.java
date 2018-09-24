/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.MovieSlotDetails;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Win-PC
 */
@Local
public interface MovieSlotDetailsFacadeLocal {

    void create(MovieSlotDetails movieSlotDetails);

    void edit(MovieSlotDetails movieSlotDetails);

    void remove(MovieSlotDetails movieSlotDetails);

    MovieSlotDetails find(Object id);

    List<MovieSlotDetails> findAll();

    List<MovieSlotDetails> findRange(int[] range);

    int count();
    
}
