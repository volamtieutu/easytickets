/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.Cinema;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Win-PC
 */
@Stateless
public class CinemaFacade extends AbstractFacade<Cinema> implements CinemaFacadeLocal {

    @PersistenceContext(unitName = "EasyTickets-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CinemaFacade() {
        super(Cinema.class);
    }
    
    @Override
    public boolean checkExistCinemaName(String cName) {
        String mNameExist;

        Query q = em.createNamedQuery("Cinema.findByCinemaName");
        q.setParameter("cinemaName", cName);
        if (q.getResultList().isEmpty()) {
            return false;
        } else {
            mNameExist = cName;
            return true;
        }
    }
    
    /**
     *
     * @param areaID
     * @return
     */
    @Override
    public List<Cinema> showCinemaByAreaID(int areaID) {
        Query q = em.createQuery("select c from Cinema c where c.areaID.areaID =:areaID");
        q.setParameter("areaID", areaID);
        List list = q.getResultList();
        return list;
    }
}
