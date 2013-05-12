/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Controller;

import com.DesktopApp.ConstantUtils.WindowsManager;
import com.DesktopApp.Factory.FactoryLookAndFeel;
import com.DesktopApp.Model.UserModel;
import com.DesktopApp.Model.UtilModel;
import com.DesktopApp.form.i_l.LookAndFeelForm;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Jonathan
 */
public class UtilController {

    public static LookAndFeel getLookAndFeel(String idUser) {
        try {
            return FactoryLookAndFeel.getLookAndFeel(new UtilModel().getLookAndFeel(idUser));
        } catch (ParseException ex) {
            Logger.getLogger(UtilController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
}
