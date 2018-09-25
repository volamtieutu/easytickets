/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.TimeSlotMovie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Win-PC
 */
@Local
public interface TimeSlotMovieFacadeLocal {

    void create(TimeSlotMovie timeSlotMovie);

    void edit(TimeSlotMovie timeSlotMovie);

    void remove(TimeSlotMovie timeSlotMovie);

    TimeSlotMovie find(Object id);

    List<TimeSlotMovie> findAll();

    List<TimeSlotMovie> findRange(int[] range);

    int count();
    
}
