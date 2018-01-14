package Database;

import Repository.SqlHandler;

public class dbConnection {

    public static SqlHandler sqlHandler;

    public static void createConnection(){
        sqlHandler = new SqlHandler();
        sqlHandler.connectDatabase("jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Netflix;integratedSecurity=true;"); // databaseName invullen

    }

}
