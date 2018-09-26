package entities;

import entities.Customer;
import entities.Movie;
import entities.MovieSlotDetailsPK;
import entities.Seat;
import entities.TimeSlotMovie;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T13:05:47")
@StaticMetamodel(MovieSlotDetails.class)
public class MovieSlotDetails_ { 

    public static volatile SingularAttribute<MovieSlotDetails, Seat> seat;
    public static volatile SingularAttribute<MovieSlotDetails, Movie> movie;
    public static volatile SingularAttribute<MovieSlotDetails, MovieSlotDetailsPK> movieSlotDetailsPK;
    public static volatile SingularAttribute<MovieSlotDetails, TimeSlotMovie> timeSlotMovie;
    public static volatile SingularAttribute<MovieSlotDetails, Customer> customer;

}