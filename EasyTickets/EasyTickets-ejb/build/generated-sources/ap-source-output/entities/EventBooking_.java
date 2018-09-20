package entities;

import entities.Customer;
import entities.Event;
import entities.Place;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-20T12:43:19")
@StaticMetamodel(EventBooking.class)
public class EventBooking_ { 

    public static volatile SingularAttribute<EventBooking, Event> eventID;
    public static volatile SingularAttribute<EventBooking, Integer> amoutOfSeat;
    public static volatile SingularAttribute<EventBooking, Place> placeID;
    public static volatile SingularAttribute<EventBooking, Integer> bookingID;
    public static volatile SingularAttribute<EventBooking, Integer> amountOfPayment;
    public static volatile SingularAttribute<EventBooking, Customer> username;

}