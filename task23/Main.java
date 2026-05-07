package task23;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(12, "Kris");
        Dog dog = new Dog(17, "Boris");

        cat.getAnimalName();
        dog.getWeight();
        cat.makeSound();
        dog.makeSound();
    }
}
