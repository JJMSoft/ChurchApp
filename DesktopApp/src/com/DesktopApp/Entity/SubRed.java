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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "sub_red")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubRed.findAll", query = "SELECT s FROM SubRed s"),
    @NamedQuery(name = "SubRed.findByIdSubRed", query = "SELECT s FROM SubRed s WHERE s.idSubRed = :idSubRed"),
    @NamedQuery(name = "SubRed.findByName", query = "SELECT s FROM SubRed s WHERE s.name = :name"),
    @NamedQuery(name = "SubRed.findByColor", query = "SELECT s FROM SubRed s WHERE s.color = :color")})
public class SubRed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_Sub_Red")
    private Integer idSubRed;
    @Column(name = "name")
    private String name;
    @Column(name = "color")
    private String color;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSubRed")
    private List<SubRedRed> subRedRedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSubRed")
    private List<Group> group1List;
    @JoinColumn(name = "id_Red", referencedColumnName = "id_Red")
    @ManyToOne(optional = false)
    private Red idRed;

    public SubRed() {
    }

    public SubRed(Integer idSubRed) {
        this.idSubRed = idSubRed;
    }

    public Integer getIdSubRed() {
        return idSubRed;
    }

    public void setIdSubRed(Integer idSubRed) {
        this.idSubRed = idSubRed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @XmlTransient
    public List<SubRedRed> getSubRedRedList() {
        return subRedRedList;
    }

    public void setSubRedRedList(List<SubRedRed> subRedRedList) {
        this.subRedRedList = subRedRedList;
    }

    @XmlTransient
    public List<Group> getGroup1List() {
        return group1List;
    }

    public void setGroup1List(List<Group> group1List) {
        this.group1List = group1List;
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
        hash += (idSubRed != null ? idSubRed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubRed)) {
            return false;
        }
        SubRed other = (SubRed) object;
        if ((this.idSubRed == null && other.idSubRed != null) || (this.idSubRed != null && !this.idSubRed.equals(other.idSubRed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.SubRed[ idSubRed=" + idSubRed + " ]";
    }
    
}
