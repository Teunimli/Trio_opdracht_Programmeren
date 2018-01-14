package Domain;

import java.util.ArrayList;

public class Series {
    private int id;
    private String title;
    private int duration;
    private ArrayList<Episode> episodes;


    public Series(int id, String title, int duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.episodes = new ArrayList<Episode>();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public String toString() {
        return "Titel: " + title + ", Duration: " + duration;
    }
}