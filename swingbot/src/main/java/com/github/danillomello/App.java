package com.github.danillomello;

import javax.swing.SwingUtilities;

import com.github.danillomello.components.Frame;

public class App {
    
    public static void main(String[] args) {
        final String text = args[0];
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame frame = new Frame(text);
                frame.setVisible(true);
            }
        });
    }
}
