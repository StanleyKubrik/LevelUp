package person.model;

public class Person {
    private int id;
    private String name;
    private String sname;
    private int age;


    public Person() {
    }

    public Person(int id, String name, String sname, int age) {
        this.id = id;
        this.name = name;
        this.sname = sname;
        this.age = age;
    }

    public Person(String name, String sname, int age) {
        this.name = name;
        this.sname = sname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "model.Person{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", surname = '" + sname + '\'' +
                ", age = " + age +
                '}';
    }

    public void clonePerson(Person obj){
        this.name = obj.getName();
        this.sname = obj.getSname();
        this.age = obj.getAge();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
