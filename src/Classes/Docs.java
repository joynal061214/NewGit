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
@Table(name = "docs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Docs.findAll", query = "SELECT d FROM Docs d"),
    @NamedQuery(name = "Docs.findByClientID", query = "SELECT d FROM Docs d WHERE d.clientID = :clientID"),
    @NamedQuery(name = "Docs.findByDocID", query = "SELECT d FROM Docs d WHERE d.docID = :docID"),
    @NamedQuery(name = "Docs.findByAbout", query = "SELECT d FROM Docs d WHERE d.about = :about"),
    @NamedQuery(name = "Docs.findByMime", query = "SELECT d FROM Docs d WHERE d.mime = :mime")})
public class Docs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ClientID")
    private int clientID;
    @Id
    @Basic(optional = false)
    @Column(name = "DocID")
    private Integer docID;
    @Column(name = "About")
    private String about;
    @Lob
    @Column(name = "Doc")
    private byte[] doc;
    @Column(name = "Mime")
    private String mime;
    @Column(name = "FileName")
    private String FileName;
    
    public Docs() {
    }

    public Docs(Integer docID) {
        this.docID = docID;
    }

    public Docs(Integer docID, int clientID) {
        this.docID = docID;
        this.clientID = clientID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public Integer getDocID() {
        return docID;
    }

    public void setDocID(Integer docID) {
        this.docID = docID;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public byte[] getDoc() {
        return doc;
    }

    public void setDoc(byte[] doc) {
        this.doc = doc;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public String getFileName() {
        return FileName;
    }
    
    
    public void setFileName(String Filename) {
        this.FileName = Filename;
    }    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (docID != null ? docID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docs)) {
            return false;
        }
        Docs other = (Docs) object;
        if ((this.docID == null && other.docID != null) || (this.docID != null && !this.docID.equals(other.docID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Docs[ docID=" + docID + " ]";
    }
    
}
