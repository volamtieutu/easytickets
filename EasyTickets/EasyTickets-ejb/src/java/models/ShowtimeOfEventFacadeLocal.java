/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.ShowtimeOfEvent;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Administrator
 */
@Local
public interface ShowtimeOfEventFacadeLocal {

    void create(ShowtimeOfEvent showtimeOfEvent);

    void edit(ShowtimeOfEvent showtimeOfEvent);

    void remove(ShowtimeOfEvent showtimeOfEvent);

    ShowtimeOfEvent find(Object id);

    List<ShowtimeOfEvent> findAll();

    List<ShowtimeOfEvent> findRange(int[] range);

    int count();
    
}
