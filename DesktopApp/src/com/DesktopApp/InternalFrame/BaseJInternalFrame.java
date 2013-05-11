package com.DesktopApp.InternalFrame;

import com.DesktopApp.Utils.SwingWorkers;
import com.itgp.mvc.DSetErrorListener;
import com.itgp.mvc.Utility;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.FocusEvent;
import java.io.Closeable;
import javax.swing.*;

/**
 * @author Jonathan
 */
public class BaseJInternalFrame extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 7534017695088382125L;
    private boolean bExitVM = false; // By default, no not close the Java virtual machine (unless called started main method)
    protected boolean updating = false;
    private JFrame parent;

    /**
     * Creates new form RLMBaseJInternalFrame
     */
    public BaseJInternalFrame(String title, String instructions) {
        super(title, true, true, true, true);
        initComponents();
        lblTitle.setText(title);
        lblInstructions.setText(instructions);
        lblClassName.setText(getClass().getSimpleName());
        westBottomPanel.remove(progressBar);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblInstructions = new javax.swing.JLabel();
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

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        topPanel.setBackground(new java.awt.Color(255, 255, 255));
        topPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        topPanel.setPreferredSize(new java.awt.Dimension(100, 80));
        topPanel.setLayout(new java.awt.BorderLayout());

        infoPanel.setOpaque(false);
        infoPanel.setLayout(new java.awt.BorderLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblTitle.setText("Title");
        infoPanel.add(lblTitle, java.awt.BorderLayout.NORTH);

        lblInstructions.setText("Instructions");
        infoPanel.add(lblInstructions, java.awt.BorderLayout.CENTER);

        topPanel.add(infoPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(topPanel, java.awt.BorderLayout.NORTH);

        bottomPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bottomPanel.setLayout(new java.awt.BorderLayout());

        westBottomPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 3));
        westBottomPanel.add(lblMode);

        progressBar.setPreferredSize(new java.awt.Dimension(50, 18));
        westBottomPanel.add(progressBar);

        bottomPanel.add(westBottomPanel, java.awt.BorderLayout.WEST);

        centerBottomPanel.setLayout(new java.awt.BorderLayout());

        actionsPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 3, 0));

        lblForm.setForeground(new java.awt.Color(41, 40, 40));
        lblForm.setToolTipText("Display the current Forms");
        actionsPanel.add(lblForm);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(2, 20));
        actionsPanel.add(jSeparator1);

        lblClassName.setForeground(new java.awt.Color(41, 40, 40));
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

        centerBottomPanel.add(actionsPanel, java.awt.BorderLayout.CENTER);

        bottomPanel.add(centerBottomPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(bottomPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        System.err.println("CLOSED");
        this.dispose();
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        System.err.println("CLOSING");
        this.dispose();
    }//GEN-LAST:event_formInternalFrameClosing

    private void lblClassNameMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            StringSelection className = new StringSelection(lblClassName.getText().trim());

            Clipboard clbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clbrd.setContents(className, className);
        }
    }

    /**
     * This method is used like template to get the default company control of
     * each form. Every form should implement this method if wants be defaulted
     * by the company number.
     */
    /**
     * This method is used to set the company number into the company control.
     * The company number comes from the preferences. If the company number
     * doesn't exists in preferences the value "" will be setted to the control.
     */
    /**
     * This method returns the default content pane for the visual form. The
     * implementation returns the correct content pane depending on whether the
     * method is called from this class or from an extending template.
     *
     * @return The correct content pane
     */
    public Container getContentPane() {
        return super.getContentPane();
    }

    /**
     * This method adds tooltipText to components RTextField, RComboBox,
     * RCheckBox and RTextArea
     */
    /**
     * Overloads super.setTitle() because in this example we would like to set
     * the same title in the decoration panel as in the top of the frame
     *
     * @param title Title of the form
     *
     *
     * /**
     * Setter the instruction title displayed in the dialog.
     *
     * @param instructions
     */
    protected void setInstructionTitle(String instructions) {
        this.lblInstructions.setText(instructions);
    }

    /**
     * Setter the secundary title displayed in the dialog.
     *
     * @param title
     */
    protected void setSecundaryTitle(String title) {
        this.lblTitle.setText(title);
    }

    /**
     * Exit the Application
     */
    /**
     * This method will be called whenever an error is logged by XTT.
     *
     * @param e error event
     */
    public boolean isExitVM() {
        return bExitVM;
    }

    public void setExitVM(boolean bExitVM) {
        this.bExitVM = bExitVM;
    }

    public String getMode() {
        return lblMode.getText().trim();
    }

    public void setMode(String mode) {
        this.lblMode.setText(mode.trim());
        this.repaint();
    }

    /**
     * Exposes the status bar so it can be updated from other components.
     *
     * @return status bar.
     */
    public final javax.swing.JProgressBar getProgressBar() {
        return progressBar;
    }

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
     * Accesor to the frame.
     *
     * @return Return the frame which is the parent of this internal frame.
     */
    public JFrame getFrame() {
        return parent;
    }

    /**
     * Set the frame.
     *
     * @param parent the frame that is the parent of this internal frame.
     */
    public void setFrame(JFrame parent) {
        if (parent == null) {
            throw new NullPointerException("The parent cannot be null");
        }
        this.parent = parent;
    }

    public void search(JButton jbutton, JTable jtable) {
        //    cleanTable(jtable);
        setMode("Loading data, please wait...");
        setIndeterminateProgressBar(true);
        jbutton.setEnabled(false);

        new SwingWorkers() {
            public Object construct() {
                doPopulateInquiry();
                return null;
            }

            public void finished() {
                setIndeterminateProgressBar(false);
                setMode("");
            }
        }.start();
        jbutton.setEnabled(true);
    }

    public void search(JButton jbutton) {
        setMode("Loading data, please wait...");
        setIndeterminateProgressBar(true);
        jbutton.setEnabled(false);

        new SwingWorkers() {
            public Object construct() {
                doPopulateInquiry();
                return null;
            }

            public void finished() {
                setIndeterminateProgressBar(false);
                setMode("");
            }
        }.start();
        jbutton.setEnabled(true);
    }

    public void doPopulateInquiry() {
    }

    public void doDefaultCloseAction() {

        boolean saveExistingChanges = true; // assume that the existing changes will be saved
        Component lastComponent = this.getMostRecentFocusOwner();
        if (lastComponent != null) {
            //
            // workaround Java bug - no verifier and/or focus lost is issued when x is pressed to close window
            //

            if (lastComponent instanceof JComponent) {
                InputVerifier iv = ((JComponent) lastComponent).getInputVerifier();
                if (iv != null) {
                    saveExistingChanges = iv.shouldYieldFocus((JComponent) lastComponent); // save changes only if validation succeeds

                }
            }

            if (saveExistingChanges) {
                // only trigger a lost focus if the verifier succeeded

                FocusEvent focusEvent = new FocusEvent(lastComponent, FocusEvent.FOCUS_LOST, false, this);
                lastComponent.dispatchEvent(focusEvent); // dispatch a focus lost event on the last focused component
            } else {
                boolean discardChanges = Utility.checkDiscardAllChanges(this);
                if (!discardChanges) {
                    return; // don't discard the changes (therefore don't save, don't close, simply return)
                }
            }
        }
        if (Utility.closeForm(this, false, saveExistingChanges)) { // release any locks and remove form from open form list
            try {
                this.dispose();

            } catch (Exception e) {
            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionsPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel centerBottomPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblClassName;
    private javax.swing.JLabel lblForm;
    protected javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblMode;
    protected javax.swing.JLabel lblTitle;
    private javax.swing.JProgressBar progressBar;
    protected javax.swing.JPanel topPanel;
    private javax.swing.JPanel westBottomPanel;
    // End of variables declaration//GEN-END:variables
}
