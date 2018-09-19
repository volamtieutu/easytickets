/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.MovieBooking;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Win-PC
 */
@Stateless
public class MovieBookingFacade extends AbstractFacade<MovieBooking> implements MovieBookingFacadeLocal {

    @PersistenceContext(unitName = "EasyTicketsAdmin-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MovieBookingFacade() {
        super(MovieBooking.class);
    }
    
}
