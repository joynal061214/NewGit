
package Classes;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Joynal Abedin
 * 27-Jul-2013
 */


@Entity
@Table(name = "users", catalog = "lsdb", schema = "")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUserId", query = "SELECT u FROM Users u WHERE u.usersPK.userId = :userId"),
    @NamedQuery(name = "Users.findByUserName", query = "SELECT u FROM Users u WHERE u.userName = :userName"),
    @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password"),
    @NamedQuery(name = "Users.findByFirstName", query = "SELECT u FROM Users u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "Users.findByLastName", query = "SELECT u FROM Users u WHERE u.lastName = :lastName"),
    @NamedQuery(name = "Users.findByUserGroupUserGroupid", query = "SELECT u FROM Users u WHERE u.usersPK.userGroupUserGroupid = :userGroupUserGroupid")
})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsersPK usersPK;
    @Basic(optional = false)
    @Column(name = "userName")
    private String userName;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @JoinColumn(name = "UserGroup_UserGroup_id", referencedColumnName = "UserGroup_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usergroup usergroup;

    public Users()
    {
    }

    public Users(UsersPK usersPK)
    {
        this.usersPK = usersPK;
    }

    public Users(UsersPK usersPK, String userName, String password)
    {
        this.usersPK = usersPK;
        this.userName = userName;
        this.password = password;
    }

    public Users(int userId, int userGroupUserGroupid)
    {
        this.usersPK = new UsersPK(userId, userGroupUserGroupid);
    }

    public UsersPK getUsersPK()
    {
        return usersPK;
    }

    public void setUsersPK(UsersPK usersPK)
    {
        this.usersPK = usersPK;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Usergroup getUsergroup()
    {
        return usergroup;
    }

    public void setUsergroup(Usergroup usergroup)
    {
        this.usergroup = usergroup;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (usersPK != null ? usersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users))
        {
            return false;
        }
        Users other = (Users) object;
        if ((this.usersPK == null && other.usersPK != null) || (this.usersPK != null && !this.usersPK.equals(other.usersPK)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Classes.Users[ usersPK=" + usersPK + " ]";
    }

}
