package gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class UserInterface implements Runnable {

    private JFrame frame;

    public void run() {
        frame = new JFrame("Netflix Statistix");
        frame.setPreferredSize(new Dimension(800, 500));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JTabbedPane tabbedPane = new JTabbedPane(); // Panel met tabbladen

        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);

        tabbedPane.add("Home",createTabHome()); //Tabblad aanmaken en toevoegen
        tabbedPane.add("Create", createCreateTab());
        tabbedPane.add("Tab2", createTab2());

        container.add(tabbedPane);
        container.add(createCredits(),BorderLayout.SOUTH); //Namen en opleiding toevoegen
    }

    private JPanel createTabHome(){
        JPanel panelTab1 = new JPanel();
        BorderLayout layout = new BorderLayout();
        panelTab1.setLayout(layout);
        panelTab1.setBackground(Color.white);

        JLabel image = new JLabel();
        image.setLayout(layout);

        image.setIcon(new ImageIcon("src/image2.png")); // Achtergrond image

        panelTab1.add(image, BorderLayout.NORTH);

        return panelTab1;
    }

    private JPanel createCreateTab(){
        JPanel panelCreateTab = new JPanel();
        panelCreateTab.setBackground(Color.white);
        panelCreateTab.setLayout(null);


        JLabel label = new JLabel("Wat wilt u aanmaken");
        label.setBounds(150,80,150,25);

        String[] choices = {"Account", "Episode", "Movie", "Profile", "Series"}; // De opties in de dropdown

        JComboBox<String> cb = new JComboBox<String>(choices);
        cb.setBounds(300,80,300,25);

        JLabel label1 = new JLabel();
        label1.setBounds(150,150,100,25);
        JLabel label2 = new JLabel();
        label2.setBounds(150,180,100,25);
        JLabel label3 = new JLabel();
        label3.setBounds(150,210,100,25);
        JLabel label4 = new JLabel();
        label4.setBounds(150,240,100,25);
        JLabel label5 = new JLabel();
        label5.setBounds(150,270,100,25);
        JLabel label6 = new JLabel();
        label6.setBounds(150,300,100,25);
        JLabel label7 = new JLabel();
        label7.setBounds(150,330,100,25);
        JLabel label8 = new JLabel();
        label8.setBounds(150,360,100,25);

        JTextField textField1 = new JTextField();
        textField1.setBounds(275,150,200,25);
        JTextField textField2 = new JTextField();
        textField2.setBounds(275,180,200,25);
        JTextField textField3 = new JTextField();
        textField3.setBounds(275,210,200,25);
        JTextField textField4 = new JTextField();
        textField4.setBounds(275,240,200,25);
        JTextField textField5 = new JTextField();
        textField5.setBounds(275,270,200,25);
        JTextField textField6 = new JTextField();
        textField6.setBounds(275,300,200,25);
        JTextField textField7 = new JTextField();
        textField7.setBounds(275,330,200,25);
        JTextField textField8 = new JTextField();
        textField8.setBounds(275,360,200,25);

        textField1.setVisible(false);
        textField2.setVisible(false);
        textField3.setVisible(false);
        textField4.setVisible(false);
        textField5.setVisible(false);
        textField6.setVisible(false);
        textField7.setVisible(false);
        textField8.setVisible(false);

        JButton button = new JButton("Selecteer");

        ActionListener actionListener = new ActionListener(label1,label2,label3,label4,label5,label6,label7,label8,textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8, cb);
        button.addActionListener(actionListener);
        button.setBounds(600,80,100,25);

        panelCreateTab.add(button);

        panelCreateTab.add(label1);
        panelCreateTab.add(label2);
        panelCreateTab.add(label3);
        panelCreateTab.add(label4);
        panelCreateTab.add(label5);
        panelCreateTab.add(label6);
        panelCreateTab.add(label7);
        panelCreateTab.add(label8);

        panelCreateTab.add(textField1);
        panelCreateTab.add(textField2);
        panelCreateTab.add(textField3);
        panelCreateTab.add(textField4);
        panelCreateTab.add(textField5);
        panelCreateTab.add(textField6);
        panelCreateTab.add(textField7);
        panelCreateTab.add(textField8);

        JButton buttonSend = new JButton("Verstuur");
        buttonSend.setBounds(600,360,100,25);

        panelCreateTab.add(buttonSend);
        panelCreateTab.add(label);
        panelCreateTab.add(cb);

        return panelCreateTab;
    }

    private JPanel createTab2(){ // Voor een door de gebruiker geselecteerde serie, geef per aflevering het gemiddeld bekeken % van de tijdsduur. Bij elke aflevering worden het volgnummer én titel getoond.
        JPanel panelTab2 = new JPanel();
        panelTab2.setBackground(Color.white);
        panelTab2.setLayout(null);

        JLabel label = new JLabel("Selecteer een serie");
        label.setBounds(150,80,150,25);

        ArrayList<String> choices = new ArrayList<>(); // Deze zal de Series van SeriesRepository moeten ophalen

        choices.add("Choice 1"); //Deze zijn om te testen tot die tijd
        choices.add("Choice 2"); //Deze zijn om te testen tot die tijd

        JComboBox<String> cb = new JComboBox<>();

        for(String s : choices){ // Voegt alle films uit de arraylist toe aan de ComboBox/Dropdown list
            cb.addItem(s);
        }

        cb.setBounds(300,80,300,25);


        JTextArea result = new JTextArea();
        result.append("a\n"); // Voeg hier de resultaten aan toe, vergeet geen \n erin, mogelijk met de .get methodes??


        result.append(cb.getSelectedItem().toString());


        result.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(result);
        scrollPane.setBounds(150,150,450,200);

        panelTab2.add(cb);
        panelTab2.add(label);
        panelTab2.add(scrollPane);

        return panelTab2;
    }


    private JLabel createCredits(){ //Maakt een JLabel aan met onze namen en opleiding die onderaan het scherm komen te staan
        JLabel students = new JLabel();
        students.setText("Informatica 2018 - 23IVT1A - Teun Aarts 0000000 - Michael van Zundert 0000000 - Kevin Gerretsen 2050253");

        students.setForeground(Color.BLACK);
        return students;
    }

    public JFrame getFrame() {
        return frame;
    }
}
