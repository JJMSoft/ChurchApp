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
@Table(name = "user_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserGroup.findAll", query = "SELECT u FROM UserGroup u"),
    @NamedQuery(name = "UserGroup.findByIdUserGroup", query = "SELECT u FROM UserGroup u WHERE u.idUserGroup = :idUserGroup")})
public class UserGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_User_Group")
    private Integer idUserGroup;
    @JoinColumn(name = "id_Group", referencedColumnName = "id_Group")
    @ManyToOne(optional = false)
    private Group idGroup;
    @JoinColumn(name = "id_User", referencedColumnName = "id_User")
    @ManyToOne(optional = false)
    private User idUser;

    public UserGroup() {
    }

    public UserGroup(Integer idUserGroup) {
        this.idUserGroup = idUserGroup;
    }

    public Integer getIdUserGroup() {
        return idUserGroup;
    }

    public void setIdUserGroup(Integer idUserGroup) {
        this.idUserGroup = idUserGroup;
    }

    public Group getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Group idGroup) {
        this.idGroup = idGroup;
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
        hash += (idUserGroup != null ? idUserGroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserGroup)) {
            return false;
        }
        UserGroup other = (UserGroup) object;
        if ((this.idUserGroup == null && other.idUserGroup != null) || (this.idUserGroup != null && !this.idUserGroup.equals(other.idUserGroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.UserGroup[ idUserGroup=" + idUserGroup + " ]";
    }
    
}
