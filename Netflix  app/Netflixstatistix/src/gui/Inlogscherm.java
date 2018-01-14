package gui;

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

public class Inlogscherm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

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
		layeredPane.add(comboBox);
		
		JLabel lblAccountnaam = new JLabel("Accountnaam:");
		lblAccountnaam.setBounds(12, 74, 87, 16);
		layeredPane.add(lblAccountnaam);
		
		textField = new JTextField();
		textField.setBounds(111, 71, 116, 22);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(29, 113, 70, 16);
		layeredPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(111, 110, 116, 22);
		layeredPane.add(textField_1);
		
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
		
		JLabel lblVoornaam = new JLabel("Voornaam:");
		lblVoornaam.setBounds(29, 154, 70, 16);
		layeredPane.add(lblVoornaam);
		
		JLabel lblTussenvoegsel = new JLabel("Tussenvoegsel:");
		lblTussenvoegsel.setBounds(10, 196, 89, 16);
		layeredPane.add(lblTussenvoegsel);
		
		JLabel lblAchternaam = new JLabel("Achternaam:");
		lblAchternaam.setBounds(19, 237, 80, 16);
		layeredPane.add(lblAchternaam);
		
		JLabel lblStraat = new JLabel("Straat:");
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
		
		JLabel lblHuisnummer = new JLabel("Huisnummer:");
		lblHuisnummer.setBounds(239, 113, 89, 16);
		layeredPane.add(lblHuisnummer);
		
		JLabel lblStad = new JLabel("Stad:");
		lblStad.setBounds(284, 196, 56, 16);
		layeredPane.add(lblStad);
		
		JButton btnOpslaan = new JButton("Opslaan");
		btnOpslaan.setBounds(322, 306, 116, 25);
		layeredPane.add(btnOpslaan);
		
		JLabel lblToevoeging = new JLabel("Toevoeging:");
		lblToevoeging.setBounds(239, 154, 75, 16);
		layeredPane.add(lblToevoeging);
		
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

		CreateUserActionListener createUserActionListener = new CreateUserActionListener(textField, textField_1, textField_2, textField_3, textField_4, textField_5, textField_6, textField_7, textField_8);
		btnOpslaan.addActionListener(createUserActionListener);
	}
}
