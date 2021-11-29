package nl.tudelft.decorator;

import javax.swing.*;
import java.awt.*;

public interface Window {
    public void draw();
    public JFrame getFrame();
    public JTextArea getTextArea();
}

