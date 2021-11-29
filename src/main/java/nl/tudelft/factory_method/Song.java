package nl.tudelft.factory_method;

public class Song {
    private String id;
    private String title;
    private String artist;
    private String recordLabel;
    private int year;

    public Song(){}

    public Song(String pId, String pTitle, String pSinger, String pRecord, int pYear){
        this.id = pId;
        this.title = pTitle;
        this.artist = pSinger;
        this.recordLabel = pRecord;
        this.year = pYear;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public int getYear() {
        return year;
    }
}
