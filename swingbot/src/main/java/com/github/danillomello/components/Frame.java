package com.github.danillomello.components;

import javax.swing.JFrame;

public class Frame extends JFrame {

    Panel panel = new Panel();

    public Frame(){
        this.setTitle("Pixel Bot");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(300, 600);
        this.setVisible(true);
        this.add(panel);       
    }    

}