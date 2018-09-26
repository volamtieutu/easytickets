package entities;

import entities.Customer;
import entities.Movie;
import entities.Room;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T13:05:47")
@StaticMetamodel(MovieBooking.class)
public class MovieBooking_ { 

    public static volatile SingularAttribute<MovieBooking, Integer> amoutOfSeat;
    public static volatile SingularAttribute<MovieBooking, Customer> customerID;
    public static volatile SingularAttribute<MovieBooking, Movie> movieID;
    public static volatile SingularAttribute<MovieBooking, Integer> amoutOfPayment;
    public static volatile SingularAttribute<MovieBooking, Integer> bookingID;
    public static volatile SingularAttribute<MovieBooking, Room> roomID;

}