package entities;

import entities.MovieSlotDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T00:42:31")
@StaticMetamodel(TimeSlotMovie.class)
public class TimeSlotMovie_ { 

    public static volatile SingularAttribute<TimeSlotMovie, Integer> timeSlotID;
    public static volatile SingularAttribute<TimeSlotMovie, Date> slot;
    public static volatile CollectionAttribute<TimeSlotMovie, MovieSlotDetails> movieSlotDetailsCollection;

}