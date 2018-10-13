package entities;

import entities.Area;
import entities.SeatingArea;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(Place.class)
public class Place_ { 

    public static volatile CollectionAttribute<Place, SeatingArea> seatingAreaCollection;
    public static volatile SingularAttribute<Place, Area> areaID;
    public static volatile SingularAttribute<Place, String> phone;
    public static volatile SingularAttribute<Place, Integer> placeID;
    public static volatile SingularAttribute<Place, String> placeAddress;
    public static volatile SingularAttribute<Place, Integer> seatsNo;
    public static volatile SingularAttribute<Place, String> placeName;

}