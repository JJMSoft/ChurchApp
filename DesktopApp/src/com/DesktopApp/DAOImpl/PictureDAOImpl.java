/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.DAOImpl;

import com.DesktopApp.DAO.PictureDAO;
import com.DesktopApp.Entity.Picture;
import com.DesktopApp.Herency.GeneralDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Jonathan
 */
public class PictureDAOImpl extends GeneralDAO implements PictureDAO {

    public boolean save(Picture picture) {
        boolean result = true;
        EntityManager manager = getEntityManger();
        EntityTransaction transaction = null;
        try {
            transaction = manager.getTransaction();
            transaction.begin();
            manager.merge(picture);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace(System.out);
            result = false;
        } finally {
            manager.close();
        }
        return result;

    }

    public List<Picture> findAll() {
        return getEntityManger().createQuery("SELECT p FROM Picture p").getResultList();
    }

    public Picture findById() {
        return getEntityManger().find(Picture.class, 1);
    }

    public boolean delete(Integer id) {
        boolean result = true;
        EntityManager manager = getEntityManger();
        EntityTransaction transaction = null;
        try {
            transaction = manager.getTransaction();
            transaction.begin();
            Picture picture = manager.find(Picture.class, id);
            manager.remove(picture);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace(System.out);
            result = false;
        } finally {
            manager.close();
        }
        return result;
    }
}
