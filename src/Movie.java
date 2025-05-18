import java.util.List;

public class Movie {

    private String title;
    private String director;
    private List<String> actors;


    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return actors;
    }
}
