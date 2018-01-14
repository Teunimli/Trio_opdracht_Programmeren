import Repository.MovieRepository;
import Repository.SqlHandler;
import gui.EpisodeInterface;
import gui.UserInterface;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SqlHandler sqlHandler = new SqlHandler();
        sqlHandler.connectDatabase("jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Netflix;integratedSecurity=true;"); // databaseName invullen
        MovieRepository movieRepository = new MovieRepository(sqlHandler);


        EpisodeInterface userInterface = new EpisodeInterface();
        SwingUtilities.invokeLater(userInterface);

    }
}
