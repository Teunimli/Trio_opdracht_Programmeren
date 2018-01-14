import java.awt.EventQueue;
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
	private JComboBox comboBox_1;
	private JTextField textField_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;

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
		btnOpslaan.setBounds(322, 306, 116, 25);
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
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		tabbedPane.addTab("Verwijderen", null, layeredPane_2, null);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		tabbedPane.addTab("Overzicht1", null, layeredPane_3, null);
		
		JLayeredPane layeredPane_4 = new JLayeredPane();
		tabbedPane.addTab("Overzicht2", null, layeredPane_4, null);
		
		JLayeredPane layeredPane_5 = new JLayeredPane();
		tabbedPane.addTab("New tab", null, layeredPane_5, null);
		
		JLayeredPane layeredPane_6 = new JLayeredPane();
		tabbedPane.addTab("New tab", null, layeredPane_6, null);
		
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().equals("Account"))
				{
					hideProfielFields();
					hideProgramFields();
					ShowAccountFields();

				}
				else if (comboBox.getSelectedItem().equals("Profiel"))
				{
					HideAccountFields(); //Combobox_1 moet geladen worden met alle acount namen
					hideProgramFields(); //Combobox_2 moet geladen worden met alle profielnamen van een gekozen account
					showProfielFields(); //Combobox_3 moet geladen worden met alle films
										 //Combobox_4 moet geladen worden met alle series
				}
				else if (comboBox.getSelectedItem().equals("Programma"))
				{
					HideAccountFields();
					hideProfielFields();
					showProgramFields();
				}
			}
		});
	}
	private void ShowAccountFields()
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
	private void HideAccountFields()
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
	private void showProfielFields()
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
	private void hideProfielFields()
	{
		lblAccountnaam.setVisible(false);
		comboBox_1.setVisible(false);
		textField_1.setVisible(false);
		textField_2.setVisible(false);

	}
	private void showProgramFields()
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
	private void hideProgramFields()
	{
		lblAccountnaam.setVisible(false);
		comboBox_1.setVisible(false);
		lblPassword.setVisible(false);
		comboBox_2.setVisible(false);
		comboBox_3.setVisible(false);
		comboBox_4.setVisible(true);
		textField_3.setVisible(false);
	}
}
