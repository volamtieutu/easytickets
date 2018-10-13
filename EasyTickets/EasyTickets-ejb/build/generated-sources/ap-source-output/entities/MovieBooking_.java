package entities;

import entities.Customer;
import entities.TimeSlot;
import entities.TimeSlotDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(MovieBooking.class)
public class MovieBooking_ { 

    public static volatile SingularAttribute<MovieBooking, TimeSlot> timeSlotID;
    public static volatile CollectionAttribute<MovieBooking, TimeSlotDetails> timeSlotDetailsCollection;
    public static volatile SingularAttribute<MovieBooking, Integer> amoutOfSeat;
    public static volatile SingularAttribute<MovieBooking, Customer> customerID;
    public static volatile SingularAttribute<MovieBooking, Integer> amoutOfPayment;
    public static volatile SingularAttribute<MovieBooking, Integer> bookingID;

}