package person;

public class Person {
    private int id;

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

    private String name;
    private String sname;
    private int age;

    public Person(){}

    public Person(int id, String name, String sname, int age){
        this.id = id;
        this.name = name;
        this.sname = sname;
        this.age = age;
    }
}
