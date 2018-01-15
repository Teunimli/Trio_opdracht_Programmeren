package gui;

import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.table.TableModel;

import Database.dbConnection;
import Repository.AccountRepository;

public class DeleteAction implements java.awt.event.ActionListener  {
	private int x;
	private TableModel model;
	private JComboBox combobox;
	private dbConnection db = new dbConnection();
	private AccountRepository  ac = new AccountRepository();
	private JTable table;
	
	public DeleteAction(JTable table, JComboBox combobox)
	{
		this.table = table;
		this.combobox = combobox;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		// DELETE SELECTED ITEM
		int row = table.getSelectedRow();
		int id = Integer.parseInt(table.getModel().getValueAt(row,0).toString());
		ac.delete(ac.read(id));
		
	}

}
