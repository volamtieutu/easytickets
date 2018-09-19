package entities;

import entities.Area;
import entities.EventBooking;
import entities.ShowtimeOfEvent;
import entities.SportBooking;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-19T11:07:43")
@StaticMetamodel(Place.class)
public class Place_ { 

    public static volatile SingularAttribute<Place, Integer> seat;
    public static volatile CollectionAttribute<Place, SportBooking> sportBookingCollection;
    public static volatile CollectionAttribute<Place, EventBooking> eventBookingCollection;
    public static volatile SingularAttribute<Place, Area> areaID;
    public static volatile SingularAttribute<Place, String> phone;
    public static volatile CollectionAttribute<Place, ShowtimeOfEvent> showtimeOfEventCollection;
    public static volatile SingularAttribute<Place, Integer> placeID;
    public static volatile SingularAttribute<Place, String> placeAddress;
    public static volatile SingularAttribute<Place, String> placeName;

}