package nl.tudelft.decorator;

import javax.swing.*;
import java.awt.*;

public class DraculaWindow extends FancyWindow {

    public DraculaWindow(Window pWindow) {
        super(pWindow);
    }

    public void draw() {
        this.getFrame().setBackground(Color.GRAY);
        this.getTextArea().setBackground(Color.GRAY);
        this.getTextArea().setForeground(Color.WHITE);
        this.window.draw();
    }
}
