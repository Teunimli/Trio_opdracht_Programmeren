package Domain;

public class Program {
    private String profileName;
    private String movieOrSerieName;
    private String episodeName;
    private int percentage;

    public Program(String profileName, String movieOrSerieName,String episodeName, int percentage) {
        this.profileName = profileName;
        this.movieOrSerieName = movieOrSerieName;
        this.episodeName = episodeName;
        this.percentage = percentage;
    }

    public String getProfileName() {
        return profileName;
    }
    public String getMovieOrSerieName() {
        return movieOrSerieName;
    }
    public String getEpisodeName() {
        return episodeName;
    }
    public int getPercentage() {
        return percentage;
    }


}
