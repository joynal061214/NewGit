
package control;

import java.util.List;
import java.io.Serializable;

import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Classes.Usergroup;
import Classes.Users;
import Classes.UsersPK;
import control.exceptions.NonexistentEntityException;
import control.exceptions.PreexistingEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * @author Joynal Abedin
 * 27-Jul-2013
 */


public class UsersJpaController implements Serializable {

    public UsersJpaController(EntityManagerFactory emf)
    {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager()
    {
        return emf.createEntityManager();
    }

    public void create(Users users) throws PreexistingEntityException, Exception
    {
        if (users.getUsersPK() == null)
        {
            users.setUsersPK(new UsersPK());
        }
        users.getUsersPK().setUserGroupUserGroupid(users.getUsergroup().getUserGroupid());
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            Usergroup usergroup = users.getUsergroup();
            if (usergroup != null)
            {
                usergroup = em.getReference(usergroup.getClass(),
                        usergroup.getUserGroupid());
                users.setUsergroup(usergroup);
            }
            em.persist(users);
            if (usergroup != null)
            {
                usergroup.getUsersList().add(users);
                usergroup = em.merge(usergroup);
            }
            em.getTransaction().commit();
        }
        catch (Exception ex)
        {
            if (findUsers(users.getUsersPK()) != null)
            {
                throw new PreexistingEntityException("Users " + users + " already exists.",
                        ex);
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

    public void edit(Users users) throws NonexistentEntityException, Exception
    {
        users.getUsersPK().setUserGroupUserGroupid(users.getUsergroup().getUserGroupid());
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            Users persistentUsers = em.find(Users.class, users.getUsersPK());
            Usergroup usergroupOld = persistentUsers.getUsergroup();
            Usergroup usergroupNew = users.getUsergroup();
            if (usergroupNew != null)
            {
                usergroupNew = em.getReference(usergroupNew.getClass(),
                        usergroupNew.getUserGroupid());
                users.setUsergroup(usergroupNew);
            }
            users = em.merge(users);
            if (usergroupOld != null && !usergroupOld.equals(usergroupNew))
            {
                usergroupOld.getUsersList().remove(users);
                usergroupOld = em.merge(usergroupOld);
            }
            if (usergroupNew != null && !usergroupNew.equals(usergroupOld))
            {
                usergroupNew.getUsersList().add(users);
                usergroupNew = em.merge(usergroupNew);
            }
            em.getTransaction().commit();
        }
        catch (Exception ex)
        {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0)
            {
                UsersPK id = users.getUsersPK();
                if (findUsers(id) == null)
                {
                    throw new NonexistentEntityException("The users with id " + id + " no longer exists.");
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

    public void destroy(UsersPK id) throws NonexistentEntityException
    {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            Users users;
            try
            {
                users = em.getReference(Users.class, id);
                users.getUsersPK();
            }
            catch (EntityNotFoundException enfe)
            {
                throw new NonexistentEntityException("The users with id " + id + " no longer exists.",
                        enfe);
            }
            Usergroup usergroup = users.getUsergroup();
            if (usergroup != null)
            {
                usergroup.getUsersList().remove(users);
                usergroup = em.merge(usergroup);
            }
            em.remove(users);
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

    public List<Users> findUsersEntities()
    {
        return findUsersEntities(true, -1, -1);
    }

    public List<Users> findUsersEntities(int maxResults, int firstResult)
    {
        return findUsersEntities(false, maxResults, firstResult);
    }

    private List<Users> findUsersEntities(boolean all, int maxResults,
            int firstResult)
    {
        EntityManager em = getEntityManager();
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Users.class));
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

    public Users findUsers(UsersPK id)
    {
        EntityManager em = getEntityManager();
        try
        {
            return em.find(Users.class, id);
        }
        finally
        {
            em.close();
        }
    }

    public int getUsersCount()
    {
        EntityManager em = getEntityManager();
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Users> rt = cq.from(Users.class);
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
