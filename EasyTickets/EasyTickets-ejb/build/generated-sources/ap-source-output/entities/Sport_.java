package entities;

import entities.SportBooking;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-20T12:39:08")
@StaticMetamodel(Sport.class)
public class Sport_ { 

    public static volatile CollectionAttribute<Sport, SportBooking> sportBookingCollection;
    public static volatile SingularAttribute<Sport, Integer> sportID;
    public static volatile SingularAttribute<Sport, String> teams;
    public static volatile SingularAttribute<Sport, Integer> ticketPrice;
    public static volatile SingularAttribute<Sport, Date> runningDatetime;
    public static volatile SingularAttribute<Sport, String> description;
    public static volatile SingularAttribute<Sport, String> sportName;
    public static volatile SingularAttribute<Sport, Integer> runTime;
    public static volatile SingularAttribute<Sport, Integer> point;

}