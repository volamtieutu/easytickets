package entities;

import entities.EventSlotDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T13:05:47")
@StaticMetamodel(TimeSlot.class)
public class TimeSlot_ { 

    public static volatile SingularAttribute<TimeSlot, Integer> timeSlotID;
    public static volatile SingularAttribute<TimeSlot, Date> slot;
    public static volatile CollectionAttribute<TimeSlot, EventSlotDetails> eventSlotDetailsCollection;

}