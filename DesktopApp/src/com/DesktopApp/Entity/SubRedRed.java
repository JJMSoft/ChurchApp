/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "sub_red_red")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubRedRed.findAll", query = "SELECT s FROM SubRedRed s"),
    @NamedQuery(name = "SubRedRed.findByIdSubRedRed", query = "SELECT s FROM SubRedRed s WHERE s.idSubRedRed = :idSubRedRed")})
public class SubRedRed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_Sub_Red_Red")
    private Integer idSubRedRed;
    @JoinColumn(name = "id_Sub_Red", referencedColumnName = "id_Sub_Red")
    @ManyToOne(optional = false)
    private SubRed idSubRed;
    @JoinColumn(name = "id_Red", referencedColumnName = "id_Red")
    @ManyToOne(optional = false)
    private Red idRed;

    public SubRedRed() {
    }

    public SubRedRed(Integer idSubRedRed) {
        this.idSubRedRed = idSubRedRed;
    }

    public Integer getIdSubRedRed() {
        return idSubRedRed;
    }

    public void setIdSubRedRed(Integer idSubRedRed) {
        this.idSubRedRed = idSubRedRed;
    }

    public SubRed getIdSubRed() {
        return idSubRed;
    }

    public void setIdSubRed(SubRed idSubRed) {
        this.idSubRed = idSubRed;
    }

    public Red getIdRed() {
        return idRed;
    }

    public void setIdRed(Red idRed) {
        this.idRed = idRed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSubRedRed != null ? idSubRedRed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubRedRed)) {
            return false;
        }
        SubRedRed other = (SubRedRed) object;
        if ((this.idSubRedRed == null && other.idSubRedRed != null) || (this.idSubRedRed != null && !this.idSubRedRed.equals(other.idSubRedRed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.SubRedRed[ idSubRedRed=" + idSubRedRed + " ]";
    }
    
}
