/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.GUI;

import com.DesktopApp.ConstantUtils.Prefs;
import com.DesktopApp.Factory.FactoryLookAndFeel;
import com.DesktopApp.form.i_l.LoginForm_1;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.io.File;
import java.text.ParseException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Jonathan
 */
public class DesktopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ParseException {
        createDirectory();

        String value = Prefs.get("lookAndFeel", "");
        if (value.trim().length() > 0) {
            UIManager.setLookAndFeel(FactoryLookAndFeel.getLookAndFeel(value));
        } else {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        }

        LoginForm_1 login = new LoginForm_1();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    private static void createDirectory() {
        File files = new File("C:\\Directory2\\Sub2\\Sub-Sub2");
        if (files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Multiple directories are created!");
            } else {
                System.out.println("Failed to create multiple directories!");
            }
        }
    }
}
