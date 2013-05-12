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
@Table(name = "province")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Province.findAll", query = "SELECT p FROM Province p"),
    @NamedQuery(name = "Province.findByIdProvince", query = "SELECT p FROM Province p WHERE p.idProvince = :idProvince"),
    @NamedQuery(name = "Province.findByName", query = "SELECT p FROM Province p WHERE p.name = :name")})
public class Province implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_Province")
    private Integer idProvince;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProvince")
    private List<Canton> cantonList;

    public Province() {
    }

    public Province(Integer idProvince) {
        this.idProvince = idProvince;
    }

    public Province(Integer idProvince, String name) {
        this.idProvince = idProvince;
        this.name = name;
    }

    public Integer getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(Integer idProvince) {
        this.idProvince = idProvince;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Canton> getCantonList() {
        return cantonList;
    }

    public void setCantonList(List<Canton> cantonList) {
        this.cantonList = cantonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProvince != null ? idProvince.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Province)) {
            return false;
        }
        Province other = (Province) object;
        if ((this.idProvince == null && other.idProvince != null) || (this.idProvince != null && !this.idProvince.equals(other.idProvince))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.Province[ idProvince=" + idProvince + " ]";
    }
    
}
