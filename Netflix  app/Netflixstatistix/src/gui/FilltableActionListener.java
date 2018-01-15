package gui;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JTable;

import Database.dbConnection;
import net.proteanit.sql.DbUtils;

public class FilltableActionListener implements java.awt.event.ActionListener{
	private JComboBox combobox; 
	private JTable table;
	private dbConnection db = new dbConnection();
	public FilltableActionListener(JComboBox combobox, JTable table)
	{
		this.combobox = combobox;
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(combobox.getSelectedItem().equals("Account"))
		{
			table.setModel(DbUtils.resultSetToTableModel(db.sqlHandler.executeSql("SELECT * FROM Account")));

		}
		else if (combobox.getSelectedItem().equals("Profiel"))
		{

			table.setModel(DbUtils.resultSetToTableModel(db.sqlHandler.executeSql("SELECT * FROM Profile")));
								 
		}
		else if (combobox.getSelectedItem().equals("Programma"))
		{
			table.setModel(DbUtils.resultSetToTableModel(db.sqlHandler.executeSql("SELECT * FROM Program")));
		}
		
	}

}
