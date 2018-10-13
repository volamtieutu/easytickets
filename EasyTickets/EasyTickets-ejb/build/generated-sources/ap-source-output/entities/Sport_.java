package entities;

import entities.PlaceSeatReserved;
import entities.Promotion;
import entities.SportBooking;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(Sport.class)
public class Sport_ { 

    public static volatile CollectionAttribute<Sport, SportBooking> sportBookingCollection;
    public static volatile SingularAttribute<Sport, String> image;
    public static volatile SingularAttribute<Sport, String> teams;
    public static volatile SingularAttribute<Sport, Integer> ticketPrice;
    public static volatile SingularAttribute<Sport, PlaceSeatReserved> placeSeatID;
    public static volatile SingularAttribute<Sport, Date> runningDatetime;
    public static volatile SingularAttribute<Sport, String> description;
    public static volatile SingularAttribute<Sport, String> media;
    public static volatile SingularAttribute<Sport, Integer> point;
    public static volatile SingularAttribute<Sport, Promotion> promotionID;
    public static volatile SingularAttribute<Sport, Integer> sportID;
    public static volatile SingularAttribute<Sport, String> sportName;
    public static volatile SingularAttribute<Sport, Integer> runTime;

}