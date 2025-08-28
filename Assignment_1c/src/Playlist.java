import java.util.ArrayList;

public interface Playlist {
    //Playlist is an Interface.

    // Methods to be implemented by classes that implement this interface
    void addSong(Song song); // Adds a song to the playlist
    void removeSong(Song song); // Removes a song from the playlist
    void playAllSongs(); // Plays all songs in the playlist

    String getName(); // Returns the name of the playlist
    ArrayList<Song> getSongs(); // Returns the list of songs in the playlist

}









