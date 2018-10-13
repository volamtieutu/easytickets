package entities;

import entities.Promotion;
import entities.TimeSlot;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, String> image;
    public static volatile SingularAttribute<Movie, Integer> ticketPrice;
    public static volatile SingularAttribute<Movie, Date> endDate;
    public static volatile SingularAttribute<Movie, String> director;
    public static volatile SingularAttribute<Movie, String> description;
    public static volatile SingularAttribute<Movie, Integer> movieID;
    public static volatile SingularAttribute<Movie, String> language;
    public static volatile SingularAttribute<Movie, String> media;
    public static volatile SingularAttribute<Movie, Integer> point;
    public static volatile SingularAttribute<Movie, Promotion> promotionID;
    public static volatile SingularAttribute<Movie, Integer> rated;
    public static volatile SingularAttribute<Movie, String> cast;
    public static volatile SingularAttribute<Movie, Date> beginDate;
    public static volatile SingularAttribute<Movie, String> genre;
    public static volatile CollectionAttribute<Movie, TimeSlot> timeSlotCollection;
    public static volatile SingularAttribute<Movie, Integer> runTime;
    public static volatile SingularAttribute<Movie, String> movieName;

}