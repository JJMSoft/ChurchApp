/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.DAO;

import com.DesktopApp.Entity.User;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface UserDAO {

    public User getSessionUser(String userName, String password);

    public List<User> getUserByName(String name);

    public User getUserById(Integer id);

    public List<User> getAllUser();
    
    public void save(User user);
}
