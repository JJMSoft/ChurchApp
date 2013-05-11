/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Herency;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jonathan
 */
public class GeneralDAO {

    @PersistenceContext
    private EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("DesktopAppPU");

    public EntityManager getEntityManger() {
        return entityFactory.createEntityManager();
    }
}
