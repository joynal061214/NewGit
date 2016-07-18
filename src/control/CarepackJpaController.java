/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Classes.Carepack;
import Classes.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Asus
 */
public class CarepackJpaController implements Serializable {

    public CarepackJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Carepack carepack) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(carepack);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Carepack carepack) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            carepack = em.merge(carepack);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = carepack.getCarePackid();
                if (findCarepack(id) == null) {
                    throw new NonexistentEntityException("The carepack with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carepack carepack;
            try {
                carepack = em.getReference(Carepack.class, id);
                carepack.getCarePackid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The carepack with id " + id + " no longer exists.", enfe);
            }
            em.remove(carepack);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Carepack> findCarepackEntities() {
        return findCarepackEntities(true, -1, -1);
    }

    public List<Carepack> findCarepackEntities(int maxResults, int firstResult) {
        return findCarepackEntities(false, maxResults, firstResult);
    }

    private List<Carepack> findCarepackEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Carepack.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Carepack findCarepack(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Carepack.class, id);
        } finally {
            em.close();
        }
    }

    public int getCarepackCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Carepack> rt = cq.from(Carepack.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
