package com.swing_observer;

import com.utils.Utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FirstListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Utils.printStr("FirstListener answered");
    }
}
