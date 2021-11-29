package nl.tudelft.proxy;

public class Window {
    public static void main(String[] args) {
        Video video = new ProxyVideo("");
        video.store();
    }
}
