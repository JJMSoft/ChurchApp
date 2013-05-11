/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Controller;

import com.DesktopApp.Entity.Picture;
import com.DesktopApp.Model.PictureModel;
import java.util.List;


/**
 *
 * @author Jonathan
 */

public class PictureController {
    
    PictureModel model;
    
    public List<Picture> getPictures() {
        return model.findAll();
    }
}
