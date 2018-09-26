package entities;

import entities.Cinema;
import entities.Place;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T13:05:47")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, Integer> areaID;
    public static volatile SingularAttribute<Area, String> areaName;
    public static volatile CollectionAttribute<Area, Cinema> cinemaCollection;
    public static volatile CollectionAttribute<Area, Place> placeCollection;

}