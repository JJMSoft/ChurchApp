/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Utils;

import com.DesktopApp.ConstantUtils.Constants;
import com.DesktopApp.ConstantUtils.WindowsManager;
import com.DesktopApp.form.e_h.ErrorForm;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

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
                dir.mkdirs();
            }
            file = new File(baseDir + System.getProperty("file.separator") + name + "." + extension);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }

        return file;
    }

    public static void displayErrorMessage(String error) {
        ErrorForm f = new ErrorForm(WindowsManager.get(), error);
        ContainerUtil.setDefaultValues(f);
    }

    public static void sendEmail(String error, String exceptionType) throws AddressException {

        Properties props = new Properties();

        // Nombre del host de correo, es smtp.gmail.com
        props.setProperty("mail.smtp.host", "smtp.gmail.com");

        // TLS si está disponible
        props.setProperty("mail.smtp.starttls.enable", "true");

        // Puerto de gmail para envio de correos
        props.setProperty("mail.smtp.port", "587");

        // Nombre del usuario
        props.setProperty("mail.smtp.user", "user");

        // Si requiere o no usuario y password para conectarse.
        props.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        session.setDebug(true);

        MimeMessage message = new MimeMessage(session);
        try {
            // Quien envia el correo
            // message.setFrom(new InternetAddress("asdasd@gmail.com"));
            // A quien va dirigido

            message.addRecipient(Message.RecipientType.TO, new InternetAddress("jonathanjm100@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("jonathanjm100@hotmail.com"));

            message.setSubject("ERROR");

            message.setText("Error<br>"
                    + "<b>Error Type: </b>" + exceptionType + "<br>"
                    + "<b>Error Description: </b>" + error + "<br>"
                    
                    
                    
                    
                    ,
                    "ISO-8859-1",
                    "html");

            Transport t = session.getTransport("smtp");
            t.connect(Constants.EMAIL, Constants.PASSWORD);
            t.sendMessage(message, message.getAllRecipients());
            t.close();
        } catch (MessagingException ex) {
            Logger.getLogger(GeneralUtility.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
