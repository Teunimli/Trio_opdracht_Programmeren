package Repository;

import Database.dbConnection;
import Domain.Movie;
import Domain.Program;

import java.sql.ResultSet;

import static javax.swing.JOptionPane.showMessageDialog;

public class ProgramRepository {

    ProfileRepository profileRepository = new ProfileRepository();
    MovieRepository movieRepository= new MovieRepository();
    SeriesRepository seriesRepository= new SeriesRepository();
    EpisodeRepository episodeRepository = new EpisodeRepository();

    public boolean createMovie(Program program){
        int profileId = profileRepository.readIdWithProfiletName(program.getProfileName());
        int movieId = movieRepository.readIdWithMovieName(program.getMovieOrSerieName());

        try
        {
            String sqlQuery = "INSERT INTO Program (MovieId, ProfileId, percentage) VALUES (" + movieId + "," + profileId + ",  " + program.getPercentage() + ")";
            showMessageDialog(null, "Toevoegen van een gekeken film is gelukt");
            return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            showMessageDialog(null, "Toevoegen van een gekeken film is niet gelukt");
            System.out.println(e);
        }
        return false;

    }

    public boolean createSerie(Program program){
        int profileId = profileRepository.readIdWithProfiletName(program.getProfileName());
        int serieId = seriesRepository.readIdWitSerieName(program.getMovieOrSerieName());
        int episodeId = episodeRepository.readIdWitEpisodeNameAndSerieId(program.getEpisodeName(), serieId);

        try
        {
            String sqlQuery = "INSERT INTO Program (SerieId, EpisodeId, ProfileId, percentage) VALUES ( " + serieId + " , "+ episodeId + "," + profileId + ",  " + program.getPercentage() + ")";
            showMessageDialog(null, "Toevoegen van een gekeken serie met aflevering is gelukt");
            return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            showMessageDialog(null, "Toevoegen van een gekeken serie met aflevering is niet gelukt");
            System.out.println(e);
        }
        return false;

    }

    public int readProgram(int id){
        int program = 0;
        try
        {
            String sqlQuery = "SELECT ProgramId FROM Program WHERE ProgramId=" + id;
            ResultSet rs = dbConnection.sqlHandler.executeSql(sqlQuery);
            while(rs.next()) {
                program = rs.getInt("ProgramId");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return program;
    }

    public boolean delete(int programId) {
        try
        {
            String sqlQuery = "DELETE FROM Program WHERE ProgramId = " + programId +"";
            showMessageDialog(null, "Deleten van programma is gelukt");
            return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            showMessageDialog(null, "Deleten van programma is niet gelukt");
            System.out.println(e);
        }
        return false;
    }


}
