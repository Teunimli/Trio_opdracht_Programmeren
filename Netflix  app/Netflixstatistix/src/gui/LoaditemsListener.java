package gui;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class LoaditemsListener implements java.awt.event.ActionListener{
	private Inlogscherm inlog;
	private JComboBox comboBox;
	
	public LoaditemsListener(Inlogscherm inlog, JComboBox comboBox)
	{
		this.inlog = inlog;
		this.comboBox = comboBox;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(comboBox.getSelectedItem().equals("Account"))
		{
			inlog.hideProfielFields();
			inlog.hideProgramFields();
			inlog.ShowAccountFields();

		}
		else if (comboBox.getSelectedItem().equals("Profiel"))
		{
			inlog.HideAccountFields(); //Combobox_1 moet geladen worden met alle acount namen
			inlog.hideProgramFields(); //Combobox_2 moet geladen worden met alle profielnamen van een gekozen account
			inlog.showProfielFields(); //Combobox_3 moet geladen worden met alle films
								 //Combobox_4 moet geladen worden met alle series
		}
		else if (comboBox.getSelectedItem().equals("Programma"))
		{
			inlog.HideAccountFields();
			inlog.hideProfielFields();
			inlog.showProgramFields();
		}
	}

}
