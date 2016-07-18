/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "reminder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reminder.findAll", query = "SELECT r FROM Reminder r"),
    @NamedQuery(name = "Reminder.findByReminderId", query = "SELECT r FROM Reminder r WHERE r.reminderId = :reminderId"),
    @NamedQuery(name = "Reminder.findByDescription", query = "SELECT r FROM Reminder r WHERE r.description = :description"),
    @NamedQuery(name = "Reminder.findByReminderDtTime", query = "SELECT r FROM Reminder r WHERE r.reminderDtTime = :reminderDtTime"),
    @NamedQuery(name = "Reminder.findByReviewed", query = "SELECT r FROM Reminder r WHERE r.reviewed = :reviewed")})
public class Reminder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "reminder_id")
    private Integer reminderId;
    @Column(name = "description")
    private String description;
    @Column(name = "ReminderDtTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reminderDtTime;
    @Column(name = "Reviewed")
    private Integer reviewed;
    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @ManyToOne
    private Client clientId;

    public Reminder() {
    }

    public Reminder(Integer reminderId) {
        this.reminderId = reminderId;
    }

    public Integer getReminderId() {
        return reminderId;
    }

    public void setReminderId(Integer reminderId) {
        this.reminderId = reminderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReminderDtTime() {
        return reminderDtTime;
    }

    public void setReminderDtTime(Date reminderDtTime) {
        this.reminderDtTime = reminderDtTime;
    }

    public Integer getReviewed() {
        return reviewed;
    }

    public void setReviewed(Integer reviewed) {
        this.reviewed = reviewed;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reminderId != null ? reminderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reminder)) {
            return false;
        }
        Reminder other = (Reminder) object;
        if ((this.reminderId == null && other.reminderId != null) || (this.reminderId != null && !this.reminderId.equals(other.reminderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Reminder[ reminderId=" + reminderId + " ]";
    }
    
}
