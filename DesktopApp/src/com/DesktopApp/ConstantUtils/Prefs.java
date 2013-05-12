/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.ConstantUtils;

import com.DesktopApp.Utils.PropertiesUtil;
import java.util.HashMap;
import java.util.prefs.Preferences;

/**
 *
 * @author Jonathan
 */
public class Prefs {

    private static final Preferences INSTANCE = Preferences.systemRoot();
    private static HashMap<String, String> map = new HashMap<>();
    /**
     * Preferences prefix.
     */
    public static final String PREFIX = "bw/";

    public static String get(String key, String def) {
        String temp = map.get(key);
        if (temp == null || temp.equals("")) {
            PropertiesUtil.openFile("prefs");
            temp = PropertiesUtil.getValue(key);
            if (temp == null || temp.equals("")) {
                temp = def;
            }
        }
        return temp;
    }

    /**
     * Set a property.
     *
     * @param key The key.
     * @param value The value.
     */
    public static void put(String key, String value) {

        map.put(key, value);
        PropertiesUtil.openFile("prefs");
        PropertiesUtil.addValue(key, value);
        PropertiesUtil.store();

    }

    /**
     * Get a property.
     *
     * @param key The key of the property to get.
     * @param def A default value returned in case the key doesn't exists.
     * @return The value of the property key.
     */
    public static String getFromRegistry(String key, String def) {
        String value = map.get(key);
        if (value == null || value.equals("")) {
            value = INSTANCE.get(PREFIX + key, def);
            if (value == null || value.equals("")) {
                PropertiesUtil.openFile("prefs");
                value = PropertiesUtil.getValue(key);
                if (value == null || value.equals("")) {
                    value = def;
                }
            }
        }
        //put(PREFIX + key, value);
        return value;
    }
}
