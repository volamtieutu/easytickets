/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.SportBooking;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Win-PC
 */
@Local
public interface SportBookingFacadeLocal {

    void create(SportBooking sportBooking);

    void edit(SportBooking sportBooking);

    void remove(SportBooking sportBooking);

    SportBooking find(Object id);

    List<SportBooking> findAll();

    List<SportBooking> findRange(int[] range);

    int count();
    
}
