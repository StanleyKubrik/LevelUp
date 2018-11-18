package animals;

public class Dog extends Animal {
    private String name;
    private int age;

    public Dog() {
    }

    public String getName() {
        return "Dog name is " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void move() {
        System.out.println(this.name + " run!");
    }

    @Override
    public void say() {
        System.out.println(this.name + " says woof!");
    }
}
