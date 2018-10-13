package entities;

import entities.Room;
import entities.TimeSlotDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(Seat.class)
public class Seat_ { 

    public static volatile SingularAttribute<Seat, Integer> number;
    public static volatile CollectionAttribute<Seat, TimeSlotDetails> timeSlotDetailsCollection;
    public static volatile SingularAttribute<Seat, Integer> seatID;
    public static volatile SingularAttribute<Seat, String> row;
    public static volatile SingularAttribute<Seat, Room> roomID;

}