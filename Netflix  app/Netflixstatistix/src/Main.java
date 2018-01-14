
import Database.dbConnection;
import gui.Inlogscherm;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        dbConnection.createConnection();

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Inlogscherm frame = new Inlogscherm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
