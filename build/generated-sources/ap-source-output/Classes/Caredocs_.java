package Classes;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-11-16T16:13:37")
@StaticMetamodel(Caredocs.class)
public class Caredocs_ { 

    public static volatile SingularAttribute<Caredocs, Integer> careDocID;
    public static volatile SingularAttribute<Caredocs, String> fileName;
    public static volatile SingularAttribute<Caredocs, byte[]> doc;
    public static volatile SingularAttribute<Caredocs, String> about;
    public static volatile SingularAttribute<Caredocs, String> mime;
    public static volatile SingularAttribute<Caredocs, Integer> carePackid;

}