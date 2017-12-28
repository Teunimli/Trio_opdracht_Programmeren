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
            String sqlQuery = "SELECT * FROM Film WHERE Id=" + id;
            ResultSet rs = sqlHandler.executeSql(sqlQuery);
            rs.next();
            film = new Film(rs.getInt("Id"),rs.getString("Title"), rs.getInt("Duration"), rs.getString("Genre"), rs.getString("Language"), rs.getInt("Age"));
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return film;
    }

    public boolean create(Film film){
        try
        {
            String sqlQuery = "INSERT INTO Film VALUES (" + film.getId() + ", '" + film.getTitle() + "', '" + film.getDuration() + ", '" + film.getGenre() + ", '" + film.getLanguage() + ", '" + film.getAge() + "')";
            return sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return false;

    }

    public boolean update(Film filmToUpdate, Film updatedFilm){ //andere parameters dan in ClassDiagram
        try{
            String sqlQuery = "UPDATE Film SET (" + updatedFilm.getId() + ", '" + updatedFilm.getTitle() + "', '" + updatedFilm.getDuration() + ", '" + updatedFilm.getGenre() + ", '" + updatedFilm.getLanguage() + ", '" + updatedFilm.getAge() + "') WHERE Id=" +filmToUpdate.getId() ;
            return sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    public boolean delete(Film film){
        if(film==null) return false;
        return delete(film.getId());
    }

    public boolean delete(int id) { //Niet in de classDiagram, wel zo netjes
        try
        {
            String sqlQuery = "DELETE Film WHERE Id=" + id;
            return sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
