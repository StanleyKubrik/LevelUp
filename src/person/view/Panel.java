package person.view;

import person.control.Controller;
import person.control.IController;
import person.model.Table;
import person.model.TableContract;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class Panel extends JPanel {
    private IController iControler;
    private JTable tbl ;
    private JScrollPane scr ;
    private JButton creat;
    private JButton read;
    private JButton update;
    private JButton delete;

    public Panel()
    {
        TableContract tabelConfig = new Table();
        iControler = new Controller(tabelConfig);
        setLayout(null);
        setBackground(Color.CYAN);
        tbl = new JTable((TableModel) tabelConfig);
        scr = new JScrollPane(tbl);
        scr.setBounds(10, 10, 400, 400);

        creat  =  new JButton("Create");
        read   =  new JButton("Read");
        update =  new JButton("Update");
        delete =  new JButton("Delete");

        creat.setBounds(600, 100, 100, 40);
        creat.setBackground(Color.WHITE);

        read.setBounds(600, 150, 100, 40);
        read.setBackground(Color.WHITE);

        update.setBounds(600, 200, 100, 40);
        update.setBackground(Color.WHITE);

        delete.setBounds(600, 250, 100, 40);
        delete.setBackground(Color.WHITE);

        add(scr);
        add(creat);
        add(read);
        add(update);
        add(delete);

        creat.addActionListener(v->{
            iControler.create();
        });
        read.addActionListener(v->{iControler.read();});
        update.addActionListener(v->{iControler.update();});
        delete.addActionListener(v->{iControler.delete();});
    }
}
