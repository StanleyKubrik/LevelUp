package converter;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Panel extends JPanel implements Calc.ICallBack {
    private JTextField txtIn;
    private JTextField txtOut;
    private JButton bt_grvkg;
    private JButton bt_kgvtn;
    private JButton bt_tnvunc;
    private JButton bt_cvf;
    private JButton bt_kvc;
    private JButton bt_clear;
    private JButton bt_history;
    private double value;
    private ICalc iCallBack;
    private JTextArea jTextArea;

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
        add(bt_history);
        add(jTextArea);
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
        bt_kvc.setBounds(175, 135, 100, 50);

        bt_clear = new JButton("Clear");
        bt_clear.setBounds(40, 90, 100, 50);

        bt_history = new JButton("History");
        bt_history.setBounds(285, 135, 100, 50);

        jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);
        jTextArea.setBackground(Color.lightGray);
        jTextArea.setBounds(15, 195, 340, 350);
        jTextArea.setFont(new Font("Courier New", Font.PLAIN, 20));
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
            txtIn.setText("");
            txtOut.setText("");
            jTextArea.setText("");
        });

        bt_history.addActionListener(e -> iCallBack.history());
    }

    @Override
    public void callBack(String message) {
        txtOut.setText(message);
    }

    @Override
    public void callBackHistory(String message) {
        jTextArea.append(message);
    }
}
