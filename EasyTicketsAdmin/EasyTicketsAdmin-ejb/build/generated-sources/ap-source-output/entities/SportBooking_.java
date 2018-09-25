package entities;

import entities.Customer;
import entities.Place;
import entities.Sport;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T00:42:31")
@StaticMetamodel(SportBooking.class)
public class SportBooking_ { 

    public static volatile SingularAttribute<SportBooking, Integer> amountOfSeat;
    public static volatile SingularAttribute<SportBooking, Sport> sportID;
    public static volatile SingularAttribute<SportBooking, Customer> customerID;
    public static volatile SingularAttribute<SportBooking, Place> placeID;
    public static volatile SingularAttribute<SportBooking, Integer> bookingID;
    public static volatile SingularAttribute<SportBooking, Integer> amountOfPayment;
    public static volatile SingularAttribute<SportBooking, Customer> username;

}