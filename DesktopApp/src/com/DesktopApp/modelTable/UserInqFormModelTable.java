/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.modelTable;

import com.DesktopApp.Entity.User;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author Jonathan
 */
public class UserInqFormModelTable {

    private static DefaultTableModel model = null;
    private static JTable table = null;

    public UserInqFormModelTable(JTable table) {
        this.table = table;
        setTableModel();
        hideColumn();
    }

    public static Vector<String> getHeader() {
        Vector<String> tableHeader = new Vector<String>();
        tableHeader.add("ID");
        tableHeader.add("Nombre");
        tableHeader.add("Primer Apellido");
        tableHeader.add("Segundo Apellido");
        tableHeader.add("Correo Electrónico");
        tableHeader.add("Teléfono Casa");
        tableHeader.add("Celular");
        //hideColumn();
        return tableHeader;
    }

    private static void setHeaderSizes(JTable table) {
        table.getColumnModel().getColumn(0).setPreferredWidth(0);
        table.getColumnModel().getColumn(1).setPreferredWidth(50);
        table.getColumnModel().getColumn(2).setPreferredWidth(50);
        table.getColumnModel().getColumn(3).setPreferredWidth(50);
        table.getColumnModel().getColumn(4).setPreferredWidth(50);
        table.getColumnModel().getColumn(5).setPreferredWidth(50);
    }

    private static void hideColumn() {
        TableColumn col = table.getColumnModel().getColumn(0);
        col.setMaxWidth(0);
        col.setMinWidth(0);
        col.setPreferredWidth(0);
    }

    public static void setTableModel() {

        model = new DefaultTableModel(null, getHeader());
        table.setModel(model);
        setHeaderSizes(table);
    }

    public static TableModel getModel() {
        return model;
    }

    public static TableModel setTable(JTable table, List<User> userList) {
        if (userList.size() > 0) {
            for (Object o : userList) {
                User user = (User) o;
                Vector<Object> oneRow = new Vector<Object>();
                oneRow.add(user.getIdUser());
                oneRow.add(user.getName());
                oneRow.add(user.getFirstName());
                oneRow.add(user.getLastName());
                oneRow.add(user.getEmail());
                oneRow.add(user.getPhone());
                oneRow.add(user.getCellPhone());
                model.addRow(oneRow);
            }
        }
        return model;
    }
}
