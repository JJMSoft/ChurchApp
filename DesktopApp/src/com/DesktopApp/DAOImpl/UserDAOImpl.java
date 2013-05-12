/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.DAOImpl;

import com.DesktopApp.DAO.UserDAO;
import com.DesktopApp.Entity.User;
import com.DesktopApp.Herency.GeneralDAO;
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
        sql.append("SELECT u FROM User u WHERE u.userName = :userNamed ");
        sql.append("AND u.password = :passwordd");

        try {
            TypedQuery<User> query = getEntityManger().createQuery(sql.toString(), User.class).
                    setParameter("userNamed", userName).
                    setParameter("passwordd", password);

            return query.getSingleResult();
        } catch (Exception e) {
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
            return null;
        }

    }

    public User getUserById(Integer id) {

        try {
            return getEntityManger().find(User.class, id);
        } catch (Exception e) {
            return null;
        }
    }
}
