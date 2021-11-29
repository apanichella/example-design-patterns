package nl.tudelft.decorator;

import javax.swing.*;
import java.awt.*;

public abstract class FancyWindow implements Window {
    protected Window window;

    public FancyWindow(Window pWindow) {
        this.window = pWindow;
    }

    public abstract void draw();

    public JFrame getFrame() {
        return this.window.getFrame();
    }

    public JTextArea getTextArea(){
        return this.window.getTextArea();
    }
}
