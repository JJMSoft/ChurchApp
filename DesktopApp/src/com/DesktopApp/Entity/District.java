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
@Table(name = "district")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "District.findAll", query = "SELECT d FROM District d"),
    @NamedQuery(name = "District.findByIdDistrict", query = "SELECT d FROM District d WHERE d.idDistrict = :idDistrict"),
    @NamedQuery(name = "District.findByName", query = "SELECT d FROM District d WHERE d.name = :name")})
public class District implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_District")
    private Integer idDistrict;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDistrict")
    private List<Group> groupList;
    @JoinColumn(name = "id_Group", referencedColumnName = "id_Canton")
    @ManyToOne(optional = false)
    private Canton idGroup;

    public District() {
    }

    public District(Integer idDistrict) {
        this.idDistrict = idDistrict;
    }

    public District(Integer idDistrict, String name) {
        this.idDistrict = idDistrict;
        this.name = name;
    }

    public Integer getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(Integer idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Group> getGroup1List() {
        return groupList;
    }

    public void setGroup1List(List<Group> groupList) {
        this.groupList = groupList;
    }

    public Canton getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Canton idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDistrict != null ? idDistrict.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof District)) {
            return false;
        }
        District other = (District) object;
        if ((this.idDistrict == null && other.idDistrict != null) || (this.idDistrict != null && !this.idDistrict.equals(other.idDistrict))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.District[ idDistrict=" + idDistrict + " ]";
    }
    
}
