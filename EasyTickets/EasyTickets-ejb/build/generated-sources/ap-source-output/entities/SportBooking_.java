package entities;

import entities.Customer;
import entities.Sport;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(SportBooking.class)
public class SportBooking_ { 

    public static volatile SingularAttribute<SportBooking, Integer> amountOfSeat;
    public static volatile SingularAttribute<SportBooking, Sport> sportID;
    public static volatile SingularAttribute<SportBooking, Customer> customerID;
    public static volatile SingularAttribute<SportBooking, Integer> bookingID;
    public static volatile SingularAttribute<SportBooking, Integer> amountOfPayment;

}