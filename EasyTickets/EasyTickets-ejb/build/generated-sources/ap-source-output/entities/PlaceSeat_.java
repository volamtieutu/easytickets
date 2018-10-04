package entities;

import entities.EventSlotDetails;
import entities.Place;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-04T18:58:44")
@StaticMetamodel(PlaceSeat.class)
public class PlaceSeat_ { 

    public static volatile SingularAttribute<PlaceSeat, Integer> seatID;
    public static volatile CollectionAttribute<PlaceSeat, EventSlotDetails> eventSlotDetailsCollection;
    public static volatile SingularAttribute<PlaceSeat, String> seatColumn;
    public static volatile CollectionAttribute<PlaceSeat, Place> placeCollection;

}