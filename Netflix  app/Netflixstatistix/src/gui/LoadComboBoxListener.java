package gui;

import Repository.AccountRepository;
import Repository.ProfileRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class LoadComboBoxListener implements java.awt.event.ActionListener {
    private Inlogscherm inlog;
    private LoaditemsListener loaditemsListener;
    private JComboBox comboBox;
    private AccountRepository accountRepository;
    private ProfileRepository profileRepository;
    private ArrayList<String> profileNames;

    public LoadComboBoxListener(LoaditemsListener loaditemsListener, JComboBox comboBox, Inlogscherm inlog){
        this.loaditemsListener = loaditemsListener;
        this.comboBox = comboBox;
        this.inlog = inlog;
        accountRepository = new AccountRepository();
        profileRepository = new ProfileRepository();
        profileNames = new ArrayList<String>();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int profileAcccountNumber = accountRepository.readIdWithAccountName(inlog.comboBox_1.getSelectedItem().toString());
        profileNames = profileRepository.read(profileAcccountNumber);
        inlog.comboBox_4.setModel(new DefaultComboBoxModel(profileNames.toArray()));
    }
}
