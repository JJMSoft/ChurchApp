/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "consolidation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consolidation.findAll", query = "SELECT c FROM Consolidation c"),
    @NamedQuery(name = "Consolidation.findByIdConsolidation", query = "SELECT c FROM Consolidation c WHERE c.idConsolidation = :idConsolidation"),
    @NamedQuery(name = "Consolidation.findByStartDate", query = "SELECT c FROM Consolidation c WHERE c.startDate = :startDate"),
    @NamedQuery(name = "Consolidation.findByUpdateDate", query = "SELECT c FROM Consolidation c WHERE c.updateDate = :updateDate"),
    @NamedQuery(name = "Consolidation.findByAvaible", query = "SELECT c FROM Consolidation c WHERE c.avaible = :avaible"),
    @NamedQuery(name = "Consolidation.findByComments", query = "SELECT c FROM Consolidation c WHERE c.comments = :comments")})
public class Consolidation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_Consolidation")
    private Integer idConsolidation;
    @Column(name = "start_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "update_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Basic(optional = false)
    @Column(name = "avaible")
    private boolean avaible;
    @Column(name = "comments")
    private Integer comments;
    @JoinColumn(name = "id_User", referencedColumnName = "id_User")
    @ManyToOne(optional = false)
    private User idUser;
    @JoinColumn(name = "id_Leader", referencedColumnName = "id_Leader_Group")
    @ManyToOne(optional = false)
    private LeaderGroup idLeader;

    public Consolidation() {
    }

    public Consolidation(Integer idConsolidation) {
        this.idConsolidation = idConsolidation;
    }

    public Consolidation(Integer idConsolidation, boolean avaible) {
        this.idConsolidation = idConsolidation;
        this.avaible = avaible;
    }

    public Integer getIdConsolidation() {
        return idConsolidation;
    }

    public void setIdConsolidation(Integer idConsolidation) {
        this.idConsolidation = idConsolidation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public boolean getAvaible() {
        return avaible;
    }

    public void setAvaible(boolean avaible) {
        this.avaible = avaible;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public LeaderGroup getIdLeader() {
        return idLeader;
    }

    public void setIdLeader(LeaderGroup idLeader) {
        this.idLeader = idLeader;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsolidation != null ? idConsolidation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consolidation)) {
            return false;
        }
        Consolidation other = (Consolidation) object;
        if ((this.idConsolidation == null && other.idConsolidation != null) || (this.idConsolidation != null && !this.idConsolidation.equals(other.idConsolidation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.DesktopApp.Entity.Consolidation[ idConsolidation=" + idConsolidation + " ]";
    }
    
}
