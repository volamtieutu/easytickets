package entities;

import entities.Area;
import entities.Room;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-04T18:58:44")
@StaticMetamodel(Cinema.class)
public class Cinema_ { 

    public static volatile SingularAttribute<Cinema, Area> areaID;
    public static volatile SingularAttribute<Cinema, String> phone;
    public static volatile SingularAttribute<Cinema, Integer> cinemaID;
    public static volatile SingularAttribute<Cinema, String> cinemaName;
    public static volatile CollectionAttribute<Cinema, Room> roomCollection;
    public static volatile SingularAttribute<Cinema, String> cinemaAddress;

}