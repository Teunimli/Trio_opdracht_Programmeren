package Domain;

public class Episode{
    private String title;
    private int duration;

    public String getTitle() {return title;}

    public int getDuration() {return duration;}

    public void setTitle(String title) {this.title = title;}

    public void setDuration(int duration) {this.duration = duration;}

    public String toString() {
        return "Titel: " + title + ", Duration: " + duration;
    }


}
