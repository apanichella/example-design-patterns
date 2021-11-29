package nl.tudelft.proxy;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class RealVideo implements Video {
    private final String filename;
    private String metadata;
    private MediaPlayer player;

    public RealVideo(String filename) {
        this.filename = filename;
        load();
    }

    public void load() {
        System.out.println("Loading   " + filename);
        // Loading video from the disk
        Media media = new Media(filename);
        this.player = new MediaPlayer(media);
        this.metadata = this.player.getCurrentTime().toString();
    }

    public void play() {
        System.out.println("Play " + filename);
        this.player.play();
    }

    public String getMetadata() {
        return this.metadata;
    }

    public void store() {
        //..
    }
}
