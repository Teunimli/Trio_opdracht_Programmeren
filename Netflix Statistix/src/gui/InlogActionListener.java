package gui;

import Domain.Account;
import Repository.AccountRepository;
import Repository.SqlHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class InlogActionListener implements java.awt.event.ActionListener {

    private JTextField accountname;
    private JTextField password;
    private ArrayList<Account> accounts;
    AccountRepository accountRepository;

    public InlogActionListener(JTextField accountname, JTextField password) {
        this.accountname = accountname;
        this.password = password;
        accounts = new ArrayList<Account>();
        accountRepository = new AccountRepository();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        accounts = accountRepository.readAll();

        for(Account a : accounts){
            if(accountname.getText().equals(a.getAccountName() )&& password.getText().equals(a.getPassWord()) ){
                JOptionPane.showMessageDialog(null, "You have logged in");
            }else{
                JOptionPane.showMessageDialog(null, "This is wrong");

            }
        }

    }
}
