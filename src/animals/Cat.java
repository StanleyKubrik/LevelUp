package animals;

public class Cat extends Animal {
    private String name;
    private int age;

    public Cat() {
    }

    public String getName() {
        return "Cat name is " + name;
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
        System.out.println(this.name + " says meow!");
    }
}
