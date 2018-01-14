import Database.dbConnection;
import gui.InlogInterface;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        dbConnection.createConnection();
        InlogInterface inlogInterface= new InlogInterface();
        SwingUtilities.invokeLater(inlogInterface);

    }
}
