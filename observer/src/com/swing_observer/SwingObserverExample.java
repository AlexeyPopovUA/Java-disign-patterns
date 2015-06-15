package com.swing_observer;


import javax.swing.*;
import java.awt.*;

public class SwingObserverExample{

    JFrame frame;

    public static void main(String[] args){
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go(){
        frame = new JFrame();

        JButton button = new JButton("click here!");

        button.addActionListener(new FirstListener());
        button.addActionListener(new SecondListener());

        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setBounds(100, 200, 300, 500);
        frame.setVisible(true);
    }


}


