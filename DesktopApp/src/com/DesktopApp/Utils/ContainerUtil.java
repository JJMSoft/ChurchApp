/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Utils;

import com.DesktopApp.ConstantUtils.WindowsManager;
import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author Jonathan
 */
public class ContainerUtil {

    public static void setDefaultValues(JInternalFrame jInternalFrame) {
        JFrame jframe = WindowsManager.get();
        Dimension desktopSize = jframe.getSize();
        Dimension jInternalFrameSize = jInternalFrame.getSize();
        jInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
        jInternalFrame.setVisible(true);
        jframe.add(jInternalFrame);
    }

    public static void setDefaultValues(JDialog jDialog) {
        JFrame jframe = WindowsManager.get();
        Dimension desktopSize = jframe.getSize();
        Dimension jInternalFrameSize = jDialog.getSize();
        jDialog.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
        jDialog.setVisible(true);
    }
}
