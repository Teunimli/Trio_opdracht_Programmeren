package gui;

import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.table.TableModel;

import Database.dbConnection;
import Repository.AccountRepository;
import Repository.ProfileRepository;
import Repository.ProgramRepository;

public class DeleteAction implements java.awt.event.ActionListener  {
	private int x;
	private TableModel model;
	private JComboBox combobox;
	private dbConnection db = new dbConnection();
	private AccountRepository  accountRepository;
	private ProfileRepository profileRepository;
	private ProgramRepository programRepository;
	private JTable table;
	
	public DeleteAction(JTable table, JComboBox combobox)
	{
		this.table = table;
		this.combobox = combobox;
		accountRepository = new AccountRepository();
		profileRepository = new ProfileRepository();
		programRepository = new ProgramRepository();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		// DELETE SELECTED ITEM

		if(combobox.getSelectedItem() == "Account"){
			int row = table.getSelectedRow();
			int id = Integer.parseInt(table.getModel().getValueAt(row,0).toString());
			accountRepository.delete(accountRepository.read(id));
		}else if(combobox.getSelectedItem() == "Profiel"){
			int row = table.getSelectedRow();
			int id = Integer.parseInt(table.getModel().getValueAt(row,0).toString());
			profileRepository.delete(profileRepository.readProfile(id));
		}else if(combobox.getSelectedItem() == "Programma"){
			int row = table.getSelectedRow();
			int id = Integer.parseInt(table.getModel().getValueAt(row,0).toString());
			programRepository.delete(programRepository.readProgram(id));
		}

		
	}

}
