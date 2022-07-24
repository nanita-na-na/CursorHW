package homework4;

public class Cat extends Animal implements Huntable {
    public Cat(String name, int age, String color, int id) {
        super(name, age, color, id);
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
        System.out.println(getName() + "-" + getId() + " meow! meow! meow!");
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

    public void callAllMethods() {
        hunt();
        attacks();
        bites();
        voice();
        eat();
        sleep();
    }

    public static class Tiger extends Cat {
        public Tiger(String name, int age, String color, int id) {
            super(name, age, color, id);
        }

        @Override
        public void voice() {
            System.out.println(getName() + "-" + getId() + " rrrr! grrrr! mrrrr!");
        }
    }

    public static class Fox extends Cat {

        public Fox(String name, int age, String color, int id) {
            super(name, age, color, id);
        }

        @Override
        public void voice() {
            System.out.println(getName() + "-" + getId() + " fyr! fyr! fyr!");
        }
    }
}
