/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Model;

import com.DesktopApp.DAOImpl.PictureDAOImpl;
import com.DesktopApp.Entity.Picture;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class PictureModel implements Serializable {

    PictureDAOImpl dao;

    public boolean save(Picture picture) {
        return dao.save(picture);
    }

    public List<Picture> findAll() {
        return dao.findAll();
    }

    public Picture findById() {
        return dao.findById();
    }
}
