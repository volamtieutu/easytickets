package entities;

import entities.Cinema;
import entities.MovieBooking;
import entities.Seat;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-04T18:58:44")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile SingularAttribute<Room, Cinema> cinemaID;
    public static volatile SingularAttribute<Room, Seat> seatID;
    public static volatile CollectionAttribute<Room, MovieBooking> movieBookingCollection;
    public static volatile SingularAttribute<Room, Integer> roomID;
    public static volatile SingularAttribute<Room, String> roomName;

}