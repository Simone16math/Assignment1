import java.util.ArrayList;

public class JazzPlaylist implements Playlist {
    // JazzPlaylist class implements the Playlist interface

    // Attributes
    private String name;
    private ArrayList<Song> songs;

    // Constructor
    public JazzPlaylist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Getters for the attributes
    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Song> getSongs() {
        return songs;
    }

    // Other methods
    @Override
    public void addSong(Song song) {
        // Adds a song to the playlist
        if (songs.contains(song)) {
            // If the song is already in the playlist, do not add it again
            System.out.println( song.getTitle() + " by " + song.getArtist()+ "already exists in the "+ getName() + " playlist.");
            System.out.println( "Duplicate songs are not allowed in the playlist.");
            return;
        }
        // add the song to the playlist songs
        songs.add(song);
        System.out.println("Song added: " + song.getTitle() + " by " + song.getArtist());
    }

    @Override
    public void removeSong(Song song) {
        // Removes a song from the playlist
        if (songs.isEmpty()) {
            // If the playlist is empty, cannot remove any song
            System.out.println("Playlist is empty.");
        } else if (songs.contains(song)) {
            // If the playlist is not empty and contains the song, remove it
            songs.remove(song);
            System.out.println("Song removed: " + song.getTitle() + " by " + song.getArtist());
        } else {
            // If the song is not found in the playlist
            System.out.println("Song not found in the playlist.");
        }
    }

    @Override
    public void playAllSongs() {
        // Plays all songs in the playlist
        if (songs.isEmpty()) {
            // If the playlist is empty, cannot play any song
            System.out.println("Playlist is empty.");
        } else {
            // Plays all songs in the playlist
            System.out.println("Playing all songs in the jazz playlist: " + name);
            for (Song song : songs) {
                String duration = String.format("%.2f", song.getDuration());
                System.out.println("Playing: " + song.getTitle() + " by " + song.getArtist() + " (" + duration + " minutes)" +
                        " Genre: " + song.getGenre() + " Mood: " + song.getMood() );
            }
        }
    }
}
