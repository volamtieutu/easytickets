package entities;

import entities.EventBooking;
import entities.MovieBooking;
import entities.SportBooking;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-20T02:15:35")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Date> birthday;
    public static volatile CollectionAttribute<Customer, SportBooking> sportBookingCollection;
    public static volatile CollectionAttribute<Customer, EventBooking> eventBookingCollection;
    public static volatile SingularAttribute<Customer, String> password;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, Integer> customerID;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile CollectionAttribute<Customer, MovieBooking> movieBookingCollection;
    public static volatile SingularAttribute<Customer, Integer> poit;
    public static volatile SingularAttribute<Customer, String> username;

}