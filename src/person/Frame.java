package person;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame(){
        setBounds(100, 100, 415, 600);
        setTitle("Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new Panel());
        setVisible(true);
    }
}
