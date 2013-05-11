/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.modelTable;


import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Jonathan
 */
public class TableGrid {

    private static Vector<String> tableHeader = new Vector<String>();
    private static Vector tableData;
    private static DefaultTableModel model;
    private static JTable table;

    public static void addColumn(String value) {
        tableHeader.add(value);
    }
}
