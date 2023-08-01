package com.github.danillomello.view.components;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import com.github.danillomello.view.actions.PixelButtonAction;

public class Panel extends JPanel {

    FrameButton button;

    public Panel() {
        GridBagConstraints c = new GridBagConstraints();

        //todo: how to get data from button to panel

        this.setLayout(new GridBagLayout());
        this.setSize(290, 590);
        this.setBorder(BorderFactory.createEtchedBorder());

        button = new FrameButton("Pixel Button", new PixelButtonAction());
        this.add(button);

        button = new FrameButton("teste");
        this.add(button);

        c.fill = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 1;

        this.add(button);
    }
}
