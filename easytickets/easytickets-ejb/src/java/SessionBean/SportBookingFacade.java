/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import Entity.SportBooking;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Win-PC
 */
@Stateless
public class SportBookingFacade extends AbstractFacade<SportBooking> implements SportBookingFacadeLocal {

    @PersistenceContext(unitName = "easytickets-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SportBookingFacade() {
        super(SportBooking.class);
    }
    
}
