package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SqlHandler {
    private Connection connection = null;

    public boolean connectDatabase(String connectionUrl) {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.connection = DriverManager.getConnection(connectionUrl);
        }
        catch(Exception e)
        {
            System.out.println(e);
            connection=null;
            return false;
        }
        return true;
    }

    public ResultSet executeSql(String sqlQuery) {

    }
}
