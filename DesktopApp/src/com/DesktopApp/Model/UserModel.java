/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Model;

import com.DesktopApp.DAOImpl.UserDAOImpl;
import com.DesktopApp.Entity.User;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class UserModel {

    public static List<User> getUserByName(String name) {
        return new UserDAOImpl().getUserByName(name);
    }

    public static User getUserById(Integer id) {
        return new UserDAOImpl().getUserById(id);
    }

    public static List<User> getAllUser() {
        return new UserDAOImpl().getAllUser();
    }

    public static void save(User user) {
        new UserDAOImpl().save(user);
    }
}
