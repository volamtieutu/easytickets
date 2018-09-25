/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.EventSlotDetails;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Win-PC
 */
@Local
public interface EventSlotDetailsFacadeLocal {

    void create(EventSlotDetails eventSlotDetails);

    void edit(EventSlotDetails eventSlotDetails);

    void remove(EventSlotDetails eventSlotDetails);

    EventSlotDetails find(Object id);

    List<EventSlotDetails> findAll();

    List<EventSlotDetails> findRange(int[] range);

    int count();
    
}
