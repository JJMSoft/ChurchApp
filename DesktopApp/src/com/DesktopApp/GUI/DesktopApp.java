/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.GUI;

import com.DesktopApp.form.i_l.LoginForm_1;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
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
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new WindowsLookAndFeel());
        LoginForm_1 login = new LoginForm_1();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
}