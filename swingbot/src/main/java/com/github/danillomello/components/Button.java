package com.github.danillomello.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton implements ActionListener{

    public Button(){
        this.setSize(150, 50);
        this.setText("Queria te dizer uma coisa...");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String teste2 = "teste";
    }
    
}
