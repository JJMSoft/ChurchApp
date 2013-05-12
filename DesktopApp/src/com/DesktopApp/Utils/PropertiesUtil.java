/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Jonathan
 */
public class PropertiesUtil {

    public static Properties prop = null;
    public static String extension = "properties";
    public static String fileName = "";
    public static String path = "";

    public static boolean openFile(String pfileName) {
        prop = new Properties();
        fileName = pfileName;
        InputStream is = null;
        File file = null;
        try {
            file = GeneralUtility.createTemporaryFile(fileName, "properties", "properties");
            if (file == null) {
                return false;
            }
            is = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            return false;
        }

        if (is != null) {
            try {
                path = file.getAbsolutePath();
                prop.load(is);

            } catch (IOException ex) {
                ex.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public static String getValue(String key) {
        if (prop == null) {
            prop = new Properties();
        }

        return prop.getProperty(key) == null ? "" : prop.getProperty(key);
    }

    public static void addValue(String key, String value) {
        if (prop == null) {
            prop = new Properties();
        }

        prop.setProperty(key, value);
    }

    public static boolean store() {
        OutputStream os;
        try {
            os = new FileOutputStream(new File(path));
            try {
                prop.store(os, fileName);
            } catch (IOException ex) {
                ex.printStackTrace();
                return false;
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }
}
