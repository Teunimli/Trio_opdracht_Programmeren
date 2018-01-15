package gui;

import Domain.Series;
import Repository.SeriesRepository;
import Repository.SqlHandler;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class EpisodeInterface implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(800, 500));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        SeriesRepository series = new SeriesRepository();
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setLayout(null);


        JLabel label = new JLabel("Selecteer een serie");
        label.setBounds(150,80,150,25);

        ArrayList<Series> choices = series.readAll();// Deze zal de Series van SeriesRepository moeten ophalen
        JComboBox<String> cb = new JComboBox<>();
        for(Series x : choices)
        {
            cb.addItem(x.getTitle());
        }

        cb.setBounds(300,80,300,25);


        JTextArea result = new JTextArea();
        result.append("a\n"); // Voeg hier de resultaten aan toe, vergeet geen \n erin, mogelijk met de .get methodes??


        result.append(cb.getSelectedItem().toString());


        result.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(result);
        scrollPane.setBounds(150,150,450,200);

        panel.add(cb);
        panel.add(label);
        panel.add(scrollPane);
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}

