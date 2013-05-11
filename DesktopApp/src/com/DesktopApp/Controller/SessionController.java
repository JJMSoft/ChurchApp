/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Controller;

import com.DesktopApp.Entity.User;
import com.DesktopApp.Model.SessionModel;
import com.DesktopApp.ConstantUtils.SessionUtil;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Jonathan
 */
public class SessionController {

    private static User user = null;
    private static boolean connect = false;

    public static boolean beginSession(String userName, String password) throws NoSuchAlgorithmException {
        boolean condition = false;

        if (getUser() == null) {
            String passwordEncripted = SessionUtil.getMD5(password);
            User userActive = SessionModel.validateUser(userName, password);

            if (userActive != null) {
                condition = true;
                setUser(userActive);
                setConnect(condition);
            }
        }

        return condition;
    }

    private static void setUser(User puser) {
        user = puser;
    }

    private static void setConnect(boolean pconnect) {
        connect = pconnect;
    }

    /**
     * @return the user
     */
    public static User getUser() {
        return user;
    }

    /**
     * @return the connect
     */
    public static boolean getConnect() {
        return connect;
    }
}
