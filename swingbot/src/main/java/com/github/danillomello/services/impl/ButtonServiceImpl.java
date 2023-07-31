package com.github.danillomello.services.impl;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.util.concurrent.atomic.AtomicIntegerArray;

import javax.swing.event.MouseInputAdapter;

import com.github.danillomello.services.ButtonService;

public class ButtonServiceImpl implements ButtonService{

    @Override
    public Color getPixelColorByMouseClicked() {
        try {
            AtomicIntegerArray position = new AtomicIntegerArray(null);                  
            new MouseInputAdapter() {          
                @Override          
                public void mouseClicked(MouseEvent e){
                    Point point = MouseInfo.getPointerInfo().getLocation();
                    position.set((int) point.getX(), (int) point.getY());
                }  
            };
            return new Robot().getPixelColor(position.get(0), position.get(1));
        } catch (AWTException e) {
            e.printStackTrace();
        }
        return null;        
    }    
}
 