package homework3;

public class Zoo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 2, "brown", 01);
        cat1.callAllMethods();

        Cat tiger1 = new Cat.Tiger("Simba", 3, "striped", 03);
        tiger1.callAllMethods();

        Cat fox1 = new Cat.Fox("Lisa", 1,"red", 07);
        fox1.callAllMethods();

        Dog dog1 = new Dog("Sharik", 4,"gray", 04);
        dog1.callAllMethods();

        Dog wolf1 = new Dog.Wolf("Wolf", 4, "gray", 02);
        wolf1.callAllMethods();
    }
}
