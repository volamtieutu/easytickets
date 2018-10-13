/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.SeatingArea;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Win-PC
 */
@Local
public interface SeatingAreaFacadeLocal {

    void create(SeatingArea seatingArea);

    void edit(SeatingArea seatingArea);

    void remove(SeatingArea seatingArea);

    SeatingArea find(Object id);

    List<SeatingArea> findAll();

    List<SeatingArea> findRange(int[] range);

    int count();
    
}
