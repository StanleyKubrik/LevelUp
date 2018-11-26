package person;

import javax.swing.*;

public class Panel extends JPanel {
    private IController iController;

    Panel(){
        iController = new Controller();
        setLayout(null);
    }
}
