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

    private JPanel createTab2(){ // Voor een door de gebruiker geselecteerde serie, geef per aflevering het gemiddeld bekeken % van de tijdsduur. Bij elke aflevering worden het volgnummer én titel getoond.
        JPanel panelTab2 = new JPanel();
        panelTab2.setBackground(Color.white);
        panelTab2.setLayout(null);

        JLabel label = new JLabel("Selecteer een serie");
        label.setBounds(150,80,150,25);

        ArrayList<String> choices = new ArrayList<>(); // Deze zal de Series van SeriesRepository moeten ophalen

        choices.add("Choice 1"); //Deze zijn om te testen tot die tijd
        choices.add("Choice 2");

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
