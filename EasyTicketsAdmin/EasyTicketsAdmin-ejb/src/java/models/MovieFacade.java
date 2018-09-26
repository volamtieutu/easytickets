/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.Movie;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Win-PC
 */
@Stateless
public class MovieFacade extends AbstractFacade<Movie> implements MovieFacadeLocal {

    @PersistenceContext(unitName = "EasyTicketsAdmin-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MovieFacade() {
        super(Movie.class);
    }

    @Override
    public String convertBDate(Date begin) {
        String dateString = null;
        SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            dateString = sdfr.format(begin);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return dateString;
    }

    @Override
    public String convertEDate(Date end) {
        String dateString = null;
        SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            dateString = sdfr.format(end);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return dateString;
    }
}
