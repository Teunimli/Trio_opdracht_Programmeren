package gui;

import Repository.EpisodeRepository;
import Repository.SeriesRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class LoadEpisodeListener implements java.awt.event.ActionListener{

    private Inlogscherm inlog;
    private LoaditemsListener loaditemsListener;
    private JComboBox comboBox;
    private ArrayList<String> episodeNames;
    private SeriesRepository seriesRepository;
    private EpisodeRepository episodeRepository;

    public LoadEpisodeListener(LoaditemsListener loaditemsListener, JComboBox comboBox, Inlogscherm inlog){
        this.loaditemsListener = loaditemsListener;
        this.comboBox = comboBox;
        this.inlog = inlog;
        episodeNames = new ArrayList<String>();
        seriesRepository = new SeriesRepository();
        episodeRepository = new EpisodeRepository();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int serieNumber = seriesRepository.readIdWitSerieName(inlog.comboBox_3.getSelectedItem().toString());
        episodeNames = episodeRepository.read(serieNumber);
        inlog.comboBox_10.setModel(new DefaultComboBoxModel(episodeNames.toArray()));

    }

}
