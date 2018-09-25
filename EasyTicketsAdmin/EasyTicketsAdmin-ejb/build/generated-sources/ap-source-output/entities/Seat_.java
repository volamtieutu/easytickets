package entities;

import entities.MovieSlotDetails;
import entities.Room;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T00:42:31")
@StaticMetamodel(Seat.class)
public class Seat_ { 

    public static volatile CollectionAttribute<Seat, Room> roomCollection;
    public static volatile SingularAttribute<Seat, Integer> seatID;
    public static volatile CollectionAttribute<Seat, MovieSlotDetails> movieSlotDetailsCollection;
    public static volatile SingularAttribute<Seat, String> seatColumn;

}