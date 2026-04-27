package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionBonjour implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Bonjour!");
    }
    
}
