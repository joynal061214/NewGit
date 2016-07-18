
package Classes;

import java.util.List;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Joynal Abedin
 * 27-Jul-2013
 */


@Entity
@Table(name = "usergroup", catalog = "lsdb", schema = "")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Usergroup.findAll", query = "SELECT u FROM Usergroup u"),
    @NamedQuery(name = "Usergroup.findByUserGroupid", query = "SELECT u FROM Usergroup u WHERE u.userGroupid = :userGroupid"),
    @NamedQuery(name = "Usergroup.findByGroupName", query = "SELECT u FROM Usergroup u WHERE u.groupName = :groupName"),
    @NamedQuery(name = "Usergroup.findByUsersuserid", query = "SELECT u FROM Usergroup u WHERE u.usersuserid = :usersuserid")
})
public class Usergroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UserGroup_id")
    private Integer userGroupid;
    @Column(name = "groupName")
    private String groupName;
    @Lob
    @Column(name = "groupDescriptions")
    private String groupDescriptions;
    @Column(name = "Users_user_id")
    private Integer usersuserid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usergroup")
    private List<Users> usersList;

    public Usergroup()
    {
    }

    public Usergroup(Integer userGroupid)
    {
        this.userGroupid = userGroupid;
    }

    public Integer getUserGroupid()
    {
        return userGroupid;
    }

    public void setUserGroupid(Integer userGroupid)
    {
        this.userGroupid = userGroupid;
    }

    public String getGroupName()
    {
        return groupName;
    }

    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public String getGroupDescriptions()
    {
        return groupDescriptions;
    }

    public void setGroupDescriptions(String groupDescriptions)
    {
        this.groupDescriptions = groupDescriptions;
    }

    public Integer getUsersuserid()
    {
        return usersuserid;
    }

    public void setUsersuserid(Integer usersuserid)
    {
        this.usersuserid = usersuserid;
    }

    @XmlTransient
    public List<Users> getUsersList()
    {
        return usersList;
    }

    public void setUsersList(
            List<Users> usersList)
    {
        this.usersList = usersList;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (userGroupid != null ? userGroupid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usergroup))
        {
            return false;
        }
        Usergroup other = (Usergroup) object;
        if ((this.userGroupid == null && other.userGroupid != null) || (this.userGroupid != null && !this.userGroupid.equals(other.userGroupid)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Classes.Usergroup[ userGroupid=" + userGroupid + " ]";
    }

}
