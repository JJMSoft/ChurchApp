/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Utils;

import com.DesktopApp.ConstantUtils.Constants;

/**
 * Thread Group method to place all threads created in the application.
 * ThreadGroup.
 *
 * @author damunoz
 */
public final class ThreadGroups extends java.lang.ThreadGroup {

    /**
     * Singleton class.
     */
    private static ThreadGroups threadGroup;

    /**
     * Method that initializes the thread groupd with a name.
     *
     * @param name The name of the Thread group.
     */
    private ThreadGroups(String name) {
        super(name);
    }

    /**
     * Method that return the thread groupd.
     *
     * @return The ThreadGroup.
     */
    public static ThreadGroup getInstance() {
        if (threadGroup == null) {
            return new ThreadGroup(Constants.THREADGROUP);
        }
        return threadGroup;
    }
}
