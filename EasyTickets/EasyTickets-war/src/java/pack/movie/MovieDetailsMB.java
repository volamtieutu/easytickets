/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.movie;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
@Named(value = "movieDetailsMB")
@SessionScoped
public class MovieDetailsMB implements Serializable {


    public MovieDetailsMB() {
    }


}
