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
        return UserModel.getAllUser();
    }

    public static User getUserById(Integer id) {
        return UserModel.getUserById(id);
    }

    public static void saveUser(String name, String firstName, String lastName, String email, String phone, String cellphone) {
        User user = new User(name, firstName, lastName, email, phone, cellphone);
        UserModel.save(user);
    }
}
