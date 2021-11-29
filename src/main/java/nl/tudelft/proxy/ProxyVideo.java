package nl.tudelft.proxy;

public class ProxyVideo implements Video {
    private final String filename;
    private RealVideo video;
    private String metadata;

    public ProxyVideo(String filename) {
        this.filename = filename;
    }

    public void play() {
        if (video == null) {
            video = new RealVideo(filename);
        }
        video.play();
    }

    public String getMetadata() {
        if (video==null){
            return metadata;
        }
        return video.getMetadata();
    }

    public void store() {
        // ..
    }

    public void load() {
        //..
    }
}

