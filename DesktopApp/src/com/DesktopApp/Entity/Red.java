/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "red")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Red.findAll", query = "SELECT r FROM Red r"),
    @NamedQuery(name = "Red.findByIdRed", query = "SELECT r FROM Red r WHERE r.idRed = :idRed"),
    @NamedQuery(name = "Red.findByName", query = "SELECT r FROM Red r WHERE r.name = :name")})
public class Red implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_Red")
    private Integer idRed;
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRed")
    private List<SubRedRed> subRedRedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRed")
    private List<SubRed> subRedList;

    public Red() {
    }

    public Red(Integer idRed) {
        this.idRed = idRed;
    }

    public Integer getIdRed() {
        return idRed;
    }

    public void setIdRed(Integer idRed) {
        this.idRed = idRed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<SubRedRed> getSubRedRedList() {
        return subRedRedList;
    }

    public void setSubRedRedList(List<SubRedRed> subRedRedList) {
        this.subRedRedList = subRedRedList;
    }

    @XmlTransient
    public List<SubRed> getSubRedList() {
        return subRedList;
    }

    public void setSubRedList(List<SubRed> subRedList) {
        this.subRedList = subRedList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRed != null ? idRed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Red)) {
            return false;
        }
        Red other = (Red) object;
        if ((this.idRed == null && other.idRed != null) || (this.idRed != null && !this.idRed.equals(other.idRed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.Red[ idRed=" + idRed + " ]";
    }
    
}
