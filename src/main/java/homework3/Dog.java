package homework3;

public class Dog extends Animal implements Huntable {

    public Dog(String name, int age, String color, int id) {
        super(name, age, color, id);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + "-" + getId() + " hunting");
    }

    @Override
    public void attacks() {
        System.out.println(getName() + "-" + getId() + " attack!");
    }

    @Override
    public void bites() {
        System.out.println(getName() + "-" + getId() + " make \"куусь\" ");
    }

    @Override
    void eat() {
        System.out.println(getName() + "-" + getId() + " eating");
    }

    @Override
    void sleep() {
        System.out.println(getName() + "-" + getId() + " sleeping");
    }

    @Override
    public void voice() {
        System.out.println(getName() + "-" + getId() + " wof! wof! wof!");
    }

    public void callAllMethods() {
        hunt();
        attacks();
        bites();
        voice();
        eat();
        sleep();
    }

    public static class Wolf extends Dog {
        public Wolf(String name, int age, String color, int id) {
            super(name, age, color, id);
        }

        @Override
        public void voice() {
            System.out.println(getName() + "-" + getId() + " auu! auuu! auuu!");
        }
    }
}
