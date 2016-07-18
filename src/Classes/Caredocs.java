/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "caredocs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caredocs.findAll", query = "SELECT c FROM Caredocs c"),
    @NamedQuery(name = "Caredocs.findByCareDocID", query = "SELECT c FROM Caredocs c WHERE c.careDocID = :careDocID"),
    @NamedQuery(name = "Caredocs.findByFileName", query = "SELECT c FROM Caredocs c WHERE c.fileName = :fileName"),
    @NamedQuery(name = "Caredocs.findByMime", query = "SELECT c FROM Caredocs c WHERE c.mime = :mime"),
    @NamedQuery(name = "Caredocs.findByAbout", query = "SELECT c FROM Caredocs c WHERE c.about = :about"),
    @NamedQuery(name = "Caredocs.findByCarePackid", query = "SELECT c FROM Caredocs c WHERE c.carePackid = :carePackid")})
public class Caredocs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CareDocID")
    private Integer careDocID;
    @Column(name = "FileName")
    private String fileName;
    @Column(name = "Mime")
    private String mime;
    @Lob
    @Column(name = "Doc")
    private byte[] doc;
    @Column(name = "About")
    private String about;
    @Basic(optional = false)
    @Column(name = "CarePack_id")
    private int carePackid;

    public Caredocs() {
    }

    public Caredocs(Integer careDocID) {
        this.careDocID = careDocID;
    }

    public Caredocs(Integer careDocID, int carePackid) {
        this.careDocID = careDocID;
        this.carePackid = carePackid;
    }

    public Integer getCareDocID() {
        return careDocID;
    }

    public void setCareDocID(Integer careDocID) {
        this.careDocID = careDocID;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public byte[] getDoc() {
        return doc;
    }

    public void setDoc(byte[] doc) {
        this.doc = doc;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getCarePackid() {
        return carePackid;
    }

    public void setCarePackid(int carePackid) {
        this.carePackid = carePackid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (careDocID != null ? careDocID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caredocs)) {
            return false;
        }
        Caredocs other = (Caredocs) object;
        if ((this.careDocID == null && other.careDocID != null) || (this.careDocID != null && !this.careDocID.equals(other.careDocID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Caredocs[ careDocID=" + careDocID + " ]";
    }
    
}
