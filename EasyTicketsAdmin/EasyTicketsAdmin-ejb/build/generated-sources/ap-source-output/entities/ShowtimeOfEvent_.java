package entities;

import entities.Event;
import entities.Place;
import entities.ShowtimeOfEventPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T00:42:31")
@StaticMetamodel(ShowtimeOfEvent.class)
public class ShowtimeOfEvent_ { 

    public static volatile SingularAttribute<ShowtimeOfEvent, ShowtimeOfEventPK> showtimeOfEventPK;
    public static volatile SingularAttribute<ShowtimeOfEvent, Date> runningDatetime;
    public static volatile SingularAttribute<ShowtimeOfEvent, Place> place;
    public static volatile SingularAttribute<ShowtimeOfEvent, Event> event;

}