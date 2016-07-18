
package ctrl;


import control.ClientJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Joynal Abedin
 * 16-Jul-2013
 */


public class DBM {
    
 private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("slSystemPU");
 private static ClientJpaController clientJpaController = new ClientJpaController(emf);
 private static EntityManager em = emf.createEntityManager();

    /**
     * @return the clientJpaController
     */
    public static ClientJpaController getClientJpaController()
    {
        return clientJpaController;
    }

    /**
     * @return the em
     */
    public static EntityManager getEm()
    {
        return em;
    }
    
    /*
    to display in a table
    */
    

}
