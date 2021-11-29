package nl.tudelft.decorator;

import javax.swing.*;
import java.awt.*;

public class BasicWindow implements Window {
    protected JTextArea textArea;
    protected JFrame frame;

    public BasicWindow(String pText){
        this.textArea = new JTextArea(pText);
        textArea.setBounds(10,10, 190,190);
        textArea.setLineWrap(true);

        this.frame = new JFrame();
        this.frame.add(textArea);
    }

    public void draw() {
        //Set default close operation for JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set JFrame size
        frame.setSize(210,210);

        //Make JFrame get to center
        frame.setLocationRelativeTo(null);

        //Make JFrame visible
        frame.setVisible(true);
    }

    public JFrame getFrame(){
        return this.frame;
    }

    public JTextArea getTextArea(){
        return this.textArea;
    }
}
