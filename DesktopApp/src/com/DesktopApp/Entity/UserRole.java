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
@Table(name = "user_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserRole.findAll", query = "SELECT u FROM UserRole u"),
    @NamedQuery(name = "UserRole.findByIdUserRol", query = "SELECT u FROM UserRole u WHERE u.idUserRol = :idUserRol")})
public class UserRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_User_Rol")
    private Integer idUserRol;
    @JoinColumn(name = "id_Role", referencedColumnName = "id_Role")
    @ManyToOne(optional = false)
    private Role idRole;
    @JoinColumn(name = "id_User", referencedColumnName = "id_User")
    @ManyToOne(optional = false)
    private User idUser;

    public UserRole() {
    }

    public UserRole(Integer idUserRol) {
        this.idUserRol = idUserRol;
    }

    public Integer getIdUserRol() {
        return idUserRol;
    }

    public void setIdUserRol(Integer idUserRol) {
        this.idUserRol = idUserRol;
    }

    public Role getIdRole() {
        return idRole;
    }

    public void setIdRole(Role idRole) {
        this.idRole = idRole;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserRol != null ? idUserRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserRole)) {
            return false;
        }
        UserRole other = (UserRole) object;
        if ((this.idUserRol == null && other.idUserRol != null) || (this.idUserRol != null && !this.idUserRol.equals(other.idUserRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.UserRole[ idUserRol=" + idUserRol + " ]";
    }
    
}
