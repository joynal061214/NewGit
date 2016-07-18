package Classes;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-11-16T16:13:37")
@StaticMetamodel(Schedule.class)
public class Schedule_ { 

    public static volatile SingularAttribute<Schedule, Integer> reviewed;
    public static volatile SingularAttribute<Schedule, Integer> scheduleId;
    public static volatile SingularAttribute<Schedule, Date> nextreminderTime;
    public static volatile SingularAttribute<Schedule, Date> lastReminder;
    public static volatile SingularAttribute<Schedule, Date> nextReminder;
    public static volatile SingularAttribute<Schedule, Integer> totalReviewed;
    public static volatile SingularAttribute<Schedule, Date> lasttreminderTime;
    public static volatile SingularAttribute<Schedule, Integer> reminderId;

}