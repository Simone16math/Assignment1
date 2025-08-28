public class Song {
    // Attributes
    private String title;
    private String artist;
    private double duration; // Duration in minutes
    private String genre;
    private String mood;

    // Constructor
    public Song(String title, String artist, double duration, String genre, String mood) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.mood = mood;
    }

    // Getters for each attribute. They return the value of the corresponding attribute.
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getMood() {
        return mood;
    }
}
