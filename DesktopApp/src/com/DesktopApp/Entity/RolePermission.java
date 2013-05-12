/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "role_permission")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolePermission.findAll", query = "SELECT r FROM RolePermission r"),
    @NamedQuery(name = "RolePermission.findByIdRolePermission", query = "SELECT r FROM RolePermission r WHERE r.idRolePermission = :idRolePermission")})
public class RolePermission implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Role_Permission")
    private Integer idRolePermission;
    @JoinColumn(name = "id_Permission", referencedColumnName = "id_Permission")
    @ManyToOne(optional = false)
    private Permission idPermission;
    @JoinColumn(name = "id_Role", referencedColumnName = "id_Role")
    @ManyToOne(optional = false)
    private Role idRole;

    public RolePermission() {
    }

    public RolePermission(Integer idRolePermission) {
        this.idRolePermission = idRolePermission;
    }

    public Integer getIdRolePermission() {
        return idRolePermission;
    }

    public void setIdRolePermission(Integer idRolePermission) {
        this.idRolePermission = idRolePermission;
    }

    public Permission getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(Permission idPermission) {
        this.idPermission = idPermission;
    }

    public Role getIdRole() {
        return idRole;
    }

    public void setIdRole(Role idRole) {
        this.idRole = idRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRolePermission != null ? idRolePermission.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolePermission)) {
            return false;
        }
        RolePermission other = (RolePermission) object;
        if ((this.idRolePermission == null && other.idRolePermission != null) || (this.idRolePermission != null && !this.idRolePermission.equals(other.idRolePermission))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.RolePermission[ idRolePermission=" + idRolePermission + " ]";
    }
    
}
