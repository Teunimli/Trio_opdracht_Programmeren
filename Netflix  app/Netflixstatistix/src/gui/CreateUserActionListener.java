package gui;

import Domain.Account;
import Repository.AccountRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class CreateUserActionListener implements java.awt.event.ActionListener {

    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    AccountRepository accountRepository;

    public CreateUserActionListener(JTextField textField, JTextField textField_1, JTextField textField_2, JTextField textField_3, JTextField textField_4, JTextField textField_5, JTextField textField_6, JTextField textField_7,JTextField textField_8) {
        this.textField = textField;
        this.textField_1 = textField_1;
        this.textField_2 = textField_2;
        this.textField_3 = textField_3;
        this.textField_4 = textField_4;
        this.textField_5 = textField_5;
        this.textField_6 = textField_6;
        this.textField_7 = textField_7;
        this.textField_8 = textField_8;
        accountRepository = new AccountRepository();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int textfield_6 = Integer.parseInt(textField_6.getText());
        accountRepository.create(new Account(textField.getText(), textField_1.getText(),  textField_2.getText(),  textField_3.getText(),  textField_4.getText(),  textField_5.getText(),  textfield_6,  textField_7.getText(), textField_8.getText(), 1));

    }
}
