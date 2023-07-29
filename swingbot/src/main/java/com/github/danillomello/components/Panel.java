package com.github.danillomello.components;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener{
    Button button = new Button();
    Label label = new Label("");

    public Panel(){

        this.setLayout(new GridBagLayout());
        this.setSize(290, 590);
        this.setBorder(BorderFactory.createEtchedBorder());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        button.addActionListener(this);
        this.add(button);
        this.add(label, c);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){             
            label.setText("Eu te amo!");
        }
    }
}
