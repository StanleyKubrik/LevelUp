package person;

import java.util.ArrayList;
import java.util.List;

public final class Mock {
    private List<Person> person = new ArrayList<>();

    private static Mock instance = null;

    private Mock(){}

    public static synchronized Mock getInstance(){
        if (instance == null){
            instance = new Mock();
        }
        return instance;
    }

    public void create(String n, String sn, int age){
        if (person != null) {
            int index = person.size();
            person.add(new Person(++index, n, sn, age));
        }
    }

    public List<Person> read(){
        return person != null ? person : new ArrayList<>();
    }

    public Person update(int id){
        for (Person obj : person){
            if (obj.getId() == id){
                return obj;
            }
        }
        return null;
    }

    public void delete(int id){
        for (int i = 0; i < person.size(); i++) {
            if(person.get(i).getId() == id){
                person.remove(--i);
            }
        }
    }

    public int size(){
        return person.size();
    }
}
