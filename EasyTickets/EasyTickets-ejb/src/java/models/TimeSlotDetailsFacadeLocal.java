/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.TimeSlotDetails;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Win-PC
 */
@Local
public interface TimeSlotDetailsFacadeLocal {

    void create(TimeSlotDetails timeSlotDetails);

    void edit(TimeSlotDetails timeSlotDetails);

    void remove(TimeSlotDetails timeSlotDetails);

    TimeSlotDetails find(Object id);

    List<TimeSlotDetails> findAll();

    List<TimeSlotDetails> findRange(int[] range);

    int count();
    
}
