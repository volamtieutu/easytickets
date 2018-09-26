package entities;

import entities.EventBooking;
import entities.EventSlotDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T13:05:47")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, Integer> eventID;
    public static volatile SingularAttribute<Event, String> beginDate;
    public static volatile SingularAttribute<Event, String> image;
    public static volatile CollectionAttribute<Event, EventBooking> eventBookingCollection;
    public static volatile SingularAttribute<Event, Integer> ticketPrice;
    public static volatile SingularAttribute<Event, String> eventName;
    public static volatile SingularAttribute<Event, String> description;
    public static volatile SingularAttribute<Event, String> eventType;
    public static volatile SingularAttribute<Event, Integer> runTime;
    public static volatile CollectionAttribute<Event, EventSlotDetails> eventSlotDetailsCollection;
    public static volatile SingularAttribute<Event, Integer> point;

}