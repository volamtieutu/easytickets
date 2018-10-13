package entities;

import entities.Place;
import entities.PlaceSeatReserved;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(SeatingArea.class)
public class SeatingArea_ { 

    public static volatile SingularAttribute<SeatingArea, Integer> seatingAreaID;
    public static volatile SingularAttribute<SeatingArea, String> seatingAreaName;
    public static volatile SingularAttribute<SeatingArea, Place> placeID;
    public static volatile CollectionAttribute<SeatingArea, PlaceSeatReserved> placeSeatReservedCollection;

}