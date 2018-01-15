package Repository;

import Database.dbConnection;

import java.sql.ResultSet;
import java.util.ArrayList;

public class EpisodeRepository {

    public int readIdWitEpisodeNameAndSerieId (String name, int id){
        int episodeId = 0;
        try
        {
            String sqlQuery = "SELECT EpisodeId FROM Episode WHERE Title = '" + name + "' AND SerieId = " + id + " ";
            ResultSet rs = dbConnection.sqlHandler.executeSql(sqlQuery);
            while(rs.next()) {
                episodeId = rs.getInt("EpisodeId");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return episodeId;
    }

    public ArrayList read(int id){
        ArrayList<String> episodeNames = new ArrayList<String>();
        try
        {
            String sqlQuery = "SELECT Title FROM Episode WHERE SerieId = " + id;
            ResultSet rs = dbConnection.sqlHandler.executeSql(sqlQuery);
            while(rs.next()) {
                episodeNames.add(rs.getString("Title"));
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return episodeNames;
    }
}
