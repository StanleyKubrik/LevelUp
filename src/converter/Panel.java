package converter;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Calc.ICallBack {
    private JTextField txtIn;
    private JTextField txtOut;
    private JButton grvkg;
    private JButton kgvtn;
    private JButton tnvunc;
    private JButton cvf;
    private JButton kvc;
    private JButton clear;
    private double value;

    Panel(){
        setLayout(null);
        setBackground(Color.GRAY);
        init();
        add(txtIn);
        add(txtOut);
        add(grvkg);
        add(kgvtn);
        add(tnvunc);
        add(cvf);
        add(kvc);
        add(clear);
        listener();
    }

    private void init(){
        ICalc callBack = new Calc(this);

        txtIn = new JTextField();
        txtIn.setBounds(15, 15, 150, 30);
        txtIn.setFont(new Font("Courier New", Font.PLAIN, 20));

        txtOut = new JTextField();
        txtOut.setBounds(15, 50, 150, 30);
        txtOut.setFont(new Font("Courier New", Font.PLAIN, 20));

        grvkg = new JButton("грамм в кг");
        grvkg.setBounds(175, 15, 100, 50);

        kgvtn = new JButton("кг в тонны");
        kgvtn.setBounds(175, 75, 100, 50);

        tnvunc = new JButton("тн в унц");
        tnvunc.setBounds(285, 15, 100, 50);

        cvf = new JButton("C в F");
        cvf.setBounds(285, 75, 100, 50);

        kvc = new JButton("К в C");
        kvc.setBounds(235, 135, 100, 50);

        clear = new JButton("Clear");
        clear.setBounds(40, 90, 100, 50);
    }

    private void listener(){


        clear.addActionListener(e -> {
//            String temp1 = txtIn.getText();
//            String temp2 = txtOut.getText();
//            txtIn.setText(temp1.substring(0,0));
//            txtOut.setText(temp2.substring(0,0));
            txtIn.setText("");
            txtOut.setText("");
        });
    }

    @Override
    public void callBack(String message) {
        txtOut.setText(message);
    }
}
