/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import Entity.ShowtimeOfMovie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Win-PC
 */
@Local
public interface ShowtimeOfMovieFacadeLocal {

    void create(ShowtimeOfMovie showtimeOfMovie);

    void edit(ShowtimeOfMovie showtimeOfMovie);

    void remove(ShowtimeOfMovie showtimeOfMovie);

    ShowtimeOfMovie find(Object id);

    List<ShowtimeOfMovie> findAll();

    List<ShowtimeOfMovie> findRange(int[] range);

    int count();
    
}
