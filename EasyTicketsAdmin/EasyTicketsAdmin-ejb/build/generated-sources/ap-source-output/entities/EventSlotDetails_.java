package entities;

import entities.Customer;
import entities.Event;
import entities.EventSlotDetailsPK;
import entities.PlaceSeat;
import entities.TimeSlot;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-25T10:28:15")
@StaticMetamodel(EventSlotDetails.class)
public class EventSlotDetails_ { 

    public static volatile SingularAttribute<EventSlotDetails, EventSlotDetailsPK> eventSlotDetailsPK;
    public static volatile SingularAttribute<EventSlotDetails, TimeSlot> timeSlot;
    public static volatile SingularAttribute<EventSlotDetails, Event> event;
    public static volatile SingularAttribute<EventSlotDetails, PlaceSeat> placeSeat;
    public static volatile SingularAttribute<EventSlotDetails, Customer> customer;

}