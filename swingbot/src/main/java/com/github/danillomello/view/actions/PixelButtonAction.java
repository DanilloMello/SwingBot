package com.github.danillomello.view.actions;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class PixelButtonAction extends AbstractAction {

    @Override
    public void actionPerformed(ActionEvent action) {
        //TODO: pega o pixel por click - passa para o panel e altera label com a cor do pixel 
        //TODO: pega o tempo em input box - passa para o panel que será adicionado ao bot. 
        //TODO: pega os dados e adiciona bot - passa o pixel e o tempo para o bot.
        Point point = MouseInfo.getPointerInfo().getLocation();
        Color color;
        try {
            color = new Robot().getPixelColor((int) point.getX(), (int) point.getY());
            System.out.println("Color RGB: " + color.toString());
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Position X: " + point.getX() + " - Position Y: " + point.getY());
        
    }
    
}