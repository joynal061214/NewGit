/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "carepack")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carepack.findAll", query = "SELECT c FROM Carepack c"),
    @NamedQuery(name = "Carepack.findByCarePackid", query = "SELECT c FROM Carepack c WHERE c.carePackid = :carePackid"),
    @NamedQuery(name = "Carepack.findByName", query = "SELECT c FROM Carepack c WHERE c.name = :name")})
public class Carepack implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CarePack_id")
    private Integer carePackid;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Lob
    @Column(name = "description")
    private String description;

    public Carepack() {
    }

    public Carepack(Integer carePackid) {
        this.carePackid = carePackid;
    }

    public Carepack(Integer carePackid, String name) {
        this.carePackid = carePackid;
        this.name = name;
    }

    public Integer getCarePackid() {
        return carePackid;
    }

    public void setCarePackid(Integer carePackid) {
        this.carePackid = carePackid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carePackid != null ? carePackid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carepack)) {
            return false;
        }
        Carepack other = (Carepack) object;
        if ((this.carePackid == null && other.carePackid != null) || (this.carePackid != null && !this.carePackid.equals(other.carePackid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Carepack[ carePackid=" + carePackid + " ]";
    }
    
}
