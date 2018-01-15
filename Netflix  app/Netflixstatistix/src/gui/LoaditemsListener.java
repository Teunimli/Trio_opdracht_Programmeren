package gui;

import Domain.Account;
import Domain.Movie;
import Domain.Series;
import Repository.AccountRepository;
import Repository.MovieRepository;
import Repository.ProfileRepository;
import Repository.SeriesRepository;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.*;

public class LoaditemsListener implements java.awt.event.ActionListener{
	private Inlogscherm inlog;
	private JComboBox comboBox;
	private AccountRepository accountRepository;
	private ProfileRepository profileRepository;
	private MovieRepository movieRepository;
	private SeriesRepository seriesRepository;
	private ArrayList<Account> accounts;
	private ArrayList<Movie> movies;
	private ArrayList<Series> series;
	private ArrayList<String> accountNames;
	private ArrayList<String> profileNames;
	private ArrayList<String> movieNames;
	private ArrayList<String> serieNames;

	public LoaditemsListener(Inlogscherm inlog, JComboBox comboBox)
	{
		this.inlog = inlog;
		this.comboBox = comboBox;
		accountRepository = new AccountRepository();
		profileRepository = new ProfileRepository();
		movieRepository = new MovieRepository();
		seriesRepository = new SeriesRepository();
		accounts = new ArrayList<Account>();
		movies = new ArrayList<Movie>();
		series = new ArrayList<Series>();
		accountNames = new ArrayList<String>();
		profileNames = new ArrayList<String>();
		movieNames = new ArrayList<String>();
		serieNames = new ArrayList<String>();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(comboBox.getSelectedItem().equals("Account"))
		{
			inlog.hidePfItemAdd();
			inlog.hidePgItemAdd();
			inlog.showAcItemAdd();

		}
		else if (comboBox.getSelectedItem().equals("Profiel"))
		{
			inlog.hideAcItemAdd(); //Combobox_1 moet geladen worden met alle acount namen
			inlog.hidePgItemAdd(); //Combobox_2 moet geladen worden met alle profielnamen van een gekozen account
			inlog.showPfItemAdd(); //Combobox_3 moet geladen worden met alle films
								 //Combobox_4 moet geladen worden met alle series

			accounts = accountRepository.readAll();

			for(Account a : accounts) {
				accountNames.add(a.getAccountName());
			}
			inlog.comboBox_1.setModel(new DefaultComboBoxModel(accountNames.toArray()));
		}
		else if (comboBox.getSelectedItem().equals("Programma"))
		{
			inlog.hideAcItemAdd();
			inlog.hidePfItemAdd();
			inlog.showPgItemAdd();

			accounts = accountRepository.readAll();

			for(Account a : accounts) {
				accountNames.add(a.getAccountName());
			}
			inlog.comboBox_1.setModel(new DefaultComboBoxModel(accountNames.toArray()));

			movies = movieRepository.readAll();
			movieNames.add(null);
			for(Movie m : movies){
				movieNames.add(m.getTitle());
			}

			inlog.comboBox_2.setModel(new DefaultComboBoxModel(movieNames.toArray()));


			series = seriesRepository.readAll();
			serieNames.add(null);
			for(Series s : series){
				serieNames.add(s.getTitle());
			}

			inlog.comboBox_3.setModel(new DefaultComboBoxModel(serieNames.toArray()));


			inlog.comboBox_1.addActionListener(new LoadComboBoxListener(this, inlog.comboBox_1, inlog));
			inlog.comboBox_3.addActionListener(new LoadEpisodeListener(this, inlog.comboBox_3, inlog));



		}
	}

}
