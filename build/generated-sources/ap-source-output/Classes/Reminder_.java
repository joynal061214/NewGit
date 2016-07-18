package Classes;

import Classes.Client;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-11-16T16:13:37")
@StaticMetamodel(Reminder.class)
public class Reminder_ { 

    public static volatile SingularAttribute<Reminder, Integer> reviewed;
    public static volatile SingularAttribute<Reminder, String> description;
    public static volatile SingularAttribute<Reminder, Date> reminderDtTime;
    public static volatile SingularAttribute<Reminder, Integer> reminderId;
    public static volatile SingularAttribute<Reminder, Client> clientId;

}