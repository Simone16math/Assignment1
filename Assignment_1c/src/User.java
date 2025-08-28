import java.util.ArrayList;

public class User{
    // Attributes
    private String username;
    private ArrayList<Playlist> playlists;
    private ArrayList<Song> library;

    // Constructor
    public User(String username, ArrayList<Song> library) {
        this.username = username;
        this.playlists = new ArrayList<>();
        this.library = library;
    }

    // Methods
    public void createPlaylist(String name, String genre){
        // Creates a playlist of a specified type (Pop, Rock, Jazz)
        Playlist playlist;

        // Determines the type of playlist to create based on user input
        if (genre.equalsIgnoreCase("Pop")){
            playlist = new PopPlaylist(name);
        } else if (genre.equalsIgnoreCase("Rock")){
            playlist = new RockPlaylist(name);
        } else if (genre.equalsIgnoreCase("Jazz")){
            playlist = new JazzPlaylist(name);
        } else {
            System.out.println("Invalid playlist genre. Please choose Pop, Rock, or Jazz. " +
                    "\n Playlist creation failed and no further playlist operations will work as intended.");
            return;
        }

        // Adds the new playlist to the user's list of playlists
        if (playlists == null) {
            playlists = new ArrayList<>();
        }
        playlists.add(playlist);
        System.out.println("Playlist created: " + playlist.getName());

        //return playlist;
    }

    public void deletePlaylist(Playlist playlist) {
        // Deletes a specified playlist
        if (playlist == null) {
            // if the playlist is null, there is nothing to delete.
            System.out.println("Playlist cannot be null. Please create a playlist appropriately.");
            return;
        }
        if (playlists.contains(playlist)) {
            // Remove the playlist from the user's list of playlists
            playlists.remove(playlist);
            System.out.println("Playlist deleted: " + playlist.getName());
        } else {
            // If the playlist is not found in the user's list of playlists (this case should not happen)
            System.out.println("Playlist not found.");
        }
    }

    public void addSongToPlaylist(Playlist playlist, Song song) {
        // Adds a song to a specified playlist
        if (playlist == null || song == null) {
            System.out.println("Playlist or song cannot be null. \n Please create a playlist and/or a song appropriately.");
            return;
        }
        if (playlists.contains(playlist)) {
            // Add song to the playlist
            playlist.addSong(song);

            if (!library.contains(song)) {
                // If the song is not already in the user's library, add it
                library.add(song);
            }

            System.out.println(song.getTitle() + " was added to your playlist titled: " + playlist.getName());
        } else {
            // If the playlist is not found in the user's list of playlists (this case should not happen)
            System.out.println("Playlist not found. Please create the intended playlist first.");
        }
    }

    public int getSongCountInLibrary(Song song, ArrayList<Song> library) {
        // Returns the number of a specific song in the user's library
        int songCount = 0;
        for (Song s : library) {
            // Increment count if the song matches
            if (s.equals(song)) {
                songCount++;
            }
        }
        return songCount; // return the total count of the specified song in the library
    }

    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        // Removes a song from a specified playlist
        if (playlist == null || song == null) {
            System.out.println("Playlist or song cannot be null. \n Please create a playlist and/or a song appropriately.");
            return;
        }
        if (playlists.contains(playlist)) {
            // Remove song from the playlist
            playlist.removeSong(song);

            if (getSongCountInLibrary(song, library) == 1) {
                // If the song was only in this playlist, remove it from the user's library
                library.remove(song);
            }
            System.out.println(song.getTitle() + " was removed from your playlist titled: " + playlist.getName());

        } else {
            System.out.println("Playlist not found.");
        }
    }

    public ArrayList<Song> listByGenre(String genre) {
        // Lists songs in the user's library by a specified genre
        ArrayList<Song> filteredSongs = new ArrayList<>();
        for (Song song : library) {
            // for each song in the library, check if it matches the specified genre
            if (!filteredSongs.contains(song)) {
                // if the song was not already added to the filtered list, check its genre
                if (song.getGenre().equalsIgnoreCase(genre)) {
                    // if the genre matches, add the song to the filtered list
                    filteredSongs.add(song);
                }
            }
        }
        return filteredSongs; // return the list of filtered songs by set genre
    }

    public ArrayList<Song>  listByMood(String mood) {
        // Lists songs in the user's library by a specified mood
        ArrayList<Song> filteredSongs = new ArrayList<>();
        for (Song song : library) {
            // for each song in the library, check if it matches the specified mood
            if (!filteredSongs.contains(song)) {
                // if the song was not already added to the filtered list, check its mood
                if (song.getMood().equalsIgnoreCase(mood)) {
                    // if the mood matches, add the song to the filtered list
                    filteredSongs.add(song);
                }
            }
        }
        return filteredSongs; // return the list of filtered songs by set mood
    }

    public void showAllSongs(){
        // Displays all songs in the user's library
        for (Playlist playlist : playlists) {
            System.out.println("Playlist: " + playlist.getName());
            playlist.playAllSongs();
            System.out.println(); // Print a newline for better readability between playlists
        }
    }
    public void printSongs(ArrayList<Song> songs) {
        // Prints the details of each song in the provided list
        if (songs.isEmpty()) {
            System.out.println("No songs found.");
        } else {
            for (Song song : songs) {
                String duration = String.format("%.2f", song.getDuration());
                System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist() +
                        ", Duration: " + duration + " minutes, Genre: " + song.getGenre() +
                        ", Mood: " + song.getMood());
            }
        }
    }

    public ArrayList<Playlist> getPlaylists() {
        // Returns the list of playlists
        return playlists;
    }

    public Playlist getPlaylistByName(String name) {
        // Returns a playlist by its name
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(name)) {
                return playlist; // return the playlist if the name matches
            }
        }
        return null; // return null if no matching playlist is found
    }

    public void genreRecommendation(String genre) {
        // Provides song recommendations based on a specified genre
        if (genre.equalsIgnoreCase("Pop")) {
            // Recommendations for Pop genre
            System.out.println("Here are some popular pop song recommendations:");
            System.out.println("   'Blinding Lights' by The Weeknd (3.22)");
            System.out.println("   'Levitating' by Dua Lipa (3.23)");
            System.out.println("   'Watermelon Sugar' by Harry Styles (2.54)");
        } else if (genre.equalsIgnoreCase("Rock")) {
            // Recommendations for Rock genre
            System.out.println("Here are some rock song recommendations:");
            System.out.println("   'Bohemian Rhapsody' by Queen (5.55)");
            System.out.println("   'Stairway to Heaven' by Led Zeppelin (8.02)");
            System.out.println("   'Hotel California' by Eagles (6.30)");
        } else if (genre.equalsIgnoreCase("Jazz")) {
            // Recommendations for Jazz genre
            System.out.println("Here are some jazz song recommendations:");
            System.out.println("   'So What' by Miles Davis (9.22)");
            System.out.println("   'Take Five' by Dave Brubeck (5.24)");
            System.out.println("   'My Favorite Things' by John Coltrane (13.41)");
        } else {
            // If the genre is not recognized, there are no song recommendations
            System.out.println("No recommendations available for the specified genre.");
        }
    }


}
