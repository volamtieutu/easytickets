package entities;

import entities.Movie;
import entities.MovieBooking;
import entities.Room;
import entities.TimeSlotDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(TimeSlot.class)
public class TimeSlot_ { 

    public static volatile SingularAttribute<TimeSlot, Integer> timeSlotID;
    public static volatile SingularAttribute<TimeSlot, String> date;
    public static volatile CollectionAttribute<TimeSlot, TimeSlotDetails> timeSlotDetailsCollection;
    public static volatile SingularAttribute<TimeSlot, Movie> movieID;
    public static volatile SingularAttribute<TimeSlot, String> slot;
    public static volatile CollectionAttribute<TimeSlot, MovieBooking> movieBookingCollection;
    public static volatile SingularAttribute<TimeSlot, Room> roomID;

}