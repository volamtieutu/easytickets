package entities;

import entities.ShowtimeOfMoviePK;
import entities.Theater;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-18T14:57:56")
@StaticMetamodel(ShowtimeOfMovie.class)
public class ShowtimeOfMovie_ { 

    public static volatile SingularAttribute<ShowtimeOfMovie, Theater> theater;
    public static volatile SingularAttribute<ShowtimeOfMovie, Date> runningDatetime;
    public static volatile SingularAttribute<ShowtimeOfMovie, ShowtimeOfMoviePK> showtimeOfMoviePK;

}