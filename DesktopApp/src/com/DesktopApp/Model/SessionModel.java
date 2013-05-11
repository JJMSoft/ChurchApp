/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Model;

import com.DesktopApp.DAOImpl.UserDAOImpl;
import com.DesktopApp.Entity.User;

/**
 *
 * @author Jonathan
 */
public class SessionModel {
    
    public static User validateUser(String user, String password){
        return new UserDAOImpl().getSessionUser(user, password);
    }
    
}
