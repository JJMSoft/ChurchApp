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
@Table(name = "canton")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Canton.findAll", query = "SELECT c FROM Canton c"),
    @NamedQuery(name = "Canton.findByIdCanton", query = "SELECT c FROM Canton c WHERE c.idCanton = :idCanton"),
    @NamedQuery(name = "Canton.findByName", query = "SELECT c FROM Canton c WHERE c.name = :name")})
public class Canton implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_Canton")
    private Integer idCanton;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "id_Province", referencedColumnName = "id_Province")
    @ManyToOne(optional = false)
    private Province idProvince;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGroup")
    private List<District> districtList;

    public Canton() {
    }

    public Canton(Integer idCanton) {
        this.idCanton = idCanton;
    }

    public Canton(Integer idCanton, String name) {
        this.idCanton = idCanton;
        this.name = name;
    }

    public Integer getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(Integer idCanton) {
        this.idCanton = idCanton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(Province idProvince) {
        this.idProvince = idProvince;
    }

    @XmlTransient
    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCanton != null ? idCanton.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Canton)) {
            return false;
        }
        Canton other = (Canton) object;
        if ((this.idCanton == null && other.idCanton != null) || (this.idCanton != null && !this.idCanton.equals(other.idCanton))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.Canton[ idCanton=" + idCanton + " ]";
    }
    
}
