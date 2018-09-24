package entities;

import entities.Customer;
import entities.Movie;
import entities.Theater;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-23T18:00:22")
@StaticMetamodel(MovieBooking.class)
public class MovieBooking_ { 

    public static volatile SingularAttribute<MovieBooking, Integer> amoutOfSeat;
    public static volatile SingularAttribute<MovieBooking, Theater> theaterID;
    public static volatile SingularAttribute<MovieBooking, Movie> movieID;
    public static volatile SingularAttribute<MovieBooking, Integer> amoutOfPayment;
    public static volatile SingularAttribute<MovieBooking, Integer> bookingID;
    public static volatile SingularAttribute<MovieBooking, Customer> username;

}