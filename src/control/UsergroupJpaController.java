
package control;

import java.io.Serializable;

import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Classes.Users;

import java.util.ArrayList;
import java.util.List;

import Classes.Usergroup;
import control.exceptions.IllegalOrphanException;
import control.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * @author Joynal Abedin
 * 27-Jul-2013
 */


public class UsergroupJpaController implements Serializable {

    public UsergroupJpaController(EntityManagerFactory emf)
    {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager()
    {
        return emf.createEntityManager();
    }

    public void create(Usergroup usergroup)
    {
        if (usergroup.getUsersList() == null)
        {
            usergroup.setUsersList(new ArrayList<Users>());
        }
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Users> attachedUsersList = new ArrayList<Users>();
            for (Users usersListUsersToAttach : usergroup.getUsersList())
            {
                usersListUsersToAttach = em.getReference(usersListUsersToAttach.getClass(),
                        usersListUsersToAttach.getUsersPK());
                attachedUsersList.add(usersListUsersToAttach);
            }
            usergroup.setUsersList(attachedUsersList);
            em.persist(usergroup);
            for (Users usersListUsers : usergroup.getUsersList())
            {
                Usergroup oldUsergroupOfUsersListUsers = usersListUsers.getUsergroup();
                usersListUsers.setUsergroup(usergroup);
                usersListUsers = em.merge(usersListUsers);
                if (oldUsergroupOfUsersListUsers != null)
                {
                    oldUsergroupOfUsersListUsers.getUsersList().remove(usersListUsers);
                    oldUsergroupOfUsersListUsers = em.merge(oldUsergroupOfUsersListUsers);
                }
            }
            em.getTransaction().commit();
        }
        finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public void edit(Usergroup usergroup) throws IllegalOrphanException, NonexistentEntityException, Exception
    {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            Usergroup persistentUsergroup = em.find(Usergroup.class,
                    usergroup.getUserGroupid());
            List<Users> usersListOld = persistentUsergroup.getUsersList();
            List<Users> usersListNew = usergroup.getUsersList();
            List<String> illegalOrphanMessages = null;
            for (Users usersListOldUsers : usersListOld)
            {
                if (!usersListNew.contains(usersListOldUsers))
                {
                    if (illegalOrphanMessages == null)
                    {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Users " + usersListOldUsers + " since its usergroup field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null)
            {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Users> attachedUsersListNew = new ArrayList<Users>();
            for (Users usersListNewUsersToAttach : usersListNew)
            {
                usersListNewUsersToAttach = em.getReference(usersListNewUsersToAttach.getClass(),
                        usersListNewUsersToAttach.getUsersPK());
                attachedUsersListNew.add(usersListNewUsersToAttach);
            }
            usersListNew = attachedUsersListNew;
            usergroup.setUsersList(usersListNew);
            usergroup = em.merge(usergroup);
            for (Users usersListNewUsers : usersListNew)
            {
                if (!usersListOld.contains(usersListNewUsers))
                {
                    Usergroup oldUsergroupOfUsersListNewUsers = usersListNewUsers.getUsergroup();
                    usersListNewUsers.setUsergroup(usergroup);
                    usersListNewUsers = em.merge(usersListNewUsers);
                    if (oldUsergroupOfUsersListNewUsers != null && !oldUsergroupOfUsersListNewUsers.equals(usergroup))
                    {
                        oldUsergroupOfUsersListNewUsers.getUsersList().remove(usersListNewUsers);
                        oldUsergroupOfUsersListNewUsers = em.merge(oldUsergroupOfUsersListNewUsers);
                    }
                }
            }
            em.getTransaction().commit();
        }
        catch (Exception ex)
        {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0)
            {
                Integer id = usergroup.getUserGroupid();
                if (findUsergroup(id) == null)
                {
                    throw new NonexistentEntityException("The usergroup with id " + id + " no longer exists.");
                }
            }
            throw ex;
        }
        finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException
    {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            Usergroup usergroup;
            try
            {
                usergroup = em.getReference(Usergroup.class, id);
                usergroup.getUserGroupid();
            }
            catch (EntityNotFoundException enfe)
            {
                throw new NonexistentEntityException("The usergroup with id " + id + " no longer exists.",
                        enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Users> usersListOrphanCheck = usergroup.getUsersList();
            for (Users usersListOrphanCheckUsers : usersListOrphanCheck)
            {
                if (illegalOrphanMessages == null)
                {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Usergroup (" + usergroup + ") cannot be destroyed since the Users " + usersListOrphanCheckUsers + " in its usersList field has a non-nullable usergroup field.");
            }
            if (illegalOrphanMessages != null)
            {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(usergroup);
            em.getTransaction().commit();
        }
        finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public List<Usergroup> findUsergroupEntities()
    {
        return findUsergroupEntities(true, -1, -1);
    }

    public List<Usergroup> findUsergroupEntities(int maxResults, int firstResult)
    {
        return findUsergroupEntities(false, maxResults, firstResult);
    }

    private List<Usergroup> findUsergroupEntities(boolean all, int maxResults,
            int firstResult)
    {
        EntityManager em = getEntityManager();
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usergroup.class));
            Query q = em.createQuery(cq);
            if (!all)
            {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        }
        finally
        {
            em.close();
        }
    }

    public Usergroup findUsergroup(Integer id)
    {
        EntityManager em = getEntityManager();
        try
        {
            return em.find(Usergroup.class, id);
        }
        finally
        {
            em.close();
        }
    }

    public int getUsergroupCount()
    {
        EntityManager em = getEntityManager();
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Usergroup> rt = cq.from(Usergroup.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        }
        finally
        {
            em.close();
        }
    }

}
