import java.util.ArrayList;

public abstract class Playlist {
    // Attributes
    protected String name;
    private ArrayList<Song> songs;

    // Constructor
    public Playlist(String name){
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Methods
    public void addSong(Song song) {
        // Adds a song to the playlist
        if (songs.contains(song)) {
            // If the song is already in the playlist, do not add it again
            System.out.println( song.getTitle() + " by " + song.getArtist()+ "already exists in the "+ name + " playlist.");
            System.out.println( "Duplicate songs are not allowed in the playlist.");
            return;
        }
        // add the song to the playlist
        songs.add(song);
        System.out.println("Song added: " + song.getTitle() + " by " + song.getArtist());
    }

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
            System.out.println("Song not found in the playlist.");
        }
    }

    public void playAllSongs() {
        // Plays all songs in the playlist
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Playing all songs in the playlist: " + name);
            for (Song song : songs) {
                String duration = String.format("%.2f", song.getDuration());
                System.out.println("Playing: " + song.getTitle() + " by " + song.getArtist() + " (" + duration + " minutes)");
            }
        }
    }
}









