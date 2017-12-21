package Repository;

import Domain.Film;

import java.sql.ResultSet;
import java.util.ArrayList;

public class FilmRepository {

    private SqlHandler sqlHandler;

    public FilmRepository(SqlHandler sqlHandler) {
        this.sqlHandler = sqlHandler;
    }

    public ArrayList<Film> readAll(){
        ArrayList<Film> list = new ArrayList<>();
        try {
            ResultSet rs = sqlHandler.executeSql("SELECT * FROM Film");
            while(rs.next()) {
                list.add(new Film(rs.getInt("Id"),rs.getString("Title"), rs.getInt("Duration"), rs.getString("Genre"), rs.getString("Language"), rs.getInt("Age")));
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Film read(int id){
        Film film = null;
        try
        {
            String sqlQuery = "SELECT * FROM STUDENTS WHERE Id=" + id;
            ResultSet rs = sqlHandler.executeSql(sqlQuery);
            rs.next();
            film = new Film(rs.getInt("Id"),rs.getString("Title"), rs.getInt("Duration"), rs.getString("Genre"), rs.getString("Language"), rs.getInt("Age")));
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return film;
    }

    public boolean create(Film){

    }

    public boolean update(Film){

    }

    public boolean delete(Film){

    }

}
