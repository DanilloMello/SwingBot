package com.github.danillomello.components;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Button extends JButton {

    boolean isPointer = false;

    public Button(){
        
        this.setSize(150, 50);
        this.setText("Queria te dizer uma coisa...");
        if (isPointer){
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    e.getPoint();
                }
            });
        }
        this.addActionListener(e -> {
            isPointer = true;
        });
    }

    
}
