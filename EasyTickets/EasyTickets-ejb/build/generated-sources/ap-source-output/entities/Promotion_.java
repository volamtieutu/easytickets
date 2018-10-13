package entities;

import entities.Event;
import entities.Movie;
import entities.Sport;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T17:45:43")
@StaticMetamodel(Promotion.class)
public class Promotion_ { 

    public static volatile SingularAttribute<Promotion, Date> beginDate;
    public static volatile SingularAttribute<Promotion, String> promotionName;
    public static volatile SingularAttribute<Promotion, String> discription;
    public static volatile CollectionAttribute<Promotion, Event> eventCollection;
    public static volatile CollectionAttribute<Promotion, Movie> movieCollection;
    public static volatile SingularAttribute<Promotion, Date> endDate;
    public static volatile SingularAttribute<Promotion, Integer> discount;
    public static volatile SingularAttribute<Promotion, Integer> promotionID;
    public static volatile CollectionAttribute<Promotion, Sport> sportCollection;

}