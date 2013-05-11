/*
 * RLMBaseJFrame_1.java
 *
 * Created on October 3, 2006, 12:36 PM
 */

import com.DesktopApp.Utils.SwingWorkers;
import static java.awt.Color.*;
import com.itgp.mvc.DPanel;
import com.itgp.mvc.RViewSimple;
import com.itgp.mvc.Utility;
import com.itgp.mvc.view.RTable;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 * ---------------------- Modification History ---------------------- RA : April
 * 17, 2007 - Added setComponentsToolTipText method it will be used to put
 * default tooltip text over the components. - Added methods to default the
 * company. RA : April 27, 2007 - Updated size of the instructions label.
 *
 * MG : Dec 11, 2007 -Added setSecundaryTitle() method. -Added
 * setInstructionTitle() method.
 *
 */
/**
 * @author rlynn
 */
public class RLMBaseJDialog extends javax.swing.JDialog {

    private static final long serialVersionUID = 8204001776423916608L;
    protected boolean updating = false;
    protected CloseWindowListener closeListener;
    private Frame parent;
    /**
     * Variable used in inquiry form to check if the form was updated and then
     * reload data from database.
     */
    private boolean recordUpdated = false;

    /**
     * Creates new form RLMBaseJFrame_1
     */
    public RLMBaseJDialog(java.awt.Frame parent, boolean modal, String title, String instructions) {
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIcon1 = new javax.swing.JLabel();
        infoPanel1 = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        westBottomPanel = new javax.swing.JPanel();
        lblMode = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        centerBottomPanel = new javax.swing.JPanel();
        actionsPanel = new javax.swing.JPanel();
        lblForm = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblClassName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnPrintScreen = new javax.swing.JButton();
        btnSecurity = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        lblIcon1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cypresscreek/resources/images/wizard-logo.gif"))); // NOI18N
        jPanel1.add(lblIcon1, java.awt.BorderLayout.EAST);

        infoPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 8, 1, 1));
        infoPanel1.setOpaque(false);
        infoPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(infoPanel1, java.awt.BorderLayout.CENTER);

        lblTitle2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(0, 0, 204));
        lblTitle2.setText("Title");
        jPanel1.add(lblTitle2, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        bottomPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bottomPanel.setLayout(new java.awt.BorderLayout());

        westBottomPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 3));
        westBottomPanel.add(lblMode);

        progressBar.setPreferredSize(new java.awt.Dimension(50, 18));
        westBottomPanel.add(progressBar);

        bottomPanel.add(westBottomPanel, java.awt.BorderLayout.WEST);

        centerBottomPanel.setLayout(new java.awt.BorderLayout());

        actionsPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 3, 0));

        lblForm.setToolTipText("Display the current Forms");
        actionsPanel.add(lblForm);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(2, 20));
        actionsPanel.add(jSeparator1);

        lblClassName.setToolTipText("Class Name");
        lblClassName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClassNameMouseClicked(evt);
            }
        });
        actionsPanel.add(lblClassName);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(2, 20));
        actionsPanel.add(jSeparator2);

        btnPrintScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cypresscreek/resources/images/print.gif"))); // NOI18N
        btnPrintScreen.setToolTipText("Print a Screen Shot");
        btnPrintScreen.setContentAreaFilled(false);
        btnPrintScreen.setPreferredSize(new java.awt.Dimension(25, 25));
        btnPrintScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintScreenActionPerformed(evt);
            }
        });
        actionsPanel.add(btnPrintScreen);

        btnSecurity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cypresscreek/resources/images/lock.png"))); // NOI18N
        btnSecurity.setToolTipText("Add Security to this form");
        btnSecurity.setContentAreaFilled(false);
        btnSecurity.setEnabled(false);
        btnSecurity.setName("btnSecurity"); // NOI18N
        btnSecurity.setPreferredSize(new java.awt.Dimension(25, 25));
        btnSecurity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecurityActionPerformed(evt);
            }
        });
        actionsPanel.add(btnSecurity);
        btnSecurity.getAccessibleContext().setAccessibleName("btnSecurity");

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cypresscreek/resources/images/about.gif"))); // NOI18N
        btnHelp.setToolTipText("Help");
        btnHelp.setContentAreaFilled(false);
        btnHelp.setPreferredSize(new java.awt.Dimension(25, 25));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        actionsPanel.add(btnHelp);

        centerBottomPanel.add(actionsPanel, java.awt.BorderLayout.CENTER);

        bottomPanel.add(centerBottomPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(bottomPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblClassNameMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            StringSelection className = new StringSelection(lblClassName.getText().trim());

            Clipboard clbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clbrd.setContents(className, className);
        }
    }

	private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
	}//GEN-LAST:event_btnHelpActionPerformed

    private void btnSecurityActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnPrintScreenActionPerformed(java.awt.event.ActionEvent evt) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RLMBaseJDialog(new javax.swing.JFrame(), true, "", "").setVisible(true);
            }
        });
    }

    protected void setTitleInstruction(String title) {
        //lblTitle.setText(title);
    }

    protected void setInstructions(String instructions) {
    }

    public String getMode() {
        return lblMode.getText().trim();
    }

    public void setMode(String mode) {
        this.lblMode.setText(mode.trim());
        this.repaint();
    }

    public void doClose() {
        System.out.println("Closing...");
    }

    /**
     * This method is used like template to get the default company control of
     * each form. Every form should implement this method if wants be defaulted
     * by the company number.
     */
    protected RViewSimple getCompanyControl() {
        return null;
    }

    /**
     * This method adds tooltipText to components RTextField, RComboBox,
     * RCheckBox and RTextArea
     */
    public void setComponentsToolTipText(DPanel dPanel) {
        Map hm = dPanel.getControlMap();
        Iterator it = hm.entrySet().iterator();
        JComponent comp = null;
        RViewSimple rComponent = null;
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            Object value = e.getValue();
            String toolTipText = "";
            if (value instanceof RViewSimple) {
                rComponent = (RViewSimple) value;
                comp = (JComponent) rComponent;

                if (comp.getToolTipText() != null) {
                    toolTipText = "<HTML>" + "<BODY>" + "<p>" + comp.getToolTipText() + "<p>" + rComponent.getColumnName() + "</BODY>" + "</HTML>";
                } else {
                    toolTipText = rComponent.getColumnName();
                }
                comp.setToolTipText(toolTipText);
            }
        }
    }

    /**
     * Exposes the status bar so it can be updated from other components.
     *
     * @return status bar.
     */
    //	public final javax.swing.JProgressBar getProgressBar() {
    //		return progressBar;
    //	}
    public final void setIndeterminateProgressBar(boolean indeterminate) {
        progressBar.setIndeterminate(indeterminate);

        if (indeterminate) {
            westBottomPanel.add(progressBar);
        } else {
            westBottomPanel.remove(progressBar);
        }

        this.repaint();
    }

    /**
     * This method prints the window of the maintenance
     *
     * @param table(it is inquiry grid)
     * @param message(it is a delay message)
     *
     */
    protected void doPrint(RTable table, String message) {
        try {
            if (table.getRowCount() > 0) {
                table.print(JTable.PrintMode.FIT_WIDTH, new MessageFormat(message), new MessageFormat("Page {0,number}"));
            }
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Accessor to the recordUpdated property.
     *
     * @return Returns recordUpdated property value.
     */
    public boolean isRecordUpdated() {
        return recordUpdated;
    }

    /**
     * Setter for the recordUpdated property.
     *
     * @param recordUpdated The new state to set.
     */
    protected void setRecordUpdated(boolean recordUpdated) {
        this.recordUpdated = recordUpdated;
    }

    /**
     * Setter the secundary title displayed in the dialog.
     *
     * @param title
     */
    protected void setSecundaryTitle(String title) {
        //this.lblTitle.setText(title);
    }

    /**
     * Setter the instruction title displayed in the dialog.
     *
     * @param instructions
     */
    protected void setInstructionTitle(String instructions) {
       // this.lblTestSystem.setText(instructions);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionsPanel;
    private javax.swing.JPanel bottomPanel;
    protected javax.swing.JButton btnHelp;
    protected javax.swing.JButton btnPrintScreen;
    protected javax.swing.JButton btnSecurity;
    private javax.swing.JPanel centerBottomPanel;
    private javax.swing.JPanel infoPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblClassName;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblIcon1;
    protected javax.swing.JLabel lblMode;
    protected javax.swing.JLabel lblTitle2;
    protected javax.swing.JProgressBar progressBar;
    private javax.swing.JPanel westBottomPanel;
    // End of variables declaration//GEN-END:variables

    /**
     * Implement the logic to call to any report.
     */
    protected void doExecuteReport() {
    }

    /**
     * Implement logic to do validations after close the report.
     */
    protected void doFinalValidations() {
    }

    /**
     * Display any report.
     *
     * @param printButton
     * @param reportTitle
     */
    protected void showReport(final javax.swing.JButton printButton, String reportTitle) {
        printButton.setEnabled(false);
        setIndeterminateProgressBar(true);
        setMode("Printing " + reportTitle + "...");
        new SwingWorkers() {
            public Object construct() {
                doExecuteReport();
                return null;
            }

            public void finished() {
                printButton.setEnabled(true);
                setMode("Done!");
                setIndeterminateProgressBar(false);
                doFinalValidations();
            }
        }.start();
    }

    public void dispose() {
        super.dispose();
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }

    private void lblClassNameClicked(java.awt.event.MouseEvent evt, String className, String title) {
    }

    /**
     * Close window listener.
     *
     * @author raguero
     */
    class CloseWindowListener extends WindowAdapter {

        /**
         * Event to use when closing a window.
         *
         * @see
         * java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
         */
        public void windowClosing(WindowEvent e) {
            doClose();
        }
    }
}
