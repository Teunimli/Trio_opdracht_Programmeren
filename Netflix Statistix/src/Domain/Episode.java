package Domain;

public class Episode{
    private String title;
    private int SerieId;
    private int duration;

    public Episode(String title, int duration)
    {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {return title;}

    public int getSerieId() {
        return SerieId;
    }

    public int getDuration() {return duration;}

    public void setTitle(String title) {this.title = title;}

    public void setSerieId(int serieId) {
        SerieId = serieId;
    }

    public void setDuration(int duration) {this.duration = duration;}

    public String toString() {
        return "Titel: " + title + ", Duration: " + duration;
    }


}
