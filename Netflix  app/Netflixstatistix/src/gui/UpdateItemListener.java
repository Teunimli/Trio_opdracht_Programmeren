package gui;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JTable;

import Database.dbConnection;
import Repository.SqlHandler;
import net.proteanit.sql.DbUtils;

public class UpdateItemListener implements java.awt.event.ActionListener {
	private Inlogscherm inlog;
	private JComboBox combobox;
	private JTable table;
	private dbConnection db = new dbConnection();
	
	public UpdateItemListener(Inlogscherm inlog, JComboBox combobox, JTable table)
	{
		this.inlog = inlog;
		this.combobox = combobox;
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(combobox.getSelectedItem().equals("Account"))
		{
			inlog.hidePfItemUpdate();
			inlog.hidePgItemUpdate();
			inlog.showAcItemUpdate();
			table.setModel(DbUtils.resultSetToTableModel(db.sqlHandler.executeSql("SELECT * FROM Account")));

		}
		else if (combobox.getSelectedItem().equals("Profiel"))
		{
			inlog.hideAcItemUpdate(); //Combobox_1 moet geladen worden met alle acount namen
			inlog.hidePgItemUpdate(); //Combobox_2 moet geladen worden met alle profielnamen van een gekozen account
			inlog.showPfItemUpdate();
			table.setModel(DbUtils.resultSetToTableModel(db.sqlHandler.executeSql("SELECT * FROM Profiel")));//Combobox_3 moet geladen worden met alle films
								 //Combobox_4 moet geladen worden met alle series
		}
		else if (combobox.getSelectedItem().equals("Programma"))
		{
			inlog.hideAcItemUpdate();
			inlog.hidePfItemUpdate();
			inlog.showPgItemUpdate();
			table.setModel(DbUtils.resultSetToTableModel(db.sqlHandler.executeSql("SELECT * FROM Programma")));
		}
		
	}

}
