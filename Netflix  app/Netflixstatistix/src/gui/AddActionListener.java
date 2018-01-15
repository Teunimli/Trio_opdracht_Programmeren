package gui;

import Domain.Account;
import Domain.Program;
import Domain.Profile;
import Repository.AccountRepository;
import Repository.MovieRepository;
import Repository.ProfileRepository;
import Repository.ProgramRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import static javax.swing.JOptionPane.showMessageDialog;

public class AddActionListener implements java.awt.event.ActionListener {

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
    private JComboBox comboBox;
    private JComboBox comboBox_1;
    private JComboBox comboBox_2;
    private JComboBox comboBox_3;
    private JComboBox comboBox_4;
    private JComboBox comboBox_10;
    AccountRepository accountRepository;
    ProfileRepository profileRepository;
    ProgramRepository programRepository;

    public AddActionListener(JTextField textField, JTextField textField_1, JTextField textField_2, JTextField textField_3, JTextField textField_4, JTextField textField_5, JTextField textField_6, JTextField textField_7, JTextField textField_8, JPasswordField passwordField ,JComboBox comboBox, JComboBox comboBox_1, JComboBox comboBox_2, JComboBox comboBox_3, JComboBox comboBox_4, JComboBox comboBox_10) {
        this.textField = textField;
        this.textField_1 = textField_1;
        this.textField_2 = textField_2;
        this.textField_3 = textField_3;
        this.textField_4 = textField_4;
        this.textField_5 = textField_5;
        this.textField_6 = textField_6;
        this.textField_7 = textField_7;
        this.textField_8 = textField_8;
        this.passwordField = passwordField;
        this.comboBox = comboBox;
        this.comboBox_1 = comboBox_1;
        this.comboBox_2 = comboBox_2;
        this.comboBox_3 = comboBox_3;
        this.comboBox_4 = comboBox_4;
        this.comboBox_10 = comboBox_10;
        accountRepository = new AccountRepository();
        profileRepository = new ProfileRepository();
        programRepository = new ProgramRepository();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(comboBox.getSelectedItem().equals("Account")) {

            int textfield_6 = Integer.parseInt(textField_6.getText());
            String passText = new String(passwordField.getPassword());
            accountRepository.create(new Account(textField.getText(), passText,  textField_2.getText(),  textField_3.getText(),  textField_4.getText(),  textField_5.getText(),  textfield_6,  textField_7.getText(), textField_8.getText(), 1));
        }
        else if (comboBox.getSelectedItem().equals("Profiel")) {
            int textfield_2 = Integer.parseInt(textField_2.getText());

            profileRepository.create(new Profile(comboBox_1.getSelectedItem().toString(),textField_1.getText(),  textfield_2));

        }
        else if (comboBox.getSelectedItem().equals("Programma")) {
            int textfield_3 = Integer.parseInt(textField_3.getText());

            if(comboBox_3.getSelectedItem() == null){
                programRepository.createMovie(new Program(comboBox_4.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString(), null, textfield_3));
            }else if(comboBox_2.getSelectedIndex() == -1){
                programRepository.createSerie(new Program(comboBox_4.getSelectedItem().toString(), comboBox_3.getSelectedItem().toString(), comboBox_10.getSelectedItem().toString(), textfield_3));
            }else if(comboBox_3.getSelectedItem() != null && comboBox_2.getSelectedItem() != null ){
                showMessageDialog(null, "Toevoegen kan niet");
            }

        }

    }
}
