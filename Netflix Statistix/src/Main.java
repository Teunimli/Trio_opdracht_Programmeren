import Repository.FilmRepository;
import Repository.SqlHandler;

public class Main {

    public static void main(String[] args) {

        SqlHandler sqlHandler = new SqlHandler();
        sqlHandler.connectDatabase("jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=School;integratedSecurity=true;"); // databaseName invullen
        FilmRepository filmRepository = new FilmRepository(sqlHandler);

    }
}
