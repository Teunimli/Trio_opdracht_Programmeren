package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTable;



public class Inlogscherm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblAccountnaam;
	private JPasswordField passwordField;
	private JLabel lblPassword;
	private JLabel lblVoornaam;
	private JLabel lblTussenvoegsel;
	private JLabel lblAchternaam;
	private JLabel lblStraat;
	private JLabel lblHuisnummer;
	private JLabel lblStad;
	private JLabel lblToevoeging;
	public JComboBox comboBox_1;
	private JTextField textField_1;
	public JComboBox comboBox_2;
	public JComboBox comboBox_3;
	public JComboBox comboBox_4;
	private JTable table;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JPasswordField passwordField_1;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JComboBox comboBox_6;
	private JTextField textField_17;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JTable table_1;

	public Inlogscherm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBounds(0, 0, 590, 382);
		contentPane.add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Toevoegen", null, layeredPane, null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Account", "Profiel", "Programma"}));
		comboBox.setBounds(407, 13, 80, 22);
		comboBox.setSelectedItem("Account");
		layeredPane.add(comboBox);

		
		lblAccountnaam = new JLabel("Accountnaam:");
		lblAccountnaam.setBounds(12, 74, 87, 16);
		layeredPane.add(lblAccountnaam);
		
		textField = new JTextField();
		textField.setBounds(111, 71, 116, 22);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setBounds(22, 113, 77, 16);
		layeredPane.add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(111, 151, 116, 22);
		layeredPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(111, 193, 116, 22);
		layeredPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(111, 234, 116, 22);
		layeredPane.add(textField_4);
		
		lblVoornaam = new JLabel("Voornaam:");
		lblVoornaam.setBounds(29, 154, 70, 16);
		layeredPane.add(lblVoornaam);
		
		lblTussenvoegsel = new JLabel("Tussenvoegsel:");
		lblTussenvoegsel.setBounds(10, 196, 89, 16);
		layeredPane.add(lblTussenvoegsel);
		
		lblAchternaam = new JLabel("Achternaam:");
		lblAchternaam.setBounds(19, 237, 80, 16);
		layeredPane.add(lblAchternaam);
		
		lblStraat = new JLabel("Straat:");
		lblStraat.setBounds(273, 74, 56, 16);
		layeredPane.add(lblStraat);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(322, 71, 116, 22);
		layeredPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(322, 110, 116, 22);
		layeredPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(322, 151, 116, 22);
		layeredPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(322, 193, 116, 22);
		layeredPane.add(textField_8);
		
		lblHuisnummer = new JLabel("Huisnummer:");
		lblHuisnummer.setBounds(239, 113, 89, 16);
		layeredPane.add(lblHuisnummer);
		
		lblStad = new JLabel("Stad:");
		lblStad.setBounds(284, 196, 56, 16);
		layeredPane.add(lblStad);
		
		JButton btnOpslaan = new JButton("Opslaan");
		btnOpslaan.setBounds(322, 295, 116, 25);
		layeredPane.add(btnOpslaan);
		
		lblToevoeging = new JLabel("Toevoeging:");
		lblToevoeging.setBounds(239, 154, 75, 16);
		layeredPane.add(lblToevoeging);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(111, 110, 116, 22);
		layeredPane.add(passwordField);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(111, 71, 116, 22);
		layeredPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 110, 116, 22);
		layeredPane.add(textField_1);
		textField_1.setColumns(10);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(111, 151, 116, 22);
		layeredPane.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(322, 151, 116, 22);
		layeredPane.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setBounds(111, 110, 116, 22);
		layeredPane.add(comboBox_4);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("Wijzigen", null, layeredPane_1, null);
		
		table = new JTable();
		table.setBounds(0, 230, 499, 147);

		layeredPane_1.add(table);
		
		JButton button = new JButton("Opslaan");
		button.setBounds(334, 158, 116, 25);
		layeredPane_1.add(button);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(334, 108, 116, 22);
		layeredPane_1.add(textField_9);
		
		label = new JLabel("Stad:");
		label.setBounds(285, 111, 56, 16);
		layeredPane_1.add(label);
		
		label_1 = new JLabel("Toevoeging:");
		label_1.setBounds(257, 76, 75, 16);
		layeredPane_1.add(label_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(334, 73, 116, 22);
		layeredPane_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(334, 41, 116, 22);
		layeredPane_1.add(textField_11);
		
		 label_2 = new JLabel("Huisnummer:");
		label_2.setBounds(247, 44, 89, 16);
		layeredPane_1.add(label_2);
		
		 label_3 = new JLabel("Straat:");
		label_3.setBounds(285, 16, 56, 16);
		layeredPane_1.add(label_3);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(334, 13, 116, 22);
		layeredPane_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(111, 13, 116, 22);
		layeredPane_1.add(textField_13);
		
		label_4 = new JLabel("Accountnaam:");
		label_4.setBounds(12, 16, 87, 16);
		layeredPane_1.add(label_4);
		
		 label_5 = new JLabel("Password:");
		label_5.setBounds(22, 43, 77, 19);
		layeredPane_1.add(label_5);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(111, 41, 116, 22);
		layeredPane_1.add(passwordField_1);
		
		 label_6 = new JLabel("Voornaam:");
		label_6.setBounds(32, 76, 70, 16);
		layeredPane_1.add(label_6);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(111, 73, 116, 22);
		layeredPane_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(111, 108, 116, 22);
		layeredPane_1.add(textField_15);
		
		 label_7 = new JLabel("Tussenvoegsel:");
		label_7.setBounds(10, 113, 89, 16);
		layeredPane_1.add(label_7);
		
		 label_8 = new JLabel("Achternaam:");
		label_8.setBounds(22, 138, 80, 16);
		layeredPane_1.add(label_8);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(111, 135, 116, 22);
		layeredPane_1.add(textField_16);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"SELECTEER", "Account", "Profiel", "Programma"}));
		comboBox_5.setBounds(12, 185, 103, 22);
		comboBox_5.addActionListener(new UpdateItemListener(this, comboBox_5, table));

		layeredPane_1.add(comboBox_5);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setBounds(111, 13, 116, 22);
		layeredPane_1.add(comboBox_6);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(111, 41, 116, 22);
		layeredPane_1.add(textField_17);
		
		comboBox_7 = new JComboBox();
		comboBox_7.setBounds(111, 73, 116, 22);
		layeredPane_1.add(comboBox_7);
		
		comboBox_8 = new JComboBox();
		comboBox_8.setBounds(334, 73, 116, 22);
		layeredPane_1.add(comboBox_8);
		
		comboBox_9 = new JComboBox();
		comboBox_9.setBounds(111, 41, 116, 22);
		layeredPane_1.add(comboBox_9);
		table.addMouseListener(new TableClickEvent(table,comboBox_5,textField_9,textField_10,textField_11,textField_12,textField_13,textField_14,textField_15,textField_16,textField_17,passwordField_1,comboBox_6,comboBox_7,comboBox_8,comboBox_9));
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		tabbedPane.addTab("Verwijderen", null, layeredPane_2, null);
		
		table_1 = new JTable();
		table_1.setEnabled(true);
		table_1.setBounds(12, 42, 475, 322);
		
		layeredPane_2.add(table_1);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "Account", "Profiel", "Programma"}));
		comboBox_11.setBounds(12, 13, 85, 22);
		comboBox_11.addActionListener(new FilltableActionListener(comboBox_11,table_1));
		layeredPane_2.add(comboBox_11);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		tabbedPane.addTab("Overzicht1", null, layeredPane_3, null);
		
		JLayeredPane layeredPane_4 = new JLayeredPane();
		tabbedPane.addTab("Overzicht2", null, layeredPane_4, null);
		
		JLayeredPane layeredPane_5 = new JLayeredPane();
		tabbedPane.addTab("New tab", null, layeredPane_5, null);
		
		JLayeredPane layeredPane_6 = new JLayeredPane();
		tabbedPane.addTab("New tab", null, layeredPane_6, null);
		
		comboBox.addActionListener(new LoaditemsListener(this, comboBox));
		AddActionListener addActionListener = new AddActionListener(textField, textField_1, textField_2, textField_3, textField_4, textField_5, textField_6, textField_7, textField_8, passwordField, comboBox, comboBox_1);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBounds(322, 193, 116, 22);
		comboBox_10.addActionListener(new FilltableActionListener(comboBox_10,table_1));
		
		JButton btnVerwijderen = new JButton("Verwijderen");
		btnVerwijderen.setEnabled(true);
		btnVerwijderen.setBounds(384, 12, 103, 25);
		btnVerwijderen.addActionListener(new DeleteAction(table_1,comboBox_10));
		layeredPane_2.add(btnVerwijderen);
		
		JLabel lbleerstEenItem = new JLabel("*eerst een item selecteren hieronder");
		lbleerstEenItem.setBounds(161, 16, 222, 16);
		layeredPane_2.add(lbleerstEenItem);
		layeredPane.add(comboBox_10);
		btnOpslaan.addActionListener(addActionListener);
	}
	public void showAcItemAdd()
	{
		textField.setVisible(true);
		passwordField.setVisible(true);
		textField_2.setVisible(true);
		textField_3.setVisible(true);
		textField_4.setVisible(true);
		textField_5.setVisible(true);
		textField_6.setVisible(true);
		textField_7.setVisible(true);
		textField_8.setVisible(true);
		lblAccountnaam.setVisible(true);
		lblPassword.setVisible(true);
		lblVoornaam.setVisible(true);
		lblTussenvoegsel.setVisible(true);
		lblAchternaam.setVisible(true);
		lblStraat.setVisible(true);
		lblHuisnummer.setVisible(true);
		lblStad.setVisible(true);
		lblToevoeging.setVisible(true);
		lblPassword.setText("Password:");
		lblVoornaam.setText("Voornaam:");
		lblToevoeging.setText("Toevoeging:");
		lblTussenvoegsel.setText("Tussenvoegsel");
	}
	public void hideAcItemAdd()
	{
		textField.setVisible(false);
		passwordField.setVisible(false);
		textField_2.setVisible(false);
		textField_3.setVisible(false);
		textField_4.setVisible(false);
		textField_5.setVisible(false);
		textField_6.setVisible(false);
		textField_7.setVisible(false);
		textField_8.setVisible(false);
		lblAccountnaam.setVisible(false);
		lblPassword.setVisible(false);
		lblVoornaam.setVisible(false);
		lblTussenvoegsel.setVisible(false);
		lblAchternaam.setVisible(false);
		lblStraat.setVisible(false);
		lblHuisnummer.setVisible(false);
		lblStad.setVisible(false);
		lblToevoeging.setVisible(false);
	}
	public void showPfItemAdd()
	{
		lblAccountnaam.setVisible(true);
		comboBox_1.setVisible(true);
		textField_1.setVisible(true);
		textField_2.setVisible(true);
		lblPassword.setVisible(true);
		lblVoornaam.setVisible(true);
		lblPassword.setText("Profielnaam:");
		lblVoornaam.setText("Leeftijd:");
		
	}
	public void hidePfItemAdd()
	{
		lblAccountnaam.setVisible(false);
		comboBox_1.setVisible(false);
		textField_1.setVisible(false);
		textField_2.setVisible(false);

	}
	public void showPgItemAdd()
	{
		lblAccountnaam.setVisible(true);
		comboBox_1.setVisible(true);
		lblPassword.setVisible(true);
		lblPassword.setText("Profielnaam:");
		comboBox_4.setVisible(true);
		comboBox_2.setVisible(true);
		comboBox_3.setVisible(true);
		lblVoornaam.setVisible(true);
		lblToevoeging.setVisible(true);
		lblTussenvoegsel.setVisible(true);
		lblVoornaam.setText("Film:");
		lblToevoeging.setText("of Serie:");
		lblTussenvoegsel.setText("Percentage");
		textField_3.setVisible(true);
		
	}
	public void hidePgItemAdd()
	{
		lblAccountnaam.setVisible(false);
		comboBox_1.setVisible(false);
		lblPassword.setVisible(false);
		comboBox_2.setVisible(false);
		comboBox_3.setVisible(false);
		comboBox_4.setVisible(true);
		textField_3.setVisible(false);
	}
	public void showAcItemUpdate()
	{
		label.setVisible(true);
		label_1.setVisible(true);
		label_2.setVisible(true);
		label_3.setVisible(true);
		label_4.setVisible(true);
		label_5.setVisible(true);
		label_6.setVisible(true);
		label_7.setVisible(true);
		label_8.setVisible(true);
		passwordField_1.setVisible(true);
		textField_9.setVisible(true);
		textField_10.setVisible(true);
		textField_11.setVisible(true);
		textField_12.setVisible(true);
		textField_13.setVisible(true);
		textField_14.setVisible(true);
		textField_15.setVisible(true);
		textField_16.setVisible(true);
		label_5.setText("Password:");
		label_6.setText("Voornaam:");
		label_1.setText("Toevoeging:");
		label_7.setText("Tussenvoegsel");
	}
	public void hideAcItemUpdate()
	{
		label.setVisible(false);
		label_1.setVisible(false);
		label_2.setVisible(false);
		label_3.setVisible(false);
		label_4.setVisible(false);
		label_5.setVisible(false);
		label_6.setVisible(false);
		label_7.setVisible(false);
		label_8.setVisible(false);
		passwordField_1.setVisible(false);
		textField_9.setVisible(false);
		textField_10.setVisible(false);
		textField_11.setVisible(false);
		textField_12.setVisible(false);
		textField_13.setVisible(false);
		textField_14.setVisible(false);
		textField_15.setVisible(false);
		textField_16.setVisible(false);
			}
	public void showPfItemUpdate()
	{
		label_4.setVisible(true);
		label_5.setVisible(true);
		label_6.setVisible(true);
		textField_14.setVisible(true);
		textField_17.setVisible(true);
		comboBox_6.setVisible(true);
		label_5.setText("Profielnaam:");
		label_6.setText("Leeftijd:");
		
	}
	public void hidePfItemUpdate()
	{
		label_4.setVisible(false);
		label_5.setVisible(false);
		label_6.setVisible(false);
		textField_14.setVisible(false);
		textField_17.setVisible(false);
		comboBox_6.setVisible(false);
	}
	public void showPgItemUpdate()
	{
		comboBox_6.setVisible(true);
		comboBox_7.setVisible(true);
		comboBox_8.setVisible(true);
		comboBox_9.setVisible(true);
		label_5.setText("Profielnaam:");
		label_6.setText("Film:");
		label_1.setText("of Serie:");
		label_5.setVisible(true);
		label_6.setVisible(true);
		label_1.setVisible(true);
		label_4.setVisible(true);
		label_7.setText("Percentage:");
		label_7.setVisible(true);
		textField_15.setVisible(true);
	}
	public void hidePgItemUpdate()
	{		
	comboBox_6.setVisible(false);
	comboBox_7.setVisible(false);
	comboBox_8.setVisible(false);
	comboBox_9.setVisible(false);
	label_5.setVisible(false);
	label_6.setVisible(false);
	label_1.setVisible(false);
	label_7.setVisible(false);
	label_4.setVisible(false);
	textField_15.setVisible(false);
	}
}

