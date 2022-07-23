package homework3;

public class Cow extends Animal implements NotHuntable{
    public Cow(String name, int age, String color, int id) {
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
    void voice() {
        System.out.println(getName()+ "-" + getId()+ " Muu! Muu!");
    }

    @Override
    public void grazing() {
        System.out.println(getName()+ "-" + getId()+ " I`m grazing");
    }
    public void callAllMethods(){
        grazing();
        voice();
        eat();
        sleep();
    }
}
