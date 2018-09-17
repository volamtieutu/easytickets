/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import Entity.Cinema;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Win-PC
 */
@Stateless
public class CinemaFacade extends AbstractFacade<Cinema> implements CinemaFacadeLocal {

    @PersistenceContext(unitName = "easytickets-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CinemaFacade() {
        super(Cinema.class);
    }
    
}
