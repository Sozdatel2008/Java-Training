package task23;

public class Cat extends Animal{
    public Cat(double weight, String animalName) {
        super(weight, animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Meeeeoooowww :3");
    }
}
