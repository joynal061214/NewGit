
package Classes;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Joynal Abedin
 * 27-Jul-2013
 */


@Embeddable
public class UsersPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "UserGroup_UserGroup_id")
    private int userGroupUserGroupid;

    public UsersPK()
    {
    }

    public UsersPK(int userId, int userGroupUserGroupid)
    {
        this.userId = userId;
        this.userGroupUserGroupid = userGroupUserGroupid;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public int getUserGroupUserGroupid()
    {
        return userGroupUserGroupid;
    }

    public void setUserGroupUserGroupid(int userGroupUserGroupid)
    {
        this.userGroupUserGroupid = userGroupUserGroupid;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (int) userId;
        hash += (int) userGroupUserGroupid;
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersPK))
        {
            return false;
        }
        UsersPK other = (UsersPK) object;
        if (this.userId != other.userId)
        {
            return false;
        }
        if (this.userGroupUserGroupid != other.userGroupUserGroupid)
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Classes.UsersPK[ userId=" + userId + ", userGroupUserGroupid=" + userGroupUserGroupid + " ]";
    }

}
