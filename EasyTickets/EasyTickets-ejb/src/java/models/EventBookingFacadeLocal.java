/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.EventBooking;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Win-PC
 */
@Local
public interface EventBookingFacadeLocal {

    void create(EventBooking eventBooking);

    void edit(EventBooking eventBooking);

    void remove(EventBooking eventBooking);

    EventBooking find(Object id);

    List<EventBooking> findAll();

    List<EventBooking> findRange(int[] range);

    int count();
    
}
