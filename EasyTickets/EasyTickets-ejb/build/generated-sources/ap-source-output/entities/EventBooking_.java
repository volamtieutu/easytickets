package entities;

import entities.Customer;
import entities.Event;
import entities.PlaceSeatReserved;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(EventBooking.class)
public class EventBooking_ { 

    public static volatile SingularAttribute<EventBooking, Event> eventID;
    public static volatile SingularAttribute<EventBooking, Integer> amoutOfSeat;
    public static volatile SingularAttribute<EventBooking, PlaceSeatReserved> placeSeatID;
    public static volatile SingularAttribute<EventBooking, Customer> customerID;
    public static volatile SingularAttribute<EventBooking, Integer> bookingID;
    public static volatile SingularAttribute<EventBooking, Integer> amountOfPayment;

}