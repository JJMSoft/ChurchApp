package com.DesktopApp.ConstantUtils;

import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jonathan
 */
public class WindowsManager {

    private static JFrame frame;

    public static void set(JFrame pframe) {
        frame = pframe;
    }
    
    public static JFrame get(){
        return frame;
    }
}
