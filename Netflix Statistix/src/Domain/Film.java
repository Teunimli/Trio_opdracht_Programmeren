package Domain;

public class Film {
    private int id;
    private String title;
    private int duration;
    private String genre;
    private String language;
    private int age;

    public Film(int id, String title, int duration, String genre, String language, int age) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.language = language;
        this.age = age;
    }

    public int getId() {return id;}

    public String getTitle() {return title;}

    public int getDuration() {return duration;}

    public String getGenre() {return genre;}

    public String getLanguage() {return language;}

    public int getAge() {return age;}

    public void setId(int id) {this.id = id;}

    public void setTitle(String title) {this.title = title;}

    public void setDuration(int duration) {this.duration = duration;}

    public void setGenre(String genre) {this.genre = genre;}

    public void setTaal(String taal) {this.language = language;}

    public void setAge(int age) {this.age = age;}

    public String toString() {
        return "Title: " + title + ", Duration: " + duration + ", Genre: " + genre + ", Language: " + language + ", Age: " + age;
    }
}
