package person;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame(){
        setBounds(10, 10, 1200, 700);
        setTitle("Person");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new Panel());
        setVisible(true);
    }
}
