package entities;

import entities.Cinema;
import entities.MovieBooking;
import entities.ShowtimeOfMovie;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-23T18:00:22")
@StaticMetamodel(Theater.class)
public class Theater_ { 

    public static volatile SingularAttribute<Theater, Integer> seat;
    public static volatile SingularAttribute<Theater, Integer> theaterID;
    public static volatile SingularAttribute<Theater, Cinema> cinemaID;
    public static volatile SingularAttribute<Theater, String> theaterName;
    public static volatile CollectionAttribute<Theater, ShowtimeOfMovie> showtimeOfMovieCollection;
    public static volatile CollectionAttribute<Theater, MovieBooking> movieBookingCollection;

}