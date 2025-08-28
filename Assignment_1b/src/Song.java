public class Song {
    // Attributes
    private String title;
    private String artist;
    private double duration; // Duration in minutes

    // Constructor
    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

}
