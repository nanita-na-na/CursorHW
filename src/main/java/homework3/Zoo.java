package homework3;

public class Zoo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 2, "brown", 01);
        cat1.callAllMethods();

        Cat tiger1 = new Cat.Tiger("Simba", 3, "striped", 02);
        tiger1.callAllMethods();

        Cat fox1 = new Cat.Fox("Lisa", 1,"red", 03);
        fox1.callAllMethods();

        Dog dog1 = new Dog("Sharik", 4,"gray", 04);
        dog1.callAllMethods();

        Dog wolf1 = new Dog.Wolf("Wolf", 4, "gray", 05);
        wolf1.callAllMethods();

        Cow cow1 = new Cow("Muska", 3, "spotted", 06);
        cow1.callAllMethods();

        Horse horse1 = new Horse("Linda", 6, "white", 07);
        horse1.callAllMethods();
    }
}
