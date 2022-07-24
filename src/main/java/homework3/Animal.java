package homework3;

public abstract class Animal {
    private String name;
    private int age;
    private String color;
    private int id;

    public Animal(String name, int age, String color, int id) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.id = id;
    }

    public String getName() {
        return name;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    abstract void eat();

    abstract void sleep();

    abstract void voice();
}
