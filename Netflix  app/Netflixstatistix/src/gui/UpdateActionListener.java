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

public class UpdateActionListener implements java.awt.event.ActionListener {

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
    private String whatRow;
    AccountRepository accountRepository;
    ProfileRepository profileRepository;
    ProgramRepository programRepository;

    public UpdateActionListener(JTextField textField, JTextField textField_1, JTextField textField_2, JTextField textField_3, JTextField textField_4, JTextField textField_5, JTextField textField_6, JTextField textField_7, JPasswordField passwordField , String whatRow) {
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
        this.whatRow = whatRow;
        accountRepository = new AccountRepository();
        profileRepository = new ProfileRepository();
        programRepository = new ProgramRepository();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(whatRow.equals("Account")) {
                int textfield_5 = Integer.parseInt(textField_5.getText());
                String passText = new String(passwordField.getPassword());

                accountRepository.update(new Account(textField.getText(), passText, textField_1.getText(), textField_2.getText(),  textField_3.getText(),  textField_4.getText(),  textfield_5,  textField_6.getText(),  textField_7.getText(),  1));
            } else if (whatRow.equals("Profiel")) {

                int textfield_1 = Integer.parseInt(textField_1.getText());
                profileRepository.update(new Profile(textField.getText() ,textField_3.getText(), textfield_1));

            }
            else if (comboBox.getSelectedItem().equals("Programma")) {
                /*
                int textfield_3 = Integer.parseInt(textField_3.getText());

                if(comboBox_3.getSelectedItem() == null){
                    programRepository.createMovie(new Program(comboBox_4.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString(), null, textfield_3));
                }else if(comboBox_2.getSelectedIndex() == -1){
                    programRepository.createSerie(new Program(comboBox_4.getSelectedItem().toString(), comboBox_3.getSelectedItem().toString(), comboBox_10.getSelectedItem().toString(), textfield_3));
                }else if(comboBox_3.getSelectedItem() != null && comboBox_2.getSelectedItem() != null ){
                    showMessageDialog(null, "Toevoegen kan niet");
                }
*/
            }


    }
}
