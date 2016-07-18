
package ctrl;

import control.CarepackJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Joynal Abedin
 * 31-Jul-2013
 */


public class CarePackCtrl {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("slSystemPU");
    private static CarepackJpaController cpa = new CarepackJpaController(emf);
    private static EntityManager em = emf.createEntityManager();

    /**
     * @return the cpa
     */
    public static CarepackJpaController getCpa()
    {
        return cpa;
    }

    /**
     * @return the em
     */
    public static EntityManager getEm()
    {
        return em;
    }

}
