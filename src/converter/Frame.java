package converter;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame(){
        setBounds(350, 350, 415, 230);
        setTitle("Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new Panel());
        setVisible(true);
    }
}
