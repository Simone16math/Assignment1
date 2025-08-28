import java.util.ArrayList;
import java.util.Scanner;

public class Test1c {
    // Main method to test the functionality of the classes
    public static void main(String[] args) {

        ArrayList<Song> songList = new ArrayList<>();

        User testUser = new User("testUser",songList) ;
        testUser.createPlaylist("My Pop Hits", "Pop");
        testUser.createPlaylist("My Rock Hits", "Rock");
        testUser.createPlaylist("My Jazz Hits", "Jazz");

        // Create some songs
        // There are 5 songs per genre, with varying moods (happy, sad, idk)

        // Pop Songs
        Song song1 = new Song("Blinding Lights", "The Weeknd", 3.20, "Pop", "sad");
        Song song2 = new Song("Bad Guy", "Billie Eilish", 3.14, "Pop", "idk");
        Song song3 = new Song("Shape of You", "Ed Sheeran", 4.24, "Pop", "happy");
        Song song4 = new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars", 4.30, "Pop", "happy");
        Song song5 = new Song("Rolling in the Deep", "Adele", 3.48, "Pop", "sad");

        // Rock Songs
        Song song6 = new Song("Time", "Pink Floyd", 7.06, "Rock", "sad");
        Song song7 = new Song("Heroes", "David Bowie", 6.11, "Rock", "idk");
        Song song8 = new Song("Paradise City", "Guns N' Roses", 6.46, "Rock", "happy");
        Song song9 = new Song("Bad Moon Rising", "Creedence Clearwater Revival", 2.21, "Rock", "happy");
        Song song10 = new Song("Black Hole Sun", "Soundgarden", 5.18, "Rock", "sad");

        // Jazz Songs
        Song song11 = new Song("So What", "Miles Davis", 9.22, "Jazz", "idk");
        Song song12 = new Song("What a Wonderful World", "Louis Armstrong", 2.21, "Jazz", "happy");
        Song song13 = new Song("Take Five", "Dave Brubeck", 5.24, "Jazz", "idk");
        Song song14 = new Song("Body and Soul", "Coleman Hawkins", 3.00, "Jazz", "sad");
        Song song15 = new Song("Summertime", "Ella Fitzgerald and Louis Armstrong", 4.58, "Jazz", "sad");

        // Add songs to user's playlist by genre
        // Add the 5 pop songs to the pop playlist
        System.out.println("Adding set songs to defined playlists...");
        System.out.println("\n --------------------------------- \n");
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Pop Hits"), song1);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Pop Hits"), song2);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Pop Hits"), song3);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Pop Hits"), song4);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Pop Hits"), song5);
        // Add the 5 rock songs to the rock playlist
        System.out.println("\n --------------------------------- \n");
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Rock Hits"), song6);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Rock Hits"), song7);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Rock Hits"), song8);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Rock Hits"), song9);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Rock Hits"), song10);
        // Add the 5 jazz songs to the jazz playlist
        System.out.println("\n --------------------------------- \n");
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Jazz Hits"), song11);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Jazz Hits"), song12);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Jazz Hits"), song13);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Jazz Hits"), song14);
        testUser.addSongToPlaylist(testUser.getPlaylistByName("My Jazz Hits"), song15);

        System.out.println("\n --------------------------------- \n");
        System.out.println("You can view all songs in your library by genre or by mood. \n " +
                "Please enter 'genre' to view by genre or 'mood' to view by mood:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("genre")) {
            testUser.printSongs(testUser.listByGenre("Pop"));
            testUser.printSongs(testUser.listByGenre("Rock"));
            testUser.printSongs(testUser.listByGenre("Jazz"));

        } else if (input.equalsIgnoreCase("mood")) {
            testUser.printSongs(testUser.listByMood("happy"));
            testUser.printSongs(testUser.listByMood("sad"));
            testUser.printSongs(testUser.listByMood("idk"));

        } else {
            System.out.println("Invalid input. Please enter 'genre' or 'mood'.");
        }

        System.out.println("\n. You can also view all songs in your library by viewing all your playlists:");
        testUser.showAllSongs();


    }
}
