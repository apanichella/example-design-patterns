package nl.tudelft.decorator;

import javax.accessibility.AccessibleContext;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ScrollbarWindow extends FancyWindow {

    public ScrollbarWindow(Window pWindow) {
        super(pWindow);
    }

    public void draw() {
        JTextArea area = this.window.getTextArea();
        JScrollPane scrollBar=new JScrollPane(area,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.getFrame().add(scrollBar);
        this.window.draw();
    }
}
