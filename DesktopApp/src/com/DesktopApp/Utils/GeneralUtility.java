/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Utils;

import com.DesktopApp.ConstantUtils.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Jonathan
 */
public class GeneralUtility {

    /**
     * Creates a temporary file in /images folder from the given data. Using the
     * name and the extension.
     *
     * @param data The <code>byte[]</code> array that contains the data to be
     * stored.
     * @param name The name for the new temporary file.
     * @param extension The extension for the new temporary file.
     */
    public static File createTemporaryFile(String name, String extension, String directory) {
        File file = null;

        try {
            String baseDir = Constants.DIR + System.getProperty("file.separator") + directory;
            // Create the file where data will be written
            File dir = new File(baseDir);
            if (!dir.exists()) {
                dir.mkdir();
            }
            file = new File(baseDir + System.getProperty("file.separator") + name + "." + extension);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return file;
    }
}
