package com.github.danillomello.view.components;

import javax.swing.Action;
import javax.swing.JButton;

public class FrameButton extends JButton {

    public FrameButton(String text){        
        this.setSize(150, 50);
        this.setText(text);
    }

    public FrameButton(String text, Action e){        
        this.setSize(150, 50);
        this.setText(text);
        this.addActionListener(e);
    }
}
