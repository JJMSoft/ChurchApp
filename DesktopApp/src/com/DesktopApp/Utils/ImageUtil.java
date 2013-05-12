/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Utils;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Jonathan
 */
public class ImageUtil {

    public static String getScreenshoot() {
        String path = "";

        try {
            Robot robot = new Robot();
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage image = robot.createScreenCapture(screenRect);
            File file = new File("PrintScreen.jpg");
            ImageIO.write(image, "jpg", file);
            path = file.getPath();
            file.deleteOnExit();
        } catch (IOException | AWTException e) {
            e.printStackTrace();
        }

        return path;
    }
}
