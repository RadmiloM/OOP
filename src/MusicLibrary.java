import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {

    public List<Song> songs;

    public MusicLibrary() {
        this.songs = new ArrayList<>();
    }

    public void add(Song song) {
        this.songs.add(song);
    }

    public void remove(Song song) {
        this.songs.remove(song);
    }
}
