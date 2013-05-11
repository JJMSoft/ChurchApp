
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
@Table(name = "picture")
@XmlRootElement

public class Picture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Picture")

    private Integer idPicture;
    @Column(name = "title")
    
    private String title;
    @Column(name = "description")
    
    private String description;
    @Column(name = "location")
    
    private String location;
    @JoinColumn(name = "id_Album", referencedColumnName = "id_Album")
    @ManyToOne(optional = false)
    
    private Album idAlbum;

    public Picture() {
    }

    public Picture(Integer idPicture) {
        this.idPicture = idPicture;
    }

    public Integer getIdPicture() {
        return idPicture;
    }

    public void setIdPicture(Integer idPicture) {
        this.idPicture = idPicture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Album getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Album idAlbum) {
        this.idAlbum = idAlbum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPicture != null ? idPicture.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Picture)) {
            return false;
        }
        Picture other = (Picture) object;
        if ((this.idPicture == null && other.idPicture != null) || (this.idPicture != null && !this.idPicture.equals(other.idPicture))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.logicApp.Entity.Picture[ idPicture=" + idPicture + " ]";
    }
    
}
