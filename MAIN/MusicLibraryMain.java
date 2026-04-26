import model.Song;
import model.Album;

import java.util.List;

public class MusicLibraryMain {
    public static void main(String[] args) {
        // Create some songs
        Song song1 = new Song("Smooth Operator", "Sade", 240);
        Song song2 = new Song("Your Love is King", "Sade", 220);

        // Create an album
        Album album = new Album("Diamond Life", "Sade");
        album.addSong(song1);
        album.addSong(song2);

        // Display the album and its songs
        System.out.println("Album: " + album);
        List<Song> songs = album.getSongs();
        for (Song song : songs) {
            System.out.println("  " + song);
        }
    }
}
