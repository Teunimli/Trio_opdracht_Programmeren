package gui;

import javafx.scene.control.ComboBox;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TableClickEvent implements MouseListener {
    private JTable table;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JPasswordField passwordField;
    private JComboBox comboBoxselect;
    private JComboBox comboBox_1;

    public TableClickEvent(JTable table,JComboBox comboBoxselect,JTextField textField, JTextField textField_1, JTextField textField_2, JTextField textField_3, JTextField textField_4, JTextField textField_5, JTextField textField_6, JTextField textField_7, JTextField textField_8, JPasswordField passwordField ,JComboBox comboBox1, JComboBox comboBox2,JComboBox comboBox3,JComboBox comboBox4)
    {
        this.table = table;
        this.comboBoxselect = comboBoxselect;
        this.textField = textField_5;
        this.passwordField = passwordField;
        this.textField_1 = textField_6;
        this.textField_2 = textField_7;
        this.textField_3 = textField_8;
        this.textField_4 = textField_4;
        this.textField_5 = textField_3;
        this.textField_6 = textField_2;
        this.textField_7 = textField_1;
        this.textField_8 = textField;

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if (comboBoxselect.getSelectedItem() == "Account")
        {
            int row = table.getSelectedRow();
            TableModel model = table.getModel();
            textField.setText(table.getModel().getValueAt(row,3).toString());
            textField_1.setText(table.getModel().getValueAt(row,4).toString());
            textField_2.setText(table.getModel().getValueAt(row,5).toString());
            textField_3.setText(table.getModel().getValueAt(row,2).toString());
            textField_4.setText(table.getModel().getValueAt(row,1).toString());
            textField_5.setText(table.getModel().getValueAt(row,6).toString());
            textField_6.setText(table.getModel().getValueAt(row,7).toString());
            textField_7.setText(table.getModel().getValueAt(row,8).toString());
            textField_8.setText(table.getModel().getValueAt(row,9).toString());
        }
        else if (comboBoxselect.getSelectedItem() == "Profiel"){
//            int row = table.getSelectedRow();
//            TableModel model = table.getModel();
//            textField_3.setText(table.getModel().getValueAt(row,2).toString());
//            textField.setText(table.getModel().getValueAt(row,3).toString());
        }
        else if (comboBoxselect.getSelectedItem() == "Programma"){

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
