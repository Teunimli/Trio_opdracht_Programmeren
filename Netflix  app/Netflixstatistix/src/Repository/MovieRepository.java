package Repository;

import Database.dbConnection;
import Domain.Movie;

import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieRepository {

    private SqlHandler sqlHandler;

    public MovieRepository(){
    }

    public ArrayList<Movie> readAll(){
        ArrayList<Movie> list = new ArrayList<Movie>();
        try {
            ResultSet rs = dbConnection.sqlHandler.executeSql("SELECT * FROM Movie");
            while(rs.next()) {
                list.add(new Movie(rs.getString("Title"), rs.getInt("Duration"), rs.getString("Genre"), rs.getString("Language"), rs.getInt("Age")));
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public int readIdWithMovieName (String name){
        int movieId = 0;
        try
        {
            String sqlQuery = "SELECT MovieId FROM Movie WHERE Title = '" + name + "'";
            ResultSet rs = dbConnection.sqlHandler.executeSql(sqlQuery);
            while(rs.next()) {
                movieId = rs.getInt("MovieId");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return movieId;
    }

    public Movie read(int id){
        Movie movie = null;
        try
        {
            String sqlQuery = "SELECT * FROM Movie WHERE Id=" + id;
            ResultSet rs = sqlHandler.executeSql(sqlQuery);
            rs.next();
            movie = new Movie(rs.getString("Title"), rs.getInt("Duration"), rs.getString("Genre"), rs.getString("Language"), rs.getInt("Age"));
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return movie;
    }

    public boolean create(Movie movie){
        try
        {
            String sqlQuery = "INSERT INTO Movie (Title, Duration, Genre, Language, Age) VALUES ('" + movie.getTitle() + "', " + movie.getDuration() + ", '" + movie.getGenre() + ", '" + movie.getLanguage() + ", " + movie.getAge() + ")";
            return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return false;

    }

    public boolean update(Movie movieToUpdate, Movie updatedMovie){ //andere parameters dan in ClassDiagram
        try{
            String sqlQuery = "UPDATE Movie SET (" + updatedMovie.getId() + ", '" + updatedMovie.getTitle() + "', '" + updatedMovie.getDuration() + ", '" + updatedMovie.getGenre() + ", '" + updatedMovie.getLanguage() + ", '" + updatedMovie.getAge() + "') WHERE Id=" + movieToUpdate.getId() ;
            return sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    public boolean delete(Movie movie){
        if(movie ==null) return false;
        return delete(movie.getId());
    }

    public boolean delete(int id) { //Niet in de classDiagram, wel zo netjes
        try
        {
            String sqlQuery = "DELETE Movie WHERE Id=" + id;
            return sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
