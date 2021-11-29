package nl.tudelft.decorator;

import java.awt.*;

public class BoldTextWindow extends FancyWindow {

    public BoldTextWindow(Window pWindow) {
        super(pWindow);
    }

    public void draw() {
        Font font = this.getTextArea().getFont();
        this.getTextArea().setFont(font.deriveFont(Font.BOLD));
        this.window.draw();
    }
}
