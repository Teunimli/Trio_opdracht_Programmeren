package gui;

import Domain.Account;
import Repository.AccountRepository;
import Repository.ProfileRepository;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.*;

public class LoaditemsListener implements java.awt.event.ActionListener{
	private Inlogscherm inlog;
	private JComboBox comboBox;
	private AccountRepository accountRepository;
	private ProfileRepository profileRepository;
	private ArrayList<Account> accounts;
	private ArrayList<String> accountNames;
	private ArrayList<String> profileNames;

	public LoaditemsListener(Inlogscherm inlog, JComboBox comboBox)
	{
		this.inlog = inlog;
		this.comboBox = comboBox;
		accountRepository = new AccountRepository();
		profileRepository = new ProfileRepository();
		accounts = new ArrayList<Account>();
		accountNames = new ArrayList<String>();
		profileNames = new ArrayList<String>();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(comboBox.getSelectedItem().equals("Account"))
		{
			inlog.hidePfItemAdd();
			inlog.hidePgItemAdd();
			inlog.showAcItemAdd();

		}
		else if (comboBox.getSelectedItem().equals("Profiel"))
		{
			inlog.hideAcItemAdd(); //Combobox_1 moet geladen worden met alle acount namen
			inlog.hidePgItemAdd(); //Combobox_2 moet geladen worden met alle profielnamen van een gekozen account
			inlog.showPfItemAdd(); //Combobox_3 moet geladen worden met alle films
								 //Combobox_4 moet geladen worden met alle series

			accounts = accountRepository.readAll();

			for(Account a : accounts) {
				accountNames.add(a.getAccountName());
			}
			inlog.comboBox_1.setModel(new DefaultComboBoxModel(accountNames.toArray()));
		}
		else if (comboBox.getSelectedItem().equals("Programma"))
		{
			inlog.hideAcItemAdd();
			inlog.hidePfItemAdd();
			inlog.showPgItemAdd();
			
			accounts = accountRepository.readAll();

			for(Account a : accounts) {
				accountNames.add(a.getAccountName());
			}
			inlog.comboBox_1.setModel(new DefaultComboBoxModel(accountNames.toArray()));

			int profileAcccountNumber = accountRepository.readIdWithAccountName(inlog.comboBox_1.getSelectedItem().toString());
			profileNames = profileRepository.read(profileAcccountNumber);

			inlog.comboBox_4.setModel(new DefaultComboBoxModel(profileNames.toArray()));



		}
	}

}
