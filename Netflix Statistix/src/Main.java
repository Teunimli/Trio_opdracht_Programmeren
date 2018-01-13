import Repository.MovieRepository;
import Repository.SqlHandler;
import gui.UserInterface;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SqlHandler sqlHandler = new SqlHandler();
        sqlHandler.connectDatabase("jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=School;integratedSecurity=true;"); // databaseName invullen
        MovieRepository movieRepository = new MovieRepository(sqlHandler);


        UserInterface userInterface = new UserInterface();
        SwingUtilities.invokeLater(userInterface);


    }
}
