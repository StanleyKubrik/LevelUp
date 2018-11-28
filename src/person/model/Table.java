package person.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class Table extends AbstractTableModel implements TableContract {
    private List<Person> listPerson;

    public Table() {
        listPerson = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return listPerson.size();
    }

    @Override
    public String getColumnName(int column) {
        String[] columnName = {"ID", "Name", "Surname", "Age"};
        return columnName[column];
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listPerson.get(rowIndex).getId();
            case 1:
                return listPerson.get(rowIndex).getName();
            case 2:
                return listPerson.get(rowIndex).getSname();
            case 3:
                return listPerson.get(rowIndex).getAge();
            default:
                return "";
        }
    }

    @Override
    public void setAllValue(List<Person> list){
        listPerson.clear();
        listPerson.addAll(list);
        fireTableDataChanged();
    }

    public void setUpdateValue(Person pers){
        for(Person obj : listPerson){
            if(obj.equals(pers)){
                obj.clonePerson(obj);
            }
        }
        fireTableDataChanged();
    }

    @Override
    public void setValue(Person pers) {
        listPerson.add(pers);
        fireTableDataChanged();
    }


    @Override
    public void delValue(int id) {
        for (int i = 0; i < listPerson.size(); i++) {
            if (listPerson.get(i).getId() == id) {
                listPerson.remove(id);
            }
        }
        fireTableDataChanged();
    }
}
