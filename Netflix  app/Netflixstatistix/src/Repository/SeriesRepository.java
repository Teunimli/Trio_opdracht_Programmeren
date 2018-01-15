package Repository;

import Database.dbConnection;
import Domain.Episode;
import Domain.Series;

import java.sql.ResultSet;
import java.util.ArrayList;

public class SeriesRepository {
    private SqlHandler sqlHandler;

    public SeriesRepository()
    {

    }

    public ArrayList<Series> readAll(){
        ArrayList<Series> list = new ArrayList<Series>();
        try {
            ResultSet rs = dbConnection.sqlHandler.executeSql("SELECT * FROM Serie");
            while(rs.next()) {
                list.add(new Series(rs.getString("Title"),rs.getInt("Duration")));
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public int readIdWitSerieName (String name){
        int serieId = 0;
        try
        {
            String sqlQuery = "SELECT SerieId FROM Serie WHERE Title = '" + name + "'";
            ResultSet rs = dbConnection.sqlHandler.executeSql(sqlQuery);
            while(rs.next()) {
                serieId = rs.getInt("SerieId");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return serieId;
    }


    public ArrayList<Episode> Getepisode(Series series) {
        ArrayList<Episode> episodes = new ArrayList<Episode>();
        try {
            ResultSet rs = sqlHandler.executeSql("SELECT * FROM Episode WHERE SerieID = '"+series.getId()+"'");
            while(rs.next()) {
                episodes.add(new Episode(rs.getString("Title"),rs.getInt("Duration")));
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return episodes;
    }


    public Series read(int id){
        Series series = null;
        try {
            String sqlQuery = "SELECT * FROM Series WHERE Id =" + id;
            ResultSet rs = sqlHandler.executeSql(sqlQuery);
            rs.next();
            series = new Series(rs.getString("Title"),rs.getInt("Duration"));
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return series;
    }

    public boolean create(Series series){
        try
        {
            String sqlQuery = "INSERT INTO Serie VALUES()";
            return sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return false;

    }

    public boolean update(Series series){
        try{
            String sqlQuery = " UPDATE series SET ()";
            return sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    public boolean delete(Series series) {
        try
        {
            String sqlQuery = "DELETE Account WHERE Id=" + series.getId() ;
            return sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return false;
    }
}