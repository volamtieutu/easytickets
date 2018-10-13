/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.Movie;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;

/**
 *
 * @author Win-PC
 */
@Stateless
public class MovieFacade extends AbstractFacade<Movie> implements MovieFacadeLocal {

    private Date today = new Date();
    @PersistenceContext(unitName = "EasyTickets-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MovieFacade() {
        super(Movie.class);
    }
    
    /**
     *
     * @param mName
     * @return
     */
    @Override
    public boolean checkExistMovieName(String mName) {
        String mNameExist;

        Query q = em.createNamedQuery("Movie.findByMovieName");
        q.setParameter("movieName", mName);
        if (q.getResultList().isEmpty()) {            
            return false;
        }
        else {
            mNameExist = mName;
            return true;
        }
    }
    
    @Override
    public List<Movie> showNowPlaying() {
        Query q = em.createQuery("select m from Movie m where m.beginDate <= :today");
        q.setParameter("today", today, TemporalType.DATE);
        List list = q.getResultList();
        return list;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Movie> showIncoming() {
        Query q = em.createQuery("select m from Movie m where m.beginDate >= :today");
        q.setParameter("today", today, TemporalType.DATE);
        List list = q.getResultList();
        return list;
    }
}
