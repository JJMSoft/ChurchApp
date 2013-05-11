/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.DAO;

import com.DesktopApp.Entity.Picture;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface PictureDAO {
    
    public boolean save(Picture picture);
    
    public boolean delete(Integer id);
    
    public List<Picture> findAll();
    
    public Picture findById();
    
}
