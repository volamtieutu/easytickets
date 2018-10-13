/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.TimeSlot;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Win-PC
 */
@Stateless
public class TimeSlotFacade extends AbstractFacade<TimeSlot> implements TimeSlotFacadeLocal {

    @PersistenceContext(unitName = "EasyTickets-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TimeSlotFacade() {
        super(TimeSlot.class);
    }
    
}
