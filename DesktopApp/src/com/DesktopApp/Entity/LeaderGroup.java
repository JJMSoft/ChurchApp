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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "leader_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LeaderGroup.findAll", query = "SELECT l FROM LeaderGroup l"),
    @NamedQuery(name = "LeaderGroup.findByIdLeaderGroup", query = "SELECT l FROM LeaderGroup l WHERE l.idLeaderGroup = :idLeaderGroup")})
public class LeaderGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Leader_Group")
    private Integer idLeaderGroup;
    @JoinColumn(name = "Lid_Group", referencedColumnName = "id_Group")
    @ManyToOne(optional = false)
    private Group lidGroup;
    @JoinColumn(name = "Lid_Leader", referencedColumnName = "id_User")
    @ManyToOne(optional = false)
    private User lidLeader;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLeader")
    private List<Consolidation> consolidationList;

    public LeaderGroup() {
    }

    public LeaderGroup(Integer idLeaderGroup) {
        this.idLeaderGroup = idLeaderGroup;
    }

    public Integer getIdLeaderGroup() {
        return idLeaderGroup;
    }

    public void setIdLeaderGroup(Integer idLeaderGroup) {
        this.idLeaderGroup = idLeaderGroup;
    }

    public Group getLidGroup() {
        return lidGroup;
    }

    public void setLidGroup(Group lidGroup) {
        this.lidGroup = lidGroup;
    }

    public User getLidLeader() {
        return lidLeader;
    }

    public void setLidLeader(User lidLeader) {
        this.lidLeader = lidLeader;
    }

    @XmlTransient
    public List<Consolidation> getConsolidationList() {
        return consolidationList;
    }

    public void setConsolidationList(List<Consolidation> consolidationList) {
        this.consolidationList = consolidationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLeaderGroup != null ? idLeaderGroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LeaderGroup)) {
            return false;
        }
        LeaderGroup other = (LeaderGroup) object;
        if ((this.idLeaderGroup == null && other.idLeaderGroup != null) || (this.idLeaderGroup != null && !this.idLeaderGroup.equals(other.idLeaderGroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.LeaderGroup[ idLeaderGroup=" + idLeaderGroup + " ]";
    }
    
}
