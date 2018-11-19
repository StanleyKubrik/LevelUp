package converter;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Calc.ICallBack {
    private JTextField txtIn;
    private JTextField txtOut;
    private JButton bt_grvkg;
    private JButton bt_kgvtn;
    private JButton bt_tnvunc;
    private JButton bt_cvf;
    private JButton bt_kvc;
    private JButton bt_clear;
    private double value;
    private ICalc iCallBack;

    Panel(){
        setLayout(null);
        setBackground(Color.GRAY);
        init();
        add(txtIn);
        add(txtOut);
        add(bt_grvkg);
        add(bt_kgvtn);
        add(bt_tnvunc);
        add(bt_cvf);
        add(bt_kvc);
        add(bt_clear);
        listener();
    }

    private void init(){
        txtIn = new JTextField();
        txtIn.setBounds(15, 15, 150, 30);
        txtIn.setFont(new Font("Courier New", Font.PLAIN, 20));

        txtOut = new JTextField();
        txtOut.setBounds(15, 50, 150, 30);
        txtOut.setFont(new Font("Courier New", Font.PLAIN, 20));

        bt_grvkg = new JButton("грамм в кг");
        bt_grvkg.setBounds(175, 15, 100, 50);

        bt_kgvtn = new JButton("кг в тонны");
        bt_kgvtn.setBounds(175, 75, 100, 50);

        bt_tnvunc = new JButton("тн в унц");
        bt_tnvunc.setBounds(285, 15, 100, 50);

        bt_cvf = new JButton("C в F");
        bt_cvf.setBounds(285, 75, 100, 50);

        bt_kvc = new JButton("К в C");
        bt_kvc.setBounds(235, 135, 100, 50);

        bt_clear = new JButton("Clear");
        bt_clear.setBounds(40, 90, 100, 50);
    }

    private void listener(){
        iCallBack = new Calc(this);

        bt_grvkg.addActionListener(e -> {
            value = Double.parseDouble(txtIn.getText());
            iCallBack.grvkg(value);
        });

        bt_kgvtn.addActionListener(e -> {
            value = Double.parseDouble(txtIn.getText());
            iCallBack.kgvtn(value);
        });

        bt_tnvunc.addActionListener(e -> {
            value = Double.parseDouble(txtIn.getText());
            iCallBack.tnvunc(value);
        });

        bt_cvf.addActionListener(e -> {
            value = Double.parseDouble(txtIn.getText());
            iCallBack.cvf(value);
        });

        bt_kvc.addActionListener(e -> {
            value = Double.parseDouble(txtIn.getText());
            iCallBack.kvc(value);
        });

        bt_clear.addActionListener(e -> {
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
