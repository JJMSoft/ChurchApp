/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.DAOImpl;

import com.DesktopApp.DAO.UserDAO;
import com.DesktopApp.Entity.User;
import com.DesktopApp.Herency.GeneralDAO;
import com.DesktopApp.Utils.GeneralUtility;
import java.io.Serializable;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author Jonathan
 */
public class UserDAOImpl extends GeneralDAO implements UserDAO, Serializable {

    public User getSessionUser(String userName, String password) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT u FROM User u WHERE u.userName = :userName ");
        sql.append("AND u.password = :password");

        try {
            TypedQuery<User> query = getEntityManger().createQuery(sql.toString(), User.class).
                    setParameter("userName", userName).
                    setParameter("password", password);

            return query.getSingleResult();
        } catch (Exception e) {
            GeneralUtility.displayErrorMessage(e.getMessage());
            return null;
        }
    }

    public List<User> getUserByName(String name) {

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT u FROM User u WHERE u.name = :name ");

        try {

            TypedQuery<User> query = getEntityManger().createQuery(sql.toString(), User.class).
                    setParameter("name", name);

            return query.getResultList();
        } catch (Exception e) {
            GeneralUtility.displayErrorMessage(e.getMessage());
            return null;
        }

    }

    public User getUserById(Integer id) {

        try {
            return getEntityManger().find(User.class, id);
        } catch (Exception e) {
            GeneralUtility.displayErrorMessage(e.getMessage());
            return null;
        }
    }

    public List<User> getAllUser() {
        try {
            return getEntityManger().createQuery("SELECT au FROM User u", User.class).getResultList();

        } catch (Exception e) {
            GeneralUtility.displayErrorMessage(e.getMessage());
            return null;
        }
    }

    public void save(User user) {
        try {
            getEntityManger().merge(user);
        } catch (Exception e) {
            GeneralUtility.displayErrorMessage(e.getMessage());

        }
    }
}
