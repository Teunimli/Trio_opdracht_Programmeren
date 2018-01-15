package gui;

import Domain.Account;
import Repository.AccountRepository;
import javafx.scene.control.ComboBox;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class TableClickEvent implements MouseListener {
    private Inlogscherm inlog;
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
    private JComboBox comboBox_6;
    private JButton button;
    private JPasswordField passwordField;
    private JComboBox comboBoxselect;
    private JComboBox comboBox_1;
    private ArrayList<Account> accounts;
    private ArrayList<String> accountNames;
    AccountRepository accountRepository;

    public TableClickEvent(Inlogscherm inlog,JTable table,JComboBox comboBoxselect,JTextField textField, JTextField textField_1, JTextField textField_2, JTextField textField_3, JTextField textField_4, JTextField textField_5, JTextField textField_6, JTextField textField_7, JTextField textField_8, JPasswordField passwordField ,JComboBox comboBox1, JComboBox comboBox2,JComboBox comboBox3,JComboBox comboBox4, JButton button)
    {
        this.inlog = inlog;
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
        this.comboBox_6 = comboBox1;
        this.button = button;
        accounts = new ArrayList<>();
        accountNames = new ArrayList<>();
        accountRepository = new AccountRepository();
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
            passwordField.setText(table.getModel().getValueAt(row,2).toString());
            textField_4.setText(table.getModel().getValueAt(row,1).toString());
            textField_5.setText(table.getModel().getValueAt(row,6).toString());
            textField_6.setText(table.getModel().getValueAt(row,7).toString());
            textField_7.setText(table.getModel().getValueAt(row,8).toString());
            textField_8.setText(table.getModel().getValueAt(row,9).toString());


            UpdateActionListener updateActionListener = new UpdateActionListener(textField_4, textField, textField_1, textField_2, textField_5, textField_6, textField_7,textField_8, passwordField, "Account");
            button.addActionListener(updateActionListener);
        }
        else if (comboBoxselect.getSelectedItem() == "Profiel"){
            int row = table.getSelectedRow();
            TableModel model = table.getModel();

            textField_3.setText(table.getModel().getValueAt(row,2).toString());
            textField.setText(table.getModel().getValueAt(row,3).toString());

            UpdateActionListener updateActionListener = new UpdateActionListener(textField_3 , textField, textField_1,  textField_2, textField_5, textField_6, textField_7,textField_8, passwordField, "Profiel");
            button.addActionListener(updateActionListener);


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
