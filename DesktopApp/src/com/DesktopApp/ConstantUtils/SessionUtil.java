package com.DesktopApp.ConstantUtils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Jonathan
 */
public class SessionUtil {

    public static String getMD5(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] b = md.digest(password.getBytes());

        int size = b.length;
        StringBuilder h = new StringBuilder(size);
        for (int i = 0; i < size; i++) {

            int u = b[i] & 255;

            if (u < 16) {
                h.append("0").append(Integer.toHexString(u));
            } else {
                h.append(Integer.toHexString(u));
            }
        }
        return h.toString();
    }
}
