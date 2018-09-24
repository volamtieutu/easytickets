package entities;

import entities.EventBooking;
import entities.ShowtimeOfEvent;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-23T18:00:22")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, Integer> eventID;
    public static volatile SingularAttribute<Event, Date> beginDate;
    public static volatile SingularAttribute<Event, String> image;
    public static volatile CollectionAttribute<Event, EventBooking> eventBookingCollection;
    public static volatile SingularAttribute<Event, Integer> ticketPrice;
    public static volatile CollectionAttribute<Event, ShowtimeOfEvent> showtimeOfEventCollection;
    public static volatile SingularAttribute<Event, String> eventName;
    public static volatile SingularAttribute<Event, String> description;
    public static volatile SingularAttribute<Event, String> eventType;
    public static volatile SingularAttribute<Event, Integer> runTime;
    public static volatile SingularAttribute<Event, Integer> point;

}