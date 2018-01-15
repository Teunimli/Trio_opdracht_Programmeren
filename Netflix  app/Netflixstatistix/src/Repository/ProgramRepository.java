package Repository;

import Database.dbConnection;
import Domain.Movie;
import Domain.Program;

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
            return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
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
            return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return false;

    }

}
