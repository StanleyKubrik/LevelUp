package person.model;

import java.util.List;

public interface TableContract {
    void setAllValue(List<Person> list);

    void setValue(Person pers);

    void setUpdateValue(Person pers);

    void delValue(int id);
}
