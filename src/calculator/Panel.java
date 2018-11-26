package calculator;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Calculation.ICallBack {

    private IController iCallBack;
    private JTextField txt;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt7;
    private JButton bt8;
    private JButton bt9;
    private JButton bt0;
    private JButton bt_c;
    private JButton bt_div;
    private JButton bt_mult;
    private JButton bt_plus;
    private JButton bt_minus;
    private JButton bt_res;
    private JTextArea jTextArea;
    private double firstValue = 0;
    private char operation = ' ';

    Panel(){
        iCallBack = new Controller(this);
        setLayout(null);
        setBackground(Color.GRAY);
        init();
        add(txt);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        add(bt7);
        add(bt8);
        add(bt9);
        add(bt0);
        add(bt_c);
        add(bt_div);
        add(bt_mult);
        add(bt_plus);
        add(bt_minus);
        add(bt_res);
        add(jTextArea);
        listener();
    }

    private void init(){
        txt = new JTextField();
        txt.setBounds(20, 20, 200, 40);
        txt.setFont(new Font("Courier New", Font.PLAIN, 30));

        bt1 = new JButton("1");
        bt1.setBounds(20, 70, 50, 50);

        bt2 = new JButton("2");
        bt2.setBounds(70, 70, 50, 50);

        bt3 = new JButton("3");
        bt3.setBounds(120, 70, 50, 50);

        bt4 = new JButton("4");
        bt4.setBounds(20, 120, 50, 50);

        bt5 = new JButton("5");
        bt5.setBounds(70, 120, 50, 50);

        bt6 = new JButton("6");
        bt6.setBounds(120, 120, 50, 50);

        bt7 = new JButton("7");
        bt7.setBounds(20, 170, 50, 50);

        bt8 = new JButton("8");
        bt8.setBounds(70, 170, 50, 50);

        bt9 = new JButton("9");
        bt9.setBounds(120, 170, 50, 50);

        bt0 = new JButton("0");
        bt0.setBounds(70, 220, 50, 50);

        bt_c = new JButton("c");
        bt_c.setBounds(20, 220, 50, 50);

        bt_res = new JButton("=");
        bt_res.setBounds(120, 220, 50, 50);

        bt_div = new JButton("/");
        bt_div.setBounds(170, 70, 50, 50);

        bt_mult = new JButton("*");
        bt_mult.setBounds(170, 120, 50, 50);

        bt_minus = new JButton("-");
        bt_minus.setBounds(170, 170, 50, 50);

        bt_plus = new JButton("+");
        bt_plus.setBounds(170, 220, 50, 50);

        jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);
        jTextArea.setEnabled(false);
        jTextArea.setDisabledTextColor(Color.BLACK);
        jTextArea.setBackground(Color.lightGray);
        jTextArea.setBounds(225, 20, 205, 250);
        jTextArea.setFont(new Font("Courier New", Font.PLAIN, 20));
    }

    private void listener(){
        bt1.addActionListener(e -> txt.setText(txt.getText() + 1));
        bt2.addActionListener(e -> txt.setText(txt.getText() + 2));
        bt3.addActionListener(e -> txt.setText(txt.getText() + 3));
        bt4.addActionListener(e -> txt.setText(txt.getText() + 4));
        bt5.addActionListener(e -> txt.setText(txt.getText() + 5));
        bt6.addActionListener(e -> txt.setText(txt.getText() + 6));
        bt7.addActionListener(e -> txt.setText(txt.getText() + 7));
        bt8.addActionListener(e -> txt.setText(txt.getText() + 8));
        bt9.addActionListener(e -> txt.setText(txt.getText() + 9));
        bt0.addActionListener(e -> txt.setText(txt.getText() + 0));

        bt_c.addActionListener(e -> {
            String temp = txt.getText();
            txt.setText(temp.substring(0, 0));
        });

        bt_plus.addActionListener(e -> {
            firstValue = Double.valueOf(txt.getText());
            txt.setText("");
            operation = '+';
        });

        bt_minus.addActionListener(e -> {
            firstValue = Double.valueOf(txt.getText());
            txt.setText("");
            operation = '-';
        });

        bt_mult.addActionListener(e -> {
            firstValue = Double.valueOf(txt.getText());
            txt.setText("");
            operation = '*';
        });

        bt_div.addActionListener(e -> {
            firstValue = Double.valueOf(txt.getText());
            txt.setText("");
            operation = '/';
        });

        bt_res.addActionListener(e -> {
            double secondValue = Double.valueOf(txt.getText());
            if (operation == '/' && secondValue == 0){
                JOptionPane.showMessageDialog(null, "Делить на ноль нельзя!");
            }
            switch (operation){
                case '+':
                    iCallBack.sum(firstValue, secondValue);
                    break;
                case '-':
                    iCallBack.diff(firstValue, secondValue);
                    break;
                case '*':
                    iCallBack.mult(firstValue, secondValue);
                    break;
                case '/':
                    iCallBack.div(firstValue, secondValue);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Выберите корректную операцию!");
                    break;
            }
        });
    }

    @Override
    public void callBack(String message) {
        jTextArea.append(message);
    }

    @Override
    public void callBackHistory(String message) {

    }
}
