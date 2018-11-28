package person.view.factory;

import person.model.Person;

import javax.swing.*;
import java.awt.*;

public class DialogCreate<T extends DialogCreate.DialogCreateCallBack> extends JDialog
        implements IDialogFactory{
    public interface DialogCreateCallBack {
        void callBackCreate(Person person);
    }

    public DialogCreate(T callBack) {
        setLayout(null);
        setTitle("Create");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setBounds(300, 300, 300, 300);

        JTextField d_Name = new JTextField();
        JTextField d_sName = new JTextField();
        JTextField d_Age = new JTextField();

        JButton ok = new JButton("Ok");
        JButton cancel = new JButton("Cancel");

        JLabel lbl_name = new JLabel("Name");
        JLabel lbl_sName = new JLabel("Surname");
        JLabel lbl_Age = new JLabel("Age");

        d_Name.setBounds(30, 45, 120, 20);
        d_sName.setBounds(30, 95, 120, 20);
        d_Age.setBounds(30, 150, 120, 20);

        ok.setBounds(160, 30, 100, 25);
        ok.setBackground(Color.WHITE);

        cancel.setBounds(160, 70, 100, 25);
        cancel.setBackground(Color.WHITE);

        lbl_name.setBounds(30, 30, 120, 10);
        lbl_sName.setBounds(30, 75, 120, 10);
        lbl_Age.setBounds(30, 135, 120, 10);

        add(d_Name);
        add(d_sName);
        add(d_Age);

        add(ok);
        add(cancel);

        add(lbl_name);
        add(lbl_sName);
        add(lbl_Age);

        ok.addActionListener(e -> {
            callBack.callBackCreate(new Person(
                    d_Name.getText(),
                    d_sName.getText(),
                    Integer.parseInt(d_Age.getText())
            ));
            setVisible(false);
        });

        cancel.addActionListener(e -> setVisible(false));

    }

    @Override
    public void setModal(boolean modal) {
        super.setModal(modal);
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }
}
