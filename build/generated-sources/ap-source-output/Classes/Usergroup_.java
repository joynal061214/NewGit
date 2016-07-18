package Classes;

import Classes.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-11-16T16:13:37")
@StaticMetamodel(Usergroup.class)
public class Usergroup_ { 

    public static volatile SingularAttribute<Usergroup, String> groupName;
    public static volatile SingularAttribute<Usergroup, Integer> userGroupid;
    public static volatile SingularAttribute<Usergroup, String> groupDescriptions;
    public static volatile SingularAttribute<Usergroup, Integer> usersuserid;
    public static volatile ListAttribute<Usergroup, Users> usersList;

}