/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Controller;

import com.DesktopApp.Entity.User;
import com.DesktopApp.Model.UserModel;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class UserController {

    public static List<User> getUserByName(String name) {
        return UserModel.getUserByName(name);
    }

    public static List<User> getAllUser() {
        return null;
    }

    public static User getUserById(Integer id) {
        return UserModel.getUserById(id);
    }
}
