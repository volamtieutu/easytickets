package entities;

import entities.Cinema;
import entities.Seat;
import entities.TimeSlot;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile SingularAttribute<Room, Cinema> cinemaID;
    public static volatile CollectionAttribute<Room, Seat> seatCollection;
    public static volatile CollectionAttribute<Room, TimeSlot> timeSlotCollection;
    public static volatile SingularAttribute<Room, Integer> seatNo;
    public static volatile SingularAttribute<Room, Integer> roomID;
    public static volatile SingularAttribute<Room, String> roomName;

}