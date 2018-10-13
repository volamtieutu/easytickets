package entities;

import entities.MovieBooking;
import entities.Seat;
import entities.TimeSlot;
import entities.TimeSlotDetailsPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(TimeSlotDetails.class)
public class TimeSlotDetails_ { 

    public static volatile SingularAttribute<TimeSlotDetails, Seat> seat;
    public static volatile SingularAttribute<TimeSlotDetails, TimeSlot> timeSlot;
    public static volatile SingularAttribute<TimeSlotDetails, MovieBooking> movieBooking;
    public static volatile SingularAttribute<TimeSlotDetails, TimeSlotDetailsPK> timeSlotDetailsPK;

}