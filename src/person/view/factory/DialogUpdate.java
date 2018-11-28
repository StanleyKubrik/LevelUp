package person.view.factory;

import person.model.Person;

import javax.swing.*;
import java.awt.*;

public class DialogUpdate<T extends DialogUpdate.DialogUpdateCallBack> extends JDialog
        implements IDialogFactory {
    public interface DialogUpdateCallBack {
        void callBackUpdate(Person person);
    }

    public DialogUpdate(T callBack) {
        setLayout(null);
        setTitle("Update");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setBounds(300, 300, 300, 300);

        JTextField d_Id = new JTextField();
        JTextField d_FName = new JTextField();
        JTextField d_LName = new JTextField();
        JTextField d_Age = new JTextField();

        JButton ok = new JButton("Ok");
        JButton cancel = new JButton("Cancel");

        JLabel lbl_id  = new JLabel("ID");
        JLabel lbl_FName = new JLabel("Name");
        JLabel lbl_LName = new JLabel("Surname");
        JLabel lbl_Age = new JLabel("Age");

        d_Id.setBounds(30, 30, 120, 20);
        d_FName.setBounds(30, 80, 120, 20);
        d_LName.setBounds(30, 130, 120, 20);
        d_Age.setBounds(30, 180, 120, 20);

        ok.setBounds(160, 30, 100, 25);
        ok.setBackground(Color.WHITE);

        cancel.setBounds(160, 70, 100, 25);
        cancel.setBackground(Color.WHITE);

        lbl_id.setBounds(30, 10, 120, 10);
        lbl_FName.setBounds(30, 60, 120, 10);
        lbl_LName.setBounds(30, 110, 120, 10);
        lbl_Age.setBounds(30, 160, 120, 10);

        add(d_Id);
        add(d_FName);
        add(d_LName);
        add(d_Age);

        add(ok);
        add(cancel);

        add(lbl_id);
        add(lbl_FName);
        add(lbl_LName);
        add(lbl_Age);

        ok.addActionListener(e -> {
            callBack.callBackUpdate(new Person(
                    d_FName.getText(),
                    d_LName.getText(),
                    Integer.parseInt(d_Age.getText())
            ));
            setVisible(false);
        });

        cancel.addActionListener(e -> setVisible(false));

    }
}
