public class Test1b {

    public static void main(String[] args) {
        User testUser = new User("Simone");

        Playlist myPlaylist = testUser.createPlaylist("My Rock Hits", "Rock");
        Song mySong1 = new Song("Bohemian Rhapsody", "Queen", 5.55);
        testUser.addSongToPlaylist(myPlaylist, mySong1);

        Song mySong2 = new Song("Stairway to Heaven", "Led Zeppelin", 8.02);
        testUser.addSongToPlaylist(myPlaylist, mySong2);
        testUser.addSongToPlaylist(myPlaylist, mySong2);

        myPlaylist.playAllSongs();
        testUser.removeSongFromPlaylist(myPlaylist, mySong1);
        testUser.removeSongFromPlaylist(myPlaylist, mySong2);
        myPlaylist.playAllSongs();

        System.out.println("----");
        Playlist myEmptyPlaylist = testUser.createPlaylist("Empty Playlist", "pop");
        myEmptyPlaylist.playAllSongs();
        testUser.deletePlaylist(myEmptyPlaylist);

        System.out.println("----");
        Playlist popPlaylist = testUser.createPlaylist("My Pop Hits", "pop");
        Song popSong1 = new Song("Blinding Lights", "The Weeknd", 3.20);
        testUser.addSongToPlaylist(popPlaylist, popSong1);
        popPlaylist.playAllSongs();


    }
}
