/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.PlaceSeat;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Win-PC
 */
@Local
public interface PlaceSeatFacadeLocal {

    void create(PlaceSeat placeSeat);

    void edit(PlaceSeat placeSeat);

    void remove(PlaceSeat placeSeat);

    PlaceSeat find(Object id);

    List<PlaceSeat> findAll();

    List<PlaceSeat> findRange(int[] range);

    int count();
    
}
