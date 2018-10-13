/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.TimeSlot;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Win-PC
 */
@Local
public interface TimeSlotFacadeLocal {

    void create(TimeSlot timeSlot);

    void edit(TimeSlot timeSlot);

    void remove(TimeSlot timeSlot);

    TimeSlot find(Object id);

    List<TimeSlot> findAll();

    List<TimeSlot> findRange(int[] range);

    int count();
    
}
