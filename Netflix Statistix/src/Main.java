import Repository.MovieRepository;
import Repository.SqlHandler;

public class Main {

    public static void main(String[] args) {

        SqlHandler sqlHandler = new SqlHandler();
        sqlHandler.connectDatabase("jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=School;integratedSecurity=true;"); // databaseName invullen
        MovieRepository movieRepository = new MovieRepository(sqlHandler);

    }
}
