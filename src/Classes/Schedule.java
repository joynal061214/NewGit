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
@Table(name = "schedule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Schedule.findAll", query = "SELECT s FROM Schedule s"),
    @NamedQuery(name = "Schedule.findByScheduleId", query = "SELECT s FROM Schedule s WHERE s.scheduleId = :scheduleId"),
    @NamedQuery(name = "Schedule.findByReminderId", query = "SELECT s FROM Schedule s WHERE s.reminderId = :reminderId"),
    @NamedQuery(name = "Schedule.findByNextReminder", query = "SELECT s FROM Schedule s WHERE s.nextReminder = :nextReminder"),
    @NamedQuery(name = "Schedule.findByNextreminderTime", query = "SELECT s FROM Schedule s WHERE s.nextreminderTime = :nextreminderTime"),
    @NamedQuery(name = "Schedule.findByLastReminder", query = "SELECT s FROM Schedule s WHERE s.lastReminder = :lastReminder"),
    @NamedQuery(name = "Schedule.findByLasttreminderTime", query = "SELECT s FROM Schedule s WHERE s.lasttreminderTime = :lasttreminderTime"),
    @NamedQuery(name = "Schedule.findByTotalReviewed", query = "SELECT s FROM Schedule s WHERE s.totalReviewed = :totalReviewed"),
    @NamedQuery(name = "Schedule.findByReviewed", query = "SELECT s FROM Schedule s WHERE s.reviewed = :reviewed")})
public class Schedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "schedule_id")
    private Integer scheduleId;
    @Column(name = "reminder_id")
    private Integer reminderId;
    @Column(name = "next_reminder")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nextReminder;
    @Column(name = "next_reminderTime")
    @Temporal(TemporalType.TIME)
    private Date nextreminderTime;
    @Column(name = "last_reminder")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastReminder;
    @Column(name = "lastt_reminderTime")
    @Temporal(TemporalType.TIME)
    private Date lasttreminderTime;
    @Column(name = "total_reviewed")
    private Integer totalReviewed;
    @Column(name = "Reviewed")
    private Integer reviewed;

    public Schedule() {
    }

    public Schedule(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getReminderId() {
        return reminderId;
    }

    public void setReminderId(Integer reminderId) {
        this.reminderId = reminderId;
    }

    public Date getNextReminder() {
        return nextReminder;
    }

    public void setNextReminder(Date nextReminder) {
        this.nextReminder = nextReminder;
    }

    public Date getNextreminderTime() {
        return nextreminderTime;
    }

    public void setNextreminderTime(Date nextreminderTime) {
        this.nextreminderTime = nextreminderTime;
    }

    public Date getLastReminder() {
        return lastReminder;
    }

    public void setLastReminder(Date lastReminder) {
        this.lastReminder = lastReminder;
    }

    public Date getLasttreminderTime() {
        return lasttreminderTime;
    }

    public void setLasttreminderTime(Date lasttreminderTime) {
        this.lasttreminderTime = lasttreminderTime;
    }

    public Integer getTotalReviewed() {
        return totalReviewed;
    }

    public void setTotalReviewed(Integer totalReviewed) {
        this.totalReviewed = totalReviewed;
    }

    public Integer getReviewed() {
        return reviewed;
    }

    public void setReviewed(Integer reviewed) {
        this.reviewed = reviewed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scheduleId != null ? scheduleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Schedule)) {
            return false;
        }
        Schedule other = (Schedule) object;
        if ((this.scheduleId == null && other.scheduleId != null) || (this.scheduleId != null && !this.scheduleId.equals(other.scheduleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Schedule[ scheduleId=" + scheduleId + " ]";
    }
    
}
