/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Model;

import com.DesktopApp.Herency.GeneralDAO;

/**
 *
 * @author Jonathan
 */
public class UtilModel extends GeneralDAO {

    public String getLookAndFeel(String idUser) {
        return getEntityManger().find(String.class, idUser);
    }
}
