import Database.dbConnection;
import gui.InlogInterface;
import Repository.MovieRepository;
import Repository.SqlHandler;
import gui.EpisodeInterface;
import gui.UserInterface;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        dbConnection.createConnection();
        InlogInterface inlogInterface= new InlogInterface();
        SwingUtilities.invokeLater(inlogInterface);

    }
}
