/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Group.findAll", query = "SELECT g FROM Group g"),
    @NamedQuery(name = "Group.findByIdGroup", query = "SELECT g FROM Group g WHERE g.idGroup = :idGroup"),
    @NamedQuery(name = "Group.findByName", query = "SELECT g FROM Group g WHERE g.name = :name"),
    @NamedQuery(name = "Group.findByType", query = "SELECT g FROM Group g WHERE g.type = :type"),
    @NamedQuery(name = "Group.findByStartDate", query = "SELECT g FROM Group g WHERE g.startDate = :startDate"),
    @NamedQuery(name = "Group.findByDirection", query = "SELECT g FROM Group g WHERE g.direction = :direction"),
    @NamedQuery(name = "Group.findByIdLeader", query = "SELECT g FROM Group g WHERE g.idLeader = :idLeader")})
public class Group implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_Group")
    private Integer idGroup;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private Character type;
    @Column(name = "start_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "direction")
    private String direction;
    @Column(name = "id_Leader")
    private Integer idLeader;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGroup")
    private List<UserGroup> userGroupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lidGroup")
    private List<LeaderGroup> leaderGroupList;
    @JoinColumn(name = "id_District", referencedColumnName = "id_District")
    @ManyToOne(optional = false)
    private District idDistrict;
    @JoinColumn(name = "id_SubRed", referencedColumnName = "id_Sub_Red")
    @ManyToOne(optional = false)
    private SubRed idSubRed;

    public Group() {
    }

    public Group(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getIdLeader() {
        return idLeader;
    }

    public void setIdLeader(Integer idLeader) {
        this.idLeader = idLeader;
    }
    /*
     @XmlTransient
     public List<UserGroup> getUserGroupList() {
     return userGroupList;
     }

     public void setUserGroupList(List<UserGroup> userGroupList) {
     this.userGroupList = userGroupList;
     }

     @XmlTransient
     public List<LeaderGroup> getLeaderGroupList() {
     return leaderGroupList;
     }

     public void setLeaderGroupList(List<LeaderGroup> leaderGroupList) {
     this.leaderGroupList = leaderGroupList;
     }

     public District getIdDistrict() {
     return idDistrict;
     }

     public void setIdDistrict(District idDistrict) {
     this.idDistrict = idDistrict;
     }

     public SubRed getIdSubRed() {
     return idSubRed;
     }

     public void setIdSubRed(SubRed idSubRed) {
     this.idSubRed = idSubRed;
     }
     */

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGroup != null ? idGroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Group)) {
            return false;
        }
        Group other = (Group) object;
        if ((this.idGroup == null && other.idGroup != null) || (this.idGroup != null && !this.idGroup.equals(other.idGroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.Group1[ idGroup=" + idGroup + " ]";
    }
}
