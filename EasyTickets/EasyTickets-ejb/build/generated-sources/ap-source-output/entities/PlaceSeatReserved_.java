package entities;

import entities.EventBooking;
import entities.SeatingArea;
import entities.Sport;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(PlaceSeatReserved.class)
public class PlaceSeatReserved_ { 

    public static volatile CollectionAttribute<PlaceSeatReserved, EventBooking> eventBookingCollection;
    public static volatile SingularAttribute<PlaceSeatReserved, SeatingArea> seatingAreaID;
    public static volatile SingularAttribute<PlaceSeatReserved, Integer> placeSeatID;
    public static volatile SingularAttribute<PlaceSeatReserved, Integer> seatingAreaNo;
    public static volatile CollectionAttribute<PlaceSeatReserved, Sport> sportCollection;

}